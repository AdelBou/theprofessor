package com.jmasters.demo.model.Depot;


import javax.persistence.*;
import java.util.Set;

/**
 * @author cfsc
 * @version 1.0
 * @created 07-mars-2018 14:28:36
 */
@Entity
public class Information {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int designationInfo;
	private int valeur;
	private String contenu;
	private  long coef;
	private boolean valide;
	private boolean verifie;
	private int note ;
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="id_dossier")
	private Dossier dossier;
	@OneToMany(mappedBy = "information")
	private Set<PieceJointe> pieceJointes;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDesignationInfo() {

		return designationInfo;
	}

	public void setDesignationInfo(int designationInfo) {
		this.designationInfo = designationInfo;
	}


	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public long getCoef() {
		return coef;
	}

	public void setCoef(long coef) {
		this.coef = coef;
	}

	public boolean isValide() {
		return valide;
	}

	public void setValide(boolean valide) {
		this.valide = valide;
	}

	public boolean isVerifie() {
		return verifie;
	}

	public void setVerifie(boolean verifie) {
		this.verifie = verifie;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public Dossier getDossier() {
		return dossier;
	}

	public void setDossier(Dossier dossier) {
		this.dossier = dossier;
	}

	public Set<PieceJointe> getPieceJointes() {
		return pieceJointes;
	}

	public void setPieceJointes(Set<PieceJointe> pieceJointes) {
		this.pieceJointes = pieceJointes;
	}

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public Information() {
	}

	@Override
	public String toString() {
		return "Information{" +
				"id=" + id +
				", designationInfo=" + designationInfo +
				", valeur=" + valeur +
				", contenu='" + contenu + '\'' +
				", coef=" + coef +
				", valide=" + valide +
				", verifie=" + verifie +
				", note=" + note +
				", dossier=" + dossier +
				", pieceJointes=" + pieceJointes +
				'}';
	}
}