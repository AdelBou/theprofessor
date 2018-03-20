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
	private Boolean verifie;
	private Boolean valide;
	private Boolean evaluated;

    public Boolean getEvaluated() {
        return evaluated;
    }

    public void setEvaluated(Boolean evaluated) {
        this.evaluated = evaluated;
    }

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

    public Boolean getVerifie() {
        return verifie;
    }

    public void setVerifie(Boolean verifie) {
        this.verifie = verifie;
    }

    public Boolean getValide() {
        return valide;
    }

    public void setValide(Boolean valide) {
        this.valide = valide;
    }

    public Candidat getCandidat() {
        return candidat;
    }

    public void setCandidat(Candidat candidat) {
        this.candidat = candidat;
    }

    public Cun getCun() {
        return cun;
    }

    public void setCun(Cun cun) {
        this.cun = cun;
    }

    public Validateur getValidateur() {
        return validateur;
    }

    public void setValidateur(Validateur validateur) {
        this.validateur = validateur;
    }

    public Dossier() {
	}
}