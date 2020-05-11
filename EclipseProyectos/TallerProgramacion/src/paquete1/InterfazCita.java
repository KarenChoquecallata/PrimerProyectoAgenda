package paquete1;

import java.awt.*;

import javax.swing.*;

public class InterfazCita extends JFrame {

	public InterfazCita() {
	
		setVisible(true);
	 
		LaminaCita lamina = new LaminaCita();
	 
		add(lamina);
	 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		setSize(500,500);
	 
	}

}
class LaminaCita extends JPanel{
	
	JPanel datos;
	
	int contador;
	
	public LaminaCita() {
		
		setLayout(new BorderLayout());
		
		 datos = new JPanel();
		
		// panel datos
		
		JLabel textotitulo = new JLabel("Titulo");
		
		JTextField titulo = new JTextField(30);
		
        JLabel textolugar = new JLabel("Ubicacion");
		
		JTextField lugar = new JTextField(30);
		
        JLabel textodescripcion = new JLabel("Descripcion");
		
		JTextField descripcion = new JTextField(30);
		
		ubicar(textotitulo);
		
		ubicar(titulo);
		
		ubicar(textolugar);
		
		ubicar(lugar);
		
		ubicar(textodescripcion);
		
		ubicar(descripcion);
		
		add(datos, BorderLayout.CENTER);
		
		
		JPanel botones = new JPanel();
		
		JButton guardar = new JButton("Guardar");
		
		JButton descartar = new JButton("Cancelar");
		
		botones.add(guardar);
		
		botones.add(descartar);
		
		add(botones, BorderLayout.SOUTH);
		
	}
	
	public void ubicar(JComponent c) 
	{
		datos.setLayout(null);
	
		contador = 0;
		
		if(contador == 0) {
			
			datos.add(c);
			c.setBounds(10, 10, 100,100);
			contador++;
		}
		
		
	}
	
}