package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Author {
	
	@Value("yashwant kanetkar")
	private String authorName;
	@Value("Ajay Sharma")
	private String address;

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Author(String authorName, String address) {
		super();
		this.authorName = authorName;
		this.address = address;
	}

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Author [authorName=" + authorName + ", address=" + address + "]";
	}

}
