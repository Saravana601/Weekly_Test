package com.geekster.JobSearchPortal.service;

import com.geekster.JobSearchPortal.model.Job;
import com.geekster.JobSearchPortal.model.JobType;
import com.geekster.JobSearchPortal.repo.IJobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    @Autowired
    IJobRepo jobRepository;

    // Get All the Jobs
    public Iterable<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    // Get Job By ID
    public Optional<Job> getJobById(Long jobId) {
        return jobRepository.findById(jobId);
    }

    // Add Job
    public String postJob(Job job) {
        jobRepository.save(job);
        return "New Job Posted !!!";
    }

    // Add list of Jobs
    public String postJobs(List<Job> jobs) {
        jobRepository.saveAll(jobs);
        return "New Jobs Posted !!!";
    }

    // Update Salary By I'd
    public String updateSalaryById(Long jobId, Double newSalary) {
        Job job = jobRepository.findById(jobId).orElse(null);
        if (job == null) {
            return "Please Enter the Correct job id";
        }
        job.setSalary(newSalary);
        jobRepository.save(job);
        return "Salary updated!!!";
    }

    // Update Location By I'd
    public String updateLocationById(Long jobId, String newLocation) {
        Job job = jobRepository.findById(jobId).orElse(null);
        if (job == null) {
            return "Please Enter the Correct job id";
        }
        job.setLocation(newLocation);
        jobRepository.save(job);
        return "Location updated!!!";
    }

    public String updateEmailById(Long jobId, String newEmail) {
        Job job = jobRepository.findById(jobId).orElse(null);
        if (job == null) {
            return "Please Enter the Correct job id";
        }
        job.setCompanyEmail(newEmail);
        jobRepository.save(job);
        return "Email updated!!!";
    }

    // Remove Job By I'd
    public String removeJobById(Long jobId) {
        Job job = jobRepository.findById(jobId).orElse(null);
        if (job == null) {
            return "Id Not Found";
        }

        jobRepository.delete(job);
        return "Job Removed";
    }

    // Get Jobs By Type
    public List<Job> getAllSameTypeJobs(JobType jobType) {
        return jobRepository.findByJobType(jobType);
    }

    // Get Jobs Greater than Salary
    public List<Job> getAllJobsInASalaryRange(Double salaryRange) {
        return jobRepository.findBySalaryGreaterThanEqual(salaryRange);
    }

    // Get Jobs with the Same Company
    public List<Job> getAllJobsWithTheSameCompany(String companyName) {
        return jobRepository.findByCompanyName(companyName);
    }

    // Remove Jobs of the Same Company
    public String removeAllJobsOfTheSameCompany(String companyName) {
        jobRepository.deleteJobsFromTheSameCompany(companyName);
        return "Jobs Deleted from the Same Company";
    }

    // Update JobType
    public String updateSalaryOfSimilarJobType(JobType jobType) {
        jobRepository.updateAllSalaryOfSimilarType(jobType.name());
        return "Salaries Updated";
    }
}
