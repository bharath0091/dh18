package com.police.innovation.persistance;

import com.police.innovation.model.CrimeReport;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CrimeReportRepo extends MongoRepository<CrimeReport, String> {
	
}
