package ��������Ǯ��;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test2 extends JFrame{
//	5. GridLayout�� ����Ͽ� ���� �׸��� ���� Color.WHITE, Color.GRAY, Color.Red�� 
//	16���� ���� ���������ϴ� 4*4 �ٵ����� �����϶�   ��Ʈ : label.setOpaque(true);
	
	Test2(){
		Container contentPane = this.getContentPane();
		
		contentPane.setLayout(new GridLayout(4,4));
		
		Integer k = 0;
		
		Color[] buttonColor = new Color[16];
		
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
		buttonColor[10] = Color.WHITE;
		buttonColor[11] = Color.BLACK;
		buttonColor[12] = Color.DARK_GRAY;
		buttonColor[13] = Color.RED;
		buttonColor[14] = Color.BLUE;
		buttonColor[15] = Color.CYAN;
		
		for(int i=0; i<16;i++) {
			JLabel badukPane = new JLabel(k.toString());
			badukPane.setBackground(buttonColor[k]);
			badukPane.setOpaque(true);
			contentPane.add(badukPane);
			k++;
		}
		
		setSize(500,200);
		setTitle("hello");
		setVisible(true);
		
	}
		
	
	public static void main(String[] args) {
		new Test2();
	}

}
