public class Welt {

	private int[][] matrix;
	private int kennung;
	private BewegteObjekte pacman;
	private BewegteObjekte[] geister;
	private Objekte obst;
	private Objekte[] powerups;
	
	public Welt(int kennung){
		matrix = new int[32][32];
		this.kennung = kennung;
		pacman = new PacMan();
		geister = new Geister[4];
		obst = new Obst();
		powerups = new PowerUps[3];
	}
	
	public int getPoints(){
		
		return 0;
	}
	
	public void build(){
		
		
	}
	
	public void spawnObst(){
		
	}
	
	public void spawnPowerup(){
		
	}
	
	public int getKennung(){
		return kennung;
	}
	
}
