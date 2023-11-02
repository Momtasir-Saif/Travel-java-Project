import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class  Domestic extends JFrame
{
	private String[]DAOptions={"Select Location","Shahjalal International Airport","Shah Amanat International Airport",
"Osmani International Airport","Cox's Bazar International Airport","Jashore Airport","Shah Makhdum Airport",
"Saidpur Airport","Abdus Sattar Khalifa Airport, Laksam"};
	private String dates[]= {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", 
                              "26", "27", "28", "29", "30","31" };
    private String months[]
        = {"Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sep", "Oct", "Nov", "Dec" };
    private String years[]
        = {"2023"};
	private String sClass[]={"Select Class"," ","1. Economy","2. Premium Economy","3. Business","4. First Class"};
	private String adult[]
        = {"Adult","0","1","2","3"};
	private String baby[]
        = {"Aged under 11","0","1","2","3","4"};
		
	private String dep,arrival,dy,mon,yer,cls,adlt,child,nidNam,nidNumber;	
	
	protected JFrame f = new JFrame("Booking Page");
	
	
	private static int x=0;
	
	JLabel label(String text, int x,int y, int w, int h)
		{
		JLabel l1 = new JLabel(text);
		l1.setBounds(x,y,w,h);
		return l1;
		} // Travel
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
		
	
	Domestic()
	{
		
		f.setSize(800,600);
		f.setLayout(null); 
		
		JPanel panel1=new JPanel();  
        panel1.setBounds(0,0,800,70);    
        panel1.setBackground(new Color(124, 180, 107));
		panel1.setLayout(null);
		f.add(panel1);

		JLabel travel = label("Time to",15,15,150,40);
		travel.setFont(font1("Cambria Math",35));
		panel1.add(travel);
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
		panel1.add(com);
		
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
		panel1.add(imgIcon);
		imgIcon.addMouseListener(new MouseListener(){
				
			
			public void mouseClicked(MouseEvent e) {
		        new Selection();
				f.setVisible(false);
			}  
			public void mouseEntered(MouseEvent e) {
				Cursor cursor1 = new Cursor(Cursor.HAND_CURSOR);
				imgIcon.setCursor(cursor1);
				imgIcon.setToolTipText("Click here to go selection page");
			}  
			public void mouseExited(MouseEvent e) {  
				
			}  
			public void mousePressed(MouseEvent e) {  
				
			}  
			public void mouseReleased(MouseEvent e) {  
				
			}
});
		

		JLabel heading = label("Book a Domestic Flight",220,80,600,45);
		heading.setFont(font1("Arial Rounded MT Bold",35));
		f.add(heading);
		
		JLabel nid1 = label("submit NID informations",100,180,600,45);
		nid1.setFont(font1("Cambria Math",20));
		f.add(nid1);
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
		
		JLabel depAir = label("Select Departure:",450,140,300,40);
		depAir.setFont(font1("Cambria Math",18));
		f.add(depAir);
		
		
		JLabel destAir = label("Select Destination:",450,205,300,40);
		destAir.setFont(font1("Cambria Math",18));
		f.add(destAir);
		
		
		
		JLabel date = label("Date:",450,265,300,40);
		date.setFont(font1("Cambria Math",18));
		f.add(date);
		
		JLabel seatClass = label("Select Class",450,330,300,40);
		seatClass.setFont(font1("Cambria Math",18));
		f.add(seatClass);
		
		JLabel personNum = label("Number of Passenger/s: ",450,390,300,40);
		personNum.setFont(font1("Cambria Math",18));
		f.add(personNum);
		                
		JComboBox depLocation= new JComboBox(DAOptions);
		depLocation.setBounds(450,175,280,30);
		depLocation.setToolTipText("Click here to choose starting airport");
		depLocation.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			 
			dep = (String)depLocation.getSelectedItem();
			System.out.println("Departure Airport: "+dep);
			
		}});
		depLocation.setEditable(true);
		f.add(depLocation);
		
		JComboBox selLocation= new JComboBox(DAOptions);
		selLocation.setBounds(450,235,280,30);
		selLocation.setToolTipText("Click here to choose destination airport");
		selLocation.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			arrival = (String)selLocation.getSelectedItem();
			System.out.println("Arrival Airport: "+arrival);
		}});
		
		selLocation.setEditable(true);
		f.add(selLocation);
		
		JComboBox setDate= new JComboBox(dates);
		setDate.setBounds(450,295,80,30);
		setDate.setToolTipText("Click here to add day");
		setDate.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			 
				dy = (String)setDate.getSelectedItem();
				System.out.println("Day: "+dy);
			  
			
			}});
		f.add(setDate);
		
		JComboBox setMonth= new JComboBox(months);
		setMonth.setBounds(540,295,80,30);
		setMonth.setToolTipText("Click here to add month");	
        setMonth.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			mon = (String)setMonth.getSelectedItem();
			System.out.println("Month: "+mon);	
		}});		
		f.add(setMonth);
		
		JComboBox setYear= new JComboBox(years);
		setYear.setBounds(630,295,100,30);
		setYear.setToolTipText("Click here to add year");
		setYear.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			yer = (String)setYear.getSelectedItem();
			System.out.println("Year: "+yer);	
		}});	
		f.add(setYear);
		
		JComboBox setClass= new JComboBox(sClass);
		setClass.setBounds(450,365,280,30);
		setClass.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			cls = (String)setClass.getSelectedItem();
			System.out.println("Flight Class: "+cls);	
		}});
		f.add(setClass);
		
		JComboBox setAdultPas= new JComboBox(adult);
		setAdultPas.setBounds(450,425,135,30);
		setAdultPas.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			adlt = (String)setAdultPas.getSelectedItem();
			System.out.println("Adult Passenger/s: "+adlt);	
		}});
		f.add(setAdultPas);
		
		JComboBox setBabyPas= new JComboBox(baby);
		setBabyPas.setBounds(590,425,140,30);
		setBabyPas.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			child = (String)setBabyPas.getSelectedItem();
			System.out.println("Child Passenger/s: "+child);	
		}});
		f.add(setBabyPas);
		
		JButton submitButton = new JButton("Confirm Options");
		submitButton.setBounds(450,490,135,35);
		submitButton.setBackground(new Color(125, 186, 207));
		f.add(submitButton);
		
		JButton nidNumButton = new JButton("NID Information");
		nidNumButton.setBounds(120,220,190,30);
		nidNumButton.setBackground(new Color(125, 186, 207));
		
		f.add(nidNumButton);
		
		
		
		JPanel NIDpanel=new JPanel();  
        NIDpanel.setBounds(30,260,360,200);    
        NIDpanel.setBackground(new Color(124, 180, 107)); 
		NIDpanel.setVisible(false);
		NIDpanel.setLayout(null);
		f.add(NIDpanel);
		
	
		
		JLabel nidName = label("NID Name :",30,20,150,30);
		nidName.setFont(font1("Cambria Math",14));
		NIDpanel.add(nidName);
		
		JLabel nidNum = label("NID Number :",30,80,150,30);
		nidNum.setFont(font1("Cambria Math",14));
		NIDpanel.add(nidNum);
		
		JTextField nameTF = new JTextField();
		nameTF.setBounds(30,40,200,30);
		NIDpanel.add(nameTF);
		nameTF.setLayout(null);
		nameTF.setOpaque(false);
		nameTF.setForeground(new Color(0x292929));
		nameTF.setBorder(BorderFactory.createMatteBorder(0,0,1,0, new Color(10,10,10)));
		
		
		JTextField numberTF = new JTextField();
		numberTF.setBounds(30,100,200,30);
		numberTF.setLayout(null);
		numberTF.setOpaque(false);
		numberTF.setForeground(new Color(0x292929));
		numberTF.setBorder(BorderFactory.createMatteBorder(0,0,1,0, new Color(10,10,10)));
		NIDpanel.add(numberTF);
		    nidNumButton.addMouseListener(new MouseListener(){
				
			
			public void mouseClicked(MouseEvent e) {  
				if(x%2==0){
				NIDpanel.setVisible(true);
		        nidNumButton.setToolTipText("Domestic flights are inside Bangladesh");
				}
				else{
				NIDpanel.setVisible(false);
		        nidNumButton.setToolTipText("Domestic flights are inside Bangladesh");
				}	
			x=x+1;		
			}  
			public void mouseEntered(MouseEvent e) {
				Cursor cursor1 = new Cursor(Cursor.HAND_CURSOR);
				nidNumButton.setCursor(cursor1);
				nidNumButton.setToolTipText("Click here to enter NID info");
			}  
			public void mouseExited(MouseEvent e) {  
				
			}  
			public void mousePressed(MouseEvent e) {  
				
			}  
			public void mouseReleased(MouseEvent e) {  
				
			}
});

		Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        submitButton.setCursor(cursor);
		submitButton.setToolTipText("Click here to submit");
        submitButton.setVisible(true);
	
	   
		
		f.getContentPane().setBackground(new Color(171, 214, 223));
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		submitButton.addActionListener(new ActionListener(){

        public void actionPerformed(ActionEvent e){
	
		
            try{

                FileWriter fw = new FileWriter("InternationalSubmission.txt",true);
				fw.write("\n"+"Domestic Flight Ticket"+"\n"+"Departure Airport: "+dep+"\n"+"Arrival Airport: "+arrival+"\n"+"Date: "+dy+"-"+mon+"-"+yer+"\n"+
				"Flight Class: "+cls+"\n"+"Adult Passenger/s: "+adlt+"\n"+"Child Passenger/s: "+child+"\n");
            
			   fw.close();
				

			
            }catch(Exception e1){

            }
		JOptionPane.showMessageDialog(null,"Confirmed");

         }

     });
		
	JButton resetButton = new JButton("Reset");
		resetButton.setBounds(600,490,130,35);
		resetButton.setBackground(new Color(125, 186, 207));
		f.add(resetButton);
		
		Cursor resetCursor = new Cursor(Cursor.HAND_CURSOR);
        resetButton.setCursor(resetCursor);
		resetButton.setToolTipText("Click here to reset ");
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
	}
	public static void main(String [] args){
		
		new Domestic();
		
	}
	
	
	
}