package com.nt.bindings;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
@XmlRootElement
@Data
public class TicketInfo {
	private Integer ticketId;
	private String from;
	private String to;
	private String ticketPrice;
	private String pnrStatus;
}
