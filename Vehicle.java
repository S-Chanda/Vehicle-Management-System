public class Vehicle
{
    private int vehicle_ID;
    private String vehicle_Name;
    private String vehicle_Weight;
    private String vehicle_Color;
    private String vehicle_Speed;
    
    public Vehicle(int vehicle_ID, String vehicle_Name, String vehicle_Weight, String vehicle_Color)
     { 
         this.vehicle_ID = vehicle_ID;
         this.vehicle_Name = vehicle_Name;
         this.vehicle_Weight = vehicle_Weight;
         this.vehicle_Color = vehicle_Color;
     }
    
    public int getvehicle_ID()
        {
            return this.vehicle_ID;
        }
    
    public String getvehicle_Name()
        {
            return this.vehicle_Name;
        }
    
    public String getvehicle_Weight()
        {
            return this.vehicle_Weight;
        }
    
    public String getvehicle_Color()
        {
            return this.vehicle_Color;
        }
    
    public String getvehicle_Speed()
    {
            return this.vehicle_Speed;
    }
    
    public void setvehicle_Speed(String new_Speed)
    {
        vehicle_Speed = new_Speed;
    }
    
    public void setvehicle_Color(String new_Color)
    {
        vehicle_Color=new_Color;
    }
    
    public void display()
    {
        System.out.println(" Vehicel ID: " + vehicle_ID);
        System.out.println(" Vehicle Name: " + vehicle_Name);
        
        if (vehicle_Weight==""){
            System.out.println(" Vehicle Weight is not mentioned");
        }
        else{
         System.out.println(" Vehicle Weight:" + vehicle_Weight); 
        }
        
        System.out.println(" Vehicle Color:" + vehicle_Color);
        System.out.println(" Vehicle Speed:" + vehicle_Speed);
    }   
}