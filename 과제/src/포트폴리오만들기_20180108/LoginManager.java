package ��Ʈ�����������_20180108;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class MyDialog extends JDialog{
	MyDialog(){
		JTextField d_id = new JTextField(12);
		JTextField d_pw = new JTextField(12);
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
		add(new JLabel("   �̸�      : "));
		add(name);
		add(new JLabel("   �ּ�      : "));
		add(address);
		
		okBtn = new JButton("ȸ�������ϱ�");
		add(okBtn);
		okBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
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
		
		setSize(230, 200);
	}
}

public class LoginManager extends JFrame {
	JTextField id_text;
	JTextField pw_text;
	JButton login;
	JButton member;
	
	MyDialog dialog = new MyDialog();
	
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
		
		setSize(240,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new LoginManager();
	}

}
