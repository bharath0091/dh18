package com.police.innovation.model;

import java.util.List;

import groovy.transform.builder.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Convict extends Person {

	private String address;
	private int numberOfArrests;
	private List<String> crimeTypes;
	private String lastCriminalActivityDate;
	
}
