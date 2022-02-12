package com.sp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.doa.PlaneDao;
import com.sp.model.Planes;

@Service
public class PlaneService {
	
	@Autowired
	private PlaneDao dao;

	public List<Planes> getListOfPlanes() {
            return dao.findAll();	
        
	}

	public Planes savePlanes(Planes planes) {
		// TODO Auto-generated method stub
		return dao.save(planes);
	}

	public List<Planes> getPlanesFrom(String source, String destination) {
		
		return dao.findBySourceAndDestination(source,destination);
	}

}
