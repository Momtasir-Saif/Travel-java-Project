import javax.swing.*;    
import java.awt.*;
import java.util.regex.*;
import java.awt.event.*;
import java.io.*;

public class Signup extends JFrame implements ActionListener {  

	JButton b,b1,b2,b3,b5,b6,b7,b8;
	final JLabel label,l1,l2,l3,l4,l5,l6;
	final JTextField text,text1,text2,text3,text4,text5;
	final JPasswordField value;
	private int x1=0,x2=0,x3=0,x4=0,x5=0;
	//final JComboBox cb;
	private Font font5 = new Font("Algerian",Font.BOLD,35);
	private Font font6 = new Font("Cambria Math",Font.BOLD,25);
	private Font font2 = new Font("Arial ", Font.BOLD, 14);
	private Font font1 = new Font("Arial",Font.BOLD,15);
    private String s1,s2,s3,s4,s5,s6;


 Signup()
{
	 JFrame f= new JFrame();  
	 
	 label = new JLabel();            
     label.setBounds(300,250,1000,500); 
	 
	 l1=new JLabel("Connect With");    
     l1.setBounds(1020,600,110,13); 
	 l1.setFont(font1);
	 
     l2=new JLabel("");    
     l2.setBounds(0,0,0,0);
	 l2.setFont(font2);
	 
	 l3=new JLabel("");    
     l3.setBounds(0,0,0,0);
	 l3.setFont(font1);
	 
	 l4=new JLabel("");    
     l4.setBounds(0,0,0,0);
	 l4.setFont(font1);
	 
	 
	 l5=new JLabel("");    
     l5.setBounds(0,0,0,0);
	 l5.setFont(font1);
	 
	 l6=new JLabel("");    
     l6.setBounds(0,0,0,0);
	 l6.setFont(font1);
	 
	 text = new JTextField();  
     text.setBounds(905,162, 310,28);
	 //text.setBorder();
	 text.setFont(font1);
	 
	 text1= new JTextField();  
     text1.setBounds(905,215, 310,28);
	 text1.setFont(font1);
	 
	 text2 = new JTextField();  
     text2.setBounds(905,330, 310,28);
	 text2.setFont(font1);
	/* text2.addKeyListener(new KeyListener(){
    public void keyPressed (KeyEvent e) { } 
    public void keyReleased (KeyEvent e) {    
         String s7 = "^[a-z0-9]{3,30}[@][a-zA-Z]{3,10}[.][a-zA-Z]{2,6}$";
		Pattern p1=Pattern.compile(s1);
		Matcher m=p1.matcher(p.getText());
		if(!m.matches()){
			t133.setText("Email is incorrect!");
			x5++;
		}
		else{
			t133.setText(null);
			x5--;
		} 
	}   
    public void keyTyped (KeyEvent e) { }    
	});*/
	 
	 text3 = new JTextField();  
     text3.setBounds(905,495,310,28);
	 text3.setFont(font1);
	 
	 text4 = new JTextField();  
     text4.setBounds(0,0,0,0);
	 text4.setFont(font1);
	 
	 text5 = new JTextField();  
     text5.setBounds(905,440,310,28);
	 text5.setFont(font1);
	 
	 
	 value = new JPasswordField();   
     value.setBounds(905,272,310,30);
	 
	// value1 = new JPasswordField();   
    // value1.setBounds(1000,400, 145,25);
	 
	 b = new JButton("Signup");  
	 b.setBounds(950,550,220,30);
     b.addActionListener(this);
	 b.setBackground(Color.CYAN);
	 b.setBackground(new Color(102, 204, 255));
	 
	JButton b1=new JButton(new ImageIcon("E:\\java Project\\Image\\loginupper123.jpg"));  
	 b1.setBounds(770,0,240,40);
     b1.addActionListener(this);
	 b1.setBackground(Color.CYAN);
	 b1.setFont(font2);
	 b1.setBackground(new Color(102, 204, 255));
	 b1.setBorderPainted(false);
	 b1.addMouseListener(new MouseListener(){
	public void mouseClicked(MouseEvent e) {
		new LogIn();
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
    b1.setToolTipText("Home Page");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
	 
	 
	 
	 
	 b2 = new JButton("");  
	 b2.setBounds(0,0,0,0);
     b2.addActionListener(this);
	 b2.setBackground(Color.CYAN);
	 b2.setFont(font2);
	 b2.setBackground(new Color(102, 204, 255));
	 
	 b3 = new JButton("");  
	 b3.setBounds(0,0,0,0);
     b3.addActionListener(this);
	 b3.setBackground(Color.CYAN);
	 b3.setFont(font2);
	 b3.setBackground(new Color(102, 204, 255));
	 
	 JButton b5=new JButton(new ImageIcon("E:\\java Project\\Image\\backupper123.jpg"));   
	 b5.setBounds(1010,0,240,40);
	 b5.setBorderPainted(false);
     //b5.addActionListener(this);
	 b5.addMouseListener(new MouseListener(){
	public void mouseClicked(MouseEvent e) {
		new LogIn();
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
    b5.setToolTipText("Home Page");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
	 
	 JButton b6=new JButton(new ImageIcon("E:\\java Project\\Image\\facebook123.jpg"));   
	 b6.setBounds(990,620,40,40);
     b6.addActionListener(this);
	 
	 JButton b7=new JButton(new ImageIcon("E:\\java Project\\Image\\youtube123.jpg"));   
	 b7.setBounds(1050,620,40,40);
     b7.addActionListener(this);
	 
	 JButton b8=new JButton(new ImageIcon("E:\\java Project\\Image\\instragram123.png"));   
	 b8.setBounds(1110,620,40,40);
     b8.addActionListener(this);
	 
	 
	 
	 
	String country[]={"Select Country","Bangladesh","India","Australia","U.S.A","England","Newzealand","Pakistan","Qatar","Srilanka","Butan","Muldip","Soudi Arab","Mayanmer","Afganistan","Nepal","Select Country","Afghanistan","Albania","Algeria","Andorra","Angola","Antigua and Barbuda","Argentina","Armenia","Australia","Austria","Austrian Empire",
"Azerbaijan","Baden","Bahamas","Bahrain","Bangladesh","Barbados","Bavaria","Belarus","Belgium","Belize","Benin","Bolivia","Bosnia and Herzegovina",
"Botswana","Brazil","Brunei","Brunswick and Lüneburg","Bulgaria","Burkina Faso","Burma","Burundi","Cabo Verde","Cambodia","Cameroon","Canada","Cayman Islands",
"The Central African Republic","Central American Federation","Chad","Chile","China","Colombia","Comoros","Congo Free State", "The Costa Rica","Cote d’Ivoire (Ivory Coast)",
"Croatia","Cuba","Cyprus","Czechia","Czechoslovakia","Democratic Republic of the Congo","Denmark","Djibouti","Dominica","Dominican Republic","Duchy of Parma","East Germany","Ecuador","Egypt","El Salvador","Equatorial Guinea","Eritrea","Estonia","Eswatini","Ethiopia","Fiji","Finland","France","Georgia","Germany","Ghana",
"Haiti","Holy See","Honduras","Hungary","Iceland","India","Indonesia","Iran","Iraq","Ireland","Israel","Italy","Jamaica","Japan","Jordan","Kazakhstan","Kenya",
"Korea","Kosovo","Kuwait","Kyrgyzstan","Liberia","Libya","Liechtenstein","Lithuania","Madagascar","Malawi","Malaysia","Maldives","Mali","Malta","Marshall Islands","Mauritania","Mauritius",
"Mexico","Micronesia","Moldova","Monaco","Mongolia","Montenegro","Morocco","Mozambique","Namibia","Nassau","Nauru","Nepal","Netherlands", "The New Zealand","Nicaragua","Niger","Nigeria","North German Confederation","North German Union",
"North Macedonia","Norway","Oldenburg","Oman","Orange Free State","Pakistan","Palau","Panama","Papal States","Papua New Guinea","Paraguay","Peru","Philippines","Piedmont-Sardinia","Poland","Portugal",
"Qutar","Romania","Russia","Rwanda","Saudi Arabia","Senegal","Serbia","Seychelles","Sierra Leone","Singapore","South Africa","South Sudan","Spain","SriLanka","Sudan","Suriname","Sweden","Switzerland",
		   "Thailand","Turkey","Uganda","Ukraine","United Arab Emirates","The United Kingdom", "The Uruguay","Uzbekistan","Vanuatu","Venezuela","Vietnam","Württemberg","Yemen","Zambia","Zimbabwe"};        
    JComboBox cb=new JComboBox(country);    
    cb.setBounds(905,495,310,28);    
    //f.add(cb);        
    //f.setLayout(null);    
    //f.setSize(400,500);    
    //f.setVisible(true); 
	
	String language[]={"Select Language","Bangla","Hindhi","English","Urdu","Spanish",};
	JComboBox cb1=new JComboBox(language);
	cb1.setBounds(905,440,310,28);
	 
	 
	 
	 
	 JRadioButton r1=new JRadioButton("Male");    
     JRadioButton r2=new JRadioButton("Female");    
     r1.setBounds(905,387,155,28);    
     r2.setBounds(1060,387,155,28);    
     ButtonGroup bg=new ButtonGroup(); 
     r1.setBackground(new Color(102, 204, 255));	
     r2.setBackground(new Color(102, 204, 255));   	 
     //bg.add(r1);bg.add(r2);    
    // f.add(r1);f.add(r2);    
	 
	 
	 
	 
	 ImageIcon ImageIcon = new ImageIcon("E:\\java Project\\Image\\logo.png");
    Image Image = ImageIcon.getImage();
    f.setIconImage(Image);
	
	ImageIcon closeImgIcon15 = new ImageIcon("E:\\java Project\\Image\\registrationpic.jpg");
	Image img15 = closeImgIcon15.getImage();
	Image temp_img15 = img15.getScaledInstance(1280,720,Image.SCALE_SMOOTH);
	closeImgIcon15 = new ImageIcon(temp_img15);
	JLabel openImg1 = new JLabel("", closeImgIcon15 , JLabel.CENTER);
	openImg1.setBounds(0,0,1280,720);
	openImg1.setLayout(null);
	//openImg1.setVisible(false); 
	f.add(openImg1);
	
	 openImg1.add(value); 
	// openImg1.add(value1); 
	 openImg1.add(l1); 
	 openImg1.add(label); 
	 openImg1.add(l2);
     openImg1.add(l3);
     openImg1.add(l4);
	 openImg1.add(cb);
     openImg1.add(cb1);	 
     openImg1.add(l5);
     openImg1.add(l6);
    // openImg1.add(l3);	 
	 openImg1.add(b);
	 openImg1.add(b1);
	 openImg1.add(b2);
	 openImg1.add(b3);
	 openImg1.add(b5);
	 openImg1.add(b6);
	 openImg1.add(b7);
	 openImg1.add(b8);
	 
	 bg.add(r1);
	 bg.add(r2);    
     openImg1.add(r1);
	 openImg1.add(r2); 
	 
	 openImg1.add(text);
	 openImg1.add(text1);
	 openImg1.add(text2);
	 openImg1.add(text3);
	 openImg1.add(text4);
	 openImg1.add(text5);
	 
	 
	 f.setSize(1280,720);    
	 f.setLayout(null);    
	 f.setVisible(true);
	 f.setLocationRelativeTo(null);
     f.setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
	 
	 
	/* cb.addActionListener(new ActionListener){
		 
		 public void actionPerformed(ActionEvent e){
			 s1=(String)cb.getSelectionItem();
	 }});
	 
	 
	 cb1.addActionListener(new ActionListener){
		 
	 public void actionPerformed(ActionEvent e){
		 
			 s2=(String)cb.getSelectionItem();
     
	 }});*/
	 
	 
	 public void actionPerformed(ActionEvent e)
	 {
        
	 
			 try{
				 
				 s3=text.getText().concat(".txt");
				// s1=(String)cb.getSelectionItem();
				 //s2=(String)cb1.getSelectionItem();
				 s4=text1.getText();
				 s5=text2.getText();
				 s6=value.getText();
				 
				 File file = new File(s3);
				 boolean check = file.exists();
				  
		
				 
				 if( s4.isEmpty() || s5.isEmpty()||s6.isEmpty())
				 {
					 JOptionPane.showMessageDialog(null,"Please Fulfill Every Information");
				 }
				 else{
					 if(check !=true)
					 {
						 FileWriter fw =new FileWriter(s3,true);
						 fw.write(text.getText()+"\t"+value.getText()+"\n"+"Name"+s4+"\n"+"Email :"+s5+"\n"+"Password"+"\n"+s6+"\t");
						 fw.close();
						 JOptionPane.showMessageDialog(null,"Thanks,you Have Successfully Signed up");
						 new LogIn();
						 //f.setVisible(false);
					 }
					 if(check==true)
					 {
						 JOptionPane.showMessageDialog(null,"Username Already Exists");
					 }
				 }
			 }catch(Exception e1){
	                 System.out.println(e1);
                     }
	 }
				
} 
	 
    


	
	 
