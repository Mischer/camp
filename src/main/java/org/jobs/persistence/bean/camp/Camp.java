package org.jobs.persistence.bean.camp;

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
@Table(name="camp")
public class Camp extends Service {

	private static final long serialVersionUID = 1L;
	
	@Column(name="desciption")
	private String descriptions;

	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinTable(name="camp_campGroup", 
			joinColumns={ @JoinColumn(name="camp_id")},
			inverseJoinColumns={@JoinColumn(name="campGroup_id")}
	)	
	private Set<CampGroup> campGroups = new HashSet<CampGroup>(); 
	
	public Camp() {
		// TODO Auto-generated constructor stub
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	public Set<CampGroup> getCampGroups() {
		return campGroups;
	}

	public void setCampGroups(Set<CampGroup> campGroups) {
		this.campGroups = campGroups;
	}
	
}
