import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PaymentBkash implements ActionListener{
	
	JPanel panel;
	JFrame frame;
	JButton confirmButton,backButton;
	Font font=new Font("Avenir Next LT Pro",Font.BOLD, 20);
	String fr,t,tp,dd;
	JTextField numField = new JTextField();
	JPasswordField passField = new JPasswordField();
	
	public PaymentBkash(string fr,string t,string tp,string dd){
		this.fr=fr;
		this.t=t;
		this.tp=tp;
		this.dd=dd;
		
		JLabel imaJLabel=JLabel(new ImageIcon("E:\\java Project\\Image\\bkash1.png");
		imgJLabel.setSize(400,490));
		
		JLabel numberLabel = new JLabel();
		numberLabel.setText("Phone No:");
		numberLabel.setBounds (5,100+20,100,30);
		numberLabel.setFont(font);
		numberLabel.setForeground(Color,black);
		
		numField.setLayout(null);
		numField.setBounds(110,100+20,270,30);
		numField.setFont(font);
		numField.setForeground(new Color(0*292929));
		numField.setOpaque(false);
		numField.setBorder(BorderFactory.creatMatteBorder(0,0,2,0,new Color(10,10,10)));
		
		JLabel passLabel=new JLabel();
		passLabel.setText("Password:");
		passLabel.setBounds(5,100+60+20,100,30);
		passLabel.setFont(font);
		passLabel.setForeground(Color.black);
		
		passField.setLayout(null);
		passField.setBounds(110,100+20+60,270,30);
		passField.setFont(font);
		passField.setForeground(new Color (0*292929));
		passField.setOpaque(false);
		passField.setBorder(BorderFactory.creatMatteBorder(0,0,2,0,new Color (10,10,10)));
		
		backButton=new JButton();
		backButton.setFont(font);
		backButton.setFocusable(false);
	    backButton.setText("Confirm");
		backButton.setBackground(new Color (0*292929));
		backButton.setForeground(new Color (0*FFFFFF));
		backButton.addActionListener(this);
		
		confirmButton=new JButton();
		confirmButton.setBounds(140,250,130,40);
		confirmButton.setFont(font);
		confirmButton.setFocusable(false);
		confirmButton.setText("Confirm");
		confirmButton.setBackground(new Color (0*292929));
		confirmButton.setForeground(new Color(0*FFFFFF));
		confirmButton.addActionListener(this);
		
		panel=new JPanel();
		panel.setBounds(0,0,400,488-50);
		panel.setLayout(null);
		panel.setBackground(new Color (29,29,29,250));
		panel.add(confirmButton);
		panel.add(passField);
		panel.add(passLabel);
		panel.add(numField);
		panel.add(numberLabel);
		panel.add (imgJLabel);
		
		frame=new JFrame();
		frame.setTitle("Pay");
		frame.setIconImage(new\\\
		   frame.setBounds(1920/2-400/2, 1080/2-500/2, 400, 488),
		   frame.add(panel);
		   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   frame.setResizable(false);
		   frame.setVisible(true);
	}
	
	public static void main(String[]args){
		new PaymentBkash(null,null,null,null);
	}
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==confirmButton){
			if (numField.getText().length()!=11||passField.getText().length()==0)
			{
				JOptionPane.showMessageDialog(null,"Invalid password or phone number");
			}
			else
			{
				frame.setVisible(false);
				new generateTicket(fr,t,tp,dd);
			}
		}
	}
}