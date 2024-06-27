package com.example.dto;

import java.util.Date;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Post {
	private int post_no;
	private int member_no;
	private String post_info;
	private Date post_date;
	private String post_title;
	private String post_view;
	private String post_date_str; // DB 관련이 없지만 String으로 문자값을 받아 변환해서 보여주기위해 작성하는 필드 겟 셋을 위해 작성
	
	private int question_no;
	private int product_no; 
	private String question_info;
	private Date question_date;
	private String question_view;
	private String question_title;
	private String question_date_str;
	
}
