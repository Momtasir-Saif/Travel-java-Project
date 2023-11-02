import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class  International extends JFrame
{
	private String[]DAOptions={"Select Location","Bangladesh","India","Maldives","Nepal","Pakistan","Sri Lanka"};
	private String dates[]= {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", 
                              "26", "27", "28", "29", "30","31" };
    private String months[]
        = {"Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sep", "Oct", "Nov", "Dec" };
    private String years[]
        = {"2022","2023","2024","2025","2026","2027"};
	private String issueYears[]
        = {"2015","2016","2017","2018","2019","2020","2021","2022","2023"};	
	private String sClass[]={"Select Class"," ","1. Economy","2. Premium Economy","3. Business","4. First Class"};
	private String adult[]
        = {"Adult","0","1","2","3"};
	private String baby[]
        = {"Aged under 11","0","1","2","3","4"};	
		
	private String dep,arrival,dy,mon,yer,cls,adlt,child;	 //Travel
	
	protected JFrame f = new JFrame("Booking Page");
	
	JLabel label(String text, int x,int y, int w, int h)
		{
		JLabel l1 = new JLabel(text);
		l1.setBounds(x,y,w,h);
		return l1;
		}
	Font font1(String text, int fSize)
		{
			Font font = new Font(text, Font.BOLD, fSize);
			return font;
		}	
	JTextField tField(int uDis)
	    {
			
            JTextField tf = new JTextField(uDis); 
			tf.setBounds(315,uDis,280,40);
			return tf;
	    }
	private static int x=0;	
	
	International()
	{
		
		f.setSize(800,600);
		f.setLayout(null); 
		
		
		JLabel heading = label("International Flight",220,80,600,45);
		heading.setFont(font1("Arial Rounded MT Bold",35));
		f.add(heading);
		JPanel panel2=new JPanel();  
        panel2.setBounds(220,130,500,2);    
        panel2.setBackground(new Color(124, 180, 107)); 
		f.add(panel2);
		JPanel panel3=new JPanel();  
        panel3.setBounds(420,150,2,380);    
        panel3.setBackground(new Color(124, 180, 107)); 
		f.add(panel3);
		JPanel panel4=new JPanel();  
        panel4.setBounds(425,150,2,380);    
        panel4.setBackground(new Color(124, 180, 107)); 
		f.add(panel4);
		JPanel panel5=new JPanel();  
        panel5.setBounds(430,150,2,380);    
        panel5.setBackground(new Color(124, 180, 107)); 
		f.add(panel5);
		
		JLabel depAir = label("Select Departure",450,130,300,40);
		depAir.setFont(font1("SansSerif",18));
		f.add(depAir);
		
		JLabel destAir = label("Select Destination",450,190,300,40);
		destAir.setFont(font1("SansSerif",18));
		f.add(destAir);
		
		JLabel date = label("Date:",450,250,300,40);
		date.setFont(font1("SansSerif",18));
		f.add(date);
		
		JLabel seatClass = label("Select Class",450,315,300,40);
		seatClass.setFont(font1("SansSerif",18));
		f.add(seatClass);
		
		JLabel personNum = label("Number of Passenger/s ",450,375,300,40);
		personNum.setFont(font1("SansSerif",18));
		f.add(personNum);
						
		JComboBox depLocation= new JComboBox(DAOptions);
		depLocation.setBounds(450,165,280,30);
		depLocation.setToolTipText("Click here to choose starting airport");
		depLocation.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			 
			dep = (String)depLocation.getSelectedItem();
			System.out.println("Departure Airport: "+dep);
			}});
		depLocation.setEditable(true);
		f.add(depLocation);
		
		JComboBox selLocation= new JComboBox(DAOptions);
		selLocation.setBounds(450,225,280,30);
		selLocation.setToolTipText("Click here to choose destination airport");
		selLocation.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			 
				arrival = (String)selLocation.getSelectedItem();
				System.out.println("Arrival Airport: "+arrival);
			  
			
			}});
		selLocation.setEditable(true);
		f.add(selLocation);
		
		JComboBox setDate= new JComboBox(dates);
		setDate.setBounds(450,285,80,30);
		setDate.setToolTipText("Click here to add day");
		setDate.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			 
				dy = (String)setDate.getSelectedItem();
				System.out.println("Day: "+dy);
			  
			
			}});
		f.add(setDate);
		
		JComboBox setMonth= new JComboBox(months);
		setMonth.setBounds(540,285,80,30);
		setMonth.setToolTipText("Click here to add month");	
		setMonth.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			mon = (String)setMonth.getSelectedItem();
			System.out.println("Month: "+mon);	
		}});		
		f.add(setMonth);
		
		JComboBox setYear= new JComboBox(years);
		setYear.setBounds(630,285,100,30);
		setYear.setToolTipText("Click here to add year");	
		setYear.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			yer = (String)setYear.getSelectedItem();
			System.out.println("Year: "+yer);	
		}});	
		f.add(setYear);
		
		JComboBox setClass= new JComboBox(sClass);
		setClass.setBounds(450,350,280,30);
		setClass.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			cls = (String)setClass.getSelectedItem();
			System.out.println("Flight Class: "+cls);	
		}});
		f.add(setClass);
		
		JComboBox setAdultPas= new JComboBox(adult);
		setAdultPas.setBounds(450,415,135,30);
		setAdultPas.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			adlt = (String)setAdultPas.getSelectedItem();
			System.out.println("Adult Passenger/s: "+adlt);	
		}});
		f.add(setAdultPas);
		
		JComboBox setBabyPas= new JComboBox(baby);
		setBabyPas.setBounds(590,415,140,30);
		setBabyPas.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			child = (String)setBabyPas.getSelectedItem();
			System.out.println("Child Passenger/s: "+child);	
		}});
		f.add(setBabyPas);
		
		JButton submitButton = new JButton("Confirm");
		submitButton.setBounds(450,475,140,35);
		submitButton.setBackground(new Color(125, 186, 207));
	
		submitButton.addActionListener(new ActionListener(){

         public void actionPerformed(ActionEvent e){

             try{

                FileWriter fw = new FileWriter("InternationalSubmission.txt",true);
				fw.write("\n"+"International Flight Ticket"+"\n"+"Departure Airport: "+dep+"\n"+"Arrival Airport: "+arrival+"\n"+"Date: "+dy+"-"+mon+"-"+yer+"\n"+
				"Flight Class: "+cls+"\n"+"Adult Passenger/s: "+adlt+"\n"+"Child Passenger/s: "+child+"\n");
				
                fw.close();

             }catch(Exception e1){

             }
		JOptionPane.showMessageDialog(null,"Submission Confirmed");
         }

     });
		f.add(submitButton);
		
		Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        submitButton.setCursor(cursor);
		submitButton.setToolTipText("Click here to submit");
        submitButton.setVisible(true);
		
		JButton resetButton = new JButton("Reset");
		resetButton.setBounds(600,475,130,35);
		resetButton.setBackground(new Color(125, 186, 207));
		f.add(resetButton);
		
		Cursor resetCursor = new Cursor(Cursor.HAND_CURSOR);
        resetButton.setCursor(resetCursor);
		resetButton.setToolTipText("Click here to reset data");
        resetButton.setVisible(true);
	
		resetButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				depLocation.setSelectedIndex(0);
				selLocation.setSelectedIndex(0);
				setDate.setSelectedIndex(0);
				setMonth.setSelectedIndex(0);
				setYear.setSelectedIndex(0);
				setClass.setSelectedIndex(0);
				setAdultPas.setSelectedIndex(0);
				setBabyPas.setSelectedIndex(0);
			}				
			
			
		});
		
		JPanel logoPanel=new JPanel();
		logoPanel.setBounds(0,0,800,70);
		logoPanel.setBackground(new Color(124,180,107));
		logoPanel.setLayout(null);
		f.add(logoPanel);

		JLabel travel = label("Time to",15,15,150,40);
		travel.setFont(font1("Cambria Math",35));
		travel.setLayout(null);
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
		ImageIcon img = new ImageIcon("E:\\java Project\\Image\\Airline.png");
		Image image1 = img.getImage();
		Image temp_image = image1.getScaledInstance(40,40,Image.SCALE_SMOOTH);
		img = new ImageIcon(temp_image);
		JLabel imgIcon = new JLabel("", img , JLabel.CENTER);
		imgIcon.setBounds(720,10,40,40);
		logoPanel.add(imgIcon);
		imgIcon.addMouseListener(new MouseListener(){
				
			
			public void mouseClicked(MouseEvent e) {
		        new Selection();
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

    JButton PassportNumButton = new JButton("Click To Add Passport Information");
		PassportNumButton.setBounds(100,220,260,40);
		PassportNumButton.setBackground(new Color(124, 180, 107));
		f.add(PassportNumButton);

   
		
		
		
		f.getContentPane().setBackground(new Color(232, 235, 226));
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
			
	}
	public static void main(String [] args){
		
		new International();
		
	}
	
	
	
}