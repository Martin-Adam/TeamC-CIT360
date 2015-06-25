package addingPicture;

import java.awt.Graphics;
import java.awt.Image;
import Defualt.ResourceLoader;

import javax.swing.JFrame;


public class Test extends JFrame {
	
	Image i = ResourceLoader.getImage("home.jpg");
	
	public void point(Graphics g){
		if(i != null) g.drawImage(i, 0, 0, null);
		repaint();
	}
	
	public Test(){
		setSize(800, 600);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args){
		Test test = new Test();
	}

}
