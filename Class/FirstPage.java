import javax.swing.*;    
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.imageio.*;
import java.awt.*;
  
public class FirstPage extends JFrame implements ActionListener {  

	JButton b,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13;
	final JLabel label,l1,l2;
	final JTextField text;
	final JPasswordField value;
	
    FirstPage() { 
	
    JFrame f=new JFrame("homepage");
    
     label = new JLabel();            
     label.setBounds(20,150, 200,50); 
	 
	 l1=new JLabel("");    
     l1.setBounds(0,0, 0,0); 
	 
     l2=new JLabel("");    
     l2.setBounds(0,0, 0,0);
	 
	 text = new JTextField();  
     text.setBounds(0,0, 0,0);
	 text.setBorder(null);
	 
     value = new JPasswordField();   
     value.setBounds(0,0, 0,0);   
    
	 JButton b=new JButton(new ImageIcon("E:\\java Project\\Image\\Buslogo1.jpg"));  
	 b.setBounds(420,240, 100,100);
     b.addActionListener(this);
	 b.addMouseListener(new MouseListener(){
	public void mouseClicked(MouseEvent e) {
		new Bus();
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
    b.setToolTipText("Click Bus");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
	 
	 JButton b1=new JButton(new ImageIcon("E:\\java Project\\Image\\metrorail1.jpg"));  
	 b1.setBounds(530,240, 100,100);
     b1.addActionListener(this);
	 b1.setBackground(Color.CYAN);
	 b1.setBackground(Color.CYAN);
	  b1.addMouseListener(new MouseListener(){
	public void mouseClicked(MouseEvent e) {
		new MetroRail();
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
    b1.setToolTipText("Home Page");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
	 
	 JButton b2=new JButton(new ImageIcon("E:\\java Project\\Image\\plane1.jpg"));  
	 b2.setBounds(640,240, 100,100);
     //b2.addActionListener(this);
	 b2.setBackground(Color.CYAN);
	  b2.addMouseListener(new MouseListener(){
	public void mouseClicked(MouseEvent e) {
		new Selection();
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
    b2.setToolTipText("Home Page");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
	 
	 JButton b3=new JButton(new ImageIcon("E:\\java Project\\Image\\Train1.jpg"));  
	 b3.setBounds(750,240, 100,100);
     b3.addActionListener(this);
	 b3.setBackground(Color.CYAN);
	  b3.addMouseListener(new MouseListener(){
	public void mouseClicked(MouseEvent e) {
		new TrainTicket();
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
    b3.setToolTipText("Home Page");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
	 
	 
	 JButton b4=new JButton(new ImageIcon("E:\\java Project\\Image\\backupper123.jpg"));   
	 b4.setBounds(1000,0,240,40);
    // b5.addActionListener(this);
	b4.setBorderPainted(false);
	 	 b4.addMouseListener(new MouseListener(){
	public void mouseClicked(MouseEvent e) {
		new First();
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
    b4.setToolTipText("Home Page");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
  
  JButton b5=new JButton(new ImageIcon("E:\\java Project\\Image\\signupupper12.jpg"));   
	 b5.setBounds(760,0,240,40);
     //b8.addActionListener(this);
	 b5.setBorderPainted(false);
	  b5.addMouseListener(new MouseListener(){
	public void mouseClicked(MouseEvent e) {
		new Signup();
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
    b5.setToolTipText("Home Page");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
  
  JButton b6=new JButton(new ImageIcon("E:\\java Project\\Image\\loginupper123.jpg"));  
	 b6.setBounds(520,0,240,40);
     b6.addActionListener(this);
	 b6.setBackground(Color.CYAN);
	 //b6.setFont(font2);
	 b6.setBackground(new Color(102, 204, 255));
	 b6.setBorderPainted(false);
	 b6.addMouseListener(new MouseListener(){
	public void mouseClicked(MouseEvent e) {
		new LogIn();
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
    b6.setToolTipText("Home Page");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
  
  JButton b7=new JButton(new ImageIcon("E:\\java Project\\Image\\profile1.png"));  
	 b7.setBounds(300,0, 216,40);
     b7.addActionListener(this);
	 b7.setBackground(Color.CYAN);
	 b7.setBorderPainted(false);
	 
	 JButton b8=new JButton(new ImageIcon("E:\\java Project\\Image\\busticketfront1.jpg"));  
	 b8.setBounds(160,450, 254,172);
     b8.addActionListener(this);
	 b8.setBackground(Color.CYAN);
	 b8.setBorderPainted(false);
	 
	 JButton b9=new JButton(new ImageIcon("E:\\java Project\\Image\\startbusticket1.jpg"));  
	 b9.setBounds(420,450, 250,172);
     b9.addActionListener(this);
	 b9.setBackground(Color.CYAN);
	 b9.setBorderPainted(false);
	 
	 JButton b10=new JButton(new ImageIcon("E:\\java Project\\Image\\trainticketfirst1.jpg"));  
	 b10.setBounds(680,450, 250,172);
     b10.addActionListener(this);
	 b10.setBackground(Color.CYAN);
	 b10.setBorderPainted(false);
	 
	 JButton b11=new JButton(new ImageIcon("E:\\java Project\\Image\\metrrailfirst11.jpg"));  
	 b11.setBounds(940,450, 250,172);
     b11.addActionListener(this);
	 b11.setBackground(Color.CYAN);
	 b11.setBorderPainted(false);
	 
	 JButton b12=new JButton(new ImageIcon("E:\\java Project\\Image\\Back222.jpg"));   
	 b12.setBounds(50,0,240,40);
    // b5.addActionListener(this);
	b12.setBorderPainted(false);
	 	 b12.addMouseListener(new MouseListener(){
	public void mouseClicked(MouseEvent e) {
		new First();
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
    b12.setToolTipText("Home Page");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
  
  JButton b13=new JButton(new ImageIcon("E:\\java Project\\Image\\3dotfirst.jpg"));  
	 b13.setBounds(5,0,44,44);
     b13.addActionListener(this);
	 b13.setBackground(Color.CYAN);
	 
	
	 
	ImageIcon ImageIcon = new ImageIcon("E:\\java Project\\Image\\logo.png");
    Image Image = ImageIcon.getImage();
    f.setIconImage(Image);
	
	JLabel Background;
	ImageIcon img = new ImageIcon("");
	Background = new JLabel ("",img,JLabel.CENTER);
	Background.setBounds(0,0,1280,720);
	
	 
     f.add(value); 
	 f.add(l1); 
	 f.add(label); 
	 f.add(l2); 
	 f.add(b); 
	 f.add(b1);
	 f.add(b2);
	 f.add(b3);
	 f.add(b4);
	 f.add(b5);
	 f.add(b6);
	 f.add(b7);
	 f.add(b8);
	 f.add(b9);
	 f.add(b10);
	 f.add(b11);
	 f.add(b12);
	 f.add(b13);
	 f.add(text);
	 f.add(Background);

	 
	 f.setSize(1280,720);    
	 f.setLayout(null);    
	 f.setVisible(true);
	 f.setLocationRelativeTo(null);
     f.setDefaultCloseOperation(EXIT_ON_CLOSE);	 
}  

 	public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b)
		{
			String data = "Username " + text.getText();  
            data += ", Password: " + new String(value.getPassword());   
            label.setText(data);
			
		}
		else if (e.getSource() == b1)
		{   
            label.setText("SignUp");
		}
    }

	public static void main(String []ars)
	{
		new FirstPage();
	}   
}