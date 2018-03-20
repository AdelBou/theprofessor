package com.jmasters.demo.model.Depot;


import javax.persistence.*;

/**
 * @author cfsc
 * @version 1.0
 * @created 07-mars-2018 14:18:14
 */
@Entity
public class PieceJointe {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String url;
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="id_information")
	private Information information;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Information getInformation() {
		return information;
	}

	public void setInformation(Information information) {
		this.information = information;
	}

	public PieceJointe() {
	}
}