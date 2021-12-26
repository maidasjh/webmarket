package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository {
	
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository instance = new ProductRepository();

	public static ProductRepository getInstance(){
		return instance;
	} 

	public ProductRepository() {
		Product scr2 = new Product("P1101", "Giant scr2", 800000);
		scr2.setDescription("S M L, Shimano Claris, 700X25C");
		scr2.setCategory("ROAD");
		scr2.setManufacturer("GIANT");
		scr2.setUnitsInStock(10);
		scr2.setCondition("New");
		scr2.setFilename("P1101.png");

		Product scultra100 = new Product("P1201", "Merida scultra 100", 760000);
		scultra100.setDescription("S M L, Shimano Claris, 700X25C");
		scultra100.setCategory("ROAD");
		scultra100.setManufacturer("MERIDA");
		scultra100.setUnitsInStock(8);
		scultra100.setCondition("New");
		scultra100.setFilename("P1201.png");
		
		Product allezsport = new Product("P1301", "Specialized allez sport", 690000);
		allezsport.setDescription("S M L,  Shimano Claris, 700X25C");
		allezsport.setCategory("ROAD");
		allezsport.setManufacturer("SPECIALIZED");
		allezsport.setUnitsInStock(5);
		allezsport.setCondition("New");
		allezsport.setFilename("P1301.png");

		listOfProducts.add(scr2);
		listOfProducts.add(scultra100);
		listOfProducts.add(allezsport);
	}

	public ArrayList<Product> getAllProducts() {
		return listOfProducts;
	}
	
	public Product getProductById(String productId) {
		Product productById = null;

		for (int i = 0; i < listOfProducts.size(); i++) {
			Product product = listOfProducts.get(i);
			if (product != null && product.getProductId() != null && product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}
		return productById;
	}
	
	public void addProduct(Product product) {
		listOfProducts.add(product);
	}
}
