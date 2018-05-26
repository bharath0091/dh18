package com.police.innovation.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import groovyjarjarantlr.collections.List;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

@Document(collection = "CrimeReportRepo")
@Getter
@Setter
public class CrimeReport {
	private String type;
	private String date;
	private String time;
	private String address;
	private String locality;
	private String description;
	private String convict;
	private String accuser;
	private HashMap<String, ArrayList<String>> index;
	
}
