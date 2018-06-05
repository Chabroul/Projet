package Musique.Modele;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Morceau {
	
	
	public String numMorceau ;
	public String titre ;
	public String compositeur ;
	public String mesure ;
	public String uniteDuree ;
	public String tonalite ;
	public String notes ;
	public String conteneur ;
	
	
	
	public void LectureFichier () throws IOException 
	  {
		BufferedReader lecteur = null;
	    int k = 0 ,taille=0;
		String ch;
	    String note="" ;
		String [] listefichiers; 
		File repertoire = new File(System.getProperty("user.dir")) ;
		System.out.println(System.getProperty("user.dir")+"/src/");
		listefichiers=repertoire.list(); 
		for(int i=0;i<listefichiers.length;i++)
		{if(listefichiers[i].endsWith(".txt"))taille++ ;} 
		//recuperation du nombre de fichierTxt 
	    String [] fichiertxt = new String [taille]   ;
		for(int i=0;i<listefichiers.length;i++)
		{ 
			if(listefichiers[i].endsWith(".txt"))
			{ 
				
				fichiertxt[k]=new String(listefichiers[i]);
				k++ ;
			} 
		} 
		 JOptionPane jop = new JOptionPane(), jop2 = new JOptionPane();
		    note = (String)JOptionPane.showInputDialog(null, 
		      "Veuillez choisir un fichier texte !",
		      "Musique",
		      JOptionPane.QUESTION_MESSAGE,
		      null,
		      fichiertxt,
		      "Fichier Texte de Musique");
		    try
		    {
			lecteur = new BufferedReader(new FileReader(note));
		      }
		    catch(FileNotFoundException exc)
		      {
			System.out.println("Erreur d'ouverture");
			jop2.showMessageDialog(null, "Erreur d'ouverture de " + note, "Echec", JOptionPane.INFORMATION_MESSAGE);
		     }
		    jop2.showMessageDialog(null, "Analyse du contenu de " + note, "Succés", JOptionPane.INFORMATION_MESSAGE);
	    /*JOptionPane jop = new JOptionPane(), jop2 = new JOptionPane();
	    ;; = jop.showInputDialog(null, "Donnez le nom du fichier contenant la note musicale!", "Musique", JOptionPane.QUESTION_MESSAGE);
	    
		*/
	    /*Scanner sc = new Scanner(System.in);
	    System.out.println("Donnez le nom du fichier contenant la note musicale");
	    note = sc.nextLine();
		*/
	    
	    
	    try {
	    		int j=0 ;
				while ((ch = lecteur.readLine()) != null)
				{
					switch (j) 
					{
					case 0 : this.setNumMoreau(ch); break ;
					case 1 : this.setTitre(ch);break ;
					case 2 : this.setCompositeur(ch);break ; 
					case 3 : this.setMesure(ch);break; 
					case 4 : this.setUniteDuree(ch);break ; 
					case 5 : this.setTonalite(ch);break ; 
					case 6 : this.setNotes(ch);break ; 
					}
					j++;
				}
			} catch (IOException e) {
			
			e.printStackTrace();
		}
	    lecteur.close();
	  }
	
	public void setNumMoreau(String numMorceau)
	{
		this.numMorceau=numMorceau ;
	}
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getCompositeur() {
		return compositeur;
	}
	public void setCompositeur(String compositeur) {
		this.compositeur = compositeur;
	}
	public String getMesure() {
		return mesure;
	}
	public void setMesure(String mesure) {
		this.mesure = mesure;
	}
	public String getUniteDuree() {
		return uniteDuree;
	}
	public void setUniteDuree(String uniteDuree) {
		this.uniteDuree = uniteDuree;
	}
	public String getTonalite() {
		return tonalite;
	}
	public void setTonalite(String tonalite) {
		this.tonalite = tonalite;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getConteneur() {
		return conteneur;
	}
	public void setConteneur(String conteneur) {
		this.conteneur = conteneur;
	}
	public String getNumMorceau() {
		return numMorceau;
	}
	
	
	
}
