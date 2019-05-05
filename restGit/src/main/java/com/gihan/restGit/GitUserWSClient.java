package com.gihan.restGit;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.spec.ClientBuilderImpl;

import com.gihan.restwsclient.model.GitUser;

public class GitUserWSClient {

	

	public static void main(String[] args) {

		Client client = ClientBuilder.newClient();

		WebTarget target = client.target("https://api.github.com/users/octocat");
		
				
		Builder request = target.request();
		
		//Response response=request.get();
		
		
		GitUser gu= request.get(GitUser.class);
		System.out.println(gu.getName());
	}

}
