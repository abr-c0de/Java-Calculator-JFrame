package calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	JFrame jf;
	JLabel displayLabel;
	
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton dotButton;
	JButton zeroButton;
	JButton deleteButton,addButton,minusButton,multiplyButton,divButton,equalButton,backButton;
	
	String oldValue;
	
	boolean isOperatorclicked=true;
	
	String Operator;

	
	
	
	
	
	Calculator(){
		
	    jf=new JFrame("Calculator");
		
		jf.setSize(580,600);
		jf.setLayout(null);
		jf.setLocation(200, 150);
		jf.getContentPane().setBackground(Color.darkGray);
		
	    displayLabel=new JLabel();
		
		displayLabel.setBounds(32, 40, 480, 75);
		
		displayLabel.setBackground(Color.WHITE);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.LEFT);
		displayLabel.setFont(new Font("Comic Sans MS", Font.CENTER_BASELINE, 28));
		displayLabel.setForeground(Color.BLACK);
		
		jf.add(displayLabel);
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(30, 130, 80, 80);
		sevenButton.setBackground(Color.darkGray);
		sevenButton.setForeground(Color.white);
		sevenButton.addActionListener(this);
		sevenButton.setFont(new Font("Comic Sans MS",Font.CENTER_BASELINE, 40));
		jf.add(sevenButton);
		
	    eightButton=new JButton("8");
		eightButton.setBounds(130, 130, 80, 80);
		eightButton.setBackground(Color.darkGray);
		eightButton.setForeground(Color.white);
		eightButton.addActionListener(this);
		eightButton.setFont(new Font("Comic Sans MS", Font.CENTER_BASELINE, 40));
		jf.add(eightButton);
		
		
	    nineButton=new JButton("9");
		nineButton.setBounds(230, 130, 80, 80);
		nineButton.setBackground(Color.darkGray);
		nineButton.setForeground(Color.white);
		nineButton.addActionListener(this);
		nineButton.setFont(new Font("Comic Sans MS", Font.CENTER_BASELINE, 40));
		jf.add(nineButton);
		
		
	    fourButton=new JButton("4");
		fourButton.setBounds(30, 230, 80, 80);
		fourButton.setBackground(Color.darkGray);
		fourButton.setForeground(Color.white);
		fourButton.addActionListener(this);
		fourButton.setFont(new Font("Comic Sans MS", Font.CENTER_BASELINE, 40));
		jf.add(fourButton);
		
	    fiveButton=new JButton("5");
		fiveButton.setBounds(130, 230, 80, 80);
		fiveButton.setBackground(Color.darkGray);
		fiveButton.setForeground(Color.white);
		fiveButton.addActionListener(this);
		fiveButton.setFont(new Font("Comic Sans MS", Font.CENTER_BASELINE, 40));
		jf.add(fiveButton);
		
		
	    sixButton=new JButton("6");
		sixButton.setBounds(230, 230, 80, 80);
		sixButton.setBackground(Color.darkGray);
		sixButton.setForeground(Color.white);
		sixButton.addActionListener(this);
		sixButton.setFont(new Font("Comic Sans MS", Font.CENTER_BASELINE, 40));
		jf.add(sixButton);
		
		
	    oneButton=new JButton("1");
	    oneButton.setBounds(30, 330, 80, 80);
	    oneButton.setBackground(Color.darkGray);
		oneButton.setForeground(Color.white);
        oneButton.addActionListener(this);
		oneButton.setFont(new Font("Comic Sans MS", Font.CENTER_BASELINE, 40));
		jf.add(oneButton);
		
	    twoButton=new JButton("2");
		twoButton.setBounds(130, 330, 80, 80);
		twoButton.setBackground(Color.darkGray);
		twoButton.setForeground(Color.white);
		twoButton.addActionListener(this);
		twoButton.setFont(new Font("Comic Sans MS", Font.CENTER_BASELINE, 40));
		jf.add(twoButton);
		
		
	    threeButton=new JButton("3");
		threeButton.setBounds(230, 330, 80, 80);
		threeButton.setBackground(Color.darkGray);
		threeButton.setForeground(Color.white);
		threeButton.addActionListener(this);
		threeButton.setFont(new Font("Comic Sans MS", Font.CENTER_BASELINE, 40));
		jf.add(threeButton);
		
		
	    dotButton=new JButton(".");
		dotButton.setBounds(30, 430, 80, 80);
		dotButton.setBackground(Color.darkGray);
		dotButton.setForeground(Color.white);
		dotButton.addActionListener(this);
		dotButton.setFont(new Font("Comic Sans MS", Font.CENTER_BASELINE, 40));
		jf.add(dotButton);
		
		
	    zeroButton=new JButton("0");
		zeroButton.setBounds(130, 430, 80, 80);
		zeroButton.setBackground(Color.darkGray);
		zeroButton.setForeground(Color.white);
		zeroButton.addActionListener(this);
		zeroButton.setFont(new Font("Comic Sans MS", Font.CENTER_BASELINE, 40));
		jf.add(zeroButton);
		
		
	    equalButton=new JButton("=");
		equalButton.setBounds(230, 430, 80, 80);
		equalButton.setBackground(Color.CYAN);
		equalButton.setForeground(Color.black);
		equalButton.addActionListener(this);
		equalButton.setFont(new Font("Comic Sans MS", Font.CENTER_BASELINE, 40));
		jf.add(equalButton);
		
		
		
	    divButton=new JButton("/");
		divButton.setBounds(330, 130, 80, 80);
		divButton.setBackground(Color.CYAN);
		divButton.setForeground(Color.black);
		divButton.addActionListener(this);
		divButton.setFont(new Font("Comic Sans MS", Font.CENTER_BASELINE, 40));
		jf.add(divButton);
		
		
		
		multiplyButton=new JButton("*");
		multiplyButton.setBounds(330, 230, 80, 80);
		multiplyButton.setBackground(Color.CYAN);
		multiplyButton.setForeground(Color.black);
		multiplyButton.addActionListener(this);
		multiplyButton.setFont(new Font("Comic Sans MS", Font.CENTER_BASELINE, 40));
		jf.add(multiplyButton);
		
		
		
		minusButton=new JButton("-");
		minusButton.setBounds(330, 330, 80, 80);
		minusButton.setBackground(Color.CYAN);
		minusButton.setForeground(Color.black);
		minusButton.addActionListener(this);
		minusButton.setFont(new Font("Comic Sans MS", Font.CENTER_BASELINE, 40));
		jf.add(minusButton);
		
		
		
	    addButton=new JButton("+");
		addButton.setBounds(330, 430, 80, 80);
		addButton.setBackground(Color.CYAN);
		addButton.setForeground(Color.black);
		addButton.addActionListener(this);
		addButton.setFont(new Font("Comic Sans MS", Font.CENTER_BASELINE, 40));
		jf.add(addButton);
			
		
		deleteButton=new JButton("X");
		deleteButton.setBounds(430, 430, 80, 80);
		deleteButton.setBackground(Color.red);
		deleteButton.setForeground(Color.black);
		deleteButton.addActionListener(this);
		deleteButton.setFont(new Font("Comic Sans MS", Font.CENTER_BASELINE, 40));
		jf.add( deleteButton);
		
		

		backButton=new JButton("<");
		backButton.setBounds(430, 330, 80, 80);
		backButton.setBackground(Color.CYAN);
		backButton.setForeground(Color.black);
		backButton.addActionListener(this);
		backButton.setFont(new Font("Comic Sans MS", Font.CENTER_BASELINE, 40));
		jf.add( backButton);
	
	
		jf.setVisible(true);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String ar[]) {
	
	new Calculator();
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		String newValue=displayLabel.getText();
		
		
		
		if(e.getSource()==sevenButton) {
			
			if(isOperatorclicked) {
				displayLabel.setText("7");
				
				isOperatorclicked=false;
			}
			else {
			displayLabel.setText(displayLabel.getText()+"7");
			}
			
			
		}
		else if(e.getSource()==eightButton) {
			
			if(isOperatorclicked) {
				displayLabel.setText("8");
				
				isOperatorclicked=false;
			}
			else {
			displayLabel.setText(displayLabel.getText()+"8");
			}
			
		}
		else if(e.getSource()==nineButton) {
			
			if(isOperatorclicked) {
				displayLabel.setText("9");
				
				isOperatorclicked=false;
			}
			else {
			displayLabel.setText(displayLabel.getText()+"9");
			}
			
		}
		else if(e.getSource()==fourButton) {
			
			if(isOperatorclicked) {
				displayLabel.setText("4");
				
				isOperatorclicked=false;
			}
			else {
			displayLabel.setText(displayLabel.getText()+"4");
			}
			
		}
		else if(e.getSource()==fiveButton) {
			
			if(isOperatorclicked) {
				displayLabel.setText("5");
				
				isOperatorclicked=false;
			}
			else {
			displayLabel.setText(displayLabel.getText()+"5");
			}
			
		}	
		else if(e.getSource()==sixButton) {
			
			if(isOperatorclicked) {
				displayLabel.setText("6");
				
				isOperatorclicked=false;
			}
			else {
			displayLabel.setText(displayLabel.getText()+"6");
			}
			
		}		
		else if(e.getSource()==oneButton) {
			
			if(isOperatorclicked) {
				displayLabel.setText("1");
				
				isOperatorclicked=false;
			}
			else {
			displayLabel.setText(displayLabel.getText()+"1");
			}
			
		}
		else if(e.getSource()==twoButton) {
			
			if(isOperatorclicked) {
				displayLabel.setText("2");
				
				isOperatorclicked=false;
			}
			else {
			displayLabel.setText(displayLabel.getText()+"2");
			}
			
		}	
		else if(e.getSource()==threeButton) {
			
			if(isOperatorclicked) {
				displayLabel.setText("3");
				
				isOperatorclicked=false;
			}
			else {
			displayLabel.setText(displayLabel.getText()+"3");
			}
			
		}
		else if(e.getSource()==dotButton) {
			
			if(isOperatorclicked) {
				displayLabel.setText(".");
				
				isOperatorclicked=false;
			}
			else {
			displayLabel.setText(displayLabel.getText()+".");
			}
			
		}	
		else if(e.getSource()==zeroButton) {
			
			if(isOperatorclicked) {
				displayLabel.setText("0");
				
				isOperatorclicked=false;
			}
			else {
			displayLabel.setText(displayLabel.getText()+"0");
			}
			
		
		
		 }
		
        else if(e.getSource()==divButton) {
        	
        	 isOperatorclicked=true;
        	 
        	 Operator="/";
        	
 	        
 	      
 			oldValue=displayLabel.getText();
         	
			
		}
        else if(e.getSource()==multiplyButton) {
        	
        	 isOperatorclicked=true;
        	 Operator="*";
         	
        	 
        	
 			oldValue=displayLabel.getText();
         	
	
        }
        else if(e.getSource()==minusButton) {
        	
        	 isOperatorclicked=true;
 	        
        	 Operator="-";
         	
 	        
 			
 			oldValue=displayLabel.getText();
         	
	
        }
        else if(e.getSource()==addButton) {
        	
	        isOperatorclicked=true;
	        
	    
        	oldValue=displayLabel.getText();
        	
            Operator="+";
       
		}
		
    	else if(e.getSource()==deleteButton) {
        	
	        isOperatorclicked=true;
	        displayLabel.setText("");
    	}
		
    	else if(e.getSource()==backButton) {
    		isOperatorclicked=true;
    		displayLabel.setText(displayLabel.getText().substring(0,displayLabel.getText().length()-1));
    		isOperatorclicked=false;
    		
    	}
			
        
        else if(e.getSource()==equalButton) {
        	
        	
        	
			float oldValueF=Float.parseFloat(oldValue);
			float newValueF=Float.parseFloat(newValue);
			
			float result;
			
			switch(Operator){
			
			case "+":
			
        	result=oldValueF+newValueF;
			
			displayLabel.setText(result+"");
			
			break;
			
			case "-":
				
	        result=oldValueF-newValueF;
				
			displayLabel.setText(result+"");
			break;
			
			case "*":
				
		    result=oldValueF*newValueF;
					
			displayLabel.setText(result+"");
			break;
				
			case "/":
				
		    result=oldValueF/newValueF;
					
			displayLabel.setText(result+"");
			break;
			
			}
			
        }
		
	}
	
}
				




			
			
			
			
			
			
	
	
	
	


