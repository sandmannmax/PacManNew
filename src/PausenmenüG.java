import java.awt.Color;

import javax.swing.*;
public class Pausenmen�G {
private static final Color BLUE = null;
private JFrame pausenfenster;
private JFrame abdeckung;
public void PausenmenueErstellen()
{
	abdeckung=new JFrame("Pause");
	abdeckung.setSize(1024, 1024);
	pausenfenster=new JFrame();
	pausenfenster.setSize(410, 512);
	abdeckung.setBackground(BLUE);
	abdeckung.setVisible(true);
	pausenfenster.setVisible(true);
	
}
public static void main(String args[]){
	Pausenmen�G g = new Pausenmen�G();
	g.PausenmenueErstellen();
}
}
