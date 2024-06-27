package com.onedumall.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Members {
	private int members_no;
	private String members_id;
	private String members_pw;
	private String members_name;
	private String members_email;
	private String members_address; 
	private String members_phone;
	private String members_birth;

}
