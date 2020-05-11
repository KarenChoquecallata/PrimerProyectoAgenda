package paquete1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.invoke.SwitchPoint;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;


public class LaminaCalendarioMensual extends JPanel {
	     
       int contador;
      
       JPanel encabezado;
	   int year;
	   int month;
	   LaminaCalendarioMe a;
	   JLabel textoFecha ;
	   
	public LaminaCalendarioMensual(int year, int month) {
		contador=0;
		setLayout(new BorderLayout());
		this.year = year;
		this.month = month;
		JPanel todo = new JPanel();
		BoxLayout nuevo = new BoxLayout(todo, BoxLayout.Y_AXIS);
		todo.setLayout(nuevo);
		JPanel encabezado = new JPanel(new GridLayout(1,7,2,2));
		JLabel tituloanio= new JLabel("" + year+"    ");
		String tituloM = nombrarMes(month);
		JLabel tituloMes = new JLabel(tituloM);
		Border border = LineBorder.createGrayLineBorder();
		//tituloMes.setBorder(border);
	     a = new LaminaCalendarioMe(year, month);
	
		JLabel a1 = new JLabel("   LU");
		JLabel a2 = new JLabel("   MA");
		JLabel a3 = new JLabel("   MI");
		JLabel a4 = new JLabel("   JU");
		JLabel a5 = new JLabel("   VI");
		JLabel a6 = new JLabel("   SA");
		JLabel a7 = new JLabel("   DO");
	
		encabezado.add(a1);
		encabezado.add(a2);
		encabezado.add(a3);
		encabezado.add(a4);
		encabezado.add(a5);
		encabezado.add(a6);
		encabezado.add(a7);
		Color color = new Color(93, 188, 210);
		encabezado.setBackground(color);
	    textoFecha = new JLabel();
	    textoFecha.setBorder(border);
		//todo.setBorder(border);
		todo.setBackground(Color.WHITE);
		//add(tituloMes, BorderLayout.NORTH);
		todo.add(tituloanio);
		todo.add(tituloMes);
		todo.add(encabezado);
		add(textoFecha,BorderLayout.SOUTH);
		add(todo, BorderLayout.NORTH);
		add(a, BorderLayout.CENTER);
	}
	
	public String nombrarMes (int month) {
		String res = "";
		
	    switch (month) {
		case 0:
			res = "ENERO";
			break;
		case 1:
			res = "FEBRERO";
			break;
		case 2:
			res = "MARZO";
			break;
		case 3:
			res = "ABRIL";
			break;
		case 4:
			res = "MAYO";
			break;
		case 5:
			res = "JUNIO";
			break;
		case 6:
			res = "JULIO";
			break;
		case 7:
			res = "AGOSTO";
			break;
		case 8:
			res = "SEPTIEMBRE";
			break;
		case 9:
			res = "OCTUBRE";
			break;
		case 10:
			res = "NOVIEMBRE";
			break;
		case 11:
			res = "DICIEMBRE";
			break;
		
		default:
			break;
		}
		
		return res;
		
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
	public String darFecha() {
		
		return textoFecha.getText();
	}
	 class LaminaCalendarioMe extends JPanel implements  ActionListener {
			
			int contador ;
			
			int contador2;
			
			int offs;
			
			Calendar calen;
			 
			int dim ;
			
			int month;
			
			int year;
			
			
			JButton a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
			
			JButton z1,z2,z3,z4,z5,z6,z7,z8,z9;
			
			JButton b1,b2,b3,b4,b5,b6;
			
			String fecha;
			
			public LaminaCalendarioMe(int year, int month) {
				
				this.month = month;
				
				this.year = year;
				
				contador2 = 43;
				
				calen = new GregorianCalendar(year, month,1 );
				
			    setLayout(new GridLayout(6,7,5,5));
				
			    setBackground(Color.WHITE);	
				
			    contador = 1;
				
				offs = calen.get(Calendar.DAY_OF_WEEK) -2;
				
				dim = calen.getActualMaximum(Calendar.DAY_OF_MONTH);
				
				crearDia(a,year,month);
				crearDia(b,year,month);
				crearDia(c,year,month);
				crearDia(d,year,month);
				crearDia(e,year,month);
				crearDia(f,year,month);
				crearDia(g,year,month);
				crearDia(h,year,month);
				crearDia(i,year,month);
				crearDia(j,year,month);
				crearDia(k,year,month);
				crearDia(l,year,month);
				crearDia(m,year,month);
				crearDia(n,year,month);
				crearDia(o,year,month);
				crearDia(p,year,month);
				crearDia(q,year,month);
				crearDia(r,year,month);
				crearDia(s,year,month);
				crearDia(t,year,month);
				crearDia(u,year,month);
				crearDia(v,year,month);
				crearDia(w,year,month);
				crearDia(x,year,month);
				crearDia(y,year,month);
				crearDia(z,year,month);
				crearDia(z1,year,month);
				crearDia(z2,year,month);
				crearDia(z3,year,month);
				crearDia(z4,year,month);
				crearDia(z5,year,month);
				crearDia(z6,year,month);
				crearDia(z7,year,month);
				crearDia(z8,year,month);
				crearDia(z9,year,month);
				crearDia(b1,year,month);
				crearDia(b2,year,month);
				crearDia(b3,year,month);
				crearDia(b4,year,month);
				crearDia(b5,year,month);
				crearDia(b6,year,month);
				
				//Border borde = LineBorder.createGrayLineBorder();
				//setBorder(borde);
				
			}
			
			public boolean tieneMasSemanas() {
				
				calen.set(year, month, dim);
				int vario = calen.get(Calendar.WEEK_OF_MONTH) ;
				boolean res= false;
				if(vario == 6) {
					
					res = true;
				}
				calen.set(year, month, 1);
				return res;
				
			}
			public void crearDia(JButton a, int year, int month ) {
			     if(offs == -1) {
			    	 offs = 6;
			     }
				 if(offs == 0) {
					       
						          if (contador < dim+1 ) {
					              a = new JButton( ""+contador);
					             
					              Border border = LineBorder.createGrayLineBorder();
					              a.addActionListener(this);
					              a.setBorder(border);
					              a.setBackground(Color.WHITE);
					              contador++;
					              contador2--;
				                   }else { 
				                	   if(contador2!= 0) {
				                		   a = new JButton("    ");
				                		   a.setBorder(null);
				                		   a.setBackground(Color.white);
				                		   contador2--;
				                	   }
				                	   
				                	   
				                   }
					      
				 }else {
					 
					 a = new JButton("    ");
					 a.setBorder(null);
					 a.setBackground(Color.white);
					 offs--;
					 contador2--;
				 }
				
				add(a);
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				String evento  = e.getActionCommand();
				 this.fecha = evento;
				textoFecha.setText(guardarFecha());
			   
			    guardarFecha();
			}

			public String guardarFecha() {
				String res= fecha + "/"+ (month+1) +"/"+ ""+year;
				
				return res;
			}
			public String getFecha() {
				return this.fecha;
			}
		}

}
