package com.gihan.restwsclient.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="GitUser")
public class GitUser {
	
	private String login;
	private long id;
	private String name;
	
	
	 
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
