import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Calculator{
	public Calculator() {
		JFrame jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setLocation(300,100);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel displayLabel=new JLabel("Output");
		displayLabel.setBounds(25, 50, 540, 40);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		jf.add(displayLabel);
	}
	
	public static void main(String[] args) {
		new Calculator();
	}
}