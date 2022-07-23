package com.load_api.load_management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.load_api.load_management.entities.loadEntity;
import com.load_api.load_management.repository.LoadRepository;

@Service
public class LoadServiceImpl implements LoadService {

	@Autowired
	private LoadRepository loadRepository;
	
	public LoadServiceImpl(LoadRepository loadRepository) {
		this.loadRepository = loadRepository;
	}

	@Override
	public List<loadEntity> getShipperLoads(long shipperId) {
		// TODO Auto-generated method stub
		return loadRepository.findAllByShipperId(shipperId);
		
	}

	@Override
	public Optional<loadEntity> getLoads(String loadId) {
		// TODO Auto-generated method stub
		//return loadRepository.findAll();		
		return loadRepository.findById(Long.parseLong(loadId));
	}

	@Override
	public void newLoad(loadEntity load) {
		// TODO Auto-generated method stub
		loadRepository.save(load);
	}

	@Override
	public loadEntity updateLoad(loadEntity load) {
		// TODO Auto-generated method stub
		return loadRepository.save(load);
	}

	@Override
	public void deleteLoad(String loadId) {
		// TODO Auto-generated method stub
		loadRepository.deleteById(Long.parseLong(loadId));

	}

}
