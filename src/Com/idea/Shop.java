package Com.idea;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Shop {

	private String shopname;
	private String ownername;
	private String shopphone;
	private List<Product> products;
	private List<Customer> customers;
	private List<Transaction> transactions;

	public Shop() {
		products = new ArrayList<>();
		customers = new ArrayList<>();
		transactions = new ArrayList<>();

	}

	public Shop(String shopname, String ownername, String shopphone) {
		this.shopname = shopname;
		this.ownername = ownername;
		this.shopphone = shopphone;
		this.products = new ArrayList<>();
		this.customers = new ArrayList<>();
		this.transactions = new ArrayList<>();
	}

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public String getOwnername() {
		return ownername;
	}

	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

	public String getShopphone() {
		return shopphone;
	}

	public void setShopphone(String shopphone) {
		this.shopphone = shopphone;
	}

	void addProduct(Product product) {
		products.add(product);
	}

	void addCustomer(Customer customer) {
		customers.add(customer);
	}

	void buy(Customer customer, Product product, int amount) {
		if (products.contains(product)) {
			if (product.getProduct_stockamnt() > amount) {
				String transactionId = genID();
				LocalDateTime date = LocalDateTime.now();
				Transaction tDetail = new Transaction(transactionId, customer, product, amount, date);
				transactions.add(tDetail);

			} else {
				System.out.println("Product not available in shop.");
			}
		}
	}

	public String genID() {
		long currentTimeMillis = System.currentTimeMillis();
		String transactionId = "T" + currentTimeMillis;
		return transactionId;
	}

	public String showTransaction() {
		StringBuilder transactionList = new StringBuilder("Transaction List:\n");
		for (Transaction transaction : transactions) {
			String result = "{\n" 
					+ "  \"transaction_id\": \"" + transaction.getTransaction_id() + "\",\n"
					+ "  \"Customer_id\": \"" + transaction.getCustomer().getCustomer_id() + "\",\n"
					+ "  \"product_id\": " + transaction.getProduct().getProduct_id() + ",\n"
					+ "  \"product_amnt\": \"" + transaction.getProduct_amnt() + "\"\n"
					+ "  \"Date\": \"" + transaction.getDate() + "\"\n" + 
					"}";
			transactionList.append(result).append("\n");
		}
		return transactionList.toString();
	}

	public static void main(String[] args) {
		// ชื่อร้าน
		Shop shop = new Shop("Stou store", "Game", "0804259422");
		
		// สมัครสมาชิค
		Customer c1 = new Customer("C01", "Wanchana chanyaemsong", " 44 moo 3 koh tao ", " 0804259422 ", "Gamezadee555","Game12345");
		Customer c2 = new Customer("C02", "Somwang", " 152 mmo 4  ", " 077456502", "Test1", "123456");
		
		shop.addCustomer(c1);
		shop.addCustomer(c2);

		// สร้าง สินค้า
		Product p1 = new Product("P01", "Sugar", 50.0, 20);
		Product p2 = new Product("P02", "Syrup", 38.0, 5);
		Product p3 = new Product("P03", "Honey", 24.0, 0);
		shop.addProduct(p1);
		shop.addProduct(p2);
		shop.addProduct(p3);

		
		// ซื้อของ
		shop.buy(c1, p2, 2);
		shop.buy(c2, p1, 1);
		shop.buy(c2, p3, 1);

		System.out.println(shop.showTransaction());


	}
}
