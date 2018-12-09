package GUI2;
import java.awt.Container;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

public class gui2 {
	public static void main(String args[])
	{
	
		JFrame f=new JFrame("GUI SUM");
	
	JTextField tf1=new JTextField();
	tf1.setBounds(50,100,200,30);
	JTextField tf2=new JTextField();
	tf2.setBounds(50,200,200,30);
	JTextField tf3=new JTextField();
	tf3.setBounds(50,300,200,30);
	
	JButton b=new JButton("click here");
	b.setBounds(100,50,95,30);
	b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			 String s1="";
			 String s2="";
			 String s3="";
			s1=tf1.getText();
			s2=tf2.getText();
			int sum=Integer.parseInt(s1)+Integer.parseInt(s2);
			s3=Integer.toString(sum);
			tf3.setText(s3);
		}});
		

	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.add(b);
	f.add(tf1);
	f.add(tf2);
	f.add(tf3);
	f.setSize(400,400);
	f.setLayout(null);
	f.setVisible(true);}

}
