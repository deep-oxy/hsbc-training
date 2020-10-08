package com.hsbc.tr.spring;

public class Mail {
	private String toAddress;
	private String fromAddress;
	private Message message;

	public Mail() {

	}

	public String getToAddress() {
		return toAddress;
	}

	public String getFromAddress() {
		return fromAddress;
	}

	public Message getMessage() {
		return message;
	}

	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

}
