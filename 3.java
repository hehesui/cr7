// Java program to implement a GUI
// application for the student
// management system

import javax.swing.*;
import java.awt.*;
import java.awt.Image;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// import java.awt.print.*;
// import javafx.print.Printer;
import java.io.*;
import java.io.IOException;


public class Student extends Frame {

	JLabel l1, l2, l3, l4,
		l5, l6;

	JTextField tf1, tf2, tf3,
		tf4, tf5;

	JTextArea area;

	// Default constructor to
	// initialize the parameters
	Student()
	{

		l1 = new JLabel("Student Marks");
		l1.setBounds(200, 100, 250, 20);

		l2 = new JLabel(
			"Name of the Student:");
		l2.setBounds(50, 150, 250, 20);

		tf1 = new JTextField();
		tf1.setBounds(300, 150, 250, 20);

		l3 = new JLabel(
			"Maths:");
		l3.setBounds(50, 200, 250, 20);

		tf2 = new JTextField();
		tf2.setBounds(300, 200, 250, 20);

		l4 = new JLabel("History:");
		l4.setBounds(50, 250, 250, 20);

		tf3 = new JTextField();
		tf3.setBounds(300, 250, 250, 20);

		l5 = new JLabel("Science:");
		l5.setBounds(50, 300, 250, 20);

		tf4 = new JTextField();
		tf4.setBounds(300, 300, 250, 20);

		l6 = new JLabel("English:");
		l6.setBounds(50, 350, 250, 20);

		tf5 = new JTextField();
		tf5.setBounds(300, 350, 250, 20);

		JButton Receipt
			= new JButton("Generate Marksheet");
		Receipt.setBounds(50, 490, 150, 30);
		JButton b2 = new JButton("Reset");
		b2.setBounds(200, 490, 150, 30);
		

		area = new JTextArea();
		area.setBounds(50, 540, 450, 240);

		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
			
		add(tf1);
		add(tf2);
		add(tf3);
		add(tf4);
		add(tf5);

		add(area);	
		add(Receipt);
		add(b2);

		// Reset the text fields
		b2.addActionListener(
			new ActionListener() {
				public void actionPerformed(
					ActionEvent e)
				{
					area.setText("");
				
				
				}
			});

		// Generating the receipt
		Receipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{

				area.setText(
					"--------------------------------"
					+ "-----------Marksheet----"
					+ "--------------------------"
					+ "--------------------------"
					+ "-------------------\n");

				area.setText(area.getText()
							+ "Student Name: "
							+ tf1.getText()
							+ "\n");
				area.setText(area.getText()
							+ "Maths: "
							+ tf2.getText()
							+ "\n");
				area.setText(area.getText()
							+ "History: "
							+ tf3.getText()
							+ "\n");
				area.setText(area.getText()
							+ "Science: "
							+ tf4.getText()
							+ "\n");
				area.setText(area.getText()
							+ "English: "
							+ tf5.getText()
							+ "\n");
double maths, history,science,english;
   maths = Double.parseDouble (tf2.getText());
   history = Double.parseDouble (tf3.getText());
   science = Double.parseDouble (tf4.getText());
   english = Double.parseDouble (tf5.getText());

   double percentage =((maths+history+science+english)/4);
   System.out.println(percentage);
   area.setText(area.getText() + "Percentage" + percentage + "\n");

   if(percentage >= 66.66 && maths >=40 && history >=40 && science >=40 && english >=40 ){
    area.setText(area.getText() + "Grade: Distinction" );
   }
   else if(percentage >= 60.00 && maths >=40 && history >=40 && science >=40 && english >=40 ){
    area.setText(area.getText() + "Grade:First Class" );
   }
   else if(percentage >= 40 && maths >=40 && history >=40 && science >=40 && english >=40 ){
    area.setText(area.getText() + "Grade: Pass" );
   }
   else{
    area.setText(area.getText() + "Grade: Fail" );
   }

			};
		});
		addWindowListener(
			new WindowAdapter() {
				public void windowClosing(
					WindowEvent we)
				{
					System.exit(0);
				}
			});
		setSize(800, 800);
		setLayout(null);
		setVisible(true);
		setBackground(Color.cyan);
	}
	public static void main(String[] args)
	{
		new Student();
	}
} 