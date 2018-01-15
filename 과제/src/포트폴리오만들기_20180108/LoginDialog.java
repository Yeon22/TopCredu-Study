package ��Ʈ�����������_20180108;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

 class dialog_ex {
	String d_id;
	String d_pw;
	String pw_check;
	String name;
	String address;
	String birth;
	String email;
	
	public dialog_ex(String d_id, String d_pw, String pw_check, String name, String address, String email, String birth) {
		super();
		this.d_id = d_id;
		this.d_pw = d_pw;
		this.pw_check = pw_check;
		this.name = name;
		this.address = address;
		this.email = email;
		this.birth = birth;
	}

	public String getD_id() {
		return d_id;
	}
	
	public void setD_id(String d_id) {
		this.d_id = d_id;
	}
	
	public String getD_pw() {
		return d_pw;
	}
	
	public void setD_pw(String d_pw) {
		this.d_pw = d_pw;
	}
	
	public String getPw_check() {
		return pw_check;
	}
	
	public void setPw_check(String pw_check) {
		this.pw_check = pw_check;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getBirth() {
		return birth;
	}
	
	public void setBirth(String birth) {
		this.birth = birth;
	}
}

public class LoginDialog  extends JDialog{
	
	public static Vector<dialog_ex> dialog_vector = new Vector<dialog_ex>();
	
	LoginDialog(JFrame frame, String title){
		super(frame, title, true);
		JTextField d_id = new JTextField(12);
		JTextField d_pw = new JTextField(12);
		JTextField pw_check = new JTextField(12);
		JTextField name = new JTextField(12);
		JTextField address = new JTextField(12);
		JTextField email = new JTextField(12);
		JTextField birth = new JTextField(12);
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
		add(new JLabel("  email     : "));
		add(email);
		add(new JLabel("  ����      :"));
		add(birth);
		
		
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
				} else if(email.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "�̸����� �ʼ� �Է»����Դϴ�.");
				} else if(birth.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "������ �ʼ� �Է»����Դϴ�.");
				} else {
					// ��� �Է»����� �ۼ� �� ��
					if(pw_check.getText().equals(d_pw.getText())) {
						dialog_ex dex = new dialog_ex(d_id.getText(), d_pw.getText(), pw_check.getText(), name.getText(), address.getText(), email.getText(), birth.getText());
						dialog_vector.add(dex);
						
						JOptionPane.showConfirmDialog(null, "ȸ�������� ���������� �Ϸ�Ǿ����ϴ�. \n������ �ּż� �����մϴ�.");
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
		
		setSize(250, 280);
		setResizable(false);
	}
}
