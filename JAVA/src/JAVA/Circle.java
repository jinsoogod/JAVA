package JAVA;

import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.geom.*;


import javax.swing.JFrame;
import javax.swing.JPanel;

public class Circle extends JFrame implements ActionListener{

	int x=200;
	int y=0;
	
	class Mypanel extends JPanel{
		
		Shape s;
		
		public Mypanel() {
			// TODO Auto-generated constructor stub
			
			s = new Ellipse2D.Float(x, y, 80, 80);
			
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D) g;
			
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
	                RenderingHints.VALUE_ANTIALIAS_ON);
			
			g2.setColor(Color.red);
			g2.setStroke(new BasicStroke(3));
			g2.draw(s);

		}
	}

	
	public Circle() {
		// TODO Auto-generated constructor stub
	
		add(new Mypanel());
		setTitle("애니메이션 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 300);
		setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Circle();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
	}
}

