package com.police.innovation.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CrimeReport {
	private String type;
	private String date;
	private String time;
	private String address;
	private String locality;
	private String description;
	private String accuser;
	private Map<String, List<String>> index;
	private List<String> others;
	private Convict convict;
	
	
}
