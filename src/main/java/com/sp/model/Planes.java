package com.sp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Planes {

	
	@Id
	@SequenceGenerator(name = "PLANE_SEQ", allocationSize = 1, sequenceName = "PLANE_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PLANE_SEQ")
	private Long id;
	private String planeName;
	private String source;
	private String destination;
	private String travelDate;
	
	public Planes(String planeName, String source, String destination, String travelDate) {
		this.planeName = planeName;
		this.source = source;
		this.destination = destination;
		this.travelDate = travelDate;
	}
	
	
	
	
}
