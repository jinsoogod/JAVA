package Number_04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Sketch extends JFrame {

	public Sketch(){
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("마일을 킬로미터로 변환");
	
		JPanel panel = new JPanel();
		JLabel label = new JLabel("거리를 마일단위로 입력하시오");
		JTextField field1 = new JTextField(10);
		JTextField field2 = new JTextField(20);
		JButton button = new JButton("변환");
		
		button.addActionListener(new ActionListener(){
		
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int mile = Integer.parseInt(field1.getText());
				double km = mile*1.6;
				
				field2.setText(mile+" 마일은 " + km + " 킬로미터 입니다.");
			}
		});
		
		panel.add(label);
		panel.add(field1);
		panel.add(button);
		panel.add(field2);
		
		this.add(panel);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Sketch();
	}

}
