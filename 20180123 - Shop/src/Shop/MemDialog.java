package Shop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MemDialog extends JDialog {
	Connection conn = null;
	Statement stmt = null;
	
	JLabel idLbl = new JLabel("���̵�");
	JTextField idTxt = new JTextField(10);
	JLabel nameLbl = new JLabel("�̸�");
	JTextField nameTxt = new JTextField(10);
	ButtonGroup g = new ButtonGroup();
	
	JRadioButton [] radio = new JRadioButton[2];
	String [] text = {"����", "����"};
	
	JRadioButton ManRdb = new JRadioButton("����");
	JRadioButton WomanRdb = new JRadioButton("����");
	
	JButton SignBtn = new JButton("���");
	String Check = "m";
	
	public MemDialog(JFrame frame, String title){
		super(frame, title, true);
		setLayout(null);
		
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
		
		idLbl.setBounds(30,30,80,20);
		idTxt.setBounds(75,30,130,20);
		nameLbl.setBounds(30,30+40,80,20);
		nameTxt.setBounds(75,30+40,130,20);
		ManRdb.setBounds(50,30+40+40,100,20);
		WomanRdb.setBounds(150,30+40+40,100,20);
		g.add(ManRdb);
		g.add(WomanRdb);
		
		SignBtn.setBounds(100, 300, 85, 32);
		
		add(idLbl);
		add(idTxt);
		add(nameLbl);
		add(nameTxt);
		
		add(ManRdb);
		add(WomanRdb);
		
		ManRdb.addItemListener(new MyItemListener());
		WomanRdb.addItemListener(new MyItemListener());
		
		add(SignBtn);
		
		SignBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(idTxt.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "���̵� �Է��ϼ���.");
					idTxt.requestFocus();
				} else if(nameTxt.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "�̸��� �Է��ϼ���.");
					nameTxt.requestFocus();
				} else {
					//�μ�Ʈ �۾�
					try {
						String sql = "insert into member values('"
								+idTxt.getText()+"', '"
								+nameTxt.getText()+"', '"
								+Check+"', sysdate)";
						stmt.executeUpdate(sql);
						System.out.println("�ԷµǾ����ϴ�.");
						JOptionPane.showMessageDialog(null, "�ԷµǾ����ϴ�.");
						
					} catch(Exception a) {
						a.printStackTrace();
					}
				}
			}
		});
		
		setSize(300, 400);
		
	}
	
	class MyItemListener implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.DESELECTED)
				return; //���� ��ư�� ���������� ��� �׳� ����
			if(ManRdb.isSelected()) {
				Check = "m";
			} else if(WomanRdb.isSelected()) {
				Check = "f";
			}
		}
		
	}

}
