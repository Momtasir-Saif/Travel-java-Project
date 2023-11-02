import javax.swing.*;    
import java.awt.*;
import java.util.regex.*;
import java.awt.event.*;
import java.io.*;

  
public class First extends JFrame implements ActionListener {  
    
	JButton b;
	private Font font2 = new Font("Arial ", Font.BOLD, 14);
	
	
First(){
	JFrame f=new JFrame("First ");
	
     JButton b=new JButton(new ImageIcon("E:\\java Project\\Image\\letsgo123456.jpg"));   
	 b.setBounds(290,180, 229,80);
    // b.addActionListener(this);
	 b.setFont(font2);
	 b.setBackground(new Color(0, 0, 0));
	 b.setBorderPainted(false);
	 b.addMouseListener(new MouseListener(){
	public void mouseClicked(MouseEvent e) {
		new LogIn();
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
    b.setToolTipText("first");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	 });
	 
    	 
	 
	 
	ImageIcon ImageIcon = new ImageIcon("E:\\java Project\\Image\\logo.png");
    Image Image = ImageIcon.getImage();
    f.setIconImage(Image);
	
	ImageIcon closeImgIcon15 = new ImageIcon("E:\\java Project\\Image\\Start23.jpg");
	Image img15 = closeImgIcon15.getImage();
	Image temp_img15 = img15.getScaledInstance(1280,720,Image.SCALE_SMOOTH);
	closeImgIcon15 = new ImageIcon(temp_img15);
	JLabel openImg1 = new JLabel("", closeImgIcon15 , JLabel.CENTER);
	openImg1.setBounds(0,0,1280,720);
	openImg1.setLayout(null);
	openImg1.setVisible(true); 
	
		openImg1.add(b);
	f.add(openImg1);
	
	
	
	 f.setSize(1280,720);    
	 f.setLayout(null);    
	 f.setVisible(true);
	 f.setLocationRelativeTo(null);
     f.setDefaultCloseOperation(EXIT_ON_CLOSE);	 
	
	
}
public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b)
		{
			new LogIn();
			
		}
}
public static void main(String [] args){
		
		new First();
		
	}
}