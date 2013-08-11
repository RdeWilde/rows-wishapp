package test.cars.entities.car;

import org.rows.Context;
import org.rows.IOutArgs;
import org.rows.View;


public class CarView extends View<CarView.Arguments> {
	public class Arguments implements IOutArgs {

	}

	
	public Context build(Arguments out) {
		return null;
		/*
				new Html(){{
					new Head(this);
					new Body(this){{
						new ListElement(this) {{
							new ListItem(this) {{	new TextContent(this, "Color: " + arg.getCar().getColor());			}};
							new ListItem(this) {{	new TextContent(this, "Doors: " + arg.getCar().getNumberOfDoors());	}};
							new ListItem(this) {{	new TextContent(this, "Price: " + arg.getCar().getPrice());			}};
						}};
					}};
				}};
		*/
	}

}
