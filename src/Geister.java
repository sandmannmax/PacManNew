
public class Geister extends BewegteObjekte 
{
    char typ;
    int posX;
    int posY;
    int richtung;
    boolean fressbar;
	
	Geister()
	{
		super();
	}
	
	public void reset(char typ)
	{
   
	}
	
	public void bewegen(char typ)
	{
        
	}
    
	public int positionVergleichen(int xPacman, int yPacman)
	{
		
		return 1;
	}
	
	public void setPos(int x, int y)
	{
		posX = x;
		posY = y;
	}
	
}
