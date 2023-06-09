package Metro_Ticket_Booking;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
public class Registration {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
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
	public Registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = 
				new JFrame();
		frame.getContentPane().setBackground(new Color(205, 92, 92));
		frame.setBounds(100, 100, 1242, 568);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setBounds(500, 11, 227, 47);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBounds(127, 127, 74, 27);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Phone No");
		lblNewLabel_2.setBounds(128, 190, 117, 27);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Gender");
		lblNewLabel_3.setBounds(127, 263, 118, 27);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		frame.getContentPane().add(lblNewLabel_3);
		
		tb1 = new JTextField();
		tb1.setBounds(381, 127, 212, 29);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(381, 190, 212, 29);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JRadioButton r1 = new JRadioButton("Male");
		r1.setBounds(381, 255, 90, 23);
		r1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Female");
		r2.setBounds(503, 255, 90, 23);
		r2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(r2);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JLabel lblNewLabel_4 = new JLabel("Fav Programming");
		lblNewLabel_4.setBounds(127, 329, 212, 37);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox c1 = new JComboBox();
		c1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Java", "Python", "C/C++"}));
		c1.setBounds(381, 338, 134, 27);
		frame.getContentPane().add(c1);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=tb1.getText();
				String ph=tb2.getText();
				String g;
				if(r1.isSelected())
				{
					g="Male";
				}
				else if(r2.isSelected())
				{
					g="Female";
				}
				else
				{
					g="Invalid";
				}
				String p=(String) c1.getSelectedItem();
				JOptionPane.showMessageDialog(btnNewButton, "Name :"+n+"\n Phno : "+ph+"\n Gender : "+g+"\n Programming : "+p);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(287, 409, 104, 27);
		frame.getContentPane().add(btnNewButton);
	}
}
