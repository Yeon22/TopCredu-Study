package ��������Ǯ��;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test extends JFrame{
//	4.����3�� �����Ͽ� ��������� ���� �� ��ư�� ������ ���� �ٸ��� �����϶�.
	
	Test(){
		Container contentPane = this.getContentPane();
		
		contentPane.setLayout(new GridLayout(1,10));
		
		Integer k = 1;
		
		Color[] buttonColor = new Color[10];
		
		buttonColor[0] = Color.RED;
		buttonColor[1] = Color.ORANGE;
		buttonColor[2] = Color.YELLOW;
		buttonColor[3] = Color.GREEN;
		buttonColor[4] = Color.CYAN;
		buttonColor[5] = Color.BLUE;
		buttonColor[6] = Color.MAGENTA;
		buttonColor[7] = Color.GRAY;
		buttonColor[8] = Color.PINK;
		buttonColor[9] = Color.LIGHT_GRAY;
		
		for(int i=0; i<10; i++) {
			JButton btn = new JButton(k.toString());
			btn.setBackground(buttonColor[i]);
			contentPane.add(btn);
			k++;			
		}
		
		setSize(500, 200);
		setTitle("Hello");
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new Test();
	}

}
