package fr.univ_fcomte.iutbm.models;

import java.util.ArrayList;
import java.util.List;

import fr.univ_fcomte.iutbm.models.document.Document;

public class MotClef {
	
	private String libelle;
	private CategorieMotClef categorie;
	private List<Document> documents;
	
	public MotClef(String libelle, CategorieMotClef categorie){
		this.setLibelle(libelle);
		this.setCategorie(categorie);
		this.setDocuments(new ArrayList<Document>());
	}

	public String getLibelle() { return libelle; }
	public CategorieMotClef getCategorie() { return categorie;	}
	public List<Document> getDocuments() { return documents; }

	public void setLibelle(String libelle) { this.libelle = libelle; }
	public void setCategorie(CategorieMotClef categorie) { this.categorie = categorie; }
	public void setDocuments(List<Document> documents) { this.documents = documents; }
	
	
}
