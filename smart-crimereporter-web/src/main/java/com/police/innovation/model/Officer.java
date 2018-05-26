package com.police.innovation.model;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Officer extends Person {

	private String status;
	private String contact;
	private String locality;
	
}
