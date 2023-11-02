import javax.swing.*;    
import java.awt.*;
import java.util.regex.*;
import java.awt.event.*;
import java.awt.Desktop;

import java.io.*;    
import javax.swing.ImageIcon;
import javax.imageio.*;
import java.io.FileWriter;
import java.net.URI;


  
public class LogIn extends JFrame implements ActionListener {  
     private String s1,s2,s3;

	JButton b,b1,b2,b3,b4,b5,b6,b7,b8,b9;
	final JLabel label,l1,l2,l3;
	final JTextField text;
	final JPasswordField value;
	private Font font5 = new Font("Algerian",Font.BOLD,35);
	private Font font6 = new Font("Cambria Math",Font.BOLD,25);
	private Font font2 = new Font("Arial ", Font.BOLD, 14);
	private Font font1 = new Font("Arial",Font.BOLD,15);
	
    LogIn() { 
	
    JFrame f=new JFrame("LogIn ");
    
     label = new JLabel();            
     label.setBounds(300,250,1000,500); 
	 
	 l1=new JLabel("Connect With");    
     l1.setBounds(990,550,140,30); 
	 l1.setFont(font1);
	 
     l2=new JLabel("");    
     l2.setBounds(900,400, 80,30);
	 l2.setFont(font1);
	 
	 l3=new JLabel("");
	 l3.setBounds(900,100,200,100);
	 
	 text = new JTextField();  
     text.setBounds(900,270, 250,35);
	 text.setBorder(null);
	 
     value = new JPasswordField();   
     value.setBounds(900,350, 250,35);   
    
	 b = new JButton("Login");  
	 b.setBounds(900,460, 260,40);
     b.addActionListener(this);
	 //b.setBackground(Color.WHITE);
	 b.setFont(font2);
	 b.setBackground(new Color(102, 204, 255));
	 
	 b1 = new JButton("SignUp");  
	 b1.setBounds(1020,700, 80,40);
     b1.addActionListener(this);
	// b1.setBackground(Color.WHITE);
	b1.setBackground(new Color(102, 204, 255));
	 
	 b2 = new JButton("Facebook");  
	 b2.setBounds(0,0, 0,0);
     b2.addActionListener(this);
	 b2.setBackground(Color.PINK);
	 b2.setBackground(new Color(102, 204, 255));
	 //b2.setIcon(new ImageIcon("facebookimage.jpg"));
	 
	 b3 = new JButton("Twiter");  
	 b3.setBounds(0,0,0,0);
     b3.addActionListener(this);
	 //b3.setBackground(Color.PINK);
	 b3.setBackground(new Color(0, 0, 0));
	 b2.setIcon(new ImageIcon("E:\\java Project\\Image\\facebookimage.jpg"));
	 
	 b4 = new JButton("Forget Passoward ?");  
	 b4.setBounds(940,395, 160,25);
     //b4.addActionListener(this);
	 b4.setBackground(Color.WHITE);
	 b4.setBackground(new Color(255, 255, 255));
	 b4.addMouseListener(new MouseListener(){
	public void mouseClicked(MouseEvent e) {
		new Forgetten();
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
    b4.setToolTipText("Home Page");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
	 
	 
	 
	 
	 JButton b5=new JButton(new ImageIcon("E:\\java Project\\Image\\backupper123.jpg"));   
	 b5.setBounds(1010,0,240,40);
    // b5.addActionListener(this);
	b5.setBorderPainted(false);
	 	 b5.addMouseListener(new MouseListener(){
	public void mouseClicked(MouseEvent e) {
		new First();
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
    b5.setToolTipText("Home Page");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
	 
	 JButton b6=new JButton(new ImageIcon("E:\\java Project\\Image\\facebook123.jpg"));   
	 b6.setBounds(960,580,40,40);
	 b6.setBorderPainted(false);
     //b6.addActionListener(this);
	/* b6.addMouseListener(new MouseListener(){
	public void mouseClicked(MouseEvent e) {
		Desktop desk = Desktop.getDesktop();
		desk.browse(new URI("https://www.facebook.com/"));
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
    b5.setToolTipText("facebook");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	 });*/
	 
	 JButton b7=new JButton(new ImageIcon("E:\\java Project\\Image\\youtube123.jpg"));   
	 b7.setBounds(1020,580,40,40);
     b7.addActionListener(this);
	 b7.setBorderPainted(false);
	 
	 JButton b8=new JButton(new ImageIcon("E:\\java Project\\Image\\instragram123.png"));   
	 b8.setBounds(1080,580,40,40);
     b8.addActionListener(this);
	 
	 
	 
	 JButton b9=new JButton(new ImageIcon("E:\\java Project\\Image\\signupupper12.jpg"));   
	 b9.setBounds(770,0,240,40);
     //b8.addActionListener(this);
	 b9.setBorderPainted(false);
	  b9.addMouseListener(new MouseListener(){
	public void mouseClicked(MouseEvent e) {
		new Signup();
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
    b9.setToolTipText("Home Page");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
	 
	 
	 
	ImageIcon ImageIcon = new ImageIcon("E:\\java Project\\Image\\logo.png");
    Image Image = ImageIcon.getImage();
    f.setIconImage(Image);
	
	ImageIcon closeImgIcon15 = new ImageIcon("E:\\java Project\\Image\\WhatsApp Image 2023-05-01 at 12.12.13.jpg");
	Image img15 = closeImgIcon15.getImage();
	Image temp_img15 = img15.getScaledInstance(1280,720,Image.SCALE_SMOOTH);
	closeImgIcon15 = new ImageIcon(temp_img15);
	JLabel openImg1 = new JLabel("", closeImgIcon15 , JLabel.CENTER);
	openImg1.setBounds(0,0,1280,720);
	openImg1.setLayout(null);
	openImg1.setVisible(true); 
	f.add(openImg1);
	
	JLabel Background;
	ImageIcon img = new ImageIcon("E:\\java Project\\Image\\Logo_de_Facebook.png");
	Background = new JLabel ("Logo_de_Facebook.png",img,JLabel.CENTER);
	Background.setBounds(880,600, 40,40);
	f.add(Background);
	
	

	
	 
     openImg1.add(value); 
	 openImg1.add(l1); 
	 openImg1.add(label); 
	 openImg1.add(l2);
     openImg1.add(l3);	 
	 openImg1.add(b); 
	 openImg1.add(b1);
	 openImg1.add(b2);
	 openImg1.add(b3);
	 openImg1.add(b4);
	 openImg1.add(b5);
	 openImg1.add(b6);
	 openImg1.add(b7);
	 openImg1.add(b8);
	 openImg1.add(b9);
	 openImg1.add(text);
	 openImg1.add(Background);
     f.add(Background);

	 
	 f.setSize(1280,720);    
	 f.setLayout(null);    
	 f.setVisible(true);
	 f.setLocationRelativeTo(null);
     f.setDefaultCloseOperation(EXIT_ON_CLOSE);	
	 
}
     
	 
	 
	
		 public void actionPerformed(ActionEvent e)
		 {
			 boolean matched = false;
			 try
			 {
				 s1 = text.getText();
				 s2 = value.getText();
				 String s3 = text.getText().concat(".txt");
				 
				 File file = new File(s3);
				 boolean check = file.exists();
				
				 System.out.println(s3);
				 
				 if(check==true){
					FileReader fr = new FileReader(s3);
					BufferedReader br = new BufferedReader(fr);
					String line;
				
					while((line = br.readLine())!=null){
					if(line.equals(s1+"\t"+s2)){
						matched = true;
						//notmatched=false;
						break;
					}}
					fr.close();
					if(matched){
						
						FileWriter fw = new FileWriter("tmp.txt",false);
						fw.write(s3);
						
						//new Signup();
						//f.setVisible(false);
						JOptionPane.showMessageDialog(null,"Successfully signed in");
						new FirstPage();
						
						fw.close(); 
					}
					else  {
						JOptionPane.showMessageDialog(null,"Wrong Password & Wrong Username");  
					}
				}
				
				}catch(Exception e1)
			 {
				 System.out.println(e1);
			 }
		 }
		 public void logoMouseListener(JLabel label){
		
		label.addMouseListener(new MouseAdapter(){
			
			public void mouseClicked(MouseEvent e) {  
				new Signup();
				//f.setVisible(false);
			}  
			
		});
		 }
		 
		 //connect with
		 
		/* public void actionPerformed(ActionEvents e2)
		 {
			  if(e2.getSource() == b6)
			  {
				  Desktop desk = Desktop.getDesktop();
				  desk.browse(new URI("https://www.facebook.com/"));
			  }
			  if(e2.getSource() == b7)
			  {
				  Desktop desk = Desktop.getDesktop();
				  desk.browse(new URI("https://www.facebook.com/"));
			  }
			  if(e2.getSource() == b8)
			  {
				  Desktop desk = Desktop.getDesktop();
				  desk.browse(new URI("https://www.facebook.com/"));
			  }
		 }*/

		
		
		  
	
	 public static void main(String [] args)
	 {
		
		new LogIn();
		
	 }
	
	 
}
