package �����̺�Ʈ;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestClass extends JFrame {
	TestClass(){
		setTitle("�͸�Ŭ��������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		
		//�͸�Ŭ����
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action")) {
					b.setText("�׼�");
				} else {
					b.setText("Action");
				}
			}
		});
		
		add(btn);
		
		setSize(300, 300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new TestClass();

	}

}
