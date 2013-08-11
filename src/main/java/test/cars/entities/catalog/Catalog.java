package test.cars.entities.catalog;
import java.util.ArrayList;

import org.rows.IEntity;
import test.cars.entities.car.Car;




public class Catalog extends ArrayList<Car> implements IEntity {
	public boolean add(Car entity)
	{
		return super.add(entity);
	}
}
