package com.onedumall.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
	private int members_birth;
}
