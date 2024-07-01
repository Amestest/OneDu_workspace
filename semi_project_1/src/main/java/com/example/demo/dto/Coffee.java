package com.example.demo.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Coffee {
	private int coffee_id;
	private String coffee_name;
	private String coffee_description;
	private String coffee_cuppingnote;
	private String coffee_image_path;
	private int coffee_sour;
	private int coffee_bitter;
	private int coffee_sweet;
	private int coffee_body;
	private int coffee_flavor;
}
