public class Auto_Rickshaw extends Vehicle
{
    private int engine_Displacement;
    private String torque;
    private int number_of_Seats;
    private int fuel_Tank_Capacity;
    private String ground_Clearance;
    private int charge_Amount;
    private String booked_Date;
    private boolean is_Booked;
    
    public Auto_Rickshaw(int vehicle_ID, String vehicle_Name, String vehicle_Weight, String vehicle_Color,
    String vehicle_Speed, int engine_Displacement, String torque, int fuel_Tank_Capacity, String ground_Clearance)
    {
        super(vehicle_ID, vehicle_Name, vehicle_Weight, vehicle_Color);
        setvehicle_Speed(vehicle_Speed);
        setvehicle_Color(vehicle_Color);
        this.engine_Displacement = engine_Displacement;
        this.torque = torque;
        this.fuel_Tank_Capacity = fuel_Tank_Capacity;
        this.ground_Clearance = ground_Clearance;
        is_Booked = false;
    }
    
    public int getengine_Displacement()
    {
        return this.engine_Displacement;
    }
    
    public String gettorque()
    {
        return this.torque;
    }
    
    public int getnumber_of_Seats()
    {
        return this.number_of_Seats;
    }
    
    public int getfuel_Tank_Capacity()
    {
        return this.fuel_Tank_Capacity;
    }
    
    public String getground_Clearance()
    {
        return this.ground_Clearance;
    }
    
    public int getcharge_Amount()
    {
        return this.charge_Amount;
    }
    
    public String getbooked_Data()
    {
        return this.booked_Date;
    }
    
    public boolean getis_Booked()
    {
        return this.is_Booked;
    }
    
    public void setcharge_Amount(int newCharge)
    {
      charge_Amount = newCharge;  
    }
    
    public void setnumber_of_Seats(int newSeat_No)
    {
        number_of_Seats = newSeat_No;
    }
    
    public void Book(String booked_Date, int charge_Amount, int number_of_Seats)
    {
        if (is_Booked == false)
        {
            this.booked_Date = booked_Date;
            setcharge_Amount(charge_Amount);
            setnumber_of_Seats(number_of_Seats);
            is_Booked = true;
            System.out.println(" The Auto Rickshaw is booked succesfully" );
        }
        else 
        {
            System.out.println(" The Auto Rickshaw is already booked" );
        }
    }
    
public void display()
    {
   super.display();
   if (is_Booked == true){
       System.out.println("Engine Displacement: " + engine_Displacement);
       System.out.println(" Torque:" + torque);
       System.out.println(" Fuel Tank Capacity:" + fuel_Tank_Capacity);
       System.out.println(" Ground Clearance: " + ground_Clearance);
       System.out.println(" Booked Date:" + booked_Date);
   }
   if (charge_Amount== 0){
       System.out.println(" The Charge Amount is empty");
   }
   else {
       System.out.println(" Charge Amount:" + charge_Amount);
   }
   if (number_of_Seats == 0){
       System.out.println(" No.of seat/s are empty" );
   }
   else{
       System.out.println(" Number of Seats:" + number_of_Seats);
   }
    }
}