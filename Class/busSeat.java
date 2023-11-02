import javax.swing.*;    
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.imageio.*;
import java.awt.*;
import java.util.regex.*;
import java.io.FileWriter;
import java.io.IOException;

public class busSeat extends JFrame {  

	JButton b,b1,c,button,a1,a2;
	final JLabel label,l1,l2;
	final JTextField text;
	final JPasswordField value;
	int count=0;
	private String s;
	private JLabel amount = new JLabel();
	private Font font1 = new Font("MANOSPAC", Font.BOLD, 30);
	private Font font2 = new Font("Arial ", Font.BOLD, 14);
	private Font font3 =new Font("Arial Italic",Font.BOLD,12);
	private Font font4=new Font("Cambria Math",Font.BOLD,20);
	private Font font5=new Font("Algerian",Font.BOLD,25);
	
	String s10 ,s11,s12,s13,s14,s15,s16;
	
	
	JButton seat(String text, int x,int y, int w, int h)
		{
		JButton sampleSeat = new JButton(text);
		
     sampleSeat.setBounds(245,330,90,30);
	 sampleSeat.setBackground(new Color(0, 156, 196));
	 
     sampleSeat.setForeground(Color.black);
	
		sampleSeat.setBounds(x,y,w,h);
		return sampleSeat;
		}
		
		
		public void fair(JButton button){
		button.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			
			
		button.setBackground(Color.WHITE);
		
		count = 250+count;
		s= "Total Fair :   ".concat(String.valueOf(count)).concat(" Taka");
		amount.setText(s);
		amount.setBounds(300,550,400,40);
		amount.setFont(font4);
		amount.setLayout(null);
		
			
			//s= "Total Amount :   ".concat(String.valueOf(count)).concat(" Taka");
			
			}});
			
		
	}
	/*public void fair(JButton button){
	button.addMouseListener(new MouseAdapter(){
	public void mouseClicked(MouseEvent ev) {
		if(ev.getClickCount() == 1){
			button.setBackground(Color.WHITE);
		
		count = 200+count;
		s= "Total Amount :   ".concat(String.valueOf(count)).concat(" Taka");
		amount.setText(s);
		amount.setBounds(250,550,400,30);
		amount.setLayout(null);
		}
		else if(ev.getClickCount() == 2){
			button.setBackground(Color.WHITE);
		
		count = 200-count;
		s= "Total Amount :   ".concat(String.valueOf(count)).concat(" Taka");
		amount.setText(s);
		amount.setBounds(250,550,400,30);
		amount.setLayout(null);
		
			
		}
		
	}  
	public void mouseEntered(MouseEvent e) { 
   button.setToolTipText("Click here to go previous page");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
	
	}*/
  
		
		
	
   public  busSeat(String s10,String s11,String s12,String s13,String s14,String s15,String s16) { 
   this.s10=s10;
   this.s11=s11;
   this.s12=s12;
   this.s13=s13;
   this.s14=s14;
   this.s15=s15;
   this.s16=s16;
   
	
    JFrame f=new JFrame("Bus Seat");
	
	
    
     label = new JLabel();            
     label.setBounds(20,150, 200,50); 
	 
	 l1=new JLabel("");    
     l1.setBounds(0,0,0,0); 
	 
	
		
	
	 
     l2=new JLabel("");    
     l2.setBounds(0,0, 0,0);
	 
	 text = new JTextField();  
     text.setBounds(0,0, 0,0);
	 text.setBorder(null);
	 
     value = new JPasswordField();   
     value.setBounds(0,0, 0,0); 
	 
    //back button
	 b = new JButton(new ImageIcon("E:\\java Project\\Image\\prev3.png"));  
	 b.setBounds(1150,0,60,50);
     //b.addActionListener(this);
	 b.setBackground(new Color(102,178,255));
	 Cursor cursor1 = new Cursor(Cursor.HAND_CURSOR);
		b.setCursor(cursor1);
		b.setLayout(null);
		b.addMouseListener(new MouseListener(){
 public void mouseClicked(MouseEvent e) {
		new Bus1(s10,s11,s12,s13,s14);
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
   b.setToolTipText("Click here to go previous page");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
  
	 
	 b1 = new JButton("");  
	 b1.setBounds(0,0, 0,0);
     //b1.addActionListener(this);
	 //b1.setBackground(Color.CYAN);
	 
	

	
	 
	 
	ImageIcon ImageIcon = new ImageIcon("logo.png");
    Image Image = ImageIcon.getImage();
    f.setIconImage(Image);
	
	//bacground Image
	ImageIcon closeImgIcon15 = new ImageIcon("E:\\java Project\\Image\\busSeat.png");
	Image img15 = closeImgIcon15.getImage();
	Image temp_img15 = img15.getScaledInstance(1280,720,Image.SCALE_SMOOTH);
	closeImgIcon15 = new ImageIcon(temp_img15);
	JLabel openImg3 = new JLabel("", closeImgIcon15 , JLabel.CENTER);
	openImg3.setBounds(0,0,1280,720);
	openImg3.setLayout(null);
	openImg3.setVisible(true); 
	f.add(openImg3);
	
	
	 
     openImg3.add(value); 
	 openImg3.add(l1); 
	 openImg3.add(label); 
	 openImg3.add(l2); 
	 openImg3.add(b); 
	 openImg3.add(b1);
	 openImg3.add(text);
	 openImg3.add(amount);
	 
	JButton b = seat("Driver", 1120,170,75,20);openImg3.add(b);
	 a1 = seat("A-1", 850,230,60,20);openImg3.add(a1);
	JButton b1 = seat("B-1", 850,270,60,20);openImg3.add(b1);
	JButton c1 = seat("C-1", 850,310,60,20);openImg3.add(c1);
	JButton d1 = seat("D-1", 850,350,60,20);openImg3.add(d1);
	JButton e1 = seat("E-1",850,390,60,20);openImg3.add(e1);
	JButton f1 = seat("F-1", 850,430,60,20);openImg3.add(f1);
	JButton g1 = seat("G-1", 850,470,60,20);openImg3.add(g1);
	JButton h1 = seat("H-1", 850,510,60,20);openImg3.add(h1);
	JButton i1 = seat("I-1",850,550,60,20);openImg3.add(i1);
	
	JButton a2 = seat("A-2",  918,230,60,20);openImg3.add(a2);
	JButton b2 = seat("B-2",  918,270,60,20);openImg3.add(b2);
	JButton c2 = seat("C-2",  918,310,60,20);openImg3.add(c2);
	JButton d2 = seat("D-2",  918,350,60,20);openImg3.add(d2);
	JButton e2 = seat("E-2",  918,390,60,20);openImg3.add(e2);
	JButton f2 = seat("F-2",  918,430,60,20);openImg3.add(f2);
	JButton g2 = seat("G-2",  918,470,60,20);openImg3.add(g2);
	JButton h2 = seat("H-2",  918,510,60,20);openImg3.add(h2);
	JButton i2 = seat("I-2",  918,550,60,20);openImg3.add(i2);
	
	JButton a3 = seat("A-3",1060,230,60,20);openImg3.add(a3);
	JButton b3 = seat("B-3", 1060,270,60,20);openImg3.add(b3);
	JButton c3 = seat("C-3", 1060,310,60,20);openImg3.add(c3);
	JButton d3 = seat("D-3", 1060,350,60,20);openImg3.add(d3);
	JButton e3 = seat("E-3", 1060,390,60,20);openImg3.add(e3);
	JButton f3 = seat("F-3", 1060,430,60,20);openImg3.add(f3);
	JButton g3 = seat("G-3", 1060,470,60,20);openImg3.add(g3);
	JButton h3 = seat("H-3", 1060,510,60,20);openImg3.add(h3);
	JButton i3 = seat("I-3", 1060,550,60,20);openImg3.add(i3);
	
	JButton a4 = seat("A-4", 1130,230,60,20);openImg3.add(a4);
	JButton b4 = seat("B-4", 1130,270,60,20);openImg3.add(b4);
	JButton c4 = seat("C-4", 1130,310,60,20);openImg3.add(c4);
	JButton d4 = seat("D-4", 1130,350,60,20);openImg3.add(d4);
	JButton e4 = seat("E-4", 1130,390,60,20);openImg3.add(e4);
	JButton f4 = seat("F-4", 1130,430,60,20);openImg3.add(f4);
	JButton g4 = seat("G-4", 1130,470,60,20);openImg3.add(g4);
	JButton h4 = seat("H-4", 1130,510,60,20);openImg3.add(h4);
	JButton i4 = seat("I-4", 1130,550,60,20);openImg3.add(i4);
	
	 
	c = seat("Confirm Payment", 925,630,230,30);
	Cursor cursor2 = new Cursor(Cursor.HAND_CURSOR);
		c.setCursor(cursor2);
		c.setLayout(null);
		
	openImg3.add(c);
	
	//search payment
	    c.addMouseListener(new MouseListener(){
 public void mouseClicked(MouseEvent e) {
		new Payment(s10 ,s11,s12,s13,s14,s15,s16);
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
   c.setToolTipText("Please Confirm");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
  
  
  
    fair(a1);
	fair(a2);
	fair(a3);
	fair(a4);
	fair(b1);
	fair(b2);
	fair(b3);
	fair(b4);
	fair(c1);
	fair(c2);
	fair(c3);
	fair(c4);
	fair(d1);
	fair(d2);
	fair(d3);
	fair(d4);
	fair(e1);
	fair(d2);
	fair(d3);
	fair(d4);
	fair(e2);
	fair(e3);
	fair(e4);
	fair(f1);
	fair(f2);
	fair(f3);
	fair(f4);
	fair(g1);
	fair(g2);
	fair(g3);
	fair(g4);
	fair(h1);
	fair(h2);
	fair(h3);
	fair(h4);
	fair(i1);
	fair(i2);
	fair(i3);
	fair(i4);

	 
	 f.setSize(1280,720);    
	 f.setLayout(null);    
	 f.setVisible(true);
	 f.setLocationRelativeTo(null);
     f.setDefaultCloseOperation(EXIT_ON_CLOSE);
     f.setResizable(false);	 
	

        
}  

 	/*public void actionPerformed(ActionEvent e) {
		try{
        if(e.getSource() == a1)
		{
			
			count+=200;
			
		}
		else if(e.getSource() == a2){
			
			count+=200;
		}
		 
		
		s= "Total Amount :   ".concat(String.valueOf(count)).concat(" Taka");
		l1.setText(s);
	}catch(Exception e1){}
	}*/
	
	public static void main(String[] args) {
        
                new busSeat(null,null,null,null,null,null,null);
            }
} 