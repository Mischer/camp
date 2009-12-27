package org.jobs.persistence.bean.camp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.jobs.persistence.bean.Service;

@Entity
@Table(name="camp")
public class Camp extends Service {

	private static final long serialVersionUID = 1L;
	
	@Column(name="desciption")
	private String descriptions;

	@OneToMany
	private CampGroup campGroup; 
	
	public Camp() {
		// TODO Auto-generated constructor stub
	}

	public CampGroup getCampGroup() {
		return campGroup;
	}

	public void setCampGroup(CampGroup campGroup) {
		this.campGroup = campGroup;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}
	
}
