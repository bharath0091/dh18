package com.police.innovation.model;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder
public class FinalReports {

	private List<CrimeReport> crimeReport;
	private String error;
}
