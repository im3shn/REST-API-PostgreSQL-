package com.load_api.load_management.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.load_api.load_management.entities.loadEntity;

import com.load_api.load_management.service.LoadService;

@RestController
@RequestMapping("/load")
public class LoadController {
	
	@Autowired
	private LoadService loadService;

	public LoadController(LoadService loadService) {
		this.loadService = loadService;
	}
	
	@GetMapping("/{loadId}")
	public Optional<loadEntity> getLoads(@PathVariable String loadId){
		return loadService.getLoads(loadId);
	}
	
	@GetMapping
	public List<loadEntity> getShipperLoads(@RequestParam long shipperId){
		return loadService.getShipperLoads(shipperId);
	}
	
	@PostMapping
	public ResponseEntity<String> newLoad( @RequestBody loadEntity load) {
		loadService.newLoad(load);
		return new ResponseEntity<>("Loads details added successfully.", HttpStatus.CREATED);
	}
	
	@PutMapping
	public loadEntity updateLoad(@RequestBody loadEntity load) {
		return loadService.updateLoad(load);
	}
	
	@DeleteMapping("/{loadId}")
	public void deleteLoad(@PathVariable String loadId) {
		loadService.deleteLoad(loadId);
	}
	
}
