package üũ��ư;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxEx extends JFrame {
	public CheckBoxEx() {
		setTitle("üũ�ڽ� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		//�̹����� �ε��Ѵ�.
		ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
		ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg");
		
		JCheckBox apple = new JCheckBox("���"); //false �⺻�� üũ�ȵ�
		JCheckBox pear = new JCheckBox("��", true); //üũ�� ����
		JCheckBox cherry = new JCheckBox("ü��", cherryIcon);
		cherry.setBorderPainted(true); //�׵θ� ���Ѿ��ִ� �Լ�
		cherry.setSelectedIcon(selectedCherryIcon);
		
		add(apple);
		add(pear);
		add(cherry);
		
		setSize(250, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new CheckBoxEx();
	}

}
