import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class MetroRailTicketGUI {
    private JFrame frame;
    private JLabel label;
    private JLabel ticketLabel;
    private JTextField ticketField;
    private JRadioButton firstClassButton;
    private JRadioButton standingTicketButton;
    private JButton proceedButton,homeButton,backButton;
    private JLabel amountLabel;
    private JTextField amountField;
    private JLabel nameLabel;
    private JTextField nameField;
    private JLabel numberLabel;
    private JTextField numberField;

    public MetroRailTicketGUI() {
        frame = new JFrame("Metro Rail Ticket");
        frame.setSize(1080, 720);
        frame.setLayout(null);

        label = new JLabel("Ticket Selection");
        label.setFont(new Font("Arial", Font.BOLD, 24));
        label.setBounds(400, 50, 250, 30);
        frame.add(label);

        nameLabel = new JLabel("Passenger Name:");
        nameLabel.setBounds(200, 100, 150, 30);
        frame.add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(350, 100, 150, 30);
        frame.add(nameField);

        numberLabel = new JLabel("Passenger Number:");
        numberLabel.setBounds(550, 100, 150, 30);
        frame.add(numberLabel);

        numberField = new JTextField();
        numberField.setBounds(700, 100, 150, 30);
        frame.add(numberField);

        ticketLabel = new JLabel("Enter number of tickets (max 4): ");
        ticketLabel.setBounds(200, 150, 250, 30);
        frame.add(ticketLabel);

        ticketField = new JTextField();
        ticketField.setBounds(450, 150, 50, 30);
        frame.add(ticketField);

        ButtonGroup ticketGroup = new ButtonGroup();
        firstClassButton = new JRadioButton("First Class (30 tk)");
        firstClassButton.setBounds(200, 200, 150, 30);
        ticketGroup.add(firstClassButton);
        frame.add(firstClassButton);

        standingTicketButton = new JRadioButton("Standing Ticket (15 tk)");
        standingTicketButton.setBounds(350, 200, 200, 30);
        ticketGroup.add(standingTicketButton);
        frame.add(standingTicketButton);

        amountLabel = new JLabel("Total Amount: ");
        amountLabel.setBounds(200, 250, 100, 30);
        frame.add(amountLabel);

        amountField = new JTextField();
        amountField.setEditable(false);
        amountField.setBounds(300, 250, 100, 30);
        frame.add(amountField);

        proceedButton = new JButton("Proceed to payment");
        proceedButton.setBounds(200, 300, 200, 30);
		/*proceedButton.addMouseListener(new MouseListener(){
	public void mouseClicked(MouseEvent e) {
		new method();
		frame.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
    proceedButton.setToolTipText("confirm");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });*/
		
	   
        frame.add(proceedButton);
		
		homeButton = new JButton("Home");
		homeButton.setBounds(200, 400, 100, 30);
	   
		backButton = new JButton("Back");
		backButton.setBounds(300, 400, 100, 30);
		
		
		backButton.addMouseListener(new MouseListener(){
	public void mouseClicked(MouseEvent e) {
		new MetroRail();
		frame.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
    backButton.setToolTipText("Home Page");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
		
	   
		frame.add(proceedButton);frame.add(homeButton); frame.add(backButton); JLabel Background;
		ImageIcon img = new ImageIcon("E:\\java Project\\Image\\50+-Silver-Wallpapers-Download-at-WallpaperBro.jpg");
		Background = new JLabel ("",img,JLabel.CENTER);
		Background.setBounds(0,0,1080,720);
		frame.add(Background);
	
       proceedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String passengerName = nameField.getText();
                    int passengerNumber = Integer.parseInt(numberField.getText());

                    int numTickets = Integer.parseInt(ticketField.getText());
                    if (numTickets <= 0 || numTickets > 4) {
                        throw new Exception("Invalid number of tickets.");
                    }

                    int amount;
                    if (firstClassButton.isSelected()) {
                        amount = numTickets * 30;
                    } else if (standingTicketButton.isSelected()) {
                        amount = numTickets * 15;
					} else {
					throw new Exception("Please select a ticket type.");
					}
					                amountField.setText(String.valueOf(amount));

                // write passenger information to file
                File file = new File("passengers.txt");
                FileWriter writer = new FileWriter(file, true);
                writer.write(passengerName + "Passenger Name : " + passengerNumber + "," + numTickets + "," + amount + "\n");
                writer.close();

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Invalid input. Please enter a number.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, ex.getMessage());
            }
        }
	   });

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
}

public static void main(String[] args) {
    new MetroRailTicketGUI();
}
}
