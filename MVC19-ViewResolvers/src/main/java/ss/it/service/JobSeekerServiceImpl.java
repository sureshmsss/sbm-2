package ss.it.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ss.it.model.JobSeekerInfo;
import ss.it.repo.JsRepo;

@Service
public class JobSeekerServiceImpl implements JobSeekerService {
	@Autowired
	private JsRepo repo;

	@Override
	public String registerJobSeekersInfo(JobSeekerInfo info) {
		return repo.save(info).getJsId() + " : is saved";
	}

	@Override
	public List<JobSeekerInfo> fetchAllJobSeekerInfos() {
		return repo.findAll();
	}

	@Override
	public String fetchPhotoPathByJsId(Integer id) {
		return repo.getResumePathByJsId(id);
	}

	@Override
	public String fetchResumePathByJsId(Integer id) {
		return repo.getPhotoPathByJsId(id);
	}
}
