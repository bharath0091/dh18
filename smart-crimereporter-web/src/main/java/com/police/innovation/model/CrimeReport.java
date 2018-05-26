package com.police.innovation.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Document(collection = "CrimeReportRepo")
@Getter
@Setter
public class CrimeReport {
	private String emailId;
	private String departureStation;
	private String arrivalStation;
	private String date;
	private BigDecimal lastAvailablePrice= BigDecimal.valueOf(10.0);
	private BigDecimal todayAvailablePrice= BigDecimal.valueOf(10.0);
	private LocalDateTime lastUpdated;
	private boolean emailFlag;

	@Id
	private String id;

	public void initiateId() {
		id = emailId + departureStation + arrivalStation + date;
	}
}
