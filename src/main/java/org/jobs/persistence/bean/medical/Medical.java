package org.jobs.persistence.bean.medical;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.jobs.persistence.bean.Service;

@Entity
@Table(name="medical")
public class Medical extends Service {

	private static final long serialVersionUID = 1L;
	
	@Column(name="desciption")
	private String descriptions;
	
	
	@OneToMany
	private MedicalType medicalType;	
	
	public Medical() {
		// TODO Auto-generated constructor stub
	}


	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}


	public MedicalType getMedicalType() {
		return medicalType;
	}


	public void setMedicalType(MedicalType medicalType) {
		this.medicalType = medicalType;
	}

}
