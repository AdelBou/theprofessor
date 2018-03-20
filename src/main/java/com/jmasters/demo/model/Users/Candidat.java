package com.jmasters.demo.model.Users;


import com.jmasters.demo.model.Depot.Dossier;

import javax.persistence.*;

/**
 * @author cfsc
 * @version 1.0
 * @created 07-mars-2018 14:27:29
 */
@Entity
public class Candidat extends Compte {

	//public Dossier dossier;
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="id_specialite")
	private Specialite specialite;
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="id_etablissement")
	private Etablissement etablissement;

	@OneToOne(mappedBy = "candidat")
	private Dossier dossier;



	public Specialite getSpecialite() {
		return specialite;
	}

	public void setSpecialite(Specialite specialite) {
		this.specialite = specialite;
	}

	public Etablissement getEtablissement() {
		return etablissement;
	}

	public void setEtablissement(Etablissement etablissement) {
		this.etablissement = etablissement;
	}

	public Candidat() {
	}
}