package window_gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class standard_calculator {

	private JFrame frame;
	private JTextField txtdisplay;
    double firstnum;
    String operations;
    double secondnum;
    double result;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					standard_calculator window = new standard_calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public standard_calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 284, 567);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtdisplay = new JTextField();
		txtdisplay.setBounds(10, 11, 240, 57);
		frame.getContentPane().add(txtdisplay);
		txtdisplay.setColumns(10);
		
		//row1//
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String EnterNumber = txtdisplay.getText()+btn7.getText();
				txtdisplay.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn7.setBounds(10, 81, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String EnterNumber = txtdisplay.getText()+btn8.getText();
				txtdisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn8.setBounds(59, 81, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String EnterNumber = txtdisplay.getText()+btn9.getText();
				txtdisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn9.setBounds(109, 81, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				firstnum=Double.parseDouble(txtdisplay.getText());
				txtdisplay.setText("");
				operations="/";
			}
		});
		btndiv.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btndiv.setBounds(200, 79, 50, 50);
		frame.getContentPane().add(btndiv);
		
		//row2
		JButton btn4= new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String EnterNumber = txtdisplay.getText()+btn4.getText();
				txtdisplay.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn4.setBounds(10, 142, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String EnterNumber = txtdisplay.getText()+btn5.getText();
				txtdisplay.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn5.setBounds(59, 142, 50, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String EnterNumber = txtdisplay.getText()+btn6.getText();
				txtdisplay.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn6.setBounds(109, 142, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnmult = new JButton("*");
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				firstnum=Double.parseDouble(txtdisplay.getText());
				txtdisplay.setText("");
				operations="*";
			}
		});
		btnmult.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnmult.setBounds(200, 140, 50, 50);
		frame.getContentPane().add(btnmult);
		
		//row3//
		JButton btn1= new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String EnterNumber = txtdisplay.getText()+btn1.getText();
				txtdisplay.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn1.setBounds(10, 203, 50, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String EnterNumber = txtdisplay.getText()+btn2.getText();
				txtdisplay.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn2.setBounds(59, 203, 50, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
			String EnterNumber = txtdisplay.getText()+btn3.getText();
			txtdisplay.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn3.setBounds(109, 203, 50, 50);
		frame.getContentPane().add(btn3);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				firstnum=Double.parseDouble(txtdisplay.getText());
				txtdisplay.setText("");
				operations="-";
			}
		});
		btnsub.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnsub.setBounds(200, 201, 50, 50);
		frame.getContentPane().add(btnsub);
		
	    //row4//
		JButton btn0= new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String EnterNumber = txtdisplay.getText()+btn0.getText();
				txtdisplay.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn0.setBounds(10, 264, 50, 50);
		frame.getContentPane().add(btn0);
		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				firstnum=Double.parseDouble(txtdisplay.getText());
				txtdisplay.setText("");
				operations=".";
			}
		});
		btndot.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btndot.setBounds(59, 264, 50, 50);
		frame.getContentPane().add(btndot);
		
		JButton btnadd = new JButton("+");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				firstnum=Double.parseDouble(txtdisplay.getText());
				txtdisplay.setText("");
				operations="+";
			}
		});
		btnadd.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnadd.setBounds(109, 264, 50, 50);
		frame.getContentPane().add(btnadd);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String answer;
				secondnum=Double.parseDouble(txtdisplay.getText());
				if(operations=="+")
				{
					result=firstnum+secondnum;
					answer=String.format("%.2f", result);
					txtdisplay.setText(answer);
				}
				else if(operations=="-")
				{
					result=firstnum-secondnum;
					answer=String.format("%.2f", result);
					txtdisplay.setText(answer);
				}
				else if(operations=="*")
				{
					result=firstnum*secondnum;
					answer=String.format("%.2f", result);
					txtdisplay.setText(answer);
				}
				else if(operations=="/")
				{
					result=firstnum/secondnum;
					answer=String.format("%.2f", result);
					txtdisplay.setText(answer);
				}
				
			}
		});
		btnequal.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnequal.setBounds(200, 262, 50, 50);
		frame.getContentPane().add(btnequal);
		
	  
		
	}
}
