package com.gihan.restGit;

import java.awt.PageAttributes.MediaType;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;

import com.gihan.restwsclient.model.GitUser;


public class testRestClient {
	
	
public static void main(String[] args) {
	
	
	Client client=ClientBuilder.newClient();
	
	Response response= client.target("https://api.github.com/users/octocat/followers").request().get();
	
	System.out.println(response.getStatus());
	
	
	
	
	
	
	
	
	
}
}
