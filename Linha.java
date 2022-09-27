package com.aed.soft.matrix;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class Linha extends JPanel implements ActionListener, MouseListener {
	Timer t = new Timer(1, this);
	Codigo lista = new Codigo();
	Random r = new Random();
	Font fonte;
	 int y = -2000;
	 int x = r.nextInt(10);
	 int max;
	int green = 255;
	String word = lista.lineCodeGeneration();

	// controle de velocidade
	public void ctrl_velocidade(int velocity) {
		y += r.nextInt(velocity);
	}
	public Linha() {
	addMouseListener(this);
	}

	public void paintComponent(Graphics g) {

		ctrl_velocidade(100);// define velocidade
		fonte = new Font("Segoe print", Font.PLAIN, 9);
		g.setFont(fonte);
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 1000, 1000);
		t.setInitialDelay(500);
		t.getInitialDelay();
		desenhar(g, x, y, 5);// define a forma do desenho
		repaint();
		fonte = new Font("Segoe print", Font.PLAIN, 12);
		g.setFont(fonte);
		if (y > 800) {
			word = lista.lineCodeGeneration();
			y = -1 * r.nextInt(2000);
			green = 255;
			y += 10;
			repaint();

		}
		repaint();
		g.dispose();

	}

	/**
	 * metodo desenha os codigos na tela
	 * 
	 * @param g   objeto responsavel por desenhar e controlar o fluxo de desenho na
	 *            tela
	 * @param x   width da tela
	 * @param y   height da tela
	 * @param max controla o espaçamento entre os caracteres do codigo
	 * @author Oscar
	 */

	public void desenhar(Graphics g, int x, int y, int max) {
		this.max = max;

		g.setColor(Color.GREEN);
		for (int i = 0; i < word.length(); i++) {
			if (i > word.length() - 2) {
				g.setColor(Color.WHITE);
			} else {

				g.setColor(new Color(0, green, 0));

				if (y >= r.nextInt(800)) {
					green -= 1;
				}

				if (green < 0) {
					green = 0;
				}
			}

			char c = word.charAt(i);
			g.drawString(String.valueOf(c), x, y += max);

		}

	}
	@Override
	public void actionPerformed(ActionEvent e) {
      
	}

	@Override
	public void mouseClicked(MouseEvent e) {

	System.exit(0);
    
  
    
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
