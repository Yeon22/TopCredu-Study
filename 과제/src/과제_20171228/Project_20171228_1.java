package ����_20171228;

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

public class Project_20171228_1 extends JFrame{
	Container contentPane;
	JButton Leftbtn, Rightbtn;
	JLabel imageLabel;
	ImageIcon [] image = new ImageIcon[3];
	int currentId;
	
	public Project_20171228_1() {
		setTitle("2017�� 12�� 28�� ���� 1��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		
		for(int i=0; i<image.length; i++) {
			image[i] = new ImageIcon("images_20171228/"+i+".jpg");
		}
		currentId = 0; 
		imageLabel = new JLabel(image[currentId]); 

		ImageIcon leftIcon = new ImageIcon("images_20171228/����ȭ��ǥ.jpg");
		ImageIcon rightIcon = new ImageIcon("images_20171228/������ȭ��ǥ.jpg");
		Leftbtn = new JButton(leftIcon);
		Rightbtn = new JButton(rightIcon);
		
		Leftbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				currentId --; 
				if(currentId < 0) {
					System.out.println("���� �̹����� �������� �ʽ��ϴ�.");
				} else {
					imageLabel.setIcon(image[currentId]); 
				}
			}
		});
		
		Rightbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				currentId ++;
				if(currentId > 2) {
					System.out.println("���� �̹����� �������� �ʽ��ϴ�.");
				} else {
					imageLabel.setIcon(image[currentId]); 
				}
			}
		});
		
		contentPane.add(imageLabel, BorderLayout.CENTER);
		contentPane.add(panel,BorderLayout.NORTH);
		panel.add(Leftbtn);
		panel.add(Rightbtn);
		
		setSize(500,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Project_20171228_1();
	}

}
