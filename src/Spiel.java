
public class Spiel {
	private Welt[] welt;
	private Spieler spieler;
	private int punkte;
	private int counter;
	
	public Spiel(String name){
		counter = 0;
		punkte = 0;
		welt=new Welt[10];
		spieler = new Spieler(name,0);
	}
	
	public void start(){
		
	}
	
	public void stop(){
		
		
	}
	
	public void exit(){
		spieler.setHighscore(punkte);
	}
	
	public boolean vergleichen(){
		return false;
	}
}
