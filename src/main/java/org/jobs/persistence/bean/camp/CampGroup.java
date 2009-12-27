package org.jobs.persistence.bean.camp;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.jobs.persistence.bean.Client;
import org.jobs.persistence.bean.Sesson;
import org.jobs.persistence.bean.Staff;

public class CampGroup implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	@Column(name="name")
	private String name;
	@Column(name="client")
	private Client client;
	@Column(name="sesson")
	private Sesson sesson;
	@Column(name="vospit")
	private Staff vosp;
	@Column(name="doctor")
	private Staff doctor;
	@Column(name="description")
	private String description;
	
	public CampGroup() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Sesson getSesson() {
		return sesson;
	}

	public void setSesson(Sesson sesson) {
		this.sesson = sesson;
	}

	public Staff getVosp() {
		return vosp;
	}

	public void setVosp(Staff vosp) {
		this.vosp = vosp;
	}

	public Staff getDoctor() {
		return doctor;
	}

	public void setDoctor(Staff doctor) {
		this.doctor = doctor;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
