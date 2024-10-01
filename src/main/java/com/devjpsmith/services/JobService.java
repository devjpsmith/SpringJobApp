package com.devjpsmith.services;

import com.devjpsmith.models.JobPost;
import com.devjpsmith.repositories.JobRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobService {
    private final JobRepository _jobRepository;

    public JobService(JobRepository jobRepository) {
        _jobRepository = jobRepository;
    }

    public void addJob(JobPost jobPost) {
        _jobRepository.save(jobPost);
    }

    public List<JobPost> getAllJobs() {
        return _jobRepository.find();
    }
}
