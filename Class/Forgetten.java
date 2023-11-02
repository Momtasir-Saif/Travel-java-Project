 import javax.swing.*;    
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.imageio.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.*;

  
public class Forgetten extends JFrame implements ActionListener {  

	JButton b,b1,b2,b3,b4;
	final JLabel label,l1,l2;
	final JTextField text;
	final JPasswordField value,value1;
	private String st1,st2,st3,st4,st5,st6,st7,st8;
	private String s1,s2,s3,s4,s6;
	private String []arr; 
    private boolean matched;	
	
    Forgetten() { 
	
    JFrame f=new JFrame("Reset passoward");
    
     label = new JLabel();            
     label.setBounds(20,150, 200,50); 
	 
	 l1=new JLabel("Connect With");    
     l1.setBounds(1015,540, 80,30); 
	 
     l2=new JLabel("");    
     l2.setBounds(900,340, 120,30);
	 
	 text = new JTextField();  
     text.setBounds(90,30, 100,30);
	 text.setBorder(null);
	 
     value = new JPasswordField();   
     value.setBounds(920,265, 250,30);   
	 
	 value1 = new JPasswordField();   
     value1.setBounds(920,355, 250,30);   
    
    
	 b = new JButton("Reset Passoward");  
	 b.setBounds(970,440, 160,30);
     b.addActionListener(this);
	 
	 JButton b1=new JButton(new ImageIcon("E:\\java Project\\Image\\backupper123.jpg"));   
	 b1.setBounds(1010,0,240,40);
     b1.addActionListener(this);
	 
	 JButton b2=new JButton(new ImageIcon("E:\\java Project\\Image\\facebook123.jpg"));   
	 b2.setBounds(980,580,40,40);
     b2.addActionListener(this);
	 
	 JButton b3=new JButton(new ImageIcon("E:\\java Project\\Image\\youtube123.jpg"));   
	 b3.setBounds(1040,580,40,40);
     b3.addActionListener(this);
	 
	 JButton b4=new JButton(new ImageIcon("E:\\java Project\\Image\\instragram123.png"));   
	 b4.setBounds(1100,580,40,40);
     b4.addActionListener(this);
	 
	 ImageIcon closeImgIcon00 = new ImageIcon("E:\\java Project\\Image\\close.png");
		Image img400 = closeImgIcon00.getImage();
		Image temp_img400 = img400.getScaledInstance(20,20,Image.SCALE_SMOOTH);
		closeImgIcon00 = new ImageIcon(temp_img400);
		JLabel closeImg00 = new JLabel("", closeImgIcon00 , JLabel.CENTER);
		closeImg00.setBounds(470,80, 20,20);
		closeImg00.setLayout(null);
		//closeImg00.setCursor(cursor);
		
		ImageIcon closeImgIcon100 = new ImageIcon("E:\\java Project\\Image\\open.png");
		Image img100 = closeImgIcon100.getImage();
		Image temp_img100 = img100.getScaledInstance(20,20,Image.SCALE_SMOOTH);
		closeImgIcon100 = new ImageIcon(temp_img100);
		JLabel openImg00 = new JLabel("", closeImgIcon100 , JLabel.CENTER);
		openImg00.setBounds(470,80, 20,20);
		openImg00.setLayout(null);
		openImg00.setVisible(false); 
		//openImg00.setCursor(cursor);
		
		closeImg00.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				String s4 = value.getText();
				value.setVisible(false);
				closeImg00.setVisible(false);
			
				text.setVisible(true);
				openImg00.setVisible(true);
				text.setText(s3);
		} });
		
		openImg00.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				String s5 = text.getText();
				text.setVisible(false);
				openImg00.setVisible(false);
			
				value.setVisible(true);
				closeImg00.setVisible(true);
				value.setText(s3);
		} });
		
	 
	 
	 
	 
	 
	 
	ImageIcon ImageIcon = new ImageIcon("E:\\java Project\\Image\\logo.png");
    Image Image = ImageIcon.getImage();
    f.setIconImage(Image);
	
	JLabel Background;
	ImageIcon img = new ImageIcon("E:\\java Project\\Image\\resetpassword.jpg");
	Background = new JLabel ("",img,JLabel.CENTER);
	Background.setBounds(0,0,1280,720);
	f.add(value);
    f.add(value1);	
	 f.add(l1); 
	 f.add(label); 
	 f.add(l2); 
	 f.add(b);
     f.add(b1); 
	 f.add(b2);
	 f.add(b3);
	 f.add(b4);
	 f.add(text);
	 f.add(Background);
	

	 
	 f.setSize(1280,720);    
	 f.setLayout(null);    
	 f.setVisible(true);
	 f.setLocationRelativeTo(null);
     f.setDefaultCloseOperation(EXIT_ON_CLOSE);	 
}  

 	 public void actionPerformed(ActionEvent e)
	 {
		        matched = false;
			
			try{
				String s1 = text.getText();
				String s2 = value.getText();
			 	String s3 = text.getText().concat(".txt");
				
				File file = new File(s3);
				boolean check = file.exists();
				
				System.out.println(s3);
				
				if(check==true){
					
					FileReader fr = new FileReader(s3);
					BufferedReader br = new BufferedReader(fr);
					String line;
					
					
					int count = 1 ;
					int x = 0;
					System.out.println(s3);
				
					while((line = br.readLine())!=null){
						
						
						if(line.equals(s1+"\t"+s2) || x>0){
							matched = true;
							if(count==1){
								st1 = text.getText()+"\t"+value.getText();
								System.out.println("st1 ::"+st1+"\n");
							}
							if(count==2){
								st2=line;
								System.out.println("st2 ::"+st2+"\n");
							}
							if(count==3){
								st3=line;
								System.out.println("st3 ::"+st3+"\n");
							}
							if(count==4){
								st4=line;
								System.out.println("st4 ::"+st4+"\n");
							}
							if(count==5){
								st5=line;
								System.out.println("st5 ::"+st5+"\n");
							}
							if(count==6){
								st6=line;
								System.out.println("st6 ::"+st6+"\n");
							}
							if(count==7){
								st7=line;
								System.out.println("st7 ::"+st7+"\n");
							}
							if(count==8){
								 st8 = line;
								System.out.println("st8 ::"+st8+"\n");
							}
							x++;
						}
						
						count++;
					}
					fr.close();
					if(matched){
						
						if(value.getText().isEmpty()||value1.getText().isEmpty()){
							JOptionPane.showMessageDialog(null,"Please enter the new password");
						}
						
						else{
						
							if(value.getText().equals(value1.getText())){
								
								if(value.getText().equals(value1.getText())){
									JOptionPane.showMessageDialog(null,"New password and old password are same");
								}else{
									System.out.println("matched");
									File file1 = new File(s3);
									boolean b = file1.delete();
									if(b){
										System.out.println("File delete & creation");
										FileWriter fw = new FileWriter(s3,true);
										fw.write(st1+"\n"+st2+"\n"+st3+"\n"+st4+"\n"+st5+"\n"+st6+"\n"+st7+"\n"+st8);
										fw.close();
										JOptionPane.showMessageDialog(null,"Password changed successfully");
										new LogIn();
										//f.setVisible(false);
									}
								}
							}else{JOptionPane.showMessageDialog(null,"New passwords did not matched ");}
						}
						
					}
					
				}else
				{
					new LogIn();
				}
				
				}catch(Exception e1)
				{
					System.out.println(e1);
				}
}
}
