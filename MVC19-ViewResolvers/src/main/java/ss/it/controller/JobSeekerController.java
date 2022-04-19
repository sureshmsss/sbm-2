package ss.it.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import ss.it.model.JobSeekerData;
import ss.it.model.JobSeekerInfo;
import ss.it.service.JobSeekerService;

@Controller
public class JobSeekerController {
	@Autowired
	private Environment env;

	@Autowired
	private JobSeekerService service;

	@Autowired
	private ServletContext sc;

	@GetMapping("/")
	public String show() {
		// return LVN
		return "welcome";
	}

	@GetMapping("/register")
	public String showJsRegistratinForm(@ModelAttribute("js") JobSeekerData data) {
		// return LVN
		return "register_js";
	}

	@PostMapping("/register")
	public String registerByUploadingFiles(@ModelAttribute("js") JobSeekerData data, Map<String, Object> map)
			throws Exception {

		// get upload folder location from properties file
		String storeLocation = env.getRequiredProperty("upload.store");

		// if that not avialable then create it
		File file = new File(storeLocation);

		if (!file.exists())
			file.mkdir();

		// get i/p streams represents the upload files content
		MultipartFile resumeFie = data.getResume();
		MultipartFile photoFile = data.getPhoto();
		InputStream isResume = resumeFie.getInputStream();
		InputStream isPhoto = photoFile.getInputStream();

		// get the names of the uploaded files
		String resumeFileName = resumeFie.getOriginalFilename();
		String photoFileName = photoFile.getOriginalFilename();

		// create o/p streams represents empty destination files
		OutputStream osResume = new FileOutputStream(file.getAbsolutePath() + "\\" + resumeFileName);
		OutputStream osPhoto = new FileOutputStream(file.getAbsolutePath() + "\\" + photoFileName);

		// perform file copy opreations
		IOUtils.copy(isResume, osResume);
		IOUtils.copy(isPhoto, osPhoto);

		// close streams
		isResume.close();
		osResume.close();
		isPhoto.close();
		osPhoto.close();

		// prepare Entity class obj from moel class obj
		JobSeekerInfo jsInfo = new JobSeekerInfo();
		jsInfo.setJsName(data.getJsName());
		jsInfo.setAddress(data.getAddress());
		jsInfo.setResumePath(file.getAbsolutePath());
		jsInfo.setPhotoPath(file.getAbsolutePath());

		// use service
		String msg = service.registerJobSeekersInfo(jsInfo);

		// keep the uploaded file names and location in model attributes
		map.put("file1", resumeFileName);
		map.put("file2", photoFileName);
		map.put("resultMsg", msg);

		// return LVN
		return "show_result";
	}

	@GetMapping("/list_js")
	public String showReport(Map<String, Object> map) {
		System.out.println("JobSeekerController.showReport()");
		// use service
		List<JobSeekerInfo> list = service.fetchAllJobSeekerInfos();
		System.out.println(list.size());

		// add result to model attributes
		map.put("jsList", list);

		// return LVN
		return "show_report";
	}

	@GetMapping("/download")
	public String fileDownload(HttpServletResponse res, @RequestParam("jsId") Integer id,
			@RequestParam("type") String type) throws Exception {

		// get path of the file to be downloaded
		String filePath = null;
		if (type.equalsIgnoreCase(filePath))
			filePath = service.fetchResumePathByJsId(id);
		else
			filePath = service.fetchPhotoPathByJsId(id);

		System.out.println(filePath);

		// create file object representing file to be downloaded
		File file = new File(filePath);

		// get the length of the file and make it as the response content type
		res.setContentLengthLong(file.length());

		// get MIME type of the file and make it as the response content type
		String mimeType = sc.getMimeType(filePath);
		mimeType = mimeType == null ? "application/octet-stream" : mimeType;
		res.setContentType(mimeType);

		// create Input stream pointing to resonse obj
		InputStream is = new FileInputStream(file);
		// create Output stream pointing to resonse obj
		OutputStream os = res.getOutputStream();

		// instruct the browser to give file content as down load able file
		res.setHeader("Content-Disposition", "attachment;fileName=" + file.getName());

		// write file content to response obj
		IOUtils.copy(is, os);

		// close streams
		os.close();
		is.close();

		return null;
	}

}
