package com.tcs.ahold.mdm.attributeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.ahold.mdm.attributeservice.model.Attribute;
import com.tcs.ahold.mdm.attributeservice.model.Response;
import com.tcs.ahold.mdm.attributeservice.service.AttributeService;


@RestController
@RequestMapping(value="/mdm/api/attribute-service")
public class AttributeController {
	
	private final AttributeService attsrv;
	
	@Autowired
	public AttributeController(final AttributeService attsrv)
	{
		this.attsrv = attsrv;
	}
	@RequestMapping(value = "/getAttributeById")
	public ResponseEntity<Response> getAttributeById(@RequestParam String id)
	{
		return ResponseEntity.ok(Response.builder().statusCode("200")
				.errorDec("").Result(attsrv.getAttributeById(id)).build() );
	}
	
	@RequestMapping(value = "/getAttributeByName")
	public ResponseEntity<Response> getAttributeByName(@RequestParam String name)
	{
		return ResponseEntity.ok(Response.builder().statusCode("200")
				.errorDec("").Result(attsrv.getByAttributeName(name)).build() );
	}
	
	@RequestMapping(value = "/getAllAttribute")
	public ResponseEntity<Response> getAllAttribute()
	{
		return ResponseEntity.ok(Response.builder().statusCode("200")
				.errorDec("").Result(attsrv.getAll()).build() );
	}
	
	@RequestMapping(value = "/addModifyCategory", method = RequestMethod.POST)
	public ResponseEntity<Response> addModifyAttribute(@RequestBody Attribute att, @RequestParam String activity)
	{
		attsrv.addModifyAttribute(activity, att);
		return ResponseEntity.ok(Response.builder().statusCode("200")
				.errorDec("").Result("Updated").build() );
	}

}
