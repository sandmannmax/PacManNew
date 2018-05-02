
abstract public class Objekte {
	int punktwert;
	int posX;
	int posY;
	boolean gefressen;
	
	public Objekte() {}
		
	abstract void spawn();
	abstract boolean getGefressen();
	abstract void verschwinden();
	
}
	
	


