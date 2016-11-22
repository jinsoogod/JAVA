package Number_05;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Bar extends JFrame{
	
	int img_x = 100;
	int img_y = 100;
	
	class barPanel extends JPanel{
		
		BufferedImage img = null;
		
		public barPanel() {
			// TODO Auto-generated constructor stub
			try {
				img = ImageIO.read(new File("C:\\Users\\jklim\\Desktop\\bar.png"));
			} catch (IOException e) {							
				System.out.println("no image");
				System.exit(1);
			}
			
			addKeyListener(new KeyListener() {
				@Override
				public void keyPressed(KeyEvent e) {
					// TODO Auto-generated method stub
					int keycode = e.getKeyCode();
					switch (keycode) {
		
					case KeyEvent.VK_LEFT:	img_x -= 10;	break;
					case KeyEvent.VK_RIGHT:	img_x += 10;	break;
					}
					repaint();

				}

				@Override
				public void keyReleased(KeyEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void keyTyped(KeyEvent arg0) {
					// TODO Auto-generated method stub
					
				}

			});
			this.requestFocus();
			setFocusable(true);
			}
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(img, img_x, img_y, null);
			}

	}
	
	public Bar() {
		// TODO Auto-generated constructor stub
		this.setTitle("박스움직이기");
		JPanel panel1 = new JPanel();
		JButton button2 = new JButton("왼쪽으로 이동");
		JButton button3 = new JButton("오른쪽으로 이동");
		barPanel barPanel = new barPanel();
		
		this.setLayout(new BorderLayout());
		
		panel1.add(button2);
		panel1.add(button3);
		
		button2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				img_x -= 10;
				repaint();
				barPanel.requestFocus();
			}
			
		});
		
		button3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				img_x += 10;
				repaint();
				barPanel.requestFocus();
			}
			
		});
		
		add(barPanel,"Center");
		add(panel1,"South");
		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Bar();
	}
}

