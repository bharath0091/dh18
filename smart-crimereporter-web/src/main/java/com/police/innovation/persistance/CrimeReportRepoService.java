package com.police.innovation.persistance;

import com.police.innovation.model.CrimeReport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CrimeReportRepoService {
	Logger LOG = LoggerFactory.getLogger(this.getClass().getName());

	@Autowired
	private CrimeReportRepo crimeReportRepo;

	public void updateSentNotifications(CrimeReport crimeReport) {
		crimeReport.setEmailFlag(true);
		crimeReportRepo.save(crimeReport);
		LOG.info("CrimeReport for {} is sent", crimeReport.getEmailId());
	}

	public List<CrimeReport> getUserSearchCriteria() {
		return crimeReportRepo.findAll();
	}

}
