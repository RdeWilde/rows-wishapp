package test.cars.entities.car;
import org.rows.*;


public class CarKey implements IKey<Car> {
	protected Car entity;
	
	
	public String getURI() {
		return null;
	}

	public Car create() {
		this.entity = new Car();
		
		return this.entity;
	}
	

	public Car getEntity() {
		return this.entity;
	}

}
