package com.write;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.Address;
import com.pojo.ManiPojo;
import com.pojo.company;

public class Action {
public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
	
	File f=new File("C:\\Users\\SCLPT 059\\eclipse-workspace\\ManiWritte\\src\\test\\resources//mani.json");
	ObjectMapper mapper=new ObjectMapper();
	company c=new company("mani", 12243);
	Address a=new Address("1st", "karur", "tamilnadu");
	Address a1=new Address("2nd", "trichy", "tamilnadu");
	Address a2=new Address("3rd", "chennai", "tamilnadu");
	ArrayList<Address> l= new ArrayList<Address>();
	l.add(a);
	l.add(a1);
	l.add(a2);
	ManiPojo p=new ManiPojo("mani", 536464747, 888, l, c);
	mapper.writeValue(f, p);
	
}
	
	
	
	
}
