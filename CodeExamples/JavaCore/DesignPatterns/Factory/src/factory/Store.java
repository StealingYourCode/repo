package factory;

public class Store {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProductFactory prodFactory = new ProductFactory();
		
		
		Product product = prodFactory.createProduct("Toy","Lego");
		System.out.println("The new product is a: "+product.getName());	
		
		Product product2 = prodFactory.createProduct("Toy","Puzzle");
		System.out.println("The new product is a: "+product2.getName());

		Product product3 = prodFactory.createProduct("Tool","Screw Driver");
		System.out.println("The new product is a: "+product3.getName());
		
		/////////////////
		
		ToyFactory toyFactory = new ToyFactory();
		
		Toy toy = toyFactory.createToy("Toy", "Barbie");
		System.out.println("The new toy is a: "+toy.getName());			
				
		
	}

}
