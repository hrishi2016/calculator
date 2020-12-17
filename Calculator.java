package guru;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	JLabel displayLabel;
	JFrame jf;
	JButton Button7;
	JButton Button8;
	JButton Button9;
	JButton Button4;
	JButton Button5;
	JButton Button6;
	JButton Button1;
	JButton Button2;
	JButton Button3;
	JButton Button0;
	JButton Buttoneq;
	JButton Buttondot , Buttonpls, Buttonmult, Buttonmns, Buttondiv, Buttonclr;
	
	

      public Calculator() {
	
             jf = new JFrame("Calculator");
             jf.setLayout(null);
             jf.setSize(600, 600);
             jf.setLocation(370, 100);
              displayLabel = new JLabel("0");
             displayLabel.setBounds(30, 50, 540, 40);
             displayLabel.setBackground(Color.LIGHT_GRAY);
             displayLabel.setOpaque(true);
             displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
             jf.add(displayLabel);
             
             Button7 = new JButton("7");
             Button7.setBounds(30, 130 , 80 , 80);
             Button7.addActionListener(this);
             jf.add(Button7);
             Button8 = new JButton("8");
             Button8.setBounds(130, 130 , 80 , 80);
             Button8.addActionListener(this);
             jf.add(Button8);
             Button9 = new JButton("9");
             Button9.addActionListener(this);
             Button9.setBounds(230, 130 , 80 , 80);
             jf.add(Button9);
             
              Button4 = new JButton("4");
              Button4.addActionListener(this);
             Button4.setBounds(30, 230 , 80 , 80);
             jf.add(Button4);
             Button5 = new JButton("5");
             Button5.addActionListener(this);
             Button5.setBounds(130, 230 , 80 , 80);
             jf.add(Button5);
             Button6 = new JButton("6");
             Button6.addActionListener(this);
             Button6.setBounds(230, 230 , 80 , 80);
             jf.add(Button6);
             
             Button3 = new JButton("3");
             Button3.addActionListener(this);
             Button3.setBounds(230, 330 , 80 , 80);
             jf.add(Button3);
             Button2 = new JButton("2");
             Button2.addActionListener(this);
             Button2.setBounds(130, 330 , 80 , 80);
             jf.add(Button2);
             Button1 = new JButton("1");
             Button1.addActionListener(this);
             Button1.setBounds(30, 330 , 80 , 80);
             jf.add(Button1);
             
            Buttoneq = new JButton("=");
             Buttoneq.setBounds(230, 430 , 340 , 80);
             Buttoneq.addActionListener(this);
             jf.add(Buttoneq);
             Buttondot = new JButton(".");
             Buttondot.addActionListener(this);
             Buttondot.setBounds(30, 430 , 80 , 80);
             jf.add(Buttondot);
             Button0 = new JButton("0");
             Button0.addActionListener(this);
             Button0.setBounds(130, 430 , 80 , 80);
             jf.add(Button0);
             
             Buttondiv= new JButton("/");
             Buttondiv.setBounds(330, 130 , 80 , 80);
             Buttondiv.addActionListener(this);
             jf.add(Buttondiv);
             
             Buttonmult= new JButton("X");
             Buttonmult.addActionListener(this);
             Buttonmult.setBounds(430, 130 , 80 , 80);
             jf.add(Buttonmult);
             
             Buttonpls = new JButton("+");
             Buttonpls.addActionListener(this);
             Buttonpls.setBounds(330, 230 , 182 , 80);
             jf.add(Buttonpls);
             
             Buttonmns = new JButton("-");
             Buttonmns.addActionListener(this);
             Buttonmns.setBounds(330, 330 , 182 , 80);
             jf.add(Buttonmns);
             Buttonclr= new JButton("clear");
             Buttonclr.addActionListener(this);
             Buttonclr.setBounds(520, 130 , 60 , 280);
             jf.add(Buttonclr);
             
             
             jf.setVisible(true);
             jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		  
      
      }
      public static void main(String[] args) {
    	  new Calculator();
      }
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Buttoneq) {jf.getContentPane().setBackground(Color.DARK_GRAY);
		}
		else if(e.getSource()!=Buttoneq){jf.getContentPane().setBackground(Color.white);}
		if(e.getSource()==Button7) {
			displayLabel.setText(displayLabel.getText()+"7");
		}
		else if(e.getSource()==Button8) {
			displayLabel.setText(displayLabel.getText()+"8");
			
		}
		else if(e.getSource()==Button9) {
			displayLabel.setText(displayLabel.getText()+"9");
			
		}
		else if(e.getSource()==Button6) {
			displayLabel.setText(displayLabel.getText()+"6");
			
		}
		else if(e.getSource()==Button5) {
			displayLabel.setText(displayLabel.getText()+"5");
			
		}
		else if(e.getSource()==Button4) {
			displayLabel.setText(displayLabel.getText()+"4");
			
		}
		else if(e.getSource()==Button3) {
			displayLabel.setText(displayLabel.getText()+"3");
			
		}
		else if(e.getSource()==Button2) {
			displayLabel.setText(displayLabel.getText()+"2");
			
		}
		else if(e.getSource()==Button1) {
			displayLabel.setText(displayLabel.getText()+"1");
			
		}
		else if(e.getSource()==Buttondot) {
			displayLabel.setText(displayLabel.getText()+".");
	
	}
		else if(e.getSource()==Button0) {
			displayLabel.setText(displayLabel.getText()+"0");
}
		else if(e.getSource()==Buttonmns) {
			displayLabel.setText(displayLabel.getText()+"-");
			
}
		else if(e.getSource()==Buttonpls) {
			displayLabel.setText(displayLabel.getText()+"+");
}
		else if(e.getSource()==Buttondiv) {
			displayLabel.setText(displayLabel.getText()+"/");
}
		else if(e.getSource()==Buttonmult) {
			displayLabel.setText(displayLabel.getText()+"*");
}
		
		else if(e.getSource()==Buttonclr) {
			displayLabel.setText("");
}
	}
}