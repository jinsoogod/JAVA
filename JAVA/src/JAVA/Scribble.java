package JAVA;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Point {
	int x, y;
}

class MyPanel extends JPanel implements MouseMotionListener {
	private int index = 0;
	Point[] array = new Point[1000];
	int a=0;
	JButton button1;
	JButton button2;
	JButton button3;
	
	public MyPanel() {
		this.addMouseMotionListener(this);
		
		button1 = new JButton("����");
		button2 = new JButton("�Ķ�");
		button3 = new JButton("����");
		
		button1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				a = 1;
				repaint();
			}
			
		});
		
		button2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				a = 2;
				repaint();
			}
			
		});
		
		button3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				a = 0;
				repaint();
			}
			
		});
		add(button1);
		add(button2);
		add(button3);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		if (index > 1000)
			return;
		array[index] = new Point();
		array[index].x = e.getX();
		array[index].y = e.getY();
		index++;
		repaint();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		if(a == 1){
			g.setColor(Color.red);
		}
		else if(a == 2){
			g.setColor(Color.blue);
		}
		else{
			g.setColor(Color.BLACK);
		}
		
		for (Point p : array)
			if (p != null)
				g.drawRect(p.x, p.y, 1, 1);
				
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
	}

}

public class Scribble extends JFrame {
	public Scribble() {
	
		
		setSize(300, 300);
		setTitle("���콺�� �׸� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel());
		setVisible(true);
	
	}

	public static void main(String[] args) {
		Scribble s = new Scribble();
	}
}
