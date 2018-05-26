package com.police.innovation.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.police.innovation.model.CrimeReport;
import com.police.innovation.persistance.CrimeReportRepo;

@RestController
public class CrimeReportController {
    Logger LOG = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    private CrimeReportRepo crimeReportRepo;

    @GetMapping(path = "/")
    public CrimeReport getReportTest(@ModelAttribute CrimeReport crimeReport) {
        LOG.info("CrimeReport home page");
        return new CrimeReport();
    }


    @PostMapping(path = "/crimes")
    public CrimeReport addReport(@ModelAttribute CrimeReport crimeReport) {
        LOG.info("Entered controller");
        
        
        
        
        
        crimeReportRepo.save(crimeReport);
        return new CrimeReport();
    }
}
