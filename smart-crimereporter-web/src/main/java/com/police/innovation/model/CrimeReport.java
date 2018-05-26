package com.police.innovation.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;

//@Document(collection = "CrimeReportRepo")
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
	private List<String> others;
	
}
