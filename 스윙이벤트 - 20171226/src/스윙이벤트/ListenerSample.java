package �����̺�Ʈ;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


class MyActionListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action")) {
			b.setText("�׼�");
		} else {
			b.setText("Action");
		}
		
	}
}


public class ListenerSample extends JFrame {
	ListenerSample(){
		setTitle("Action");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		
		//�׼�Ŭ���� ��ü
		MyActionListener listner = new MyActionListener();
		//������ �ٿ��ִ� �Լ�
		btn.addActionListener(listner);
		
		add(btn);
		
		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ListenerSample();

	}

}
