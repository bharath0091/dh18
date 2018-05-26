package com.police.innovation.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.police.innovation.model.CrimeReport;
import com.police.innovation.persistance.CrimeReportRepo;

@Controller
public class CrimeReportController {
    Logger LOG = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    private CrimeReportRepo crimeReportRepo;

    @GetMapping(path = "/")
    public String editTokenEndpoint(@ModelAttribute CrimeReport crimeReport) {
        LOG.info("CrimeReport home page");
        return "crimeReport";
    }


}
