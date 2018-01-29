package ��Ʈ�����������_20180108_start;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class LoginDialog  extends JDialog{
	Connection conn = null;
	Statement stmt = null;
	String query;
	String id_query;
	String email_query;
	
	JTextField d_id = new JTextField(12);
	JTextField d_pw = new JTextField(12);
	JTextField pw_check = new JTextField(12);
	JTextField name = new JTextField(12);
	JTextField phone = new JTextField(12);
	JTextField address = new JTextField(12);
	JTextField email = new JTextField(12);
	JTextField birth = new JTextField(12);
	
	JRadioButton ManRdb = new JRadioButton("����");
	JRadioButton WomanRdb = new JRadioButton("����");
	String Check = "M";
	
	JButton okBtn;
	JButton cancelBtn;
	JButton idcheckBtn;
	JButton classBtn;
	JButton emailBtn;
	
	LoginDialog(JFrame frame, String title){
		super(frame, title, true);
		
		ResultSet rs = null;
		String url = null;
		String uid = "h5";
		String pw = "h5";
		
		url = "jdbc:oracle:thin:@192.168.0.27:1521:topcredu";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,uid,pw);
			stmt = conn.createStatement();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		setTitle("���� ������ ȸ������");
		setLayout(null);
		
		JLabel idLbl = new JLabel("���̵� : ");
		idLbl.setBounds(24,10,50,25);
		add(idLbl);
		d_id.setBounds(80,10,100,25);
		add(d_id);
		
		idcheckBtn = new JButton("���̵� �ߺ� üũ");
		idcheckBtn.setBounds(190,10,140,25);
		add(idcheckBtn);
		idcheckBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(d_id.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "���̵� �Է����ּ���.");
					d_id.requestFocus();
				} else {
					try {
						query = "select login_id, pw, pro_name, address, email, TO_DATE(birth, 'RRRR-MM-DD') as birth, phone_number, gender" + 
								" from pofol_professor where login_id = '"+d_id.getText()+"'";
						
						ResultSet rs;
						rs = stmt.executeQuery(query);
						
						if(rs.next()) {
							JOptionPane.showMessageDialog(null, "�̹� ������� ���̵��Դϴ�.");
							d_id.setText("");
							d_id.requestFocus();
						} else {
							JOptionPane.showMessageDialog(null, "��� ������ ���̵��Դϴ�.");
						}
						
						rs.close();
						
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		
		JLabel pwLbl = new JLabel("��й�ȣ : ");
		pwLbl.setBounds(10,40,70,25);
		add(pwLbl);
		d_pw.setBounds(80,40,100,25);
		add(d_pw);
		
		JLabel alim = new JLabel("��й�ȣ�� �ִ� 10�ڸ�����");
		alim.setBounds(200,40,200,50);
		add(alim);
		JLabel alim2 = new JLabel("�Է°����մϴ�.");
		alim2.setBounds(200,70,180,25);
		add(alim2);
		
		JLabel ps_check = new JLabel("���Ȯ�� : ");
		add(ps_check);
		ps_check.setBounds(10,70,100,25);
		pw_check.setBounds(80, 70, 100, 25);
		add(pw_check);
		
		JLabel nametxt = new JLabel("�����̸� : ");
		nametxt.setBounds(10,100,80,25);
		add(nametxt);
		name.setBounds(80,100,100,25);
		add(name);
		
		JLabel phonenumber = new JLabel("��ȭ��ȣ : ");
		phonenumber.setBounds(10,130,100,25);
		add(phonenumber);
		phone.setBounds(80,130,100,25);
		add(phone);
		
		JLabel phoneArim = new JLabel("��ȭ��ȣ �Է½� ���ڸ� �Է�! ");
		phoneArim.setBounds(195,130,180,25);
		add(phoneArim);
		
		JLabel adrs = new JLabel("�ּ� : ");
		adrs.setBounds(35,160,50,25);
		add(adrs);
		address.setBounds(80,160,100,25);
		add(address);
		
		JLabel em = new JLabel("email : ");
		em.setBounds(31,190,55,25);
		add(em);
		email.setBounds(80,190,100,25);
		add(email); 
		
		emailBtn = new JButton("�̸��� �ߺ� üũ");
		emailBtn.setBounds(190,190,140,25);
		add(emailBtn);
		emailBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(email.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�̸����� �Է����ּ���.");
					email.requestFocus();
				} else {
					try {
						query = "select login_id, pw, pro_name, address, email, TO_DATE(birth, 'RRRR-MM-DD') as birth, phone_number, gender" + 
								" from pofol_professor where email = '"+email.getText()+"'";
						
						ResultSet rs;
						rs = stmt.executeQuery(query);
						
						if(rs.next()) {
							JOptionPane.showMessageDialog(null, "�̹� ������� �̸����Դϴ�.");
							email.setText("");
							email.requestFocus();
						} else {
							JOptionPane.showMessageDialog(null, "��� ������ �̸����Դϴ�.");
						}
						
						rs.close();
						
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		
		JLabel birthday = new JLabel("���� : ");
		birthday.setBounds(35,220,50,25);
		add(birthday);
		birth.setBounds(80,220,100,25);
		add(birth);
		JLabel birthArim = new JLabel("�Է� ���� : YYYY/MM/DD ");
		birthArim.setBounds(200,222,180,25);
		add(birthArim);
		
		ManRdb.setBounds(90,250,80,50);
		add(ManRdb);
		WomanRdb.setBounds(240,250,80,50);
		add(WomanRdb);
		
		ManRdb.addItemListener(new MyItemListener());
		WomanRdb.addItemListener(new MyItemListener());
		
		
		okBtn = new JButton("ȸ�������ϱ�");
		okBtn.setBounds(55,300,120,40);
		add(okBtn);
		okBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(d_id.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "���̵�� �ʼ� �Է»����Դϴ�.");
				} else if(d_pw.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "��й�ȣ�� �ʼ� �Է»����Դϴ�.");
				} else if(name.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�����̸��� �ʼ� �Է»����Դϴ�.");
				} else if(phone.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "��ȭ��ȣ�� �ʼ� �Է»����Դϴ�.");
				} else if(address.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�ּҴ� �ʼ� �Է»����Դϴ�.");
				} else if(email.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�̸����� �ʼ� �Է»����Դϴ�.");
				} else if(birth.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "������ �ʼ� �Է»����Դϴ�.");
				} else {
					// ��� �Է»����� �ۼ� �� ��
					try {
						query = "select login_id, pw, pro_name, address, email, TO_DATE(birth, 'RRRR-MM-DD') as birth, phone_number, gender" + 
								" from pofol_professor where login_id = '"+d_id.getText()+"'";
						
						ResultSet rs;
						
						rs = stmt.executeQuery(query);
						
						if(rs.next()) {
							JOptionPane.showMessageDialog(null, "�̹� �����ϴ� ���� �Դϴ�.");
						} else {
							
							if(pw_check.getText().equals(d_pw.getText())) {
								try {
									String sql = "insert into pofol_professor values('"
											+d_id.getText()+"', '"
											+d_pw.getText()+"', '"
											+name.getText()+"', '"
											+address.getText()+"', '"
											+email.getText()+"', TO_DATE('"
											+birth.getText()+"', 'RRRR-MM-DD'), '"
											+phone.getText()+"', '"
											+Check+"')";

									stmt.executeUpdate(sql);
											
								} catch(Exception a) {
									a.printStackTrace();
								}
								
								JOptionPane.showMessageDialog(null, "ȸ�������� ���������� �Ϸ�Ǿ����ϴ�. \n������ �ּż� �����մϴ�.");
								setVisible(false);
										
							} else {
								JOptionPane.showMessageDialog(null, "��й�ȣ�� ���� �ʽ��ϴ�.");
							}
						}
						
						rs.close();
						
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					
				}
			}
		});
		
		cancelBtn = new JButton("���");
		cancelBtn.setBounds(205,300,120,40);
		add(cancelBtn);
		cancelBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
		setSize(380, 400);
		setResizable(false);
	}
	

	class MyItemListener implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.DESELECTED) {
				return;
			}
			if(ManRdb.isSelected()) {
				Check = "M";
			} else if(WomanRdb.isSelected()) {
				Check = "F";
			} else if(ManRdb.isSelected() && WomanRdb.isSelected()) {
				JOptionPane.showMessageDialog(null, "������ ���ڿ� ���� �� �� �ϳ��� �����Ͽ� �ֽñ� �ٶ��ϴ�.");
			}
		}
		
	}
	
}
