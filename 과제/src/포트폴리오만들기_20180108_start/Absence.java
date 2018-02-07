package ��Ʈ�����������_20180108_start;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javafx.scene.paint.Color;

public class Absence extends JPanel implements Runnable{
	Connection conn = null;
	Statement stmt = null;
	String query;
	
	DefaultTableModel model;
	JTable table;
	
	String class_id;
	String name;
	String checkme;
	String department_id;
	
	JLabel timerLabel;
	JLabel timerLabel2;
	JButton alreadycheck = new JButton("��üũ");
	JButton search = new JButton ("��ȸ");
	JButton check = new JButton("�⼮");
	JButton uncheck = new JButton("�Ἦ");
	JButton sick = new JButton("����");
	JButton jotai = new JButton("����");
	

	@Override
	public void run() {
		while(true) {
			Calendar calendar = Calendar.getInstance();
			String now = calendar.get(Calendar.YEAR)+"��"
					+(calendar.get(Calendar.MONTH)+1)+"��"
					+calendar.get(Calendar.DATE)+"��";
			
			String now2 = calendar.get(Calendar.HOUR)+"��"
					+calendar.get(Calendar.MINUTE)+"��"
					+calendar.get(Calendar.SECOND)+"��";
			
			timerLabel.setText(now);
			timerLabel2.setText(now2);
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	public void List(String squery) {
		try {
			if(squery.equals("")) {
				query = "select class_id, name, checkme from pofol_score order by class_id";
			} else {
				query = "select class_id, name, checkme from pofol_score "+squery+" order by class_id";
			}
			
			ResultSet rs = stmt.executeQuery(query);
			
			model.setNumRows(0);
			
			while(rs.next()) {
				String[] row = new String[3];
				row[0] = rs.getString("class_id");
				row[1] = rs.getString("name");
				row[2] = rs.getString("checkme");
				model.addRow(row);
			}
			
			rs.close();
			
		}catch(SQLException e) {
			e.getStackTrace();
		}
	}
	
	Absence(){
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

		setLayout(null);
		
		JLabel time = new JLabel("��¥ �� �ð�");
		time.setBounds(360,10,150,25);
		time.setFont(new Font("����",Font.BOLD, 14));
		add(time);
		

		timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.BOLD, 16));
		timerLabel.setBounds(350,44,150,25);
		add(timerLabel);
		
		timerLabel2 = new JLabel();
		timerLabel2.setFont(new Font("Gothic", Font.BOLD, 16));
		timerLabel2.setBounds(356,69,150,25);
		add(timerLabel2);
		
		Thread thread = new Thread(this);
		thread.start();
		
		
		JLabel depart = new JLabel("�а� : ");
		depart.setBounds(10,10,35,30);
		add(depart);
		
		String dept[] = {"��ü", "��ǻ�Ͱ��а�", "��Ƽ�̵���", "����ȸ���", "�������"};
		JComboBox cb_depart = new JComboBox(dept);
		cb_depart.setBounds(48,12,120,20);
		add(cb_depart);
		
		String [] colName = {"�й�", "�̸�","�⼮üũ"};
		
		model = new DefaultTableModel(colName, 0);
		table = new JTable(model);
		table.setPreferredScrollableViewportSize(new Dimension(300, 350));
		JScrollPane scroll = new JScrollPane(table);
		scroll.setBounds(10,40,300,350);
		add(scroll);
		
		table.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mousePressed(MouseEvent e) {}
			
			@Override
			public void mouseExited(MouseEvent e) {}
			
			@Override
			public void mouseEntered(MouseEvent e) {}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				table = (JTable)e.getComponent();
				model = (DefaultTableModel)table.getModel();
				
				String sid = (String)model.getValueAt(table.getSelectedRow(), 0);
				class_id = sid;
				String sname = (String)model.getValueAt(table.getSelectedRow(), 1);
				name = sname;
				String scheckme = (String)model.getValueAt(table.getSelectedRow(), 2);
				checkme = scheckme;
				
			}
		});
		
		//��üũ ��ư
		alreadycheck.setBounds(195, 10, 80,25);
		add(alreadycheck);
		alreadycheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int index = cb_depart.getSelectedIndex();
				String cb_name = cb_depart.getItemAt(index).toString();
				
				if(class_id == null) {
					JOptionPane.showMessageDialog(null, "��üũ ó���� �л��� �����Ͻ� �� \n��ư�� �����ֽñ� �ٶ��ϴ�.","���",JOptionPane.INFORMATION_MESSAGE);
				} else {
					try {
						stmt.executeQuery("update pofol_score set checkme = '��üũ' " + 
								"where class_id = '"+class_id+"'");
						
						JOptionPane.showMessageDialog(null, "��üũó���Ǿ����ϴ�.","�˸�",JOptionPane.INFORMATION_MESSAGE);
						
						if(cb_name.equals("��ü")) {
							List("");
						} else if(cb_name.equals("��ǻ�Ͱ��а�")) {
							String squery = "where department_id = "
									+ "(select department_id from pofol_department where department_id = 'C001')";
							List(squery);
							
						} else if(cb_name.equals("��Ƽ�̵���")) {
							String squery = "where department_id = "
									+ "(select department_id from pofol_department where department_id = 'M002')";
							List(squery);
							
						} else if(cb_name.equals("����ȸ���")) {
							String squery = " where department_id = "
									+ "(select department_id from pofol_department where department_id = 'T003')";
							List(squery);
							
						} else if(cb_name.equals("�������")) {
							String squery = " where department_id = "
									+ "(select department_id from pofol_department where department_id = 'G004')";
							List(squery);
						}
						
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		
		//��ȸ
		search.setBounds(350, 110, 100, 35);
		add(search);
		search.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int index = cb_depart.getSelectedIndex();
				String cb_name = cb_depart.getItemAt(index).toString();
				
				if(cb_name.equals("��ü")) {
					List("");
				} else if(cb_name.equals("��ǻ�Ͱ��а�")) {
					String squery = "where department_id = "
							+ "(select department_id from pofol_department where department_id = 'C001')";
					List(squery);
					
				} else if(cb_name.equals("��Ƽ�̵���")) {
					String squery = "where department_id = "
							+ "(select department_id from pofol_department where department_id = 'M002')";
					List(squery);
					
				} else if(cb_name.equals("����ȸ���")) {
					String squery = " where department_id = "
							+ "(select department_id from pofol_department where department_id = 'T003')";
					List(squery);
					
				} else if(cb_name.equals("�������")) {
					String squery = " where department_id = "
							+ "(select department_id from pofol_department where department_id = 'G004')";
					List(squery);
				}
				
			}
			
		});
		
		
		//�⼮
		check.setBounds(350, 170, 100, 35);
		add(check);
		check.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int index = cb_depart.getSelectedIndex();
				String cb_name = cb_depart.getItemAt(index).toString();
				
				if(class_id == null) {
					JOptionPane.showMessageDialog(null, "�⼮ ó���� �л��� �����Ͻ� �� \n��ư�� �����ֽñ� �ٶ��ϴ�.","���",JOptionPane.INFORMATION_MESSAGE);
				} else {
					try {
						stmt.executeQuery("update pofol_score set checkme = '�⼮' " + 
								"where class_id = '"+class_id+"'");
						
						JOptionPane.showMessageDialog(null, "�⼮ó���Ǿ����ϴ�.","�˸�",JOptionPane.INFORMATION_MESSAGE);
						
						if(cb_name.equals("��ü")) {
							List("");
						} else if(cb_name.equals("��ǻ�Ͱ��а�")) {
							String squery = "where department_id = "
									+ "(select department_id from pofol_department where department_id = 'C001')";
							List(squery);
							
						} else if(cb_name.equals("��Ƽ�̵���")) {
							String squery = "where department_id = "
									+ "(select department_id from pofol_department where department_id = 'M002')";
							List(squery);
							
						} else if(cb_name.equals("����ȸ���")) {
							String squery = " where department_id = "
									+ "(select department_id from pofol_department where department_id = 'T003')";
							List(squery);
							
						} else if(cb_name.equals("�������")) {
							String squery = " where department_id = "
									+ "(select department_id from pofol_department where department_id = 'G004')";
							List(squery);
						}
						
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		
		
		//�Ἦ
		uncheck.setBounds(350, 230, 100, 35);
		add(uncheck);
		uncheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int index = cb_depart.getSelectedIndex();
				String cb_name = cb_depart.getItemAt(index).toString();
				
				if(class_id == null) {
					JOptionPane.showMessageDialog(null, "�Ἦ ó���� �л��� �����Ͻ� �� \n��ư�� �����ֽñ� �ٶ��ϴ�.","���",JOptionPane.INFORMATION_MESSAGE);
				} else {
					try {
						stmt.executeQuery("update pofol_score set checkme = '�Ἦ' " + 
								"where class_id = '"+class_id+"'");

						JOptionPane.showMessageDialog(null, "�Ἦó���Ǿ����ϴ�.","�˸�",JOptionPane.INFORMATION_MESSAGE);
						
						if(cb_name.equals("��ü")) {
							List("");
						} else if(cb_name.equals("��ǻ�Ͱ��а�")) {
							String squery = "where department_id = "
									+ "(select department_id from pofol_department where department_id = 'C001')";
							List(squery);
							
						} else if(cb_name.equals("��Ƽ�̵���")) {
							String squery = "where department_id = "
									+ "(select department_id from pofol_department where department_id = 'M002')";
							List(squery);
							
						} else if(cb_name.equals("����ȸ���")) {
							String squery = " where department_id = "
									+ "(select department_id from pofol_department where department_id = 'T003')";
							List(squery);
							
						} else if(cb_name.equals("�������")) {
							String squery = " where department_id = "
									+ "(select department_id from pofol_department where department_id = 'G004')";
							List(squery);
						}
						
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		
		
		//����
		sick.setBounds(350, 290, 100, 35);
		add(sick);
		sick.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int index = cb_depart.getSelectedIndex();
				String cb_name = cb_depart.getItemAt(index).toString();
				
				if(class_id == null) {
					JOptionPane.showMessageDialog(null, "���� ó���� �л��� �����Ͻ� �� \n��ư�� �����ֽñ� �ٶ��ϴ�.","���",JOptionPane.INFORMATION_MESSAGE);
				} else {
					try {
						stmt.executeQuery("update pofol_score set checkme = '����' " + 
								"where class_id = '"+class_id+"'");

						JOptionPane.showMessageDialog(null, "����ó���Ǿ����ϴ�.","�˸�",JOptionPane.INFORMATION_MESSAGE);
						
						if(cb_name.equals("��ü")) {
							List("");
						} else if(cb_name.equals("��ǻ�Ͱ��а�")) {
							String squery = "where department_id = "
									+ "(select department_id from pofol_department where department_id = 'C001')";
							List(squery);
							
						} else if(cb_name.equals("��Ƽ�̵���")) {
							String squery = "where department_id = "
									+ "(select department_id from pofol_department where department_id = 'M002')";
							List(squery);
							
						} else if(cb_name.equals("����ȸ���")) {
							String squery = " where department_id = "
									+ "(select department_id from pofol_department where department_id = 'T003')";
							List(squery);
							
						} else if(cb_name.equals("�������")) {
							String squery = " where department_id = "
									+ "(select department_id from pofol_department where department_id = 'G004')";
							List(squery);
						}
						
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		
		
		//����
		jotai.setBounds(350, 350, 100, 35);
		add(jotai);
		jotai.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int index = cb_depart.getSelectedIndex();
				String cb_name = cb_depart.getItemAt(index).toString();
				
				if(class_id == null) {
					JOptionPane.showMessageDialog(null, "���� ó���� �л��� �����Ͻ� �� \n��ư�� �����ֽñ� �ٶ��ϴ�.","���",JOptionPane.INFORMATION_MESSAGE);
				} else {
					try {
						stmt.executeQuery("update pofol_score set checkme = '����' " + 
								"where class_id = '"+class_id+"'");

						JOptionPane.showMessageDialog(null, "����ó���Ǿ����ϴ�.","�˸�",JOptionPane.INFORMATION_MESSAGE);
						
						if(cb_name.equals("��ü")) {
							List("");
						} else if(cb_name.equals("��ǻ�Ͱ��а�")) {
							String squery = "where department_id = "
									+ "(select department_id from pofol_department where department_id = 'C001')";
							List(squery);
							
						} else if(cb_name.equals("��Ƽ�̵���")) {
							String squery = "where department_id = "
									+ "(select department_id from pofol_department where department_id = 'M002')";
							List(squery);
							
						} else if(cb_name.equals("����ȸ���")) {
							String squery = " where department_id = "
									+ "(select department_id from pofol_department where department_id = 'T003')";
							List(squery);
							
						} else if(cb_name.equals("�������")) {
							String squery = " where department_id = "
									+ "(select department_id from pofol_department where department_id = 'G004')";
							List(squery);
						}
						
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		
		setSize(490, 400);
		setVisible(true);
	}

}
