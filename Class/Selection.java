import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Selection extends JFrame
{
	protected JFrame f = new JFrame("Selection Page");
	
	Font font1(String text, int fSize)
		{
			Font font = new Font(text, Font.BOLD, fSize);
			return font;
		}	
		
	JLabel label(String text, int x,int y, int w, int h)
		{
		JLabel l1 = new JLabel(text);
		l1.setBounds(x,y,w,h);
		return l1;
		}
	Selection()
	{
	f.setSize(800,600);
	f.setLayout(null); 
		
	 JPanel panel=new JPanel();  
        panel.setBounds(425,0,2,600);    
        panel.setBackground(new Color(124, 180, 107)); 
		f.add(panel);
		JPanel logoPanel=new JPanel();
		logoPanel.setBounds(0,0,800,70);
		logoPanel.setBackground(new Color(124,180,107));
		logoPanel.setLayout(null);
		f.add(logoPanel);
		JPanel panel1=new JPanel();  
        panel1.setBounds(430,0,2,600);    
        panel1.setBackground(new Color(124, 180, 107)); 
		f.add(panel1);
		JPanel panel2=new JPanel();  
        panel2.setBounds(435,0,2,600);    
        panel2.setBackground(new Color(124, 180, 107)); 
		f.add(panel2);
		JPanel panel3=new JPanel();  
        panel3.setBounds(450,190,290,1);    
        panel3.setBackground(new Color(124, 180, 107)); 
		f.add(panel3);
		JPanel panel4=new JPanel();  
        panel4.setBounds(15,50,195,2);    
        panel4.setBackground(new Color(124, 180, 107)); 
		f.add(panel4);
		
		
		ImageIcon gifIcon = new ImageIcon("E:\\java Project\\Image\\fbcb8200-470f-45dd-be88-61a4dd8009d5.png");
		Image img = gifIcon.getImage();
		Image temp_img = img.getScaledInstance(340,170,Image.SCALE_SMOOTH);
		gifIcon = new ImageIcon(temp_img);

		JLabel plane = new JLabel("", gifIcon , JLabel.CENTER);
		plane.setBounds(32,90,340,170);
		f.add(plane);
		Cursor cursor1 = new Cursor(Cursor.HAND_CURSOR);
		plane.setCursor(cursor1);
		plane.setLayout(null);
		
		
		ImageIcon gifIcon1 = new ImageIcon("E:\\java Project\\Image\\fbcb8200-470f-45dd-be88-61a4dd8009d5.png");
		Image img1 = gifIcon1.getImage();
		Image temp_img1 = img1.getScaledInstance(345,175,Image.SCALE_SMOOTH);
		gifIcon1 = new ImageIcon(temp_img1);

		JLabel plane6 = new JLabel("", gifIcon1 , JLabel.CENTER);
		plane6.setBounds(0,0,340,170);
		plane.add(plane6);
		plane6.setLayout(null);
		plane6.setVisible(false);
		
		
    plane.addMouseListener(new MouseListener(){
			
			public void mouseClicked(MouseEvent e) {  
				new Domestic();
				f.setVisible(false);
			}  
			public void mouseEntered(MouseEvent e) {  
				plane6.setVisible(true);
		        plane.setToolTipText("Domestic flights are inside Bangladesh");
			}  
			public void mouseExited(MouseEvent e) {  
				plane6.setVisible(false);
			}  
			public void mousePressed(MouseEvent e) {  
				
			}  
			public void mouseReleased(MouseEvent e) {  
				
			}
});

    ImageIcon gifIcon2 = new ImageIcon("E:\\java Project\\Image\\81aa66ad-0d4a-479c-b106-cbbd494a0d8e.png");
		Image img2 = gifIcon2.getImage();
		Image temp_img2 = img2.getScaledInstance(345,175,Image.SCALE_SMOOTH);
		gifIcon2 = new ImageIcon(temp_img2);

		JLabel plane2 = new JLabel("", gifIcon2 , JLabel.CENTER);
		plane2.setBounds(30,300,340,170);
		f.add(plane2);
		Cursor cursor2 = new Cursor(Cursor.HAND_CURSOR);
		plane2.setCursor(cursor2);
		plane2.setLayout(null);
		
		ImageIcon gifIcon3 = new ImageIcon("E:\\java Project\\Image\\81aa66ad-0d4a-479c-b106-cbbd494a0d8e.png");
		Image img3 = gifIcon3.getImage();
		Image temp_img3 = img3.getScaledInstance(350,180,Image.SCALE_SMOOTH);
		gifIcon3 = new ImageIcon(temp_img3);
		
		JLabel plane7 = new JLabel("", gifIcon3 , JLabel.CENTER);
		plane7.setBounds(0,0,350,180);
		plane2.add(plane7);
		plane7.setLayout(null);
		plane7.setVisible(false);
		
plane2.addMouseListener(new MouseListener(){
			
			public void mouseClicked(MouseEvent e) {  
				new International();
				f.setVisible(false);
			}  
			public void mouseEntered(MouseEvent e) {  
				plane7.setVisible(true);
		        plane2.setToolTipText("International flights are inside Bangladesh");
			}  
			public void mouseExited(MouseEvent e) {  
				plane7.setVisible(false);
			}  
			public void mousePressed(MouseEvent e) {  
				
			}  
			public void mouseReleased(MouseEvent e) {  
				
			}
});
		
    JLabel travel = label("Time TO ",15,15,150,40);
		travel.setFont(font1("Algerian",35));
		logoPanel.add(travel);
    travel.addMouseListener(new MouseListener(){
			
			public void mouseClicked(MouseEvent e) {  
				new Signup();
				f.setVisible(false);
			}  
			public void mouseEntered(MouseEvent e) { 
		        travel.setToolTipText("Home Page");
				Cursor cursor3 = new Cursor(Cursor.HAND_CURSOR);
				travel.setCursor(cursor3);
			}  
			public void mouseExited(MouseEvent e) {  
			
			}  
			public void mousePressed(MouseEvent e) {  
				
			}  
			public void mouseReleased(MouseEvent e) {  
				
			}
});
	    JLabel com = label("Travel",155,17,80,40);
			com.setFont(font1("Cambria Math",25));
			logoPanel.add(com);
		
		com.addMouseListener(new MouseListener(){	
			public void mouseClicked(MouseEvent e) {  
				new Signup();
				f.setVisible(false);
			}  
			public void mouseEntered(MouseEvent e) { 
		        com.setToolTipText("Home Page");
				Cursor cursor2 = new Cursor(Cursor.HAND_CURSOR);
				com.setCursor(cursor2);
				
			}  
			public void mouseExited(MouseEvent e) {  
			
			}  
			public void mousePressed(MouseEvent e) {  
				
			}  
			public void mouseReleased(MouseEvent e) {  
				
			}
});	

		
	    JLabel heading = label("Select Your Flight ",450,150,400,40);
		heading.setFont(font1("Arial Rounded MT Bold",25));
		f.add(heading);
		
	ImageIcon imgReturn = new ImageIcon("H:\\Java Project\\Image\\returnIcon.png");
		Image image1 = imgReturn.getImage();
		Image temp_image = image1.getScaledInstance(40,40,Image.SCALE_SMOOTH);
		imgReturn = new ImageIcon(temp_image);
		JLabel imgIcon = new JLabel("", imgReturn , JLabel.CENTER);
		imgIcon.setBounds(720,10,40,40);
		logoPanel.add(imgIcon);
		imgIcon.addMouseListener(new MouseListener(){
				
			
			public void mouseClicked(MouseEvent e) {
		        new Signup();
				f.setVisible(false);
			}  
			public void mouseEntered(MouseEvent e) {
				Cursor cursor1 = new Cursor(Cursor.HAND_CURSOR);
				imgIcon.setCursor(cursor1);
				imgIcon.setToolTipText("Click here to go previous page");
			}  
			public void mouseExited(MouseEvent e) {  
				
			}  
			public void mousePressed(MouseEvent e) {  
				
			}  
			public void mouseReleased(MouseEvent e) {  
				
			}
});	
		
		
		
	Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        
	JButton domesticButton = new JButton("Domestic");
		domesticButton.setBounds(450,240,300,40);
		domesticButton.setBackground(new Color(124, 180, 107));
		domesticButton.setCursor(cursor);
		domesticButton.setToolTipText("Domestic flights are inside Bangladesh");
		f.add(domesticButton);	
domesticButton.addMouseListener(new MouseListener(){
				
			
			public void mouseClicked(MouseEvent e) {  
				new Domestic();
				f.setVisible(false);
			}  
			public void mouseEntered(MouseEvent e) {
			}  
			public void mouseExited(MouseEvent e) {  
				
			}  
			public void mousePressed(MouseEvent e) {  
				
			}  
			public void mouseReleased(MouseEvent e) {  
				
			}
});		
		
		JButton intlButton = new JButton("Inernational");
		intlButton.setBounds(450,300,300,40);
		intlButton.setBackground(new Color(124, 180, 107));
		intlButton.setCursor(cursor);
		intlButton.setToolTipText("International flights are outside Bangladesh");
		f.add(intlButton);
	intlButton.addMouseListener(new MouseListener(){
			
			public void mouseClicked(MouseEvent e) {  
				new International();
				f.setVisible(false);
			}  
			public void mouseEntered(MouseEvent e) {
		        intlButton.setToolTipText("International flights are inside Bangladesh");
			}  
			public void mouseExited(MouseEvent e) {  
				plane7.setVisible(false);
			}  
			public void mousePressed(MouseEvent e) {  
				
			}  
			public void mouseReleased(MouseEvent e) {  
				
			}
});	
		
	f.getContentPane().setBackground(new Color(232, 235, 226));
	f.setLocationRelativeTo(null);
	f.setResizable(false);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setVisible(true);
	
	}
	public static void main(String [] args){
		
		new Selection();
		
	}
}