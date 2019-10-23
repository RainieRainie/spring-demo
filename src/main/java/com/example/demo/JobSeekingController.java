package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = {"/api/address/"})
public class JobSeekingController {
    @Value("${rylie.suburb}")
    private String rylieSuburb;

    private static final Logger LOG = LoggerFactory.getLogger(JobSeekingController.class);

    @RequestMapping(value = "/rylie", method = RequestMethod.GET)
    public JobSeeking SearchQASAddress() {

        JobSeeking jobSeeking = new JobSeeking();
        jobSeeking.setSuburb(rylieSuburb);

        return jobSeeking;
    }


}
