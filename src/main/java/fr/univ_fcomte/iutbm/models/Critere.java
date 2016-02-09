package fr.univ_fcomte.iutbm.models;

public class Critere {
	private String nom;
	private Domaine domaine;
	
	public Critere(String nom, Domaine domaine){
		this.setNom(nom);
		this.setDomaine(domaine);
	}
	
	public String getNom(){ return this.nom; }
	public Domaine getDomaine() { return this.domaine; }
	
	public void setNom(String nom) { this.nom = nom; }
	public void setDomaine(Domaine domaine) { this.domaine = domaine; }
}
