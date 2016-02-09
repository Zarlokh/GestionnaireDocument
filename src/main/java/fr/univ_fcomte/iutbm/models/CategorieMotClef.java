package fr.univ_fcomte.iutbm.models;

import java.util.ArrayList;
import java.util.List;

public class CategorieMotClef {
	private String nom;
	private Domaine domaine;
	private List<MotClef> motClef;
	
	public CategorieMotClef(String nom, Domaine domaine){
		this.setNom(nom);
		this.setMotClef(new ArrayList<MotClef>());
		this.setDomaine(domaine);
	}

	public String getNom() {
		return this.nom;
	}

	public List<MotClef> getMotClef() {
		return this.motClef;
	}
	public Domaine getDomaine() {
		return this.domaine;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setMotClef(List<MotClef> motClef) {
		this.motClef = motClef;
	}
	
	public void setDomaine(Domaine domaine){
		this.domaine = domaine;
	}
	
	
}
