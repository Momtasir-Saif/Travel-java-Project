import javax.swing.*;    
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.imageio.*;
import java.awt.*;
import java.util.regex.*;
import java.io.FileWriter;
import java.io.IOException;
  
  
public class Bus1 extends JFrame implements ActionListener{  

	JButton b,b1,b2;
	final JLabel label,l1,l2,l3,l4,l5,l6,l7;
	final JTextField text;
	final JPasswordField value;
	String s15,s16,s17,s18,s19;
	
    JComboBox cb1,cb2,cb3,cb4,cb5;
	String s10 ,s11,s12,s13,s14;
   
	
    public Bus1(String s10,String s11,String s12,String s13,String s14 ) { 
	this.s10=s10;
	this.s11=s11;
	this.s12=s12;
	this.s13=s13;
	this.s14=s14;
	
	Font font1 = new Font("MANOSPAC", Font.BOLD, 30);
	Font font2 = new Font("Arial ", Font.BOLD, 14);
	Font font3 =new Font("Arial Italic",Font.BOLD,12);
	Font font4=new Font("Cambria Math",Font.BOLD,20);
	Font font5=new Font("Algerian",Font.BOLD,25);
	
    JFrame f=new JFrame("Bus ");
    
     label = new JLabel();            
     label.setBounds(20,150, 200,50); 
	 
	 l1=new JLabel("");    
     l1.setBounds(700,260, 500,40); 
	 l1.setForeground(Color.BLACK);
	  l1.setFont(font4);
	 
     l2=new JLabel("");    
     l2.setBounds(700,310,500,40);
	 l2.setForeground(Color.BLACK);
	 l2.setFont(font4);
	 
	 l3=new JLabel("");    
     l3.setBounds(700,360, 500,40);
	 l3.setForeground(Color.BLACK);
	 l3.setFont(font4);
	 
	 l4=new JLabel("");    
     l4.setBounds(700,400, 500,40);
	 l4.setForeground(Color.BLACK);
	 l4.setFont(font4);
	 
	 l5=new JLabel("");    
     l5.setBounds(700,450,400,40);
	 l5.setForeground(Color.BLACK);
	 l5.setFont(font4);
	 
	 l6=new JLabel("From : "+s10);    
     l6.setBounds(700,150,400,40);
	 l6.setForeground(Color.BLACK);
	 l6.setFont(font4);
	 
	  l7=new JLabel("TO :"+s11);    
     l7.setBounds(700,210,400,40);
	 l7.setForeground(Color.BLACK);
	 l7.setFont(font4);
	 
	 
	 
	 
	
	 text = new JTextField();  
     text.setBounds(0,0, 0,0);
	 text.setBorder(null);
	 
     value = new JPasswordField();   
     value.setBounds(0,0, 0,0);   
    
	 b = new JButton("");  
	 b.setBounds(0,0,0,0);
     b.addActionListener(this);
	 
	 
	 b1 = new JButton("Modify Search");  
	 b1.setBounds(1100,50, 150,30);
	 b1.setBackground(new Color(39,193,49));
	  Cursor cursor1 = new Cursor(Cursor.HAND_CURSOR);
		b1.setCursor(cursor1);
		b1.setLayout(null);
		b1.addMouseListener(new MouseListener(){
 public void mouseClicked(MouseEvent e) {
		new Bus();
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
   b1.setToolTipText("Back Page");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
  
  //seat search batton
  b2 = new JButton("View Seats");  
	 b2.setBounds(750,595,200,40);
	 b2.addActionListener(this);
	 b2.setBackground(new Color(39,193,49));
	 Cursor cursor124 = new Cursor(Cursor.HAND_CURSOR);
		b2.setCursor(cursor124);
		b2.setLayout(null);
		b2.addMouseListener(new MouseListener(){
	public void mouseClicked(MouseEvent e) {
		new busSeat(s10,s11,s12,s13,s14,s15,s16);
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
    b.setToolTipText("Please Confirm");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
  
  
  //combo box
   String oparetor[]={"Select Bus","Hanif Enterprise","Ena Transport (Pvt) Ltd","Saintmartin TravelsSoudia","Saintmartin Hyundai (Robi Express)","Hanif Enterprise","Royal Coach","SHOHAGH PARIBAHAN"};        
    cb1=new JComboBox(oparetor);    
    cb1.setBounds(75, 120,400,38);
	cb1.setFont(font2);
 cb1.setBackground(new Color(204, 229, 250));
	cb1.setForeground(Color.black);   
	cb1.setFocusable(false);
	 cb1.addActionListener(this);
	
	String bustype[]={"Select Bus Type","AC","Non Ac"};        
    cb2=new JComboBox(bustype);    
    cb2.setBounds(75, 214,400,40);
	cb2.setFont(font2);
 cb2.setBackground(new Color(204, 229, 250));
	cb2.setForeground(Color.black);   
	cb2.setFocusable(false);
	 cb2.addActionListener(this);
	
	String point[]={" Select Bording Point","Abdullahpur Bus Point","Sayedabad Bus Point","Dampara Bus Point, Chittagong","Brahmanbaria Bus point","Cumilla Bus Point","Nathullahbad Bus Terminal ,Barishal","Kadamtoli Bus Terminal, Sylhet"};        
     cb3=new JComboBox(point);    
    cb3.setBounds(75, 314,400,40);
	cb3.setFont(font2);
 cb3.setBackground(new Color(204, 229, 250));
	cb3.setForeground(Color.black);   
	cb3.setFocusable(false);
	 cb3.addActionListener(this);
	
	
	
	String point1[]={"Select Dropping Point","Abdullahpur Bus Point","Sayedabad Bus Point","Dampara Bus Point, Chittagong","Brahmanbaria Bus point","Cumilla Bus Point","Nathullahbad Bus Terminal ,Barishal","Kadamtoli Bus Terminal, Sylhet"};        
     cb4=new JComboBox(point1);    
    cb4.setBounds(75, 408,400,40);
	cb4.setFont(font2);
 cb4.setBackground(new Color(204, 229, 250));
	cb4.setForeground(Color.black);   
	cb4.setFocusable(false);
	 cb4.addActionListener(this);
	
	String time[]={"06:00 AM - 12:00 PM","12:00 PM - 06:00 PM","After 06:00 PM"};        
     cb5=new JComboBox(time);    
    cb5.setBounds(75, 512,400,40);
	cb5.setFont(font2);
 cb5.setBackground(new Color(204, 229, 250));
	cb5.setForeground(Color.black);   
	cb5.setFocusable(false);
	cb5.addActionListener(this);
	
	/*String time1[]={"Before 06:00 AM","12:00 PM - 06:00 PM","After 09:00 PM"};        
    JComboBox cb6=new JComboBox(time1);    
    cb6.setBounds(75, 610,400,40);
	cb6.setFont(font2);
 cb6.setBackground(new Color(204, 229, 250));
	cb6.setForeground(Color.black);   
	cb6.setFocusable(false);*/
	
	
	
	 
	ImageIcon ImageIcon = new ImageIcon("logo.png");
    Image Image = ImageIcon.getImage();
    f.setIconImage(Image);
	
	//background image
	ImageIcon closeImgIcon15 = new ImageIcon("E:\\java Project\\Image\\2nd gui.png");
	Image img15 = closeImgIcon15.getImage();
	Image temp_img15 = img15.getScaledInstance(1280,720,Image.SCALE_SMOOTH);
	closeImgIcon15 = new ImageIcon(temp_img15);
	JLabel openImg2 = new JLabel("", closeImgIcon15 , JLabel.CENTER);
	openImg2.setBounds(0,0,1280,720);
	openImg2.setLayout(null);
	openImg2.setVisible(true); 
	f.add(openImg2);
	
	
	 
     openImg2.add(value); 
	openImg2.add(l1); 
	openImg2.add(label); 
	 openImg2.add(l2);
	 openImg2.add(l3);
	 openImg2.add(l4);
	 openImg2.add(l5);
	 
	 
	 
	 openImg2.add(b); 
	openImg2.add(b1);
	openImg2.add(b2);
	 openImg2.add(text);
     openImg2.add(cb1);
     openImg2.add(cb2);
     openImg2.add(cb3);
	 openImg2.add(cb4);
	 openImg2.add(cb5);
	 openImg2.add(l6);
	 openImg2.add(l7);
	 //openImg2.add(cb6);
	 
	 
	 f.setSize(1280,720);    
	 f.setLayout(null);    
	 f.setVisible(true);
	 f.setLocationRelativeTo(null);
     f.setDefaultCloseOperation(EXIT_ON_CLOSE);	 
	 f.setResizable(false);
	 
	 
	 cb1.addActionListener(new ActionListener(){

         public void actionPerformed(ActionEvent e){

                s15 = (String)cb1.getSelectedItem();
        }});
		
		cb2.addActionListener(new ActionListener(){

         public void actionPerformed(ActionEvent e){

                s16 = (String)cb2.getSelectedItem();
        }});
		
		cb3.addActionListener(new ActionListener(){

         public void actionPerformed(ActionEvent e){

                s17 = (String)cb3.getSelectedItem();
        }});
		
		cb4.addActionListener(new ActionListener(){

         public void actionPerformed(ActionEvent e){

                s18 = (String)cb4.getSelectedItem();
        }});
		
		cb5.addActionListener(new ActionListener(){

         public void actionPerformed(ActionEvent e){

                s19 = (String)cb5.getSelectedItem();
        }});
	 
}  

 	public void actionPerformed(ActionEvent e) {
		
		
		try{
			 FileWriter fw = new FileWriter("bus.txt",true);
			 
        if(e.getSource() == cb1)
		{	
			l1.setText("Bus Name : "+s15);
			fw.write("\n"+"Bus Name : "+s15);
		}
		 
		 
	   if(e.getSource() == cb2)   
		{				
			l2.setText("Bus Type : "+s16);
			fw.write("\n"+"Bus Type : "+s16);
		}
		
		
		if(e.getSource() == cb3){
			l3.setText("Bording Points : "+s17);
			fw.write("\n"+"Bording Points : "+s17);
		}
		
		
       if(e.getSource() == cb4){
		   if(s18.equals("Abdullahpur Bus Point")&&s17.equals("Abdullahpur Bus Point")||s18.equals("Sayedabad Bus Point")&&s17.equals("Sayedabad Bus Point")||
		   s18.equals("Dampara Bus Point, Chittagong")&&s17.equals("Dampara Bus Point, Chittagong")||s18.equals("Brahmanbaria Bus point")&&s17.equals("Brahmanbaria Bus point")||s18.equals("Cumilla Bus Point")&&s17.equals("Cumilla Bus Point")||
		   s18.equals("Nathullahbad Bus Terminal ,Barishal")&&s17.equals("Nathullahbad Bus Terminal ,Barishal")||
		   s18.equals("Kadamtoli Bus Terminal, Sylhet")&&s17.equals("Kadamtoli Bus Terminal, Sylhet")){
			   
			   JOptionPane.showMessageDialog(null,"Please correctly fil up Destination");
			   
		    }
		   else{
			   l4.setText("Dropping Points : "+s18);
			   fw.write("\n"+"Droping Points  : "+s18);
		   }
       }


      if(e.getSource() == cb5)   
		{				
			l5.setText("Depature Time : "+s19);
			fw.write("\n"+"Depature Time  : "+s19);
		}

		
		if(e.getSource() == b2)  {
			
			if(s15==null||s16==null||s17==null||s18==null||s19==null){
				    JOptionPane.showMessageDialog(null,"Please correctly fil up");}
					
						
		} 
		 fw.close();
		}catch(Exception e1){}
		
		}
		
    
	
	
	public static void main(String[] args) {
        
                new Bus1(null,null,null,null,null);
            }
} 