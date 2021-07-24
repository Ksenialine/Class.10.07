package by.academy.lesson7;

public class Application {
	public static void main(String... args) {
		Deal deal = new Deal();
		User seller = new User();
		User buyer = new User();
		
		Product[] products = new Product[2];
		
		products[0] = new Milk("������", 1.5, 1, 2, 0.75);
		products[1] = new Cheese("���", 3.7, 1, 0.2, "���������");
		
		deal.setBuyer(buyer);
		deal.setSeller(seller);
		
		deal.setProducts(products);
		System.out.println("Bill: ");
		for(Product p : deal.getProducts()) {
			System.out.println(p.getName() + " price: " + p.calcPrice());
		}
		System.out.println("------------");
		System.out.println("Full price: " + deal.calcFullPrice());
	}

}
