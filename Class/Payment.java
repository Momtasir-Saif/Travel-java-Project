import javax.swing.*;    
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.imageio.*;
import java.awt.*;
import java.util.regex.*;
import java.io.FileWriter;
import java.io.IOException;

public class Payment extends  JFrame  {

   final JLabel label;
   
    JButton b,bkash,nagod,b1;

   String s10 ,s11,s12,s13,s14,s15,s16;

   
    public Payment(String s10, String s11,String s12,String s13,String s14,String s15,String s16){
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
		
	JFrame f=new JFrame("Payment Syatem");
           
	label = new JLabel();            
     label.setBounds(0,0, 0,0);
	 
	 b = new JButton("");  
	 b.setBounds(0,0,0,0);
     //b.addActionListener(this);
	 
	 //bikash button
	 bkash = new JButton(new ImageIcon("E:\\java Project\\Image\\bkash.png"));  
	bkash.setBounds(280,250,150,104);
	 Cursor cursor1 = new Cursor(Cursor.HAND_CURSOR);
		bkash.setCursor(cursor1);
		bkash.setLayout(null);
		bkash.addMouseListener(new MouseListener(){
 public void mouseClicked(MouseEvent e) {
		new payBkash(s10 ,s11,s12,s13,s14,s15,s16);
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
   bkash.setToolTipText("Click");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
	
	
	 //nagod button
	  nagod = new JButton(new ImageIcon("E:\\java Project\\Image\\nagod.png"));  
	nagod.setBounds(50,250,150,104);
	 Cursor cursor2 = new Cursor(Cursor.HAND_CURSOR);
		nagod.setCursor(cursor2);
		nagod.setLayout(null);
		nagod.addMouseListener(new MouseListener(){
 public void mouseClicked(MouseEvent e) {
		new payNagod(s10 ,s11,s12,s13,s14,s15,s16);
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
   nagod.setToolTipText("Click");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
		
		//back button
		b1 = new JButton(new ImageIcon("E:\\java Project\\Image\\prev1.png"));  
	b1.setBounds(445,0,32,32);
	Cursor cursor3 = new Cursor(Cursor.HAND_CURSOR);
		b1.setCursor(cursor3);
		b1.setLayout(null);
		b1.addMouseListener(new MouseListener(){
 public void mouseClicked(MouseEvent e) {
		new busSeat(s10,s11,s12,s13,s14,s15,s16);
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
   b1.setToolTipText("Back Previous Page");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
	 
	
	  //background image
	  ImageIcon closeImgIcon15 = new ImageIcon("E:\\java Project\\Image\\pay.png");
	Image img15 = closeImgIcon15.getImage();
	Image temp_img15 = img15.getScaledInstance(500,488,Image.SCALE_SMOOTH);
	closeImgIcon15 = new ImageIcon(temp_img15);
	JLabel openImg4 = new JLabel("", closeImgIcon15 , JLabel.CENTER);
	openImg4.setBounds(0,0,500,488);
	openImg4.setLayout(null);
	openImg4.setVisible(true);	
	f.add(openImg4);
	
	
       openImg4.add(bkash);
       openImg4.add(nagod);
       openImg4.add(b1);
                                                                                          

      f.setSize(500,488);    
	 f.setLayout(null);    
	 f.setVisible(true);
	 f.setLocationRelativeTo(null);
     f.setDefaultCloseOperation(EXIT_ON_CLOSE);
     f.setResizable(false);	      

    }
    
    
   
public static void main(String[] args) {
        new Payment(null,null,null,null,null,null,null);
    }	
}
