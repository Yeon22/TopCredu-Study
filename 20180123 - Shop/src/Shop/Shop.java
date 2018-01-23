package Shop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Shop extends JFrame {
	Connection conn;
	JPanel panel;
	
	//ȸ������ ���̾�α� ����
	MemDialog dialog = new MemDialog(null, "ȸ������");
	
	//��ǰ��� ���̾�α� ����
	
	Shop(){
		setTitle("��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar bar = new JMenuBar();
		
		JMenu m_member = new JMenu("ȸ��            ");
		bar.add(m_member);
		
		JMenuItem m_MemSign = new JMenuItem("ȸ������");
		m_member.add(m_MemSign);
		
		m_MemSign.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
			}
		});
		
		//ȸ�����
		JMenuItem m_MemList = new JMenuItem("ȸ�����");
		m_member.add(m_MemList);
		
		m_MemList.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.removeAll(); //��� ������Ʈ ����
				panel.revalidate(); //�ٽ� Ȱ��ȭ
				panel.repaint(); //�ٽ� �׸���
				panel.add(new MemList());
				panel.setLayout(null);
			}
		});
		
		//������ȸ
		JMenuItem m_MemSearch = new JMenuItem("������ȸ");
		m_member.add(m_MemSearch);
		
		m_MemSearch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.removeAll(); //��� ������Ʈ ����
				panel.revalidate(); //�ٽ� Ȱ��ȭ
				panel.repaint(); //�ٽ� �׸���
//				panel.add(new GenderList());
				panel.setLayout(null);
			}
		});
		
		//�����̺�Ʈ
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				try {
					if(conn!=null) {
						conn.close();
					}
				} catch(SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		JMenu m_Goods = new JMenu("��ǰ            ");
		bar.add(m_Goods);
		
		JMenuItem m_GoodSign = new JMenuItem("��ǰ���");
		m_Goods.add(m_GoodSign);
		
		m_GoodSign.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JMenu m_Orders = new JMenu("�ֹ�            ");
		bar.add(m_Orders);
		
		JMenuItem m_OrderList = new JMenuItem("�ֹ����");
		m_Orders.add(m_OrderList);
		
		m_Orders.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.removeAll(); //��� ������Ʈ ����
				panel.revalidate(); //�ٽ� Ȱ��ȭ
				panel.repaint(); //�ٽ� �׸���
//				panel.add(new OrderList());
				panel.setLayout(null);
			}
		});
		
		panel = new JPanel();
		add(panel);
		
		setJMenuBar(bar);
		setSize(800, 600);
		setResizable(false);
		setVisible(true);
		
	}
	
	

	public static void main(String[] args) {
		new Shop();
	}

}
