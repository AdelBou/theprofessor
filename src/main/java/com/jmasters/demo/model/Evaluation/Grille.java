package com.jmasters.demo.model.Evaluation;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Set;

/**
 * @author cfsc
 * @version 1.0
 * @created 07-mars-2018 14:28:23
 */
@Entity
public class Grille {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@OneToOne(mappedBy = "grille")
	private Cun cun;
	@OneToMany(mappedBy = "grille")
	private  Set<Critere> criteres;

	public Cun getCun() {
		return cun;
	}

	public void setCun(Cun cun) {
		this.cun = cun;
	}

	public Grille(Cun cun) {
		this.cun = cun;
	}
}