package com.devsuperior.dsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.services.MovieService;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {
	
	@Autowired
	private MovieService service;

	@GetMapping
	public Page<MovieDTO> findAll(Pageable pageable) {
		return service.findAll(pageable);
	}
	
	@GetMapping(value = "/{id}")
	public MovieDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}

	@GetMapping(value = "/functionone")
	public String functionone() {
		return "(setData, setLoading) => { let info = ['']; const counts = {}; const structuredData = [{}]; info = dataSource.map((item, index) => { return item.stage; }); info.forEach(function (x) { counts[x] = (counts[x] || 0) + 1; }); for (var key in counts) { if (counts.hasOwnProperty(key)) { structuredData.push({ arg: key, val: counts[key] }); } } setData(structuredData); setLoading(false); }";
	}

	@GetMapping(value = "/functiontwo")
	public String functiotwo() {
		return "(setData, setLoading) => { let info = ['']; const counts = {}; const structuredData = [{}]; info = dataSource.map((item, index) => { return item.absenceType.name; }); info.forEach(function (x) { counts[x] = (counts[x] || 0) + 1; }); for (var key in counts) { if (counts.hasOwnProperty(key)) { structuredData.push({ arg: key, val: counts[key] }); } } setData(structuredData); setLoading(false); }";
	}
}
