package demo;
import javax.swing.*;
import java.awt.*;
import  java.awt.event.*;
public class TemperatureConvertor extends JFrame implements ActionListener{
	private JTextField celciusTextField;
	private JTextField farenheitTextField;
	TemperatureConvertor(){
		setTitle("Temperature Convertor");
		setSize(300,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(3,2));
		
		JLabel celciusTable = new JLabel("Celcius");
		celciusTextField= new JTextField();
		JLabel fahrenheitLabel =new JLabel("Fahrenheit");
		farenheitTextField =new JTextField();
		farenheitTextField.setEditable(false);
		JButton convertButton= new JButton("Convert");
		
		convertButton.addActionListener(this);
		
		panel.add(celciusTable);
		panel.add(celciusTextField);
		panel.add(fahrenheitLabel);
		panel.add(farenheitTextField);
		panel.add(new JLabel());
		panel.add(convertButton);
		
		add(panel);
		
	}

	public static void main(String[] args) {
		TemperatureConvertor convertor= new TemperatureConvertor();
		convertor.setVisible(true);

	}
	public void actionPerformed(ActionEvent e) {
		double celcius=Double.parseDouble(celciusTextField.getText());
		Double fahrenheit=(celcius*9/5)+32;
		farenheitTextField.setText(String.format("%.2f", fahrenheit));
		
	}

}


