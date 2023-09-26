package com.geekster.JobSearchPortal.controller;


import com.geekster.JobSearchPortal.model.Job;
import com.geekster.JobSearchPortal.model.JobType;
import com.geekster.JobSearchPortal.service.JobService;
import jakarta.validation.constraints.Email;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class JobController {

    @Autowired
    JobService jobService;

    @PostMapping("job")
    public String postJob(@RequestBody Job job) {
        return jobService.postJob(job);
    }

    @PostMapping("jobs")
    public String postJobs(@RequestBody List<Job> jobs) {
        return jobService.postJobs(jobs);
    }

    @GetMapping("jobs")
    public Iterable<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("job/{jobId}")
    public Optional<Job> getJobById(@PathVariable Long jobId) {
        return jobService.getJobById(jobId);
    }

    @GetMapping("jobs/type/{jobType}")
    public List<Job> getAllSameTypeJobs(@PathVariable JobType jobType) {
        return jobService.getAllSameTypeJobs(jobType);
    }

    @GetMapping("jobs/salary/range/{salaryRange}")
    public List<Job> getAllJobsInASalaryRange(@PathVariable Double salaryRange) {
        return jobService.getAllJobsInASalaryRange(salaryRange);
    }

    @GetMapping("jobs/company/")
    public List<Job> getAllJobsWithTheSameCompany(@RequestParam("companyName") String companyName) {
        return jobService.getAllJobsWithTheSameCompany(companyName);
    }

    @PutMapping("job/id/{jobId}/Salary/{newSalary}")
    public String updateSalaryById(@PathVariable Long jobId, @PathVariable Double newSalary) {
        return jobService.updateSalaryById(jobId, newSalary);
    }

    @PutMapping("job/id/{jobId}/location")
    public String updateLocationById(@PathVariable Long jobId, @RequestParam String newLocation) {
        return jobService.updateLocationById(jobId, newLocation);
    }

    @PutMapping("job/id/{jobId}/email")
    public String updateEmailById(@PathVariable Long jobId, @Email @RequestParam String newEmail) {
        return jobService.updateEmailById(jobId, newEmail);
    }

    @PutMapping("jobs/salaryHike/jobType/{jobType}")
    public String updateSalaryOfSimilarJobType(@PathVariable JobType jobType) {
        return jobService.updateSalaryOfSimilarJobType(jobType);
    }

    @DeleteMapping("job/delete/id/{jobId}")
    public String removeJobById(@PathVariable Long jobId) {
        return jobService.removeJobById(jobId);
    }

    @DeleteMapping("jobs/company/{companyName}")
    public String removeAllJobsOfTheSameCompany(@PathVariable String companyName) {
        return jobService.removeAllJobsOfTheSameCompany(companyName);
    }
}