import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import java.io.File;
import java.io.IOException;
import java.awt.Robot;
import java.awt.Rectangle;
import java.awt.AWTException;
import javax.imageio.ImageIO;
import  javax.swing.JFileChooser;

public class collectTicket extends  JFrame implements  ActionListener {

   final JLabel label,l1,l2,l3,l6,l7;
    JButton b,b1,b2;
	JFileChooser fileChooser;
	JFrame f;
	
    String s10 ,s11,s12,s13,s14,s15,s16;
	
     public collectTicket(String s10, String s11,String s12,String s13,String s14,String s15,String s16){
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
	 Font font7=new Font("Bell MT", Font.PLAIN, 30);
    Font font8=new Font("Bell MT", Font.PLAIN, 18);

	
	 f=new JFrame("Ticket Collect");
           
	label = new JLabel();            
     label.setBounds(0,0, 0,0);
	 
	  l1=new JLabel(s10);
        l1.setBounds(300,235,400,40);
        l1.setFont(font7);
        //l1.setHorizontalAlignment(JLabel.LEFT);
        l1.setForeground(Color.WHITE);
       
	l2=new JLabel(s11);
        l2.setBounds(295,312,400,40);
        l2.setFont(font7);
        //l1.setHorizontalAlignment(JLabel.LEFT);
        l2.setForeground(Color.WHITE);
		
		
	l3=new JLabel(s12+" ; "+s13+" ; "+s14);
        l3.setBounds(300,545,400,40);
        l3.setFont(font7);
        //l1.setHorizontalAlignment(JLabel.LEFT);
        l3.setForeground(Color.WHITE);
		
		/*l4=new JLabel(s13);
        l4.setBounds(300,350,400,40);
        l4.setFont(font4);
        //l1.setHorizontalAlignment(JLabel.LEFT);
        l4.setForeground(Color.WHITE);
		
		l5=new JLabel(s14);
        l5.setBounds(300,400,400,40);
        l5.setFont(font4);
        //l1.setHorizontalAlignment(JLabel.LEFT);
        l5.setForeground(Color.WHITE);*/
		
		
		l6=new JLabel(s15);
        l6.setBounds(350,390,400,40);
        l6.setFont(font8);
        //l1.setHorizontalAlignment(JLabel.LEFT);
        l6.setForeground(Color.WHITE);
		
		l7=new JLabel(s16);
        l7.setBounds(355,470,400,40);
        l7.setFont(font7);
        //l1.setHorizontalAlignment(JLabel.LEFT);
        l7.setForeground(Color.WHITE);
		
		
		
		
		
		//Home button 
		b1 = new JButton(new ImageIcon("E:\\java Project\\Image\\home.png"));  
	b1.setBounds(15,20,40,40);
	
	Cursor cursor3 = new Cursor(Cursor.HAND_CURSOR);
		b1.setCursor(cursor3);
		b1.setLayout(null);
		b1.addMouseListener(new MouseListener(){
 public void mouseClicked(MouseEvent e) {
		new FirstPage();
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
   b1.setToolTipText("Home page");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
  
  
  // save batton
  b2 = new JButton(new ImageIcon("E:\\java Project\\Image\\save.png"));  
	b2.setBounds(750,20,50,50);
	b2.addActionListener(this);
	
	Cursor cursor4 = new Cursor(Cursor.HAND_CURSOR);
		b2.setCursor(cursor4);
		b2.setLayout(null);
  
  
  
	 
	
	  //background image
	  ImageIcon closeImgIcon15 = new ImageIcon("E:\\java Project\\Image\\Ticket.png");
	Image img15 = closeImgIcon15.getImage();
	Image temp_img15 = img15.getScaledInstance(830,830,Image.SCALE_SMOOTH);
	closeImgIcon15 = new ImageIcon(temp_img15);
	JLabel openImg7 = new JLabel("", closeImgIcon15 , JLabel.CENTER);
	openImg7.setBounds(0,0,830,830);
	openImg7.setLayout(null);
	openImg7.setVisible(true);	
	f.add(openImg7);
	
	openImg7.add(b1);
	openImg7.add(b2);
      openImg7.add(l1);
      openImg7.add(l2);
	  openImg7.add(l3);
	
	openImg7.add(l6);
	openImg7.add(l7);

      f.setSize(830,830);    
	 f.setLayout(null);    
	 f.setVisible(true);
	 f.setLocationRelativeTo(null);
     f.setDefaultCloseOperation(EXIT_ON_CLOSE);
     f.setResizable(false);	      

    }
	public void actionPerformed(ActionEvent e) {
      if(e.getSource()==b2)  
      {
             
        try {
			fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
  int result = fileChooser.showOpenDialog(this);
    if (result == JFileChooser.APPROVE_OPTION) {
    File selectedFile = fileChooser.getSelectedFile();
    System.out.println("Selected file: " + selectedFile.getAbsolutePath());
   }
            
            
          }catch(Exception e1){}
       
        
      }

     
       
 
   
}
    

	
    
    
   
public static void main(String[] args) {
        new collectTicket(null,null,null,null,null,null,null);
    }	
}
