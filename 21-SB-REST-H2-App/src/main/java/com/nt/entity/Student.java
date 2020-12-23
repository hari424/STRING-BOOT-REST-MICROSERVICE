package com.nt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "STUDENT_DTLS")
public class Student {
	@Id
	@GeneratedValue
	private Integer sid;
	private String sname;
	private Integer marks;
}
