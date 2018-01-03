package �������ٿ�����;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class ToolTipEx extends JFrame {
	public ToolTipEx() {
		setTitle("���� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createToolBar();
		setSize(400, 200);
		setVisible(true);
	}
	
	void createToolBar() {
		JToolBar toolBar = new JToolBar("Kitae Menu");
		toolBar.setBackground(Color.LIGHT_GRAY);
		JButton newBtn = new JButton("New");
		newBtn.setToolTipText("������ �����մϴ�.");
		toolBar.add(newBtn);
		
		JButton openBtn = new JButton(new ImageIcon("images/FileIcon.png"));
		openBtn.setToolTipText("������ ���ϴ�.");
		toolBar.add(openBtn);
		toolBar.addSeparator();
		
		JButton saveBtn = new JButton(new ImageIcon("images/SaveIcon.png"));
		saveBtn.setToolTipText("������ �����մϴ�.");
		toolBar.add(saveBtn);
		
		toolBar.add(new JLabel("search"));
		
		JTextField tf = new JTextField("text field");
		tf.setToolTipText("ã�����ϴ� ���ڿ��� �Է��ϼ���.");
		toolBar.add(tf);
		
		JComboBox combo = new JComboBox();
		combo.addItem("Java");
		combo.addItem("C#");
		combo.addItem("C");
		combo.addItem("C++");
		toolBar.add(combo);
		add(toolBar, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		new ToolTipEx();
	}

}
