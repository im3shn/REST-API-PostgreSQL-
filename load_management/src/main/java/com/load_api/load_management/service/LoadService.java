package com.load_api.load_management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.load_api.load_management.entities.loadEntity;

@Component
public interface LoadService  {
	List<loadEntity> getShipperLoads(long shipperId);
	Optional<loadEntity> getLoads(String loadId);
	void newLoad(loadEntity load);
	loadEntity updateLoad(loadEntity load);
	void deleteLoad(String loadId);
	
}
