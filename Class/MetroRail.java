import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;

public class MetroRail extends JFrame implements ActionListener {

    JLabel fromLabel,
        toLabel,
        dateLabel,
		timeLabel,
		headingLabel,
        titleLabel;
		JTextField numberField,
		nameField;
	
		JComboBox<String> fromBox, toBox, dayBox, monthBox, yearBox, timeBox;
			JButton submitButton, HomeButton,mapButton;


    String[] stations = {"Uttara", "Badda", "Khilkhet", "Bashundhara(Kuril)"};
    String[] days = new String[32];
    String[] months = {"Months", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    String[] years = new String[11];
	String[] times = {"8 am", "10 am", "11.30 am", "2.30 pm", "6 pm", "8 pm", "10 pm"};
 
    MetroRail() {

		// Frame
		JFrame frame = new JFrame("Time To Travel");
		frame.setBounds(0, 0, 1080, 720);
		frame.setSize(1080, 720); 
		frame.setResizable(false); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);

        // Fonts
        Font font1 = new Font("MANOSPAC", Font.BOLD, 30);
        Font font2 = new Font("Arial ", Font.BOLD, 14);
        Font font3 = new Font("Arial Italic", Font.BOLD, 12);
        Font font4 = new Font("Cambria Math", Font.BOLD, 20);
        Font font5 = new Font("Algerian", Font.BOLD, 25);

        // Frame
        JFrame ticketFrame  = new JFrame("Time To Travel");
        ticketFrame .setBounds(1080, 720, 500, 500);
        ticketFrame .setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ticketFrame .setLayout(null);
		
        // Title Label
        titleLabel = new JLabel("Time To Travel");
        titleLabel.setBounds(160, 20, 250, 30);
        titleLabel.setFont(font5);
        titleLabel.setForeground(new Color(55, 79, 232));
        frame.add(titleLabel);
		
		// Heading Label
        headingLabel = new JLabel("Metro E-Ticket");
        headingLabel.setBounds(120, 70, 250, 30);
        headingLabel.setFont(font5);
        headingLabel.setForeground(new Color(255, 0, 0));
        frame.add(headingLabel);
		
		
        // From Station Label
        fromLabel = new JLabel("From: ");
        fromLabel.setBounds(50, 124, 80, 25);
        fromLabel.setFont(font2);
        frame.add(fromLabel);

        // From Station ComboBox
        fromBox = new JComboBox<String>(stations);
        fromBox.setBounds(120, 124, 200, 25);
        fromBox.setFont(font2);
        frame.add(fromBox);

        // To Station Label
        toLabel = new JLabel("To: ");
        toLabel.setBounds(50, 154, 80, 25);
        toLabel.setFont(font2);
        frame.add(toLabel);

        // To Station ComboBox
        toBox = new JComboBox<String>(stations);
        toBox.setBounds(120, 154, 200, 25);
        toBox.setFont(font2);
        frame.add(toBox);
		
		 // Time Label
		JLabel timeLabel = new JLabel("Time:");
		timeLabel.setBounds(50, 217, 80, 25);
		timeLabel.setFont(font2);
		frame.add(timeLabel);

		// Time ComboBox
		String[] times = {"8 am", "10 am", "11:30 am", "2:30 pm", "6 pm", "8 pm", "10 pm"};
		JComboBox<String> timeBox = new JComboBox<String>(times);
		timeBox.setBounds(120, 217, 200, 25);
		timeBox.setFont(font2);
    frame.add(timeBox);


        // Date Label
        dateLabel = new JLabel("Date: ");
        dateLabel.setBounds(50, 187, 80, 25);
        dateLabel.setFont(font2);
        frame.add(dateLabel);
		
		
		
        // Day ComboBox
        for (int i = 0; i <= 31; i++) {
            if (i == 0) {
                days[i] = "Day";
            } else {
                days[i] = Integer.toString(i);
            }
        }
		
        dayBox = new JComboBox<String>(days);
        dayBox.setBounds(120, 187, 60, 25);
        dayBox.setFont(font2);
        frame.add(dayBox);

        // Month ComboBox
        monthBox = new JComboBox<String>(months);
        monthBox.setBounds(190, 187, 90, 25);
        monthBox.setFont(font2);
        frame.add(monthBox);
		// Year ComboBox
		for (int i = 0; i <= 10; i++) {
			years[i] = Integer.toString(2023 + i);
		}
		yearBox = new JComboBox<String>(years);
		yearBox.setBounds(300, 187, 80, 25);
		yearBox.setFont(font2);
		frame.add(yearBox);

		// Submit Button
		submitButton = new JButton("Submit");
		submitButton.setBounds(200, 300, 120, 25);
		//submitButton.addActionListener(this);
		submitButton.setFont(font2);
		frame.add(submitButton);
		
		submitButton.addMouseListener(new MouseListener(){
	public void mouseClicked(MouseEvent e) {
		new MetroRailTicketGUI();
		frame.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
    submitButton.setToolTipText("Please Confirm");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
		// Home Button
		HomeButton = new JButton("Back");
		HomeButton.setBounds(900, 103, 80, 25);
		//HomeButton.addActionListener(this);
		HomeButton.setFont(font2);
		HomeButton.addMouseListener(new MouseListener(){
	public void mouseClicked(MouseEvent e) {
		new FirstPage();
		frame.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
    HomeButton.setToolTipText("Home Page");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
		frame.add(HomeButton);
				
				
		// Map Button
		mapButton = new JButton("Map");
		mapButton.setBounds(900, 170, 80, 25);
		//mapButton.addActionListener(this);
		mapButton.setFont(font2);
		frame.add(mapButton);
		mapButton.addMouseListener(new MouseListener(){
	public void mouseClicked(MouseEvent e) {
		new Map();
		frame.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
    mapButton.setToolTipText("Home Page");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
		
        JLabel Background;
		ImageIcon img = new ImageIcon("E:\\java Project\\Image\\bangladesh-highspeed-metro-rail-free-vector_628838-919.jpg");
		Background = new JLabel ("",img,JLabel.CENTER);
		Background.setBounds(0,0,1080,720);
		frame.add(Background);
		
		
		frame.setVisible(true);
		
		
		

		}

public void actionPerformed(ActionEvent e) {
    
        String from = (String) fromBox.getSelectedItem();
        String to = (String) toBox.getSelectedItem();
        String day = (String) dayBox.getSelectedItem();
        String month = (String) monthBox.getSelectedItem();
        String year = (String) yearBox.getSelectedItem();

        if (from == null || to == null || day.equals("Day") || month.equals("Months")) {
            JOptionPane.showMessageDialog(this, "Please fill up the form correctly.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Write ticket information to file
        String date = day + "-" + month + "-" + year;
        String ticketInfo = "From: " + from + ", To: " + to + ", Date: " + date;

        try {
            FileWriter writer = new FileWriter("metrorail.txt", true);
            writer.write(ticketInfo + "\n");
            writer.close();
            JOptionPane.showMessageDialog(this, "Ticket saved to file successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "An error occurred while saving the ticket to file.", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    
}

public static void main(String[] args) {
    new MetroRail();
}
}
