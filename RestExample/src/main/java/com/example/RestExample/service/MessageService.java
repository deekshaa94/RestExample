package com.example.RestExample.service;

import java.util.ArrayList;
import java.util.List;

import com.example.RestExample.model.MessageModel;

public class MessageService {
	
	public List<MessageModel> getAll(){
		MessageModel m1= new MessageModel(1L,"Deekshaa","Heool");
		MessageModel m2= new MessageModel(2L,"Tandon","hie");
		List<MessageModel> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
	}

}
