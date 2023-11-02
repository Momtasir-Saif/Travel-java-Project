import javax.swing.*;    
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.imageio.*;
import java.awt.*;
import java.util.regex.*;
import java.io.FileWriter;
import java.io.IOException;
  
public class Bus extends JFrame implements ActionListener {  

	JButton b,b1;
	final JLabel label,travel1,l2;
	
	final JTextField text;
	final JPasswordField value;
	String s10,s11,s12,s13,s14;
	
    Bus() { 
	Font font1 = new Font("MANOSPAC", Font.BOLD, 30);
	Font font2 = new Font("Arial ", Font.BOLD, 14);
	Font font3 =new Font("Arial Italic",Font.BOLD,12);
	Font font4=new Font("Cambria Math",Font.BOLD,20);
	Font font5=new Font("Algerian",Font.BOLD,25);
	
	
    JFrame f=new JFrame("Bus Ticket");
    
     label = new JLabel();            
     label.setBounds(0,0, 0,0); 
	 
	 
	 travel1=new JLabel("Time To Travel");    
     travel1.setBounds(10,20, 500,40); 
	 travel1.setFont(font5);
	 travel1.setForeground(new Color(55,79,232));
	 //hand
	 Cursor cursor1 = new Cursor(Cursor.HAND_CURSOR);
		travel1.setCursor(cursor1);
		travel1.setLayout(null);

		travel1.addMouseListener(new MouseListener(){
	public void mouseClicked(MouseEvent e) {
		new FirstPage();
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
    travel1.setToolTipText("Home Page");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
		
	 
     l2=new JLabel("");    
     l2.setBounds(0,0, 0,0);
	 
	 text = new JTextField("");  
     text.setBounds(0,0, 0,0);
	 text.setBorder(null);
	 
     value = new JPasswordField();   
     value.setBounds(0,0, 0,0);  

	 
	 
    //serach button
	 b = new JButton(new ImageIcon("E:\\java Project\\Image\\2023-05-06.png"));  
	 b.setBounds(308,550, 450,35);
     b.addActionListener(this);
	 Cursor cursor124 = new Cursor(Cursor.HAND_CURSOR);
		b.setCursor(cursor124);
		b.setLayout(null);
		b.addMouseListener(new MouseListener(){
	public void mouseClicked(MouseEvent e) {
		new Bus1(s10,s11,s12,s13,s14);
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
    b.setToolTipText("Please Confirm");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
  
	 
	 
	 
	 b1 = new JButton("");  
	 b1.setBounds(0,0, 0,0);
     b1.addActionListener(this);
	 b1.setBackground(Color.CYAN);
	 
	 String country[]={"Select City","Dhaka","Cumilla","Chittagong","Cox's Bazar","Barisal","Brahmanbaria","Sylhet"};        
    JComboBox cb=new JComboBox(country);    
    cb.setBounds(108, 220,350,35);
	cb.setFont(font2);
 cb.setBackground(new Color(255, 255, 255));
	cb.setForeground(Color.black);   
	cb.setFocusable(false);
	
	String country1[]={"Select City","Dhaka","Cumilla","Chittagong","Cox's Bazar","Barisal","Brahmanbaria","Sylhet"};        
    JComboBox cb1=new JComboBox(country1);    
    cb1.setBounds(108, 313,350,35); 
	cb1.setFont(font2);
	 cb1.setBackground(new Color(255, 255, 255));
	cb1.setForeground(Color.black);
	cb1.setFocusable(false);
	
	
	String dates[]={"Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", 
                              "26", "27", "28", "29", "30","31"};        
    JComboBox cb3=new JComboBox(dates);    
    cb3.setBounds(108, 405,108,35); 
	cb3.setFont(font2);
	 cb3.setBackground(new Color(255, 255, 255));
	cb3.setForeground(Color.black);
	 cb3.setFocusable(false);
	
String Months[]={"Months", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};        
    JComboBox cb4=new JComboBox(Months);    
    cb4.setBounds(217, 405,110,35);
cb4.setFont(font2);	
 cb4.setBackground(new Color(255, 255, 255));
	cb4.setForeground(Color.black);	
	cb4.setFocusable(false);
	
	
	String Years[]={"Years","2023"};        
    JComboBox cb5=new JComboBox(Years);    
    cb5.setBounds(325, 405,135,35);
	cb5.setFont(font2);
 cb5.setBackground(new Color(255, 255, 255));
	cb5.setForeground(Color.black);
cb5.setFocusable(false);	
	
	
        
        
    
	 
	ImageIcon ImageIcon = new ImageIcon("logo.png");
    Image Image = ImageIcon.getImage();
    f.setIconImage(Image);
	
	//background image
	ImageIcon closeImgIcon15 = new ImageIcon("E:\\java Project\\Image\\travel1.png");
	Image img15 = closeImgIcon15.getImage();
	Image temp_img15 = img15.getScaledInstance(1280,720,Image.SCALE_SMOOTH);
	closeImgIcon15 = new ImageIcon(temp_img15);
	JLabel openImg1 = new JLabel("", closeImgIcon15 , JLabel.CENTER);
	openImg1.setBounds(0,0,1280,720);
	openImg1.setLayout(null);
	openImg1.setVisible(true); 
	f.add(openImg1);
	
	
	
     openImg1.add(value); 
	openImg1.add(travel1); 
	 openImg1.add(label); 
	 openImg1.add(l2); 
	 openImg1.add(b); 
	 openImg1.add(b1);
	 openImg1.add(text);
	 openImg1.add(cb);        
     openImg1.add(cb1); 
	 openImg1.add(cb3); 
	  openImg1.add(cb4); 
	 openImg1.add(cb5);
openImg1.add(text);	 
	 
	 
	 f.setSize(1280,720);    
	 f.setLayout(null);    
	 f.setVisible(true);
	 f.setLocationRelativeTo(null);
     f.setDefaultCloseOperation(EXIT_ON_CLOSE);	 
	 f.setResizable(false);
	 
	 
	 
	 //combobox clicked
	 cb.addActionListener(new ActionListener(){

         public void actionPerformed(ActionEvent e){

                s10 = (String)cb.getSelectedItem();
        }});
		
	 cb1.addActionListener(new ActionListener(){

         public void actionPerformed(ActionEvent e){

                s11 = (String)cb1.getSelectedItem();
        }});
		
		 cb3.addActionListener(new ActionListener(){

         public void actionPerformed(ActionEvent e){

                s12 = (String)cb3.getSelectedItem();
        }});
		
		 cb4.addActionListener(new ActionListener(){

         public void actionPerformed(ActionEvent e){

                s13 = (String)cb4.getSelectedItem();
        }});
		
		 cb5.addActionListener(new ActionListener(){

         public void actionPerformed(ActionEvent e){

                s14 = (String)cb5.getSelectedItem();
        }});
		
		
		
		
	 
}  


   public void actionPerformed(ActionEvent e){
	   if(e.getSource() == b){
			 
			 
			 try{
				 
				 FileWriter fw = new FileWriter("bus.txt",true);
				 //String s1 = s10.getText();
				 //String s2 = co1.getText();
				if(s10==null||s11==null||s12==null||s13==null||s14==null){
				    JOptionPane.showMessageDialog(null,"Please correctly fil up");}
			    else 
				{
			        if(s10.equals("Dhaka")&&s11.equals("Cumilla")||s10.equals("Dhaka")&&s11.equals("Chittagong")||s10.equals("Chittagong")&&s11.equals("Cumilla")||s10.equals("Chittagong")&&s11.equals("Dhaka")||s10.equals("Cumilla")&&s11.equals("Chittagong")||s10.equals("Cumilla")&&s11.equals("Dhaka")){
					    
						fw.write("\n"+"From : "+s10+"\n"+"To : "+s11+"\n"+"Date :"+s12+"\n"+"Months :"+s13);}
					
					else
					{
						JOptionPane.showMessageDialog(null," This route is not available");
						
				}}
				
				
				
				
				 
				 fw.close();
				 
			 }catch(Exception e1){}
			
				 
		 }
   }
		 
		



	
	
 	
	public static void main(String[] args) {
        
                new Bus();
            }
        
    }


