package �����׸���;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawStringEx extends JFrame {
	Container contentPane;
	
	GraphicsDrawStringEx() {
		setTitle("drawString ��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(250,200);
		setVisible(true);
	}

	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("�ڹٴ� ��մ�.~~", 30, 30);
			g.drawString("�󸶳�? �ϴø�ŭ ����ŭ !!!!", 60, 60);
		}
	}
	
	public static void main(String[] args) {
		new GraphicsDrawStringEx();
	}

}
