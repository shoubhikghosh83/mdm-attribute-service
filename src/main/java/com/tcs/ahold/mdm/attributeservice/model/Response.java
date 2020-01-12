package com.tcs.ahold.mdm.attributeservice.model;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Response {

	private String statusCode;
	private String errorDec;
	private Object Result;
}
