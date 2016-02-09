package fr.univ_fcomte.iutbm.models;

import java.util.ArrayList;
import java.util.List;

public class Domaine {
	private String nom;
	private List<Critere> criteres;
	private List<CategorieMotClef> categoriesMotClef;
	
	public Domaine(String nom, List<CategorieMotClef> categories){
		this.setNom(nom);
		this.setCriteres(new ArrayList<Critere>());
		this.setCategoriesMotClef(categories);
	}
	
	public String getNom(){ return this.nom; }
	public List<Critere> getCriteres() { return this.criteres; }
	public List<CategorieMotClef> getCategoriesMotClef() { return this.categoriesMotClef; }
	
	public void setNom(String nom){ this.nom = nom; }
	public void setCriteres(List<Critere> criteres){ this.criteres = criteres; }
	public void setCategoriesMotClef(List<CategorieMotClef> categoriesMotClef){ this.categoriesMotClef = categoriesMotClef; }
	
}
