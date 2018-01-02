package ����_20180102;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Project_20180102_�߱� extends JFrame {
//	1. ���콺�� �̿��ؼ� �簢���� �׸��ÿ�. (�׷��ȿ��� 12-9 ���� ����)
	
	public Project_20180102_�߱�() {
		setTitle("2018-01-02 �߱޹���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel panel = new MyPanel();
		add(panel, BorderLayout.CENTER);
		setSize(500, 500);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		Vector<Point> vs = new Vector<Point>();
		Vector<Point> ve = new Vector<Point>();
		
		Point startP = null;
		Point endP = null;
		
		MyPanel(){
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					startP = e.getPoint();
				}
				public void mouseReleased(MouseEvent e) {
					endP = e.getPoint();
					vs.add(startP);
					ve.add(endP);
					repaint();
				}
			});
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			
			for(int i=0; i<vs.size(); i++) {
				Point st = vs.elementAt(i);
				Point ed = ve.elementAt(i);
				
				g.drawRect((int)st.getX(), (int)ed.getY(), 150, 150);
			}
		}
	}
	
	
//	2. ���ͷ� �Ʒ��� ����� ��� ������ �л����� ���α׷��� ���弼��. (�ܼ�)
//		1. �߰� 2.���� 3. ��� 4. �˻� 5. ���� 6.���� 7.���� 

	public static void main(String[] args) {
		new Project_20180102_�߱�();
	}

}
