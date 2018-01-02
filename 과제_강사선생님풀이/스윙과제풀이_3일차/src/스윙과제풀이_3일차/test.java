package ��������Ǯ��_3����;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class test extends JFrame{
	Container contentPane;
	
	ImageIcon[] image= {
			new ImageIcon("images/pic1.jpg"),
			new ImageIcon("images/pic2.jpg"),
			new ImageIcon("images/pic3.jpg")
	};
	JLabel imageLabel = new JLabel();
	
	int ImgCnt =0;	
	test(){
		setTitle("��ư ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		
		JButton LeftBtn = new JButton("<=");
		
		JButton RightBtn = new JButton("=>");
		
		panel.add(LeftBtn);
		panel.add(RightBtn);
		imageLabel.setIcon(image[ImgCnt]);
		
		//��ư�̺�Ʈ
		LeftBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//���ʹ�ư��������
				++ImgCnt;
//				System.out.println(2-(ImgCnt%3));
				imageLabel.setIcon(image[2-(ImgCnt%3)]);
			}
		});
		
		RightBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//������ ��������
				++ImgCnt;
				imageLabel.setIcon(image[ImgCnt%3]);
			}
		});
		
		contentPane.add(panel,BorderLayout.NORTH);
		contentPane.add(imageLabel,BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		setSize(500,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new test();
	}

}
