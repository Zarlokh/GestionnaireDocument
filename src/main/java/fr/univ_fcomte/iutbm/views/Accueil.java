package fr.univ_fcomte.iutbm.views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Accueil extends JFrame{
	private JComboBox listeDomaine;
	
	private JPanel buildContentPane(){
		JPanel jPanel = new JPanel();
		JPanel jPanel2 = new JPanel();
		jPanel.setLayout(new BorderLayout());
		
		JPanel jPanel3 = new JPanel();
		jPanel3.setLayout(new BorderLayout());
		
		JPanel jPanel4 = new JPanel();
		JLabel jLabel1 = new JLabel("Categories");
		JTextField jTextField = new JTextField("",20);
		JLabel jLabel2 = new JLabel("Mot clés");
		JTextField jTextField2 = new JTextField("",20);
		
		jPanel4.add(jLabel1);
		jPanel4.add(jTextField);
		jPanel4.add(jLabel2);
		jPanel4.add(jTextField2);
		Object[] element = new Object[]{""};
		listeDomaine= new JComboBox(element);
		listeDomaine.setPrototypeDisplayValue("Nom du domaine");
		JButton jb = new JButton("Ajouter un domaine");		
		jPanel2.add(listeDomaine);
		jPanel2.add(jb);
		jPanel.add(jPanel2,BorderLayout.NORTH);
		Object[][] data = {};
	    String  title[] = {"Mot clés", "Critères"};
	    JTable tableau = new JTable(data, title);
	    JList doc = new JList(data);
	    jPanel.add((new JScrollPane(tableau)),BorderLayout.CENTER);
	    jPanel3.add(jPanel4,BorderLayout.NORTH);
	    jPanel3.add((new JScrollPane(doc)),BorderLayout.CENTER);
	    jPanel.add(jPanel3,BorderLayout.SOUTH);
		return jPanel;
	}
	
	public Accueil(){
		setContentPane(buildContentPane());
		setSize(1600,800);
		setVisible(true);
	}
}
