package org.jobs.persistence.bean.medical;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.jobs.persistence.bean.Service;

@Entity
@Table(name="medical")
public class Medical extends Service {

	private static final long serialVersionUID = 1L;
	
	@Column(name="desciption")
	private String descriptions;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinTable(name="medical_medicalType", 
			joinColumns={ @JoinColumn(name="medical_id")},
			inverseJoinColumns={@JoinColumn(name="medicalType_id")}
	)	
	private Set<MedicalType> medicalTypes = new HashSet<MedicalType>();	
	
	public Medical() {
	}


	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}


	public Set<MedicalType> getMedicalTypes() {
		return medicalTypes;
	}


	public void setMedicalTypes(Set<MedicalType> medicalTypes) {
		this.medicalTypes = medicalTypes;
	}
	
}
