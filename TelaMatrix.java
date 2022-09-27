package com.aed.soft.matrix;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;

public class TelaMatrix extends JWindow {

	private static final long serialVersionUID = 1L;

	Container c;

	public TelaMatrix() {

		Dimension din = getToolkit().getScreenSize();
		c = this.getContentPane();
		JPanel panel = new JPanel();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		c.add(panel2, BorderLayout.WEST);
		c.add(panel, BorderLayout.CENTER);
		c.add(panel1, BorderLayout.EAST);
		
		panel1.setLayout(new GridLayout(1,1));
		panel1.setBackground(Color.WHITE);
		
		panel.setLayout(new GridLayout(1,1));
		panel.setBackground(Color.BLACK);
		
		panel2.setLayout(new GridLayout(1,1));
		panel2.setBackground(Color.WHITE);
		
		//teste
		panel1.add(new Linha());
		panel2.add(new JLabel("matrix"));
		

		int value = 100;

		for (int i = 0; i < value; i++) {
			panel.add(new Linha());
		}
		setSize(din.width, din.height-300);
		
		setVisible(true);

	}
	
public static void main(String[]args) {
	new TelaMatrix();
}

}
