package move;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel{
	
   BufferedImage img=null;
   
   int img_x=100;
   int img_y=100;
   
   
   public MyPanel(){
      this.setBackground(Color.YELLOW);
      try{
    	  img=ImageIO.read(new File("C:\\Users\\jklim\\Desktop\\이미지파일\\test.png"));
      }catch(IOException e){
         System.out.println("no image");
         System.exit(1);
      }
      addKeyListener(new KeyListener(){
         public void keyPressed(KeyEvent e){
            int keycode=e.getKeyCode();
            switch(keycode){
            
            case KeyEvent.VK_LEFT: img_x-=10; break;
            case KeyEvent.VK_RIGHT: img_x+=10; break;
            }
            repaint();
         }
         public void keyReleased(KeyEvent e){}
         public void keyTyped(KeyEvent e){}
      });
      this.requestFocus();
      setFocusable(true);
   }
   public void paintComponent(Graphics g){
      super.paintComponent(g);
      g.drawImage(img, img_x, img_y, null);
   }
}


public class Move extends JFrame{
	
   public Move(){
      MyPanel p1=new MyPanel();
      JPanel p2=new JPanel();
      JButton button1 = new JButton("왼쪽으로이동");
      JButton button2 = new JButton("오른쪽으로이동");
      
      setSize(300,300);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setTitle("박스 움직이기");
      
      button1.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			p1.img_x -= 10;
			repaint();
			p1.requestFocus();		
			}
      });
      
      button2.addActionListener(new ActionListener(){

  		@Override
  		public void actionPerformed(ActionEvent arg0) {
  			// TODO Auto-generated method stub
  			
  			p1.img_x += 10;
  			repaint();
  			p1.requestFocus();
  		}
      	  
        });
      p2.add(button1);
      p2.add(button2);
      
      setLayout(new BorderLayout());
      add(p1, BorderLayout.CENTER);
      add(p2, BorderLayout.PAGE_END);
      
      setVisible(true);
   }
   public static void main(String[] args){
      Move m = new Move();
   }
}