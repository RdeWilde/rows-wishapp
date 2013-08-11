package test.cars.entities.catalog;

import org.rows.IKey;

public class CatalogKey implements IKey<Catalog> {
	private Catalog entity;

	
	public Catalog create() { // TODO: Pass Model<T>?
		this.entity = new Catalog();
		
		return this.entity;
	}


	public Catalog getEntity() {
		return this.entity;
	}


	public String getURI() {
		return null;
	}

}
