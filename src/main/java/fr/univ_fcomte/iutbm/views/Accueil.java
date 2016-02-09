package fr.univ_fcomte.iutbm.views;

import java.awt.FlowLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Accueil extends JFrame{
	private JComboBox listeDomaine;
	
	private JPanel buildContentPane(){
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new FlowLayout());
		Object[] element = new Object[]{"domaine1","domaine2"};
		listeDomaine= new JComboBox(element);
		JButton jb = new JButton("Ajouter un domaine");
		//JTextField jTextField= new JTextField("Mot clés");
		//JTextField jTextField2= new JTextField("Catégories");
		jPanel.add(listeDomaine);
		jPanel.add(jb);
		//jPanel.add(jTextField);
		//jPanel.add(jTextField2);
		return jPanel;
	}
	
	public Accueil(){
		setContentPane(buildContentPane());
		setSize(200,200);
		setVisible(true);
	}
}
