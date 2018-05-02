
public class Spieler {
	private String benutzername;
	private int highscore;
	
	public Spieler(String benutzername, int highscore){
		this.benutzername = benutzername;
		this.highscore = highscore;
	}
	
	public void setHighscore(int highscoreNew){
		highscore = highscoreNew;
	}
}
