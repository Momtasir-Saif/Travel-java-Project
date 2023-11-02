import javax.swing.*;    
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.imageio.*;
import java.awt.*;
import java.util.regex.*;
import java.io.FileWriter;
import java.io.IOException;

public class payNagod extends  JFrame implements  ActionListener  {

   final JLabel label,numberLabel,passLabel;
    JButton b,b1,b2;
	JTextField numField;
	JPasswordField passField;
    String s10 ,s11,s12,s13,s14,s15,s16;
	
   public payNagod(String s10, String s11,String s12,String s13,String s14,String s15,String s16){
	   this.s10=s10;
		this.s11=s11;
		this.s12=s12;
		this.s13=s13;
		this.s14=s14;
		this.s15=s15;
		this.s16=s16;
		
		
		Font font1 = new Font("MANOSPAC", Font.BOLD, 30);
	Font font2 = new Font("Arial ", Font.BOLD, 14);
	Font font3 =new Font("Arial Italic",Font.BOLD,12);
	Font font4=new Font("Cambria Math",Font.BOLD,20);
	Font font5=new Font("Algerian",Font.BOLD,25);
	Font font6=new Font("Avenir Next LT Pro", Font.BOLD, 20);

	
	JFrame f=new JFrame("Nagod payment");
           
	label = new JLabel();            
     label.setBounds(0,0, 0,0);
	 
	 //number lebel
	 numberLabel =new JLabel();
    numberLabel.setText("Phone No:");
    numberLabel.setBounds(5,120,100,30);
    numberLabel.setFont(font6);
    numberLabel.setForeground(Color.black);
	
	//password label
	passLabel =new JLabel();
    passLabel.setText("Password:");
    passLabel.setBounds(5,180,100,30);
    passLabel.setFont(font6);
    passLabel.setForeground(Color.black);
	
	
	//number text field
	numField = new JTextField();
	 numField.setLayout(null);
     numField.setBounds(110,120, 270, 30);
     numField.setFont(font6);
     numField.setForeground(new Color(0x292929));
     numField.setOpaque(false);
     numField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));
	 
	 
	 //password text field
	 passField = new JPasswordField();
	  passField.setLayout(null);
     passField.setBounds(110,180, 270, 30);
     passField.setFont(font6);
     passField.setForeground(new Color(0x292929));
     passField.setOpaque(false);
     passField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));
	
	
	
		//back button nagod
		b1 = new JButton(new ImageIcon("E:\\java Project\\Image\\prev2.png"));  
	b1.setBounds(345,0,32,32);
	Cursor cursor3 = new Cursor(Cursor.HAND_CURSOR);
		b1.setCursor(cursor3);
		b1.setLayout(null);
		b1.addMouseListener(new MouseListener(){
 public void mouseClicked(MouseEvent e) {
		new Payment(s10 ,s11,s12,s13,s14,s15,s16);
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
   b1.setToolTipText("Back Payment Method Page");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
  
  
  //confirm button
  b2=new JButton("Confirm");
        b2.setBounds(140,250,130,40);
        b2.setFont(font6);
        b2.setFocusable(false);
        b2.setBackground(new Color(0x292929));
       b2.setForeground(new Color(0xFFFFFF));
        b2.addActionListener(this);
		Cursor cursor4 = new Cursor(Cursor.HAND_CURSOR);
		b2.setCursor(cursor4);
		b2.setLayout(null);
  
  
	 
	
	  //background image
	  ImageIcon closeImgIcon15 = new ImageIcon("E:\\java Project\\Image\\paynagad.png");
	Image img15 = closeImgIcon15.getImage();
	Image temp_img15 = img15.getScaledInstance(400,488,Image.SCALE_SMOOTH);
	closeImgIcon15 = new ImageIcon(temp_img15);
	JLabel openImg6 = new JLabel("", closeImgIcon15 , JLabel.CENTER);
	openImg6.setBounds(0,0,400,488);
	openImg6.setLayout(null);
	openImg6.setVisible(true);	
	f.add(openImg6);
	
	
      
      openImg6.add(b1);
	   openImg6.add(b2);
	  openImg6.add(numberLabel);
	  openImg6.add(numField);
      openImg6.add(passLabel); 
      openImg6.add(passField);
		

      f.setSize(400,488);    
	 f.setLayout(null);    
	 f.setVisible(true);
	 f.setLocationRelativeTo(null);
     f.setDefaultCloseOperation(EXIT_ON_CLOSE);
     f.setResizable(false);	      

    }
	
	public void actionPerformed(ActionEvent e) {

        if(e.getSource()==b2){
            if(numField.getText().length()!=11||passField.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null, "Invalid password or phone number");
            }
            else
            {
               
               new collectTicket(s10,s11,s12,s13,s14,s15,s16);
            }
        } 
}
    
    
   
public static void main(String[] args) {
        new payNagod(null,null,null,null,null,null,null);
    }	
}
