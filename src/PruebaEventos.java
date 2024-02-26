import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.*;

//PASO 1
class CalculadoraEstandar extends JFrame implements ActionListener, KeyListener{
	JLabel estandar;
	JTextField   txtRes;
	JButton btnPorciento, btnCE, btn7, btn4, btn1, btnMM, btnRAIZ, btnC, btn8, btn5,btn2, btn0, 
	btnX2,btnBORRAR, btn9, btn6, btn3,btnPUNTO,
	btnUNOSOBREX,btnENTRE, btnPOR, btnMENOS, btnMAS, btnIGUAL;
	;

	Stack pila = new Stack();
	//JTextArea estandar, txtRes;

	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();

	Calculadora c1 = new Calculadora();
	public void componentes (JComponent c, int x, int y, int ancho, int heigh) {
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = ancho;
		gbc.gridheight = heigh;
		gbl.setConstraints(c, gbc);
		add(c);
	}

	public CalculadoraEstandar() {

		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("calculadora estandar");
		setVisible(true);

		estandar = new JLabel ("ESTÁNDAR");

		componentes(estandar, 0, 0, 5, 1);

		txtRes = new JTextField(5);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		componentes(txtRes, 0, 1, 5, 1);

		txtRes.addKeyListener(this);


		//***********************************************************************
		btnPorciento= new JButton(" % ");
		componentes(btnPorciento, 0, 2, 1, 1);
		btnPorciento.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("presionaste %");
				if(pila.empty()==true) {
				}else {
					pila.push("%");
				}
			}
		});
		//***********************************************************************
		btnCE= new JButton(" CE ");
		componentes(btnCE, 0, 3, 1, 1);
		btnCE.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("presionaste CE");
			}
		});

		//***********************************************************************
		btn7= new JButton(" 7 ");
		componentes(btn7, 0, 4, 1, 1);
		btn7.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("presionaste 7");
				if(pila.empty()==true) {
					pila.push("7");
					txtRes.setText(pila+"");

				}else {
					String concatenar =pila.peek()+"7";
					pila.pop();
					pila.push(concatenar);
					System.out.println(pila);
					txtRes.setText(pila+"");


				}
				//System.out.println(pila);
			}
		});
		//**********************************************************************************
		btn4= new JButton(" 4 ");
		componentes(btn4, 0, 5, 1, 1);
		btn4.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("presionaste 4");
				if(pila.empty()==true) {
					pila.push("4");
					txtRes.setText(pila+"");
				}else {
					String concatenar =pila.peek()+"4";
					pila.pop();
					pila.push(concatenar);
					System.out.println(pila);
					txtRes.setText(pila+"");
				}
			}
		});
		//**********************************************************************************
		btn1= new JButton(" 1 ");
		componentes(btn1, 0, 6, 1, 1);
		btn1.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("presionaste 1");
				if(pila.empty()==true) {
					pila.push("1");
					txtRes.setText(pila+"");
				}else {
					String concatenar =pila.peek()+"1";
					pila.pop();
					pila.push(concatenar);
					System.out.println(pila);
					txtRes.setText(pila+"");
				}
			}
		});
		//**********************************************************************************
		btn1= new JButton(" ± ");
		componentes(btn1, 0, 7, 1, 1);
		btn1.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("presionaste ±");
				if(pila.empty()==true) {
				}else {
					pila.push("±");
				}
			}
		});
		//C2----------------------------------------------------------------------------
		btnRAIZ= new JButton(" √ ");
		componentes(btnRAIZ, 1, 2, 1, 1);
		btnRAIZ.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("presionaste btnRAIZ");
				if(pila.empty()==true) {
				}else {
					pila.push("√");
				}
			}
		});
		//**********************************************************************************
		btnC= new JButton(" C ");
		componentes(btnC, 1, 3, 1, 1);
		btnC.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("presionaste C");
			}
		});
		//**********************************************************************************
		btn8= new JButton(" 8 ");
		componentes(btn8, 1, 4, 1, 1);
		btn8.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("presionaste 8");
				if(pila.empty()==true) {
					pila.push("8");
					txtRes.setText(pila+"");
				}else {
					String concatenar =pila.peek()+"8";
					pila.pop();
					pila.push(concatenar);
					System.out.println(pila);
					txtRes.setText(pila+"");
				}
			}
		});
		//**********************************************************************************
		btn5= new JButton(" 5 ");
		componentes(btn5, 1, 5, 1, 1);
		btn5.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("presionaste 5");
				if(pila.empty()==true) {
					pila.push("5");
					System.out.println(pila);
					txtRes.setText(pila+"");
				}else {
					String concatenar =pila.peek()+"5";
					pila.pop();
					pila.push(concatenar);
					System.out.println(pila);
					txtRes.setText(pila+"");
				}
			}
		});
		//**********************************************************************************
		btn2= new JButton(" 2 ");
		componentes(btn2, 1, 6, 1, 1);
		btn2.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("presionaste 2");
				if(pila.empty()==true) {
					pila.push("2");
					txtRes.setText(pila+"");
				}else {
					String concatenar =pila.peek()+"2";
					pila.pop();
					pila.push(concatenar);
					System.out.println(pila);
					txtRes.setText(pila+"");
				}
			}
		});
		//**********************************************************************************
		btn0= new JButton(" 0 ");
		componentes(btn0, 1, 7, 1, 1);
		btn0.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("presionaste 0");
				if(pila.empty()==true) {
					pila.push("0");
					txtRes.setText(pila+"");
				}else {
					String concatenar =pila.peek()+"0";
					pila.pop();
					pila.push(concatenar);
					System.out.println(pila);
					txtRes.setText(pila+"");
				}
			}
		});
		//C3------------------------------------------------------------------------------------
		btnX2= new JButton(" X² ");
		componentes(btnX2, 3, 2, 1, 1);
		btnX2.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("presionaste X²");
				if(pila.empty()==true) {
				}else {
					pila.push("D");
					//D=X2
				}
			}
		});
		//**********************************************************************************
		btnBORRAR= new JButton(" BORRAR ");
		componentes(btnBORRAR, 3, 3, 1, 1);
		btnBORRAR.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("presionaste BORRAR");
				if(pila.empty()==true) {
				}else {
					String cima =(String) pila.peek();
					String borrado = cima.substring(0,cima.length()-1);
					pila.push(borrado);
				}
			}
		});
		//**********************************************************************************
		btn9= new JButton(" 9 ");
		componentes(btn9, 3, 4, 1, 1);
		btn9.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("presionaste 9");
				if(pila.empty()==true) {
					pila.push("9");
					txtRes.setText(pila+"");
				}else {
					String concatenar =pila.peek()+"9";
					pila.pop();
					pila.push(concatenar);
					System.out.println(pila);
					txtRes.setText(pila+"");
				}
			}
		});
		//**********************************************************************************
		btn6= new JButton(" 6 ");
		componentes(btn6, 3, 5, 1, 1);
		btn6.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("presionaste 6");
				if(pila.empty()==true) {
					pila.push("6");
					txtRes.setText(pila+"");
				}else {
					String concatenar =pila.peek()+"6";
					pila.pop();
					pila.push(concatenar);
					System.out.println(pila);
					txtRes.setText(pila+"");
				}
			}
		});
		//**********************************************************************************
		btn3= new JButton(" 3 ");
		componentes(btn3, 3, 6, 1, 1);
		btn3.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("presionaste 3");
				if(pila.empty()==true) {
					pila.push("3");
					txtRes.setText(pila+"");
				}else {
					String concatenar =pila.peek()+"3";
					pila.pop();
					pila.push(concatenar);
					System.out.println(pila);
					txtRes.setText(pila+"");
				}
			}
		});
		//**********************************************************************************
		btnPUNTO= new JButton(" . ");
		componentes(btnPUNTO, 3, 7, 1, 1);
		btnPUNTO.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("presionaste .");
			}
		});
		//C4------------------------------------------------------------------------------------

		btnUNOSOBREX= new JButton(" 1/X ");
		componentes(btnUNOSOBREX, 4, 2, 1, 1);
		btnUNOSOBREX.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("presionaste 1/X");
			}
		});
		//**********************************************************************************
		btnENTRE= new JButton(" ÷ ");
		componentes(btnENTRE, 4, 3, 1, 1);
		btnENTRE.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("presionaste ÷");
				if(pila.empty()==true) {
				}else {
					pila.push("/");
				}
			}
		});
		//**********************************************************************************
		btnPOR= new JButton(" X ");
		componentes(btnPOR, 4, 4, 1, 1);
		btnPOR.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("presionaste X");
				if(pila.empty()==true) {
				}else {
					pila.push("X");
				}
			}
		});
		//**********************************************************************************
		btnMENOS= new JButton(" - ");
		componentes(btnMENOS, 4, 5, 1, 1);
		btnMENOS.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("presionaste -");
				if(pila.empty()==true) {
				}else {
					pila.push("-");
				}
			}
		});
		//**********************************************************************************
		btnMAS= new JButton(" + ");
		componentes(btnMAS, 4, 6, 1, 1);
		btnMAS.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("presionaste +");
				if(pila.empty()==true) {
				}else {
					pila.push("+");
				}
			}
		});
		//**********************************************************************************
		btnIGUAL= new JButton(" = ");
		componentes(btnIGUAL, 4, 7, 1, 1);
		btnIGUAL.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("presionaste =");
				if(pila.empty()==true) {
				}else {
					pila.push("=");
				}
			}
		});

		pack();
		setLocationRelativeTo(null);


	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton bottonElegido = (JButton) e.getSource();//Con el source
		String botonAtext = bottonElegido.getText();

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		//impriir las teclas que presionamos 
		System.out.println("Presionaste una tecla ");
		System.out.println(e);
		System.out.println(e.getKeyCode());
		System.out.println(e.getKeyChar());

		//if ()

	}
}//clase Calculadora

public class PruebaEventos {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new CalculadoraEstandar();
			}
		});
	}

}