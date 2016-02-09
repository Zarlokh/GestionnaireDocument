package fr.univ_fcomte.iutbm.models.document;

import java.util.ArrayList;
import java.util.List;

import fr.univ_fcomte.iutbm.models.MotClef;
import fr.univ_fcomte.iutbm.models.Note;

public class Document {
	private String title;
	private List<Note> note;
	private List<MotClef> motClefs;
	
	public Document(String title){
		this.setTitle(title);
		this.setNote(new ArrayList<Note>());
		this.setMotsClef(new ArrayList<MotClef>());
	}
	
	public String getTitle(){ return this.title; }
	public List<Note> getNote(){ return this.note; }
	public List<MotClef> getMotClef(){ return this.motClefs; }
	
	public void setTitle(String title) { this.title = title; }
	public void setNote(List<Note> note) { this.note = note; }
	public void setMotsClef(List<MotClef> motClefs){ this.motClefs = motClefs; }
}
