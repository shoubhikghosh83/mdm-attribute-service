package com.tcs.ahold.mdm.attributeservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.ahold.mdm.attributeservice.model.Attribute;
import com.tcs.ahold.mdm.attributeservice.repository.AttributeRepository;



@Service
public class AttributeService {

	private final AttributeRepository attrepo;
	
	
	@Autowired
	public AttributeService(final AttributeRepository attrepo)
	{
		this.attrepo = attrepo;
	}
	
	
	
	public Optional<Attribute> getAttributeById(String id)
	{
		return attrepo.findById(id);
	}
	
	public Optional<Attribute> getByAttributeName(String name)
	{
		return attrepo.findByAttName(name);
	}
	
	public List<Attribute> getAll()
	{
		return (List<Attribute>) attrepo.findAll();
	}
	
	public boolean addModifyAttribute(String activity, Attribute att)
	{
		if(activity.equalsIgnoreCase("A"))
		{
			attrepo.save(att);
		}
		return true;
	}
}
