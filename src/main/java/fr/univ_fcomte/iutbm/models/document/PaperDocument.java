package fr.univ_fcomte.iutbm.models.document;

public class PaperDocument extends Document{

	private String commentaire;
	
	public PaperDocument(String title, String commentaire){
		super(title);
		this.setCommentaire(commentaire);
	}
	
	public String getCommentaire() { return this.commentaire; }
	
	public void setCommentaire(String commentaire) { this.commentaire = commentaire; }
}
