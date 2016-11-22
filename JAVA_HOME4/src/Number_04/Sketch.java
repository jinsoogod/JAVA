package Number_04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Sketch extends JFrame {

	public Sketch(){
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("������ ų�ι��ͷ� ��ȯ");
	
		JPanel panel = new JPanel();
		JLabel label = new JLabel("�Ÿ��� ���ϴ����� �Է��Ͻÿ�");
		JTextField field1 = new JTextField(10);
		JTextField field2 = new JTextField(20);
		JButton button = new JButton("��ȯ");
		
		button.addActionListener(new ActionListener(){
		
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int mile = Integer.parseInt(field1.getText());
				double km = mile*1.6;
				
				field2.setText(mile+" ������ " + km + " ų�ι��� �Դϴ�.");
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
