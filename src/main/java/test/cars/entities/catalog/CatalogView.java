package test.cars.entities.catalog;

import org.rows.Context;
import org.rows.IOutArgs;
import org.rows.View;



public class CatalogView extends View<CatalogView.Arguments> {
	public class Arguments implements IOutArgs {
		
	}

	public Context build(Arguments out) {
		return null;
	}
	
	
	/*public ITemplate build(final CatalogViewArgument arg) {
		return
			new Html(){{
				new Head(this);
				new Body(this) {{
					new ListElement(this) {{								
						for (final Car car : arg.getCars())
						{
							new ListItem(this) {{
								new Link(this) {{
									this.title = car.getColor() + ", " + car.getNumberOfDoors();
									this.href = "car/" + (int)car.getPrice(); 
								}};
							}};
						}
					}};								
						
					new Form(this) {{
						new Textbox(this) {{
							this.name	="testname";
							this.value 	= "testvalue";
						}};
					}};
				}};
			}};
	}*/
}
