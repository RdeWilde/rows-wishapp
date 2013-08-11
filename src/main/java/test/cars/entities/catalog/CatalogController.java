package test.cars.entities.catalog;

import org.rows.IController;
import org.rows.IInArgs;
import test.cars.entities.catalog.CatalogView;
import test.cars.entities.catalog.CatalogController.Arguments;

public class CatalogController implements IController<Arguments, CatalogView.Arguments> {
	public class Arguments implements IInArgs {
		
	}

	public CatalogView.Arguments process(final Arguments in) {
		return null;
	}

}
