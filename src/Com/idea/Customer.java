package Com.idea;


public class Customer {
	private String customer_id;
	private String customer_fullname;
	private String customer_address;
	private String customer_phone;
	private String customer_loginname;
	private String customer_password;

	public Customer() {

	}

	public Customer(String customer_id, String customer_fullname, String customer_address, String customer_phone,
			String customer_loginname, String customer_password) {
		super();
		this.customer_id = customer_id;
		this.customer_fullname = customer_fullname;
		this.customer_address = customer_address;
		this.customer_phone = customer_phone;
		this.customer_loginname = customer_loginname;
		this.customer_password = customer_password;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_fullname() {
		return customer_fullname;
	}

	public void setCustomer_fullname(String customer_fullname) {
		this.customer_fullname = customer_fullname;
	}

	public String getCustomer_address() {
		return customer_address;
	}

	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}

	public String getCustomer_phone() {
		return customer_phone;
	}

	public void setCustomer_phone(String customer_phone) {
		this.customer_phone = customer_phone;
	}

	public String getCustomer_loginname() {
		return customer_loginname;
	}

	public void setCustomer_loginname(String customer_loginname) {
		this.customer_loginname = customer_loginname;
	}

	public String getCustomer_password() {
		return customer_password;
	}

	public void setCustomer_password(String customer_password) {
		this.customer_password = customer_password;
	}

	    @Override
        public String toString() {
        	String result = "{\n" +
                    "  \"customer_id\": \"" + customer_id + "\",\n" +
                    "  \"customer_fullname\": \"" + customer_fullname + "\",\n" +
                    "  \"customer_address\": " + customer_address + "\",\n" +
                    "  \"customer_phone\": \"" + customer_phone + "\"\n" +
                    "  \"customer_loginname\": \"" + customer_loginname + "\"\n" +
                    "  \"customer_password\": \"" + customer_password + "\"\n" +
                    "}";
        	return result ;
        }
	
	

	
}
