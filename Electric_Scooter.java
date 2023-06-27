public class Electric_Scooter extends Vehicle
{
    private int range;
    private int battery_Capacity;
    private int price;
    private String charging_Time;
    private String brand;
    private String mileage;
    private boolean has_Purchased;
    private boolean has_Sold;
    
    public Electric_Scooter(int vehicle_ID, String vehicle_Name, String vehicle_Weight, String vehicle_Color, 
    String vehicle_Speed, int battery_Capacity)
    {
        super(vehicle_ID, vehicle_Name, vehicle_Weight, vehicle_Color);
        setvehicle_Speed(vehicle_Speed);
        setvehicle_Color(vehicle_Color);
        this.battery_Capacity = battery_Capacity;
        price = 0;
        range = 0;
        brand ="";
        mileage = "";
        charging_Time = "";
        has_Purchased = false;
        has_Sold = false;
    }
    
    public int getRange()
    {
        return this.range;
    }
    
    public int getBatteryCapacity()
    {
        return this.battery_Capacity;
    }
    
    public int getPrice()
    {
        return this.price;
    }
    
    public String getChargingTime()
    {
        return this.charging_Time;
    }
    
    public String getBrand()
    {
        return this.brand;
    }
    
    public String getMileage()
    {
        return this.mileage;
    }
    
    public boolean gethasPurchased()
    {
        return this.has_Purchased;
    }
    
    public boolean gethasSold()
    {
        return this.has_Sold;
    }
    
    public void setbrand(String newBrand)
    {
        if (has_Purchased == false){
            brand = newBrand;
        }
        else {
            System.out.println(" Already Purchased: Not Possible to change the brand" );
        }
    }
    
    public void purchase(String brand, int price, String charging_Time, String mileage, int range)
    {
        if(has_Purchased = false)
        {
            setbrand(brand);
            this.price = price;
            this.charging_Time = charging_Time;
            this.mileage = mileage;
            this.range = range;
            has_Purchased = true;
        }
    }
    
    public void sell(int newprice)
    {
        if(has_Sold == false){
            price = newprice;
            charging_Time = "";
            mileage = "";
            battery_Capacity = 0;
            range = 0;
            has_Sold = true;
            has_Purchased = false;
        }
        else{
            System.out.println(" The Scooter is already sold." );
        }
    }
    
    public void display()
    {
        super.display();
        if(has_Purchased == true){
            System.out.println(" Brand: " + brand);
            System.out.println(" Batter Capacity:" + battery_Capacity );
            System.out.println(" Mileage: " + mileage);
            System.out.println(" Range:" + range);
            System.out.println(" Recharge Time" + charging_Time);
        }
    }
}