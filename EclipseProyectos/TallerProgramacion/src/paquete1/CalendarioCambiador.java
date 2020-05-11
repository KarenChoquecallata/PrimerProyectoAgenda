package paquete1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.*;

public class CalendarioCambiador extends JFrame  implements WindowListener{
	LaminaPrincipal prueba;
	public CalendarioCambiador() {
		Calendar calendar = new GregorianCalendar();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		 prueba = new LaminaPrincipal(year,month);
		 
		add(prueba);
		setVisible(true);
		setSize(600,600);
		addWindowListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String actualFecha = prueba.getFechaMarcada();
		System.out.println(actualFecha);
	}

	public static void main(String[] args) {
		CalendarioCambiador ca= new CalendarioCambiador();

	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		String actualFecha = prueba.getFechaMarcada();
		System.out.println(actualFecha);
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		String actualFecha = prueba.getFechaMarcada();
		System.out.println(actualFecha);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
class LaminaPrincipal extends JPanel implements ActionListener{
	
	int year;
	int month;
	JButton back;
	JButton next;
	LaminaCalendarioMensual anterior;
	LaminaCalendarioMensual actual;
	LaminaCalendarioMensual siguiente;
    String fechaMarcada;
	public LaminaPrincipal(int year, int month) {
        this.month = month;
		this.year = year;
		setLayout(new BorderLayout());
		ImageIcon imagen= new ImageIcon("botoncito.png");
		ImageIcon imagen2= new ImageIcon("back.png");
	    next = new JButton("", imagen);
		back = new JButton("",imagen2);
		next.setBorder(null);
		back.setBorder(null);
		next.setBackground(Color.WHITE);
	    back.setBackground(Color.WHITE);
		next.addActionListener(this);
		back.addActionListener(this);
		addMesActual(year,month);
		
		
		add(next, BorderLayout.EAST);
		add(back, BorderLayout.WEST);
	
	}
	public String getFechaMarcada() {
		return actual.darFecha();
		
	}
	public void addMesActual(int year, int month) {
		actual = new LaminaCalendarioMensual(year,month);
		actual.darFecha();
		add(actual,BorderLayout.CENTER);
		
	}
	
	public void addMesSiguiente() {
		if(month == 12) {
			year = year+1;
			month = 0;
			siguiente = new LaminaCalendarioMensual(year,month++);
		 } else {
			siguiente = new LaminaCalendarioMensual(year,month++);
	     }
		add(siguiente,BorderLayout.CENTER);
	
	}
	public void addMesAnterior() {
		if(month == -1) {
			year--;
			month = 11;
			anterior = new LaminaCalendarioMensual(year,month--);
		}else{
			anterior = new LaminaCalendarioMensual(year,month--);
		}
		add(anterior,BorderLayout.CENTER);
	}

		@Override
		public void actionPerformed(ActionEvent e) {
		Object even = e.getSource();
		if(even.equals(next)) {
			
		    actual.setVisible(false);
			addMesSiguiente();
			actual = siguiente;
		
		  // validate();
		   // updateUI();
		    
		}else {
			if(even.equals(back) ){
				actual.setVisible(false);
				addMesAnterior();
				actual = anterior;
			 		}else {
			 			
			 			
			 		}
		}
			
		}
		
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public int getMonth() {
			return month;
		}
		public void setMonth(int month) {
			this.month = month;
		}

	
}



