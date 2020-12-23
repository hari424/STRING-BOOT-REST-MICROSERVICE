package com.nt.bindings;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
@XmlRootElement
@Data
public class PassengerInfo {
	private String fname;
	private String lname;
	private String doj;
	private String trainNum;
	private String from;
	private String to;
}
