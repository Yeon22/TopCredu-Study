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

class MyDialog extends JDialog{
	MyDialog(JFrame frame, String title){
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

public class LoginManager extends JFrame {
	JTextField id_text;
	JTextField pw_text;
	JButton login;
	JButton member;
	
	MyDialog dialog = new MyDialog(this, "ȸ������ȭ��");
	
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
					// ���̵�, ��й�ȣ �Է����� ��
					if(!id_text.getText().equals("kkk")) {
						JOptionPane.showConfirmDialog(null, "���̵� �߸��Ǿ����ϴ�.");
					} else if(!pw_text.getText().equals("123456")){
						JOptionPane.showConfirmDialog(null, "��й�ȣ�� �߸��Ǿ����ϴ�.");
					} else {
						// �α��ο� ������ �� ȭ��
						JOptionPane.showConfirmDialog(null, "�α��ο� �����Ͽ����ϴ�.");
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
