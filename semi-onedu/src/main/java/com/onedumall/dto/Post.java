package com.onedumall.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Post {
	private int post_no;
	/*private String post_info;*/
	private String post_date;
	private String post_title;
	private String post_view;
}
