package com.jmasters.demo.model.Depot;


import com.jmasters.demo.model.Evaluation.Cun;
import com.jmasters.demo.model.Users.Candidat;
import com.jmasters.demo.model.Users.Validateur;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

/**
 * @author cfsc
 * @version 1.0
 * @created 07-mars-2018 14:29:01
 */

@Entity
public class Dossier {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private Date date;
	@OneToMany(mappedBy = "dossier")
	private Set<Information> informations;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "candidat_id")
	private Candidat candidat;

	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="id_cun")
	private Cun cun ;

	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="id_validateur")
	private Validateur validateur;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Set<Information> getInformations() {
		return informations;
	}

	public void setInformations(Set<Information> informations) {
		this.informations = informations;
	}

	public Dossier() {
	}
}