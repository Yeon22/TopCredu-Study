package �����̺�Ʈ;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;


class MyMouseListener implements MouseListener {
	@Override
	public void mouseClicked(MouseEvent e) {
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// ���콺�� ��ư ���ʿ� ���� ��
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.RED);
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// ���콺�� ��ư ���ʿ� �ִٰ� ���� ��
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.yellow);
	}
	@Override
	public void mousePressed(MouseEvent e) {
	}
	@Override
	public void mouseReleased(MouseEvent e) {
	}
}


public class MouseEx extends JFrame {
	MouseEx(){
		setTitle("��ư�� Mouse�̺�Ʈ �����ʸ� �ۼ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JButton btn = new JButton("Mouse Event �׽�Ʈ ��ư");
		btn.setBackground(Color.yellow);
		
		//�̺�Ʈ�� ���̰ڴ�.
		MyMouseListener listener = new MyMouseListener();
		//���콺 �̺�Ʈ�� ��ư�� ������ ��
		btn.addMouseListener(listener);
		
		add(btn);
		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MouseEx();

	}

}
