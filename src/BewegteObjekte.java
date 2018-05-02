
abstract class BewegteObjekte {
	int posX;
	int posY;
	int richtung;
	
	BewegteObjekte() {}
	
	abstract void setPos(int x, int y);
	abstract void reset(char typ);
}
