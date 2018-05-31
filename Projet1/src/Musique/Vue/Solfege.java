package Musique.Vue;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JFrame;

import Musique.Modele.Morceau;

public class Solfege extends JFrame {
  public Solfege(ArrayList <Character> myNotes, Morceau Morc){  
	Toolkit outil = getToolkit();
    this.setTitle("Ma Mélodie de merde");
    this.setSize(outil.getScreenSize());
    //this.setPreferredSize(new Dimension(1200, 800));
    this.setLocationRelativeTo(null);               
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //this.pack();
    this.setContentPane(new DrawNotes(myNotes,Morc));
    this.setVisible(true);
    this.setLocationRelativeTo(null);

  }     
}