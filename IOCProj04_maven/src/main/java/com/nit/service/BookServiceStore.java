package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nit.model.ISubject;
@Component
public class BookServiceStore {
	@Autowired
	@Qualifier("math")
	private ISubject subject;

	public ISubject getSubject() {
		return subject;
	}

	public void setSubject(ISubject subject) {
		this.subject = subject;
	}

	public void storeService() {
		subject.read();
		subject.write();
	}
}
