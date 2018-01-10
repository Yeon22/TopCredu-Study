package ��Ʈ�����������_20180108;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LoginDialog  extends JDialog{
	LoginDialog(JFrame frame, String title){
		super(frame, title, true);
		JTextField d_id = new JTextField(12);
		JTextField d_pw = new JTextField(12);
		JTextField pw_check = new JTextField(12);
		JTextField name = new JTextField(12);
		JTextField address = new JTextField(12);
		JButton okBtn;
		JButton cancelBtn;
		
		setTitle("ȸ������");
		setLayout(new FlowLayout());
		
		add(new JLabel("  ���̵�    : "));
		add(d_id);
		add(new JLabel("��й�ȣ : "));
		add(d_pw);
		add(new JLabel("���Ȯ�� : "));
		add(pw_check);
		add(new JLabel("   �̸�      : "));
		add(name);
		add(new JLabel("   �ּ�      : "));
		add(address);
		
		okBtn = new JButton("ȸ�������ϱ�");
		add(okBtn);
		okBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(d_id.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "���̵�� �ʼ� �Է»����Դϴ�.");
				} else if(d_pw.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "��й�ȣ�� �ʼ� �Է»����Դϴ�.");
				} else if(name.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "�̸��� �ʼ� �Է»����Դϴ�.");
				} else if(address.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "�ּҴ� �ʼ� �Է»����Դϴ�.");
				} else {
					// ��� �Է»����� �ۼ� �� ��
					if(pw_check.getText().equals(d_pw.getText())) {
						JOptionPane.showConfirmDialog(null, "ȸ�������� ���������� �Ϸ�Ǿ����ϴ�.");
						setVisible(false);
					} else {
						JOptionPane.showConfirmDialog(null, "��й�ȣ�� ���� �ʽ��ϴ�.");
					}
				}
			}
		});
		
		cancelBtn = new JButton("���");
		add(cancelBtn);
		cancelBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
		setSize(230, 230);
	}
}
