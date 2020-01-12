package com.tcs.ahold.mdm.attributeservice.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tcs.ahold.mdm.attributeservice.model.Attribute;


@Repository
public interface AttributeRepository extends CrudRepository<Attribute, String>{
	
	Optional<Attribute> findByAttName(String attName);

}
