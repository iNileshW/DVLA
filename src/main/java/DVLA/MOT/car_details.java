package DVLA.MOT;

public class car_details {
	//Car Detail class for getter setter and empty constructor
	private String car_reg, car_make, car_colour;
	
	//Methods
	public String getcar_reg() 
	{
		return car_reg;	
	}
	public void setcar_reg(String car_reg)
	{
		this.car_reg=car_reg;
	}
	public String getcar_make()
	{
		return car_make;
	}
	public void setcar_make(String car_make) 
	{
		this.car_make=car_make;
	}
	public String getcar_colour() 
	{
		return car_colour;
	}
	public void setcar_colour(String car_colour) 
	{
		this.car_colour=car_colour;
	}
	
	//Default Constructor
	public car_details()
	{	
		
	}
}
