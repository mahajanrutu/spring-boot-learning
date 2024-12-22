package com.nt.model;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor

public class Email {  
	private String to;
	
	private String subject;
	
	private String message;
}