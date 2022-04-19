package ss.it.service;

import java.util.List;

import ss.it.model.JobSeekerInfo;

public interface JobSeekerService {
	public String registerJobSeekersInfo(JobSeekerInfo info);

	public List<JobSeekerInfo> fetchAllJobSeekerInfos();

	public String fetchResumePathByJsId(Integer id);

	public String fetchPhotoPathByJsId(Integer id);
}
