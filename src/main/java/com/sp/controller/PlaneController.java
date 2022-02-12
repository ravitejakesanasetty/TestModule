package com.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sp.model.Planes;
import com.sp.service.PlaneService;

@RestController
@RequestMapping("/planes")
public class PlaneController {

	@Autowired
	private PlaneService service;
	
	
	
	@GetMapping("/all")
	public ResponseEntity<List<Planes>> getListOfPlanes(){
		 List<Planes> listOfPlanes = service.getListOfPlanes();
		 
		 return new ResponseEntity<List<Planes>>(listOfPlanes,HttpStatus.OK); 
	}
	
	
	@GetMapping("/findPlanesFrom")
	public ResponseEntity<List<Planes>> getPlanesFrindStoD(@RequestParam String source,
			@RequestParam String destination){
				 List<Planes> listOfPlanes = service.getPlanesFrom(source,destination);
				return new ResponseEntity<List<Planes>>(listOfPlanes,HttpStatus.OK);	
		
	}
}
