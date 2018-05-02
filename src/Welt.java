import java.util.concurrent.ThreadLocalRandom;


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
		int randomTime = ThreadLocalRandom.current().nextInt(5, 25);
		try {
			Thread.sleep((randomTime*1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		obst.spawn();
	}
	
	public void spawnPowerup(){
		for(int i = 0; i < 3; i++) {
			try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			powerups[i].spawn();
		}
	}
	
	public int getKennung(){
		return kennung;
	}
	
}
