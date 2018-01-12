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

public class LoginManager extends JFrame {
	JTextField id_text;
	JTextField pw_text;
	JButton login;
	JButton member;
	
	LoginDialog dialog = new LoginDialog(this, "ȸ������ȭ��");
	
	LoginManager(){
		setTitle("�α���ȭ��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JLabel l_id = new JLabel("���̵�      : ");
		id_text = new JTextField(10);
		add(l_id);
		add(id_text);
		
		JLabel l_pw = new JLabel("��й�ȣ  : ");
		pw_text = new JTextField(10);
		add(l_pw);
		add(pw_text);
		
		login = new JButton("�α���");
		add(login);
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(id_text.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "���̵� �Է����ּ���.");
				} else if(pw_text.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "��й�ȣ�� �Է����ּ���.");
				} else {
					for(int i =0; i< LoginDialog.dialog_vector.size(); i++) {
						dialog_ex de = LoginDialog.dialog_vector.get(i);
						
						// ���̵�, ��й�ȣ �Է����� ��
						if(!id_text.getText().equals(de.getD_id())) {
							JOptionPane.showConfirmDialog(null, "���̵� �߸��Ǿ����ϴ�.");
						} else if(!pw_text.getText().equals(de.getD_pw())){
							JOptionPane.showConfirmDialog(null, "��й�ȣ�� �߸��Ǿ����ϴ�.");
						} else {
							// �α��ο� ������ �� ȭ��
							if((JOptionPane.showConfirmDialog(null, "�α��ο� �����Ͽ����ϴ�.", "�α��μ���", JOptionPane.YES_NO_OPTION)) == JOptionPane.YES_OPTION) {
								setVisible(false);
								return;
							}
						}
					}
				}
			}
		});
		
		member = new JButton("ȸ������");
		add(member);
		member.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
			}
		});
		
		setSize(260,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new LoginManager();
	}

}
