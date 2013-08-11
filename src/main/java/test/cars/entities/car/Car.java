package test.cars.entities.car;
import org.rows.*;


public class Car implements IEntity {	
	private String color;
	private int noDoors;
	private double price;

	
	public String getColor()
	{
		return this.color;
	}
	public int getNumberOfDoors()
	{
		return this.noDoors;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}


	public void setColor(String color) {
		this.color = color;		
	}
	public void setNumberOfDoors(int noDoors) {
		this.noDoors = noDoors;
	}
}
