package com.sp.doa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sp.model.Planes;

public interface PlaneDao extends JpaRepository<Planes,Long> {

	List<Planes> findBySourceAndDestination(String source, String destination);
 
}
