package com.tcs.ahold.mdm.attributeservice.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Attribute {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String attrId;
	private String attrName;
	private String attrType;
	private String attrDataType;
	private String createdBy;
	private Timestamp createdTs;
	private String updatedBy;
	private Timestamp updatedTs;
}
