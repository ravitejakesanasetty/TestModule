package com.sp;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sp.doa.PlaneDao;
import com.sp.model.Planes;

@SpringBootApplication
public class PlaneDetailsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PlaneDetailsApplication.class, args);
	}
	
	@Autowired
	private PlaneDao dao;

	@Override
	public void run(String... args) throws Exception {
		List<Planes> asList = Arrays.asList(
				new Planes("AirIndia","Hyderabad","Delhi","27/09/2022"),
				new Planes("KINGFISH","Hyderabad","Delhi","29/09/2022"),
				new Planes("Domestic","Chennai","Delhi","01/09/2022"),
				new Planes("PlanesIndia","Hyderabad","Delhi","05/09/2022"),
				new Planes("HyderabdEpress","Hyderabad","Delhi","27/09/2022"),
				new Planes("USExpress","banlogore","chennai","27/09/2022")
				
				);
		
		
		dao.saveAll(asList);
		
	}

}
