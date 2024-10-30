package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepo;

@Service
public class DoctorServiceImpl implements IDoctorService {

	@Autowired
	private IDoctorRepo doctorRepo;
	
	@Override
	public String registerDoctor(Doctor doctor) {
		System.out.println("doc Id(before save::"+doctor.getDocId());
		Doctor doc = doctorRepo.save(doctor);
		return "Doctor obj is saved with id value:"+doc.getDocId();	
	}

}
