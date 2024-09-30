package Com.idea;

import java.time.LocalDateTime;

public class Transaction {
	private String transaction_id;
	private Customer customer;
	private Product product;
	private int product_amnt;
	private LocalDateTime date;

	public Transaction() {

	}

	public Transaction(String transaction_id, Customer customer, Product product, int product_amnt,
			LocalDateTime date) {
		super();
		this.transaction_id = transaction_id;
		this.customer = customer;
		this.product = product;
		this.product_amnt = product_amnt;
		this.date = date;
	}

	public String getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getProduct_amnt() {
		return product_amnt;
	}

	public void setProduct_amnt(int product_amnt) {
		this.product_amnt = product_amnt;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

}
