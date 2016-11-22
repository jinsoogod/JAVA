package Number_06;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Number_06 extends JFrame {

	public Number_06() {
		// TODO Auto-generated constructor stub
	
		JPanel panel;
		JButton button1;
		JButton button2;
		JButton button3;
		
		panel = new JPanel();
		button1 = new JButton("»¡°­");
		button2 = new JButton("ÆÄ¶û");
		button3 = new JButton("°ËÁ¤");
		
		 button1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				panel.setBackground(Color.red);
			}
			 
		 });
		 
		 button2.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					panel.setBackground(Color.blue);
				}
				 
			 });
		 
		 button3.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					panel.setBackground(Color.BLACK);
				}
				 
			 });
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		
		add(panel);
		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new Number_06();
	}

}
