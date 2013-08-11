package test.cars.entities.car;

import org.rows.IController;
import org.rows.IInArgs;
import test.cars.entities.car.CarView;

public class CarController implements IController<CarController.Arguments, CarView.Arguments>{
	public class Arguments implements IInArgs {

	}
	/*public void process(Car model, IContext context) {
		
		model.setPrice(model.getPrice() * 1.2); // 20% increase
			
	}*/

	public CarView.Arguments process(Arguments in) {
		// TODO Auto-generated method stub
		return null;
	}
}
