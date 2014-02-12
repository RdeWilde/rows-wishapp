package test.cars.entities.catalog;

import org.rows.IKey;

public class CatalogKey implements IKey<Catalog> {
	private Catalog entity;

	
	public void create(Catalog catalog) {
		this.entity = catalog;
	}


	public Catalog getEntity() {
		return this.entity;
	}


	public String getURI() {
		return null;
	}

}
