package fr.univ_fcomte.iutbm.models;

import fr.univ_fcomte.iutbm.models.document.Document;

public class Note {

	private Etoile note;
	private Critere critere;
	private Document document;
	
	public Note(Etoile note, Critere critere, Document document){
		this.setNote(note);
		this.setCritere(critere);
		this.setDocument(document);
	}
	
	public Etoile getNote(){ return this.note; }
	public Critere getCritere(){ return this.critere; }
	public Document getDocument(){ return this.document; }
	
	public void setNote(Etoile note){ this.note = note; }
	public void setCritere(Critere critere){ this.critere = critere; }
	public void setDocument(Document document) { this.document = document; }
}
