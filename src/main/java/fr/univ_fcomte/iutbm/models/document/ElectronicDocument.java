package fr.univ_fcomte.iutbm.models.document;

public class ElectronicDocument extends Document{
	
	private String link;
	
	public ElectronicDocument(String title, String link){
		super(title);
		this.setLink(link);
	}
	
	public String getLink() { return this.link; }
	
	public void setLink(String link) { this.link = link; }
}
