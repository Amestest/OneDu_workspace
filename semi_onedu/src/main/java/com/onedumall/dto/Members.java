package com.onedumall.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Members {
	private int member_no;
	private String member_id;
	private String member_pw;
	private String member_name;
	private String member_email;
	private String member_address;
	private String member_phone;
	private int member_birth;
}
