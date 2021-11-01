

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class App extends JFrame {
	
	private JPanel panel;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	
	
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
					frame.setVisible(true);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		});
	}
	
	public App () {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,450,300);
		panel = new JPanel();
		panel.setSize(500, 500);
		panel.setBackground(Color.WHITE);
		setContentPane(panel);
	
		boton(btn1= new JButton(),"Amarillo");
		boton(btn2 = new JButton(),"Azul");
		boton(btn3 = new JButton(),"Rojo");
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		
		btn1.addMouseListener(new MouseListener(){
			
			
			@Override
			public void mouseClicked(MouseEvent e) {
				cambioAmarillo();
				
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {}

			@Override
			public void mouseReleased(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent e) {}

			@Override
			public void mouseExited(MouseEvent e) {}

		});
		
		btn2.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				panel.setBackground(Color.BLUE);
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {}

			@Override
			public void mouseReleased(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent e) {}

			@Override
			public void mouseExited(MouseEvent e) {}

		});

		btn3.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				panel.setBackground(Color.RED);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {}

			@Override
			public void mouseReleased(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent e) {}

			@Override
			public void mouseExited(MouseEvent e) {}

		});
	}
	private void boton(JButton b,String txt) {
		b.setText(txt);
		b.setBounds(100, 100, 100, 40);
		b.setEnabled(true);
	}
	
	public void cambioAmarillo() {
		panel.setBackground(Color.yellow);
	}
	public void cambioAzul() {
		panel.setBackground(Color.blue);
	}
	public void cambioRojo() {
		panel.setBackground(Color.red);
	}
}