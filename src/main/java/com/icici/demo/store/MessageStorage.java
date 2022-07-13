package com.icici.demo.store;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class MessageStorage {
	
	private List<String> list=new ArrayList<String>();
	
	public void put(String message) {
		list.add(message);
	}
	
	public String getAll() {
		return list.toString();
	}

}
