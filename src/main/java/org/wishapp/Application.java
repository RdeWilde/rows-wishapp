package org.wishapp;

import org.rows.ContentType;
import org.rows.Endpoint;
import org.rows.IContext;
import org.rows.RequestHandler;
import org.rows.Server;

import test.DefaultHandler;
import test.cars.entities.car.Car;
import test.cars.entities.car.CarController;
import test.cars.entities.car.CarKey;
import test.cars.entities.car.CarView;
import test.cars.entities.catalog.Catalog;
import test.cars.entities.catalog.CatalogController;
import test.cars.entities.catalog.CatalogKey;
import test.cars.entities.catalog.CatalogView;


public class Application extends Server {

	public static void main(String... args) throws Exception
    {
		// GENERAL CONFIGURATION
		Application server = new Application();
		
		RequestHandler handler = new RequestHandler();
        	server.setHandler(handler);
        
        ContentType.XML.addExtension("xml");
        ContentType.JSON.addExtension("json");
        
        
        // INITIAL DATA
        CatalogKey catalogKey = new CatalogKey();
    	Catalog catalog = catalogKey.create();
                
        
        CarKey carKey = new test.cars.entities.car.CarKey();
        Car car1 = carKey.create();
		        car1.setColor("RED");
		        car1.setNumberOfDoors(3);
        		car1.setPrice(15000);
    		catalog.add(car1);
    		
    		
		CarKey carKey2 = new test.cars.entities.car.CarKey();
		Car car2 = carKey2.create();
				car2.setColor("BLUE");
				car2.setNumberOfDoors(5);
				car2.setPrice(17000);
    		catalog.add(car2);
    

		// CREATE ENDPOINT (CARS)  
		Endpoint<CatalogController.Arguments, CatalogView.Arguments> catalogEndpoint = 
   			 new Endpoint<CatalogController.Arguments, CatalogView.Arguments>(
   		        		new DefaultHandler<CatalogController.Arguments>() {
   							public CatalogController.Arguments accept(IContext context) {
   								return null;
   							}	        			
   		        		},
   		        		new CatalogController(),
   		        		new CatalogView()
   		    		);	  	
    	        
	        
        // CREATE ENDPOINT (CAR)
        Endpoint<CarController.Arguments, CarView.Arguments> carEndpoint = 
    	        new Endpoint<CarController.Arguments, CarView.Arguments>(
    	        	new DefaultHandler<CarController.Arguments>() {
    	        		public CarController.Arguments accept(IContext context) {
    	        			return null;
    	        		}
    	        	},
    	        	new CarController(),
	        		new CarView()
        		);

    	        
        // REGISTER ENDPOINTS TO SERVER
    	handler.addEndpoint(catalogEndpoint);        
        handler.addEndpoint(carEndpoint);

        
        // START SERVER
        server.start();
        server.join();
    }

}
