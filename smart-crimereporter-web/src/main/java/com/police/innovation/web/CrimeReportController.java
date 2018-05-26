package com.police.innovation.web;


import com.police.innovation.model.CrimeReport;
import com.police.innovation.persistance.CrimeReportRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@EnableGlobalMethodSecurity(securedEnabled = false)
public class CrimeReportController {
    Logger LOG = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    private CrimeReportRepo crimeReportRepo;

    @GetMapping(path = "/")
    public String editTokenEndpoint(@ModelAttribute CrimeReport crimeReport) {
        LOG.info("CrimeReport home page");
        return "crimeReport";
    }

    @PostMapping(path = "/")
    public String newApiMonitor(Model model, @ModelAttribute CrimeReport crimeReport) {
        crimeReport.initiateId();
        LOG.info("CrimeReport for {} received", crimeReport.getId());
        crimeReportRepo.save(crimeReport);
        LOG.info("CrimeReport for {} saved", crimeReport.getId());
        return "result";
    }

    @GetMapping(path = "/crimeReportTester")
    public String crimeReportTester(@ModelAttribute CrimeReport crimeReport) {
        LOG.info("CrimeReport Tester page");
        return "crimeReportTester";
    }
}
