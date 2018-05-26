package com.police.innovation.web;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.police.innovation.model.CrimeReport;
import com.police.innovation.model.FinalReports;
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
    public FinalReports addReport(@ModelAttribute CrimeReport crimeReport) {
        LOG.info("Entered controller to fetch past crime reports");
        
        List<CrimeReport> pastCrimeReport = crimeReportRepo.findPast(crimeReport.getType(), crimeReport.getLocality());
        
        if(null != pastCrimeReport && !pastCrimeReport.isEmpty()) {
        	return FinalReports.builder()
        					.crimeReport(pastCrimeReport)
        					.build();
        } else {
        	return FinalReports.builder()
        					.error("There are no matching records found for this crime")
        					.build();
        }
        
       
    }
}
