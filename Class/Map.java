import javax.swing.*;    
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.imageio.*;
import java.awt.*;
  
public class Map extends JFrame implements ActionListener {  

	JButton b;
	
    Map() { 
	
    JFrame f = new JFrame("Map");
    
    
 
	 
	 
    
	 b = new JButton("Back");  
	 b.setBounds(100,50, 120,25);
     //b.addActionListener(this);
	 
	 b.addMouseListener(new MouseListener(){
	public void mouseClicked(MouseEvent e) {
		new MetroRail();
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
    b.setToolTipText("Home Page");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
	 
	
	ImageIcon ImageIcon = new ImageIcon("logo.png");
    Image Image = ImageIcon.getImage();
    f.setIconImage(Image);
	
	JLabel Background;
	ImageIcon img = new ImageIcon("E:\\java Project\\Image\\WhatsApp Image 2023-05-14 at 13.20.17.jpg");
	Background = new JLabel ("",img,JLabel.CENTER);
	Background.setBounds(0,0,1080,720);
	
  
     
    


	
	
	 f.add(b); 
	 
	 f.add(Background);

	 
	 f.setSize(1080,720);    
	 f.setLayout(null);    
	 f.setVisible(true);
	 f.setLocationRelativeTo(null);
     f.setDefaultCloseOperation(EXIT_ON_CLOSE);	 
}  

 	public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b)
		{
			  
			
		//new MetroRail();

		}
		
    }

public static void main(String[] args) {
    new Map();
}
}