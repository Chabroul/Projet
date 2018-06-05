package Musique.Controleur;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.commons.lang3.*;

import Musique.Modele.Morceau;
import Musique.Vue.Solfege;

public class Main {
  public static void main(String[] args) throws IOException{       
	  
	  Morceau Morc = new Morceau() ;
	  Morc.LectureFichier() ;
	  ArrayList<Character> myNotes = new ArrayList<Character>();
	  //myNotes=new ArrayList<NoteMusicale> (Morc.notes.length()) ; 
	  for (int i=0 ; i<Morc.notes.length();i++)
	  {
		   myNotes.add(Morc.notes.charAt(i)) ;
	  }
	  Solfege Sol = new Solfege(myNotes,Morc) ;
	  
	  
  }       
}