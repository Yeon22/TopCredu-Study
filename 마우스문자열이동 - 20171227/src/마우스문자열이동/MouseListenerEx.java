package ���콺���ڿ��̵�;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseListenerEx extends JFrame{
	JLabel la; //�������, �ʵ�
	
	public MouseListenerEx() {
		setTitle("���콺 �̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel contentPane = new JPanel();
		setContentPane(contentPane);
		setLayout(null);
		contentPane.addMouseListener(new MyMouseAdapter());
		
		la = new JLabel("Hello");
		la.setSize(50, 20);
		la.setLocation(30, 30);
		contentPane.add(la);
		
		setSize(200,200);
		setVisible(true);
	}
	
	class MyMouseAdapter extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}
	}
	
//	class MyMouseListener implements MouseListener{
//		@Override
//		public void mouseClicked(MouseEvent e) {
//		}
//		@Override
//		public void mouseEntered(MouseEvent e) {
//		}
//		@Override
//		public void mouseExited(MouseEvent e) {
//		}
//		@Override
//		public void mousePressed(MouseEvent e) {
//			// ���콺 ������ ��
//			int x = e.getX();
//			int y = e.getY();
//			la.setLocation(x, y);
//		}
//		@Override
//		public void mouseReleased(MouseEvent e) {
//		}
//	}

	
	public static void main(String[] args) {
		new MouseListenerEx();
	}

}
