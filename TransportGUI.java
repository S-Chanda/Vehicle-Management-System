
/**
This is a new class in the project called TransportGUI. The class contains GUI of choose frame, Auto Rickshaw, and
Electric Scooter. The GUI contains the information related to the respective vehicles and buttons such as add, book,
purchase, sell, display, clear, exit, etc. The class also contains ActionPerformed methos which adds functionality to 
the buttons presented in the GUI. 
Author: Chanda Shah
Date: 5th August, 2022
*/

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TransportGUI implements ActionListener
{
    private JFrame frame,frame1,frame2;
    private JMenu menu,menu1,menu2;
    private JMenuItem a1,a2,a3,b1,b2,b3,c1,c2,c3;
    private JMenuBar m1;
    private JPanel panel,panel1,panel2,panel3,panel4,panel5;
    private Font big,big1,big2;
    private Font small,small1,small2;
    private JLabel title,title1;
    private JButton auto,scooty,add1,clear1,book1,clear2,display,exit1,addEC,clear3,exit2,buy,clear4,sell,display2;
    private JLabel id,name,weight,color,speed,displacement,fuel,torque,gc,bk,id1,date,charge,seat,id2,name2,weight2,
    color2,speed2,battery,title3,id3,brand,price,time,mileage,range,title4,id4,price2;
    private JTextField v_ID,name_,weight_,color_,speed_,displacement_,fuel_,torque_,gc_,v_ID1,charge_,seat_,v_ID2,
    name2_,weight2_,color2_,speed2_,battery_,v_ID3,brand_,price_,time_,mileage_,range_,v_ID4,price2_;
    private JComboBox js1,js2,js3;  
    
    ArrayList<Vehicle> arr = new ArrayList<Vehicle>();
    
    //method to choose vehicle
    //This method for the user to choose the required frame either Auto Rickshaw or Electric Scooter onclick. 
    //The GUI contains title, Auto Rickshaw and Electric Scooter buttons that lands to respective page onclick. 
    public void choose()
    {
        //for Frame
        frame = new JFrame();
        frame.setLayout(null);
        frame.setBounds(250,150,600,280);
        frame.setTitle(" Trasport GUI" );
        
        //Creating menubar to ease the us eof the program
        m1 = new JMenuBar();
        
        menu =new JMenu(" File" );
        a1 = new JMenuItem("New");
        menu.add(a1);
        a2 = new JMenuItem("Open");
        menu.add(a2);
        a3 = new JMenuItem("Save");
        menu.add(a3);
        m1.add(menu);
        
        menu1 =new JMenu(" Tools" );
        b1 = new JMenuItem("Font");
        menu1.add(b1);
        b2 = new JMenuItem("Maximize" );
        menu1.add(b2);
        b3 = new JMenuItem("Minimize");
        menu1.add(b3);
        m1.add(menu1);
        
        menu2 =new JMenu(" Menu" );
        c1 = new JMenuItem("Edit");
        menu2.add(c1);
        c2 = new JMenuItem("Clear");
        menu2.add(c2);
        c3 = new JMenuItem("Help");
        menu2.add(c3);
        m1.add(menu2);
        frame.setJMenuBar(m1);
        
        //for Panel
        panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(null);
        panel.setBounds(0,0,600,280);
        
        //for Font
        big = new Font(" Times New Roman", Font.BOLD,35 );
        small = new Font(" Times New Roman", Font.BOLD,17);
        
        //Title
        title = new JLabel(" Choose Vehicle" );
        title.setBounds(160,35,300,40);
        title.setFont(big);
        panel.add(title);
        
        //Auto-Rickshaw
        auto= new JButton("Auto-Rickshaw" );
        auto.setBounds(95,140,180,50);
        auto.addActionListener(this);
        auto.setFont(small);
        auto.setFocusable(false);
        panel.add(auto);
        
        //Electric Scooter
        scooty= new JButton("Electric Scooter" );
        scooty.setBounds(340,140,180,50);
        scooty.addActionListener(this);
        scooty.setFont(small);
        scooty.setFocusable(false);
        panel.add(scooty);
        
        frame.add(panel);
        frame.setVisible(true);
        frame.setResizable(true);
    }
    
    
    //This method contents the components of GUI of the class Auto Rickshaw. The methods gives user-friendly interface
    //to carryout their task. The component in the GUI includes Vehicle id, name, weight, color, speed, engine
    //displacecement, torque, fuel tank capacity, ground clearance, charge amount, booked date, number of seats, 
    //buttons such as clear button, display button, add button and book button. 
    public void auto()
    {
        //for Frame
        frame1 = new JFrame();
        frame1.setLayout(null);
        frame1.setBounds(100,5,1080,670);
        frame1.setTitle(" Add Auto" );
        
        //for Font
        Font big1 = new Font(" Times New Roman", Font.BOLD,35 );
        Font small1 = new Font(" Times New Roman", Font.PLAIN,20);
        
        //for firstPanel
        //This panel contains the components of add Auto Rickshaw which includes Vehicle ID, color, weight, name, 
        //speed, engine displacement, torque, fuel tank capacity and ground clearance. 
        panel1 = new JPanel();
        panel1.setBackground(new Color(0xD8E3DD));
        panel1.setLayout(null);
        panel1.setBounds(35,10,1000,360);
        
        //Title
        title1 = new JLabel(" Add Auto " );
        title1.setBounds(400,20,200,40);
        title1.setFont(big1);
        panel1.add(title1);
        
        //ID
        id= new JLabel("Vehicle ID:" );
        id.setBounds(50,85,200,30);
        id.setFont(small1);
        panel1.add(id);
        
        v_ID = new JTextField();
        v_ID.setBounds(230,85,200,35);
        v_ID.setFont(small1);
        panel1.add(v_ID);
        
        //name
        name = new JLabel("Vehicle Name:" );
        name.setBounds(500,85,200,30);
        name.setFont(small1);
        panel1.add(name);
        
        name_ = new JTextField();
        name_.setBounds(710,85,200,35);
        name_.setFont(small1);
        panel1.add(name_);
        
        //weight
        weight = new JLabel("Vehicle Weight:" );
        weight.setBounds(50,130,200,30);
        weight.setFont(small1);
        panel1.add(weight);
        
        weight_ = new JTextField();
        weight_.setBounds(230,130,200,35);
        weight_.setFont(small1);
        panel1.add(weight_);
        
        //color
        color = new JLabel("Vehicle Color:" );
        color.setBounds(500,130,200,30);
        color.setFont(small1);
        panel1.add(color);
        
        color_ = new JTextField();
        color_.setBounds(710,130,200,35);
        color_.setFont(small1);
        panel1.add(color_);
        
        //speed
        speed = new JLabel("Vehicle Speed:" );
        speed.setBounds(50,175,200,30);
        speed.setFont(small1);
        panel1.add(speed);
        
        speed_ = new JTextField();
        speed_.setBounds(230,175,200,35);
        speed_.setFont(small1);
        panel1.add(speed_);
        
        //engine displacement
        displacement = new JLabel("Engine Displacement:" );
        displacement.setBounds(500,175,200,30);
        displacement.setFont(small1);
        panel1.add(displacement);
        
        displacement_ = new JTextField();
        displacement_.setBounds(710,175,200,35);
        displacement_.setFont(small1);
        panel1.add(displacement_);
        
        //torque
        torque = new JLabel("Torque:" );
        torque.setBounds(50,220,200,30);
        torque.setFont(small1);
        panel1.add(torque);
        
        torque_ = new JTextField();
        torque_.setBounds(230,220,200,35);
        torque_.setFont(small1);
        panel1.add(torque_);
        
        //fuel 
        fuel = new JLabel("Fuel Tank Capacity:" );
        fuel.setBounds(500,220,200,30);
        fuel.setFont(small1);
        panel1.add(fuel);
        
        fuel_ = new JTextField();
        fuel_.setBounds(710,220,200,35);
        fuel_.setFont(small1);
        panel1.add(fuel_);
        
        //ground clearance
        gc = new JLabel("Ground Clearance:" );
        gc.setBounds(50,265,200,30);
        gc.setFont(small1);
        panel1.add(gc);
        
        gc_ = new JTextField();
        gc_.setBounds(230,265,200,35);
        gc_.setFont(small1);
        panel1.add(gc_);
    
        //Add Button
        add1= new JButton("Add " );
        add1.setBounds(150,310,200,40);
        add1.addActionListener(this);
        add1.setFont(new Font(" Times New Roman", Font.BOLD,25));
        add1.setFocusable(false);
        panel1.add(add1);
        
        //Clear
        clear1= new JButton("Clear" );
        clear1.setBounds(425,310,200,40);
        clear1.addActionListener(this);
        clear1.setFont(small1);
        clear1.setFocusable(false);
        clear1.setFont(new Font(" Times New Roman", Font.BOLD,20));
        clear1.setForeground(new Color(0xE73D0B));
        panel1.add(clear1);
        
        //Exit Button
        exit1= new JButton("Exit" );
        exit1.setBounds(710,310,200,40);
        exit1.addActionListener(this);
        exit1.setFocusable(false);
        exit1.setFont(small1);
        panel1.add(exit1);
        
        
        
        //for secondPanel
        //This panel contains the components of book Auto Rickshaw which includes Vehicle ID, Booked Date, charge 
        //amount and number of seats.
        panel2 = new JPanel();
        panel2.setBackground(new Color(0xDEE3D8));
        panel2.setLayout(null);
        panel2.setBounds(35,380,1000,240);
        
        //Book 
        bk = new JLabel("Book Auto" );
        bk.setBounds(380,20,200,40);
        bk.setFont(big1);
        panel2.add(bk);
        
        //ID
        id1 = new JLabel("Vehicle ID:" );
        id1.setBounds(50,85,150,30);
        id1.setFont(small1);
        panel2.add(id1);
        
        v_ID1 = new JTextField();
        v_ID1.setBounds(210,85,200,35);
        v_ID1.setFont(small1);
        panel2.add(v_ID1);
        
        //Booked Date
        date = new JLabel("Booked Date:" );
        date.setBounds(490,85,150,30);
        date.setFont(small1);
        panel2.add(date);
        
        String[]xx = {" YY" , " 2022" , " 2021","2020", "2019", " 2018" ," 2017","2015" };
        js1 = new JComboBox(xx);
        js1.setBounds(660,85,55,30);
        panel2.add(js1);
        
        String[]yy = {" MM"," Jan" , " Feb" , " Mar","Apr","May","Jun","July","Aug"};
        js2 = new JComboBox(yy);
        js2.setBounds(735,85,50,30);
        panel2.add(js2);
        
        String[]zz = {"DD", " 1" , " 2" , " 3", "4","5","6","7","8","9","10","11","12"};
        js3 = new JComboBox(zz);
        js3.setBounds(810,85,50,30);
        panel2.add(js3);
        
        //Charge Amount
        charge = new JLabel("Charge Amount:" );
        charge.setBounds(50,130,150,30);
        charge.setFont(small1);
        panel2.add(charge);
        
        charge_ = new JTextField();
        charge_.setBounds(210,130,200,35);
        charge_.setFont(small1);
        panel2.add(charge_);
        
        //No.ofSeats
        seat = new JLabel("No. of Seats:" );
        seat.setBounds(490,130,150,30);
        seat.setFont(small1);
        panel2.add(seat);
        
        seat_ = new JTextField();
        seat_.setBounds(660,130,200,35);
        seat_.setFont(small1);
        panel2.add(seat_);
        
        //Book button
        book1= new JButton("Book" );
        book1.setBounds(150,185,200,40);
        book1.addActionListener(this);
        book1.setFont(new Font(" Times New Roman", Font.BOLD,25));
        book1.setFocusable(false);
        panel2.add(book1);
        
        //Clear
        clear2= new JButton("Clear" );
        clear2.setBounds(410,185,200,40);
        clear2.addActionListener(this);
        clear2.setFocusable(false);
        clear2.setFont(new Font(" Times New Roman", Font.BOLD,20));
        clear2.setForeground(new Color(0xE73D0B));
        panel2.add(clear2);

        //Display button
        display= new JButton("Display" );
        display.setBounds(710,185,200,40);
        display.addActionListener(this);
        display.setFocusable(false);
        display.setFont(new Font(" Times New Roman", Font.BOLD,25));
        panel2.add(display);
        
        frame1.add(panel1);
        frame1.add(panel2);
        frame1.setVisible(true);
        frame1.setResizable(true);
    }
    
    
    //This method contents the components of GUI of the class Electric Scooter.a  battr The methods gives
    //user-friendly interface to carryout their task. The component in the GUI includes Vehicle id, name, weight,
    //color, speed, battery capacity, brand, price, charging time, mileage, range, buttons such as exit, add, clear,
    //buy and sell. 
    public void scooty()
    {
        //for Frame
        frame2 = new JFrame();
        frame2.setLayout(null);
        frame2.setBounds(100,5,1080,670);
        frame2.setTitle(" Electric Scooter" );
        
        //for Font
        Font big2 = new Font(" Times New Roman", Font.BOLD,35 );
        Font small2 = new Font(" Times New Roman", Font.PLAIN,20);
        
        //for Add Panel
        panel3 = new JPanel();
        panel3.setBackground(new Color(0xD8E3DD));
        panel3.setLayout(null);
        panel3.setBounds(35,10,1000,300);
        
        //Title
        title1 = new JLabel(" Add Scooty " );
        title1.setBounds(400,20,250,40);
        title1.setFont(big2);
        panel3.add(title1);
        
        //ID
        id2= new JLabel("Vehicle ID:" );
        id2.setBounds(50,85,150,30);
        id2.setFont(small2);
        panel3.add(id2);
        
        v_ID2 = new JTextField();
        v_ID2.setBounds(210,85,200,35);
        v_ID2.setFont(small2);
        panel3.add(v_ID2);
        
        //name
        name2 = new JLabel("Vehicle Name:" );
        name2.setBounds(480,85,150,30);
        name2.setFont(small2);
        panel3.add(name2);
        
        name2_ = new JTextField();
        name2_.setBounds(670,85,200,35);
        name2_.setFont(small2);
        panel3.add(name2_);
        
        //weight
        weight2 = new JLabel("Vehicle Weight:" );
        weight2.setBounds(50,130,150,30);
        weight2.setFont(small2);
        panel3.add(weight2);
        
        weight2_ = new JTextField();
        weight2_.setBounds(210,130,200,35);
        weight2_.setFont(small2);
        panel3.add(weight2_);
        
        //color
        color2 = new JLabel("Vehicle Color:" );
        color2.setBounds(480,130,150,30);
        color2.setFont(small2);
        panel3.add(color2);
        
        color2_ = new JTextField();
        color2_.setBounds(670,130,200,35);
        color2_.setFont(small2);
        panel3.add(color2_);
        
        //speed
        speed2 = new JLabel("Vehicle Speed:" );
        speed2.setBounds(50,175,150,30);
        speed2.setFont(small2);
        panel3.add(speed2);
        
        speed2_ = new JTextField();
        speed2_.setBounds(210,175,200,35);
        speed2_.setFont(small2);
        panel3.add(speed2_);
        
        //battery capacity
        battery = new JLabel("Battery Capacity:" );
        battery.setBounds(480,175,150,30);
        battery.setFont(small2);
        panel3.add(battery);
        
        battery_ = new JTextField();
        battery_.setBounds(670,175,200,35);
        battery_.setFont(small2);
        panel3.add(battery_);
        
        //Add Button
        addEC = new JButton(" Add " );
        addEC.setBounds(130,240,200,40);
        addEC.addActionListener(this);
        addEC.setFocusable(false);
        addEC.setFont(new Font(" Times New Roman", Font.BOLD,25));
        panel3.add(addEC);
        
        //Clear
        clear3= new JButton("Clear" );
        clear3.setBounds(410,240,200,40);
        clear3.addActionListener(this);
        clear3.setFocusable(false);
        clear3.setFont(new Font(" Times New Roman", Font.BOLD,20));
        clear3.setForeground(new Color(0xE73D0B));
        panel3.add(clear3);
        
        //Exit Button
        exit2= new JButton("Exit" );
        exit2.setBounds(710,240,200,40);
        exit2.addActionListener(this);
        exit2.setFocusable(false);
        exit2.setFont(small2);
        panel3.add(exit2);
        
        //for Purchase Panel
        panel4 = new JPanel();
        panel4.setBackground(new Color(0xD8E3DD));
        panel4.setLayout(null);
        panel4.setBounds(35,330,740,300);
        
        //Title
        title3 = new JLabel(" Purchase Scooty " );
        title3.setBounds(230,20,330,40);
        title3.setFont(big2);
        panel4.add(title3);
        
        //ID
        id3= new JLabel("Vehicle ID:" );
        id3.setBounds(30,85,95,30);
        id3.setFont(small2);
        panel4.add(id3);
        
        v_ID3 = new JTextField();
        v_ID3.setBounds(150,85,180,35);
        v_ID3.setFont(small2);
        panel4.add(v_ID3);
        
        //brand
        brand = new JLabel("Brand:" );
        brand.setBounds(370,85,150,30);
        brand.setFont(small2);
        panel4.add(brand);
        
        brand_ = new JTextField();
        brand_.setBounds(530,85,180,35);
        brand_.setFont(small2);
        panel4.add(brand_);
        
        //price
        price = new JLabel("Price:" );
        price.setBounds(30,130,90,30);
        price.setFont(small2);
        panel4.add(price);
        
        price_ = new JTextField();
        price_.setBounds(150,130,180,35);
        price_.setFont(small2);
        panel4.add(price_);
        
        //charging time
        time = new JLabel("Charging Time:" );
        time.setBounds(370,130,150,30);
        time.setFont(small2);
        panel4.add(time);
        
        time_ = new JTextField();
        time_.setBounds(530,130,180,35);
        time_.setFont(small2);
        panel4.add(time_);
        
        
        //mileage
        mileage = new JLabel("Mileage:" );
        mileage.setBounds(30,175,90,30);
        mileage.setFont(small2);
        panel4.add(mileage);
        
        mileage_ = new JTextField();
        mileage_.setBounds(150,175,180,35);
        mileage_.setFont(small2);
        panel4.add(mileage_);
        
        
        //range
        range = new JLabel("Range:" );
        range.setBounds(370,175,150,30);
        range.setFont(small2);
        panel4.add(range);
        
        range_ = new JTextField();
        range_.setBounds(530,175,180,35);
        range_.setFont(small2);
        panel4.add(range_);
        
        
        
        //Purchase Button
        buy = new JButton(" Purchase " );
        buy.setBounds(130,240,200,40);
        buy.addActionListener(this);
        buy.setFont(small2);
        buy.setFocusable(false);
        buy.setFont(new Font(" Times New Roman", Font.BOLD,25));
        panel4.add(buy);
        
        //Clear Button
        clear4= new JButton("Clear" );
        clear4.setBounds(410,240,200,40);
        clear4.addActionListener(this);
        clear4.setFont(small2);
        clear4.setFocusable(false);
        clear4.setFont(new Font(" Times New Roman", Font.BOLD,20));
        clear4.setForeground(new Color(0xE73D0B));
        panel4.add(clear4);
        
        
        //for Sell panel
        panel5 = new JPanel();
        panel5.setBackground(new Color(0xD8E3DD));
        panel5.setLayout(null);
        panel5.setBounds(780,330,255,300);
        
        
        //Title
        title4 = new JLabel(" Sell " );
        title4.setBounds(90,20,120,40);
        title4.setFont(big2);
        panel5.add(title4);
        
        //ID
        id4= new JLabel("Vehicle ID:" );
        id4.setBounds(20,85,100,30);
        id4.setFont(small2);
        panel5.add(id4);
        
        v_ID4 = new JTextField();
        v_ID4.setBounds(140,85,100,35);
        v_ID4.setFont(small2);
        panel5.add(v_ID4);
        
        //Price
        price2= new JLabel("Price:" );
        price2.setBounds(20,130,100,30);
        price2.setFont(small2);
        panel5.add(price2);
        
        price2_ = new JTextField();
        price2_.setBounds(140,130,100,35);
        price2_.setFont(small2);
        panel5.add(price2_);
        
        //Sell Button
        sell = new JButton(" Sell " );
        sell.setBounds(50,190,170,40);
        sell.addActionListener(this);
        sell.setFocusable(false);
        sell.setFont(new Font(" Times New Roman", Font.BOLD,25));
        panel5.add(sell);
        
        //Display Button
        display2 = new JButton(" Display " );
        display2.setBounds(50,250,170,40);
        display2.addActionListener(this);
        display2.setFocusable(false);
        display2.setFont(new Font(" Times New Roman", Font.BOLD,25));
        panel5.add(display2);
        
        frame2.add(panel3);
        frame2.add(panel4);
        frame2.add(panel5);
        frame2.setVisible(true);
        frame2.setResizable(true);
        

     }
    
    //This method is very important for the program to run efficiently as it handles the functionality of the 
    //buttons and textfields. The method is to add the information of Auto Rickshaw and Electric Scooter, book the 
    //auto rickshaw, purchase and sell auto electric scooter.  
    public void actionPerformed(ActionEvent e)
    {
        //This method is used to add functionality to Auto Rickshaw button from choose panel. When the button is 
        //pressed the GUI of Auto Rickshaw is opened. 
        if(e.getSource()==auto)
        {
            TransportGUI obj = new TransportGUI();
            obj.auto();
        }
        
        
        //This method is used to add functionality to Electric Scooter button from choose panel. When the button is
        //pressed the GUI of Electric Scooter is opened.
        if(e.getSource()==scooty)
        {
            TransportGUI obj = new TransportGUI();
            obj.scooty();
        }
    
        
        //This method is used to add functionality to add button of add auto panel. When the button is pressed the
        //information about auto rickshaw such as vehicle id, name, weight, color, speed, engine displacement and 
        //torque are used to create a new object of type Auto Rickshaw which is added to an array list of Vehicle 
        //class. And when an empty field or invalid field is entered, it shows an error in error message box. Also, 
        //the method used try-catch concept to handle number formatexception. 
        if(e.getSource() == add1)
        {
            try
            {
                String nn=v_ID.getText();
                int v_ID2 = Integer.parseInt(nn);
                String mm=name_.getText();
                String aa=weight_.getText();
                String bb=color_.getText();
                String cc=speed_.getText();
                String dd=displacement_.getText();
                int dd2 = Integer.parseInt(dd);
                String ee=torque_.getText();
                String ff=fuel_.getText();
                int ff2 = Integer.parseInt(ff);
                String gg=gc_.getText();
                boolean check = true;
                      
                for(Vehicle obj :arr)
                {
                    
                    if (obj.getvehicle_ID()== v_ID2)
                    {
                        check=false;
                        if(check==false)
                        {
                            JOptionPane.showMessageDialog(null," Vehicle ID: " +v_ID2+ "  is already registered" +
                            " ERROR" +JOptionPane.ERROR_MESSAGE);
                        }
                   }
                }
                if(check==true)
                {
                    Auto_Rickshaw new_obj = new Auto_Rickshaw(v_ID2,mm,aa,bb,cc,dd2,ee,ff2,gg);
                    arr.add(new_obj);
                    JOptionPane.showMessageDialog(null," Successfully Added" );
                }

            }
            catch(NumberFormatException ef)
            {
                //message box
                JOptionPane msg1 = new JOptionPane();
                msg1.showMessageDialog(null," Enter required field in integer" );
            }        
        }
        
        
        
        //This method is used to add functionality to clear button from auto rickshaw panel. When the button is
        //pressed, the values from text fields are cleared.   
        if(e.getSource() == clear1)
        {
            v_ID.setText("");
            name_.setText("");
            weight_.setText("");
            color_.setText("");
            speed_.setText("");
            displacement_.setText("");
            torque_.setText("");
            fuel_.setText("");
            gc_.setText("");
        }
       
       
        //This method is used to add functionality to exit button from auto rickshaw panel. When the exit button is
        //clicked the program terminates.  */
        if(e.getSource()==exit1)
        {
            System.exit(0);
        }
        
        
        
        /*This method is used to add functionality to book button of book auto panel. The Vehicle ID, booked date,
         * charge amount, and the number of seats is entered in the GUI. When the valid Vehicle ID is entered in the
         * text box along with the booked date, charge amount, and number of seats display the information dialog. 
         * When the book button is pressed, the input value of Vehicle ID is compared to the existing Vehicle ID, and
         * if a valid Vehicle id has been entered, it is used to book the appropriate Auto Rickshaw from the list. 
         * The method to book the Auto Rickshaw from the Auto Rickshaw class is called. */
        if(e.getSource()==book1)
        {
            try
            {
                int vID = Integer.parseInt(v_ID1.getText());
                String yy=(String)js1.getSelectedItem();
                String mm=(String)js2.getSelectedItem();
                String dd=(String)js3.getSelectedItem();
                String bdate = yy+mm+dd;
                int charge = Integer.parseInt(charge_.getText());
                int seat = Integer.parseInt(seat_.getText());
               
                for(Vehicle obj : arr)
                {
                    if (obj instanceof Auto_Rickshaw)
                    {
                        Auto_Rickshaw auto_obj = (Auto_Rickshaw)obj;
                        if(auto_obj.getvehicle_ID()==vID)
                        {
                            if(auto_obj.getis_Booked()==false)
                            {
                                auto_obj.Book(bdate,charge,seat);
                                JOptionPane.showMessageDialog(null,("Auto Rickshaw successfully booked.\n")+
                                (" \nVehicle ID: " +vID)+(" \nBooked Date: "+bdate )+(" \nCharge Amount: "+charge)
                                +(" \nNo. of Setas: " +seat));
                            }
                            else if(auto_obj.getis_Booked()==true)
                            {
                                //message
                                JOptionPane.showMessageDialog(null," The auto rickshaw is already booked." );
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null," Enter valid vehicle ID." );  
                        }
                   }
                   
                }
            }
            catch(NumberFormatException ef)
            {
                //message box
                JOptionPane msg1 = new JOptionPane();
                msg1.showMessageDialog(null," Enter required field" );
            }   
        }
        
        
        
        //This method is used to add functionality to clear button from auto rickshaw panel. When the button id 
        //pressed, the values from text fields are cleared.   
        if(e.getSource()==clear2)
        {
            v_ID1.setText("");
            charge_.setText("");
            seat_.setText("");
        }
        
        
        //This method is used to add functionality to display button from auto rickshaw panel. When the button is 
        //pressed, the information related to Auto Rickshaw is displayed in message box.  
        if(e.getSource()==display)
        {
            for(Vehicle obj:arr)
            {
                if(obj instanceof Auto_Rickshaw)
                {
                    Auto_Rickshaw auto = (Auto_Rickshaw) obj;
            
                    try
                    {
                        if (auto.getis_Booked()==true)
                        {
                    
                            String nn=v_ID.getText();
                            int v_ID2 = Integer.parseInt(nn);
                            String mm=name_.getText();
                            String aa=weight_.getText();
                            String bb=color_.getText();
                            String cc=speed_.getText();
                            String dd=displacement_.getText();
                            int dd2 = Integer.parseInt(dd);
                            String ee=torque_.getText();
                            String ff=fuel_.getText();
                            int ff2 = Integer.parseInt(ff);
                            String gg=gc_.getText();
                
                            String yy=(String)js1.getSelectedItem();
                            String xx=(String)js2.getSelectedItem();
                            String zz=(String)js3.getSelectedItem();
                            String bdate = yy+xx+zz;
                            int charge = Integer.parseInt(charge_.getText());
                            int seat = Integer.parseInt(seat_.getText());
                            
                            JOptionPane.showMessageDialog(null,("Auto Rickshaw information are as follows.\n " )+
                            ("\nVehicle ID: "+v_ID2)+("\nVehicle Name: "+xx)+("\nVehicle Weight: "+aa)+
                            ("\nVehicle Color: "+bb)+("\nVehicle Speed: "+cc)+("\nDisplacement: "+dd2)+
                            ("\nTorque: "+ee)+("\nFuel Tank Capacity: "+ff2)+("\nGround Clearance: "+gg)+
                            ("\nBooked Date: "+bdate)+("\nCharge Amount: "+charge)+("\nNo. of Seats: "+seat));
                        }
                    }
            
                    catch(NumberFormatException ef)
                    {
                        //message box
                        JOptionPane msg1 = new JOptionPane();
                        msg1.showMessageDialog(null," Empty Field." );
                    }
            
                    try
                    {
                        if (auto.getis_Booked() == false)
                        {
                            String nn=v_ID.getText();
                            int v_ID2 = Integer.parseInt(nn);
                            String mm=name_.getText();
                            String aa=weight_.getText();
                            String bb=color_.getText();
                            String cc=speed_.getText();
                        
                            JOptionPane.showMessageDialog(null,("Auto Rickshaw information are as follows.\n " )+
                            ("\nVehicle ID: "+v_ID2)+("\nVehicle Name; "+mm)+("\nVehicle Weight: "+aa)+
                            ("\nVehicle Color: "+bb)+("\nVehicle Speed: "+cc));
                        }
                    }
            
                    catch(NumberFormatException ef)
                    {
                        //message box
                        JOptionPane msg1 = new JOptionPane();
                        msg1.showMessageDialog(null," Empty Field." );
                    }
                }
            }
        }
        
        
        //This method is used to add functionality to exit button from electric scooter panel. When the exit button
        //is clicked the program terminates. 
        if(e.getSource()==exit2)
        {
            System.exit(0);
        }
        
        
        /*This method is used to add functionality to add button of add scooty panel. When the button is pressed the
         * information about electric scooter such as vehicle id, name, weight, color, speed, and  battery capacity 
         * are used to create a new object of type Electric Scooter which is added to an array list of Vehicle class.
         * And when an empty field or invalid field is entered, it shows an error in error message box. Also, the
         * method used try-catch concept to handle number format exception. */
        if(e.getSource()==addEC)
        {
            try
            {
                String nn=v_ID2.getText();
                int v_ID = Integer.parseInt(nn);
                String mm=name2_.getText();
                String aa=weight2_.getText();
                String bb=color2_.getText();
                String cc=speed2_.getText();
                String dd=battery_.getText();
                int dd2 = Integer.parseInt(dd);
                boolean check = true;
           
               for(Vehicle obj :arr)
               {
                   if (obj.getvehicle_ID()== v_ID)
                   {
                       check=false;
                       if(check==false)
                       {
                           JOptionPane.showMessageDialog(null," Vehicle ID: " +v_ID+ "  is already registered" + 
                           " ERROR" +JOptionPane.ERROR_MESSAGE);
                       }
                   }
               }
               
               if(check==true)
               {
                   Electric_Scooter new_obj = new Electric_Scooter(v_ID,mm,aa,bb,cc,dd2);
                   arr.add(new_obj);
                   JOptionPane.showMessageDialog(null," Successfully Added" );
                   
               }

           
            }
            catch(NumberFormatException ef)
            {
                //message box
                JOptionPane msg1 = new JOptionPane();
                msg1.showMessageDialog(null," Enter required field in integer" );
            }        
        }
    
    
        if(e.getSource()==clear3)
        {
            v_ID2.setText("");
            name2_.setText("");
            weight2_.setText("");
            color2_.setText("");
            battery_.setText("");
            speed2_.setText("");
        }
    
        
        /*This method is used to add functionality to clear button from electric scooter panel. The Vehicle ID, brand,
         * price, charging time, mileage, and range are entered in the GUI. When the valid Vehicle ID is entered in
         * the text box, the respective brand, price, charging time, mileage and range display the information dialog.
         * When the purchase button is pressed, the input value of Vehicle ID is compared to the existing Vehicle ID,
         * and if a valid Vehicle id has been entered, it is used to purchase the appropriate ElectricScooter from the
         * list. The method to purchase the electric scooter from the ElectricScooter class is called here. */
        if(e.getSource()==buy)
        {
            try
            {
                int vID = Integer.parseInt(v_ID3.getText());
                String brand = (brand_.getText());
                int price = Integer.parseInt(price_.getText());
                String time = (time_.getText());
                String mileage = (mileage_.getText());
                int range = Integer.parseInt(range_.getText());
                for(Vehicle obj:arr)
                {
                    if(obj instanceof Electric_Scooter)
                    {
                        Electric_Scooter scooty = (Electric_Scooter) obj;
                        if(scooty.getvehicle_ID()==vID)
                        {
                            if(scooty.gethasPurchased()==false)
                           {
                               scooty.purchase(brand,price,time,mileage,range);
                               JOptionPane.showMessageDialog(null, " Electric Scooter purchsed successfully." +
                               (" \nVehicle ID: " +vID)+(" \nBrand: " +brand)+(" \nPrice: " +price)+
                               (" \nCharging Time: " +time)+(" \nMileage: " +mileage)+(" \nRange: " +range));
                           }
                           else if(scooty.gethasPurchased()==true)
                           {
                               JOptionPane.showMessageDialog(null," Vehicle ID: " +vID + " is already purchased" );
                           }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null," Enter valid vehicle ID." );  
                        }
                    }
                }   
            }
            catch(NumberFormatException ef)
            {
                //message box
                JOptionPane msg1 = new JOptionPane();
                msg1.showMessageDialog(null," Enter required field" );
            
            }    
        }
    
    
        if(e.getSource()==clear4)
        {
            v_ID3.setText("");
            brand_.setText("");
            price_.setText("");
            time_.setText("");
            mileage_.setText("");
            range_.setText("");
        }
    
    
        
        /*This method is used to add functionality to sell button from electric scooter panel. The Vehicle ID is
         * entered in the GUI. When the valid Vehicle ID is entered in the text box along with the respective price,
         * display the information dialog. When the sell button is pressed, the input value of Vehicle ID is compared
         * to the existing Vehicle ID, and if a valid Vehicle id has been entered, it is used to sell the appropriate
         * electric scooter from the array list of Vehicle. The method to sell the scooter in electric scooter class
         * is called here.  */
        if(e.getSource()==sell)
        {
            try
            {
                int vID = Integer.parseInt(v_ID4.getText());
                int price = Integer.parseInt(price2_.getText());
                for(Vehicle obj:arr)
                {
                    if(obj instanceof Electric_Scooter)
                    {
                        Electric_Scooter scooty = (Electric_Scooter) obj;
                        if(scooty.getvehicle_ID()==vID)
                        {
                            if(scooty.gethasSold()==false)
                           {
                               scooty.sell( price);
                               JOptionPane.showMessageDialog(null," Auto Rickshaw sold successfully\n" + 
                               " \nVehicle ID: " +vID +" \nPrice: " + price);
                            }
                           else if(scooty.gethasSold()==true)
                           {
                               //message
                               JOptionPane.showMessageDialog(null," Auto rickshaw: Vehicle ID:  "+vID+ 
                               "  is already sold. You can try to sell another vehicle" );
                           }
                   
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null," Enter valid vehicle ID." );  
                        }
                    }
                }
            }
            catch(NumberFormatException ef)
            {
                //message box
                JOptionPane msg1 = new JOptionPane();
                msg1.showMessageDialog(null," Enter required field." );
            }     
        }
        
        
        
        
        
        /*This method is used to add functionality to display button from electric scooter panel. When the button is
         * pressed, the information related to Auto Rickshaw is displayed in message box. */
        if(e.getSource()==display2)
        {
            for(Vehicle obj:arr)
            {
                if(obj instanceof Electric_Scooter)
                {
                    Electric_Scooter scooty = (Electric_Scooter) obj;
                    if (scooty.gethasPurchased() == true)
                    {
                        try
                        {
                            
                            String nn=v_ID2.getText();
                            int v_ID = Integer.parseInt(nn);
                            String mm=name2_.getText();
                            String aa=weight2_.getText();
                            String bb=color2_.getText();
                            String cc=speed2_.getText();
                            String dd=battery_.getText();
                            int dd2 = Integer.parseInt(dd);
               
                            String brand = (brand_.getText());
                            int price = Integer.parseInt(price_.getText());
                            String time = (time_.getText());
                            String mileage = (mileage_.getText());
                            int range = Integer.parseInt(range_.getText());
                
                            JOptionPane.showMessageDialog(null,("Details of Electric Scooter are: \n")+
                            ("\nVehicle ID: "+v_ID2)+("\nVehicle Name; "+mm)+("\nVehicle Weight: "+aa)+
                            ("\nVehicle Color: "+bb)+("\nVehicle Speed: "+cc)+("\nBattery Capacity: "+dd2)+
                            ("\nBrand"+brand)+("\nPrice: "+price)+("\nCharging Time: "+time)+("\nMileage: "+mileage)
                            +("\nRange"+range));     
               
                        }
            
                        catch(NumberFormatException ef)
                        {
                            //message box
                            JOptionPane msg1 = new JOptionPane();
                            msg1.showMessageDialog(null," Empty Field." );
                        }
                    }
                
            
                    if (scooty.gethasPurchased() == false)
                    {
                        try
                        {  
                            int v_ID = Integer.parseInt(v_ID3.getText());
                            String mm=name2_.getText();
                            String aa=weight2_.getText();
                            String bb=color2_.getText();
                            String cc=speed2_.getText();
                            int price = Integer.parseInt(price_.getText());
               
                            JOptionPane.showMessageDialog(null,("Details of Electric Scooter are: \n")+
                            ("\nVehicle ID: "+v_ID2)+("\nVehicle Name; "+mm)+("\nVehicle Weight: "+aa)+
                            ("\nVehicle Color: "+bb)+("\nVehicle Speed: "+cc));
                        }
            
                        catch(NumberFormatException ef)
                        {
                            //message box
                            JOptionPane msg1 = new JOptionPane();
                            msg1.showMessageDialog(null," Empty Field." );
                        }
                    }
                }
            }
        }
    }


    /*main method
     * This is a main method in the class TransportGUI class calling the choose panel from the same class.  
     */
    public static void main(String[]args)
    {
        TransportGUI obj = new TransportGUI();
        obj.choose();
    }  
}
