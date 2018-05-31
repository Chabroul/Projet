package Musique.Modele;

public class NoteMusicale {

	private char note ;
	private int x ;
	private int y ;
	
	public NoteMusicale(char note)
	{
		this.note=note ;
	}
	
	public char getNote() {
		return note;
	}
	public void setNote(char note) {
		this.note = note;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
	public void Position() 
	{
		switch (this.note)
		{
		case 'A' :this.setX(170);this.setY(355); break ;  
		case 'B' :this.setX(170); this.setY(330); break ;
		case 'C' :this.setX(170); this.setY(305);break ;
		case 'D' :this.setX(170); this.setY(280);break ;
		default : break ; 
		}
	}
	
}
