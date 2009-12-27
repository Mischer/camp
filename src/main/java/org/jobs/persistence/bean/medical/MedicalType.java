package org.jobs.persistence.bean.medical;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.jobs.persistence.bean.Staff;

@Entity
@Table(name="medical_type")
public class MedicalType implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="answerableDoctor")
	private Staff answerable_doctor;
	
	
	public MedicalType() {
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Staff getAnswerable_doctor() {
		return answerable_doctor;
	}

	public void setAnswerable_doctor(Staff answerableDoctor) {
		answerable_doctor = answerableDoctor;
	}
	
}
