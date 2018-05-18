package com.example.RestExample.Resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.example.RestExample.model.MessageModel;
import com.example.RestExample.service.MessageService;

@Path("/messages")
public class MessageResources {
	
	MessageService serv = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<MessageModel> getMessage() {
		return serv.getAll();
	}

}
