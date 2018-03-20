package com.jmasters.demo.model.Users;


import javax.persistence.*;
import java.util.Set;

/**
 * @author cfsc
 * @version 1.8
 * @created 07-mars-2018 14:27:52
 */
@Entity
public class Domaine {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String designation;
	@OneToMany(mappedBy = "domaine")
	private Set<Specialite> specialites;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Set<Specialite> getSpecialites() {
		return specialites;
	}

	public void setSpecialites(Set<Specialite> specialites) {
		this.specialites = specialites;
	}

	public Domaine() {
	}

	public Domaine(String designation, Set<Specialite> specialites) {
		this.designation = designation;
		this.specialites = specialites;
	}

}