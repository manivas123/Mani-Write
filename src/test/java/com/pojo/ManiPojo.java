package com.pojo;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ManiPojo {

	
	private String Name;
	private long PhoneNo;
	private int id;
	private ArrayList<Address> add;
	private company com;
	
}
