import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.attribute.standard.Severity;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import sun.swing.SwingAccessor;

public class Calculator implements ActionListener{
	JFrame jf;
	JLabel displayLabel;
	JButton sevButton,eightButton,nineButton,fourButton,fiveButton,sixButton,oneButton,twoButton,
			threeButton,dotButton,zeroButton,equalButton,divButton,mulButton,subButton,addButton,
			clearButton;
	
	
	public Calculator() {
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(550, 580);
		jf.setLocation(300,100);
		
		
		displayLabel=new JLabel();
		displayLabel.setBounds(25, 25, 480, 80);
		displayLabel.setBackground(Color.darkGray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		displayLabel.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(displayLabel);
		
		
		sevButton=new JButton("7");
		sevButton.setBounds(25,130,80,80);
		sevButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(sevButton);
		sevButton.addActionListener(this);
		
		eightButton=new JButton("8");
		eightButton.setBounds(125,130,80,80);
		eightButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(eightButton);
		eightButton.addActionListener(this);
		
		nineButton=new JButton("9");
		nineButton.setBounds(225,130,80,80);
		nineButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(nineButton);
		nineButton.addActionListener(this);
		
		
		fourButton=new JButton("4");
		fourButton.setBounds(25,230,80,80);
		fourButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(fourButton);
		fourButton.addActionListener(this);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(125,230,80,80);
		fiveButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(fiveButton);
		fiveButton.addActionListener(this);
		
		sixButton=new JButton("6");
		sixButton.setBounds(225,230,80,80);
		sixButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(sixButton);
		sixButton.addActionListener(this);
		
		
		oneButton=new JButton("1");
		oneButton.setBounds(25,330,80,80);
		oneButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(oneButton);
		oneButton.addActionListener(this);
		
		twoButton=new JButton("2");
		twoButton.setBounds(125,330,80,80);
		twoButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(twoButton);
		twoButton.addActionListener(this);
		
		threeButton=new JButton("3");
		threeButton.setBounds(225,330,80,80);
		threeButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(threeButton);
		threeButton.addActionListener(this);
		
		
		dotButton=new JButton(".");
		dotButton.setBounds(25,430,80,80);
		dotButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(dotButton);
		dotButton.addActionListener(this);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(125,430,80,80);
		zeroButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(zeroButton);
		zeroButton.addActionListener(this);
		
		equalButton=new JButton("=");
		equalButton.setBounds(225,430,80,80);
		equalButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(equalButton);
		equalButton.addActionListener(this);
		
		divButton=new JButton("/");
		divButton.setBounds(325,130,80,80);
		divButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(divButton);
		divButton.addActionListener(this);
		
		mulButton=new JButton("X");
		mulButton.setBounds(325,230,80,80);
		mulButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(mulButton);
		mulButton.addActionListener(this);
		
		subButton=new JButton("-");
		subButton.setBounds(325,330,80,80);
		subButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(subButton);
		subButton.addActionListener(this);
		
		addButton=new JButton("+");
		addButton.setBounds(325,430,80,80);
		addButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(addButton);
		addButton.addActionListener(this);
		
		
		clearButton=new JButton("C");
		clearButton.setBounds(425,130,80,80);
		clearButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(clearButton);
		clearButton.addActionListener(this);
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevButton) 
			{		
			 displayLabel.setText(displayLabel.getText()+"7");
			}
		else if(e.getSource()==eightButton) 
			{		
			 displayLabel.setText(displayLabel.getText()+"8");
			}
		else if(e.getSource()==nineButton) 
			{		
			 displayLabel.setText(displayLabel.getText()+"9");
			}
		else if(e.getSource()==fourButton) 
			{		
			 displayLabel.setText(displayLabel.getText()+"4");
			}
		else if(e.getSource()==fiveButton) 
			{		
			 displayLabel.setText(displayLabel.getText()+"5");
			}
		else if(e.getSource()==sixButton) 
			{		
			 displayLabel.setText(displayLabel.getText()+"6");
			}
		else if(e.getSource()==oneButton) 
			{		
			 displayLabel.setText(displayLabel.getText()+"1");
			}
		else if(e.getSource()==twoButton) 
			{		
			 displayLabel.setText(displayLabel.getText()+"2");
			}
		else if(e.getSource()==threeButton) 
			{		
			 displayLabel.setText(displayLabel.getText()+"3");
			}
		else if(e.getSource()==dotButton) 
			{		
			 displayLabel.setText(displayLabel.getText()+".");
			}
		else if(e.getSource()==zeroButton) 
			{		
			 displayLabel.setText(displayLabel.getText()+"0");
			}
		else if(e.getSource()==clearButton) 
		{		
		 displayLabel.setText("");
		}
	}
		
}