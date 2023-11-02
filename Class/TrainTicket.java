import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;

public class TrainTicket extends JFrame implements ActionListener{
	
	JLabel titleLabel,ticketKindLabel,fromLabel,toLabel;
	JComboBox<String> ticketKindBox, pricingBox, fromBox;
	JButton HomeButton, BackButton, paymentButton;
	
	final String[] STATIONS = {"Dhaka", "Khulna", "Jashore", "Sylhet", "Chittagong", "Rangpur", "Cumilla" };
	final String[] TICKET_KINDS = {"Shavon", "Shulov", "Snigdha" };
	final int Shavon_Price = 750;
	final int Shulov_Price = 390;
	
	TrainTicket(){
		
		JFrame frame = new JFrame("TrainTicket");
		frame.setBounds(0,0,1080,720);
		frame.setSize(1080,720);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		Font font1 = new Font("MANOSPAC", Font.BOLD, 30);
		Font font2 = new Font ("Arial", Font.BOLD, 14);
		
		titleLabel = new JLabel("Ticket Selection Section");
		titleLabel.setBounds(360, 20, 400, 30);
		titleLabel.setFont(font1);
		titleLabel.setForeground(new Color(55, 79, 232));
		frame.add(titleLabel);
		
		ticketKindLabel = new JLabel("Ticket Kind:");
		ticketKindLabel.setBounds(220, 100, 120, 25);
		ticketKindLabel.setFont(font2);
		frame.add(ticketKindLabel);
		
		ticketKindBox = new JComboBox<String>(TICKET_KINDS);
		ticketKindBox.setBounds(350, 100, 200, 25);
		ticketKindBox.setFont(font2);
		ticketKindBox.addActionListener(this);
		frame.add(ticketKindBox);
		
		fromLabel = new JLabel("From:");
		fromLabel.setBounds(220, 150, 120, 25);
		fromLabel.setFont(font2);
		frame.add(fromLabel);
		 
		pricingBox = new JComboBox<String>(STATIONS);
		pricingBox.setBounds(350, 150, 200, 25);
		pricingBox.setFont(font2);
		frame.add(pricingBox);
		
		toLabel = new JLabel("To:");
		toLabel.setBounds(220, 200, 120, 25);
		toLabel.setFont(font2);
		frame.add(toLabel);
		
		fromBox = new JComboBox<String>(STATIONS);
		fromBox.setBounds(350, 200, 200, 25);
		fromBox.setFont(font2);
		frame.add(fromBox);
		
	    paymentButton = new JButton("Payment");
		paymentButton.setBounds(450, 300, 100, 30);
		paymentButton.setFont(font2);
		paymentButton.addActionListener(this);
				
		frame.add(paymentButton);
		
		HomeButton = new JButton("Home");
		HomeButton.setBounds(900, 103, 80, 25);
		HomeButton.addActionListener(this);
		HomeButton.setFont(font2);
		frame.add(HomeButton);
		
		BackButton =  new JButton("Back");
		HomeButton.setBounds(900, 103, 80, 25);
		HomeButton.addActionListener(this);
		HomeButton.setFont(font2);
		frame.add(BackButton);
		
		JLabel Background;
		ImageIcon img = new ImageIcon("E:\\java Project\\Image\\Train11.jpg");
		Background = new JLabel ("",img,JLabel.CENTER);
		Background.setBounds(0,0,1280,717);
		frame.add(Background);
		
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		if (e.getSource() == ticketKindBox){
			String ticketKind = (String) ticketKindBox.getSelectedItem();
			if (ticketKind.equals("Shavon")){
				pricingBox.setSelectedIndex(0);
			}else{
				pricingBox.setSelectedIndex(1);
			}
		}else if (e.getSource() == paymentButton){
			try{ 
			    FileWriter writer = new FileWriter("ticket_info.txt");
				writer.write("Ticket Kind: " + ticketKindBox.getSelectedItem() + "\n");
				writer.write("From: " + pricingBox.getSelectedItem() + "\n");
				writer.write("To: " + fromBox.getSelectedItem() + "\n");
				writer.close();
			JOptionPane.showMessageDialog(this, "Ticket information saved successfully!");
			
			} catch (IOException ex ) {
				JOptionPane.showMessageDialog(this, "Failed to save ticket information!");
			}
		}
		
	}
	
	public static void main (String[] args){
		new TrainTicket();
	}
}

		
		