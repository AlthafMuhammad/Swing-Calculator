import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import sun.swing.SwingAccessor;

public class Calculator{
	public Calculator() {
		JFrame jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(450, 580);
		jf.setLocation(300,100);
		
		
		JLabel displayLabel=new JLabel("Output ");
		displayLabel.setBounds(25, 25, 380, 80);
		displayLabel.setBackground(Color.darkGray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		displayLabel.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(displayLabel);
		
		JButton sevButton=new JButton("7");
		sevButton.setBounds(25,130,80,80);
		sevButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(sevButton);
		
		JButton eightButton=new JButton("8");
		eightButton.setBounds(125,130,80,80);
		eightButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(eightButton);
		
		JButton nineButton=new JButton("9");
		nineButton.setBounds(225,130,80,80);
		nineButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(nineButton);
		
		
		JButton fourButton=new JButton("4");
		fourButton.setBounds(25,230,80,80);
		fourButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(fourButton);
		
		JButton fiveButton=new JButton("5");
		fiveButton.setBounds(125,230,80,80);
		fiveButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(fiveButton);
		
		JButton sixButton=new JButton("6");
		sixButton.setBounds(225,230,80,80);
		sixButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(sixButton);
		
		
		JButton oneButton=new JButton("1");
		oneButton.setBounds(25,330,80,80);
		oneButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(oneButton);
		
		JButton twoButton=new JButton("2");
		twoButton.setBounds(125,330,80,80);
		twoButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(twoButton);
		
		JButton threeButton=new JButton("3");
		threeButton.setBounds(225,330,80,80);
		threeButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(threeButton);
		
		
		JButton dotButton=new JButton(".");
		dotButton.setBounds(25,430,80,80);
		dotButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(dotButton);
		
		JButton zeroButton=new JButton("0");
		zeroButton.setBounds(125,430,80,80);
		zeroButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(zeroButton);
		
		JButton equalButton=new JButton("=");
		equalButton.setBounds(225,430,80,80);
		equalButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(equalButton);
		
		JButton divButton=new JButton("/");
		divButton.setBounds(325,130,80,80);
		divButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(divButton);
		
		JButton mulButton=new JButton("X");
		mulButton.setBounds(325,230,80,80);
		mulButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(mulButton);
		
		JButton subButton=new JButton("-");
		subButton.setBounds(325,330,80,80);
		subButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(subButton);
		
		JButton addButton=new JButton("+");
		addButton.setBounds(325,430,80,80);
		addButton.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(addButton);
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new Calculator();
	}
}