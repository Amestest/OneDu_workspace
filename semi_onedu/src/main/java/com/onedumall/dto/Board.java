package com.onedumall.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Board {
	
	private int QUESTION_NO;
	private String QUESTION_INFO;
	private String QUESTION_DATE;
	private int QUESTION_VIEW;
}
