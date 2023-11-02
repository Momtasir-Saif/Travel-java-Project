import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PaymentNagad implements ActionListener{
	
	JPanel panel;
	JFrame frame;
	 JButton confirmButton,backButton;
	 Font font=new Font ("Avenir Next LT Pro",Font.BOLD,20);
	 string fr,t,tp,dd;
	 JTextField numField = new JTextField();
	 JPasswordField passField = new JPasswordField();
	 
	 public PaymentNagad(string fr,string t,string tp,string dd){
		 this.fr=fr;
		 this.t=t;
		 this.tp=tp;
		 this.dd=dd;
		 
		 JLabel imgJLabel=new JLabel(new ImageIcon("E:\\java Project\\Image\\nagad1.png");
		 imgJLabel.setSize(400,490);
		 
		 JLabel numberLabel=new JLabel();
		 numberLabel.setText("Phone No:");
		 numberLabel.setBounds(5,100+20,100,30);
		 numberLabel.setFont(font);
		 numberLabel.setForeground(Color.black);
		 
		 numField.setLayout(null);
		 numField.setBounds(110,110+20,270,30);
		 numField.setFont(font);
		 numField.setForeground(new Color(0*292929));
		 numField.setOpaque(false);
		 numField.setBorder(BorderFactory.creatMatteBorder(0,0,2,0,new color (10,10,10)));
		 
		 JLabel passLabel=new JLabel();
		 passLabel.setText("Password:");
		 passLabel.setBounds(5,100+60+20,100,30);
		 passField.setFont(font);
		 passLabel.setForeground(Color.black);
		 
		 passField.setLayout(null);
		 passField.setBounds(110,100+20+60,270,30);
		 passField.setFont(font);
	     passField.setForeground(new color(0*292929));
		 passField.setOpaque(false);
		 passField.setBorder(BrderFactory.creatMatteBorder(0,0,2,0, newColor(10,10,10)));
		 
		 backButton=new JButton();
		 backButton.setBounds(5,5,100,40);
		 backButton.setFont(font);
		 backButton.setFocusable(false);
		 backButton.setText("Confirm");
		 backButton.setBackground(new color (0*292929));
		 backButton.addActionListener(this);
		 
		 confirmButton=new JButton();
		 confirmButton.setBounds(140,250,130,40);
		 confirmButton.setFont(font);
		 confirmButton.setFocusable(false);
		 confirmButton.setText("Confirm");
		 confirmButton.setBackground(new Color (0*292929));
		 confirmButton.setForeground(new COlor (0*FFFFFF));
		 confirmButton.addActionListener(this);
		 
		 panel=new JPanel();
		 panel.setBounds(0,0,400,488-50);
		 panel.setLayout(null);
		 panel.add(confirmButton);
		 panel.add(passField);
		 panel.add(passLabel);
		 panel.add(numField);
		 panel.add(numberLabel);
		 panel.add(imgJLabel);
		 
		 frame=new JFrame;
		 frame.setTitle("Pay");
		 frame.setIconImage(new ImageIcon(\\\
		    frame.setBounds(1920/2-400/2, 1080/2-500/2,400,525);
		frame.add(panel);
		   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
	 }
	 
	 public static void main(string[]args) {
		 new paymentNagad(null,null,null,null);
	 }
	 @Override
	 public void actionPerformed(ActionEvent e) {
		 if(e.getSource()==confirmButton){
			 if(numField.getText().length()!=11||passField.getText().length()==0)
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
	 
	 