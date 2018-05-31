package Musique.Vue;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import Musique.Modele.Morceau;
 
public class DrawNotes extends JPanel {
	protected ArrayList<Character> myNotes ;
	Morceau Morc ;
	public DrawNotes  (ArrayList<Character> myNotes,Morceau Morc)
	{
		this.myNotes=myNotes; 
		this.Morc=Morc ;
		
	}
	public DrawNotes () {} 
	
	public String ListerNotes() 
	{
		String liste="" ;
		for (int i=0 ; i<this.myNotes.size();i++ )
			liste=liste+myNotes.get(i) ;
		return liste ;
	}
	
	public void paintComponent(Graphics g){
	  int diff=0 ;
	  int haut=0;
	  int yA=0 ,yB=0,yC=0,yD=0,yE=0,yF=0,yG=0 ;
	  String liste=ListerNotes() ;
	 try {
		 	
	      Image img = ImageIO.read(new File("image.jpg"));
	      Image imgnote = ImageIO.read(new File("music.png"));
	      Image diese= ImageIO.read(new File("diese.png"));
	      
	      
	      
	      
	      g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	      g.drawString("Les notes sont = "+liste , 270, 50);
	      g.drawString("Le titre de la musique =" +Morc.getTitre(), 270, 70);
	      System.out.println(Morc.getTonalite());
	      switch (Morc.getTonalite())
	      {
	      case "Gmaj" : g.drawImage(diese, 130,150,this) ;
	      				yA =133  ; yB=105 ;yC=73 ; yD=33 ; yE=30 ; yF=3 ; yG=150 ;break ;
	      case "Cmaj": yA =133  ; yB=105 ;yC=255 ; yD=230 ; yE=200 ; yF=175 ; yG=150 ; break ;
	      }
	      for (int i = 0 ; i < liste.length() ;i++)
				{
				 
	    	  	diff=i ;
	    	  	if (i>=12) {diff=diff%12 ;  haut=340;}  
	    	  	//Le nombre maximum de notes par ligne 12
	    	  	if (i%3==0) g.drawLine(550+(diff*120),120+haut,550+(diff*120),310+haut);
	    	  	//En fonction de la mesure ici 4/4 TODO 
	    	  	switch (liste.charAt(i))
				{
					case 'C' :if (Morc.getTonalite().equals("Cmaj") )
								g.drawLine(190+(diff*90), 360+haut, 270+(diff*90), 360+haut);
							  g.drawImage(imgnote, 170+(diff*90), yC+haut, this); break ;  
					case 'D' :g.drawImage(imgnote, 170+(diff*90), yD+haut, this); break ;
					case 'E' :g.drawImage(imgnote, 170+(diff*90), yE+haut, this);break ;
					case 'F' :g.drawImage(imgnote, 170+(diff*90), yF+haut, this);break ;
					case 'G' :g.drawImage(imgnote, 170+(diff*90), yG+haut, this);break ;
					case 'A' :g.drawImage(imgnote, 170+(diff*90), yA+haut, this);break ;
					case 'B' :g.drawImage(imgnote, 170+(diff*90), yB+haut, this);break ;
					default : break ; 
				}
				}
	      /*Français	do	ré	mi	fa	sol	la	si
	        Anglais	    C	D	E	F	G	A	B  */
	      
	 	} catch (IOException e) 
	 		{
	 		e.printStackTrace();
	 		}                
  }     
  
}
