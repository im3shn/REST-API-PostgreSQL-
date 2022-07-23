package com.load_api.load_management.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.load_api.load_management.entities.loadEntity;


@Repository
public interface LoadRepository extends JpaRepository<loadEntity , Long> {

	List<loadEntity> findAllByShipperId(long shipperId);
		

}
