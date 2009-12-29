package org.jobs.persistence.bean.camp;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.jobs.persistence.bean.Client;
import org.jobs.persistence.bean.Sesson;
import org.jobs.persistence.bean.Staff;

@Entity
@Table(name="camp_group")
public class CampGroup implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	@Column(name="name")
	private String name;	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="client_id")
	private Client client;	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="sesson_id")
	private Sesson sesson;
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="vosp_id")
	private Staff vosp;
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="doctor_id")
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
