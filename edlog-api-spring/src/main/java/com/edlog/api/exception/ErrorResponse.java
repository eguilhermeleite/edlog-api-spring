package com.edlog.api.exception;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ErrorResponse {
	
	public ErrorResponse(String message, int status) {
	}
	private int status;
	private String message;
	private List<String> errors;
	

}
