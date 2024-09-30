package Com.idea;

public class Product {

    private String product_id;
    private String product_name;
    private double product_price;
    private int product_stockamnt;

    // Default constructor
    public Product() {

    }

    // Constructor with parameters
    public Product(String id, String name, double price, int stockamnt) {
        this.product_id = id;
        this.product_name = name;
        this.product_price = price;
        this.product_stockamnt = stockamnt;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    public Integer getProduct_stockamnt() {
        return product_stockamnt;
    }

    public void setProduct_stockamnt(int product_stockamnt) {
        this.product_stockamnt = product_stockamnt;
    }
    
    @Override
    public String toString() {
        String result = "{\n" +
                        "  \"product_id\": \"" + product_id + "\",\n" +
                        "  \"product_name\": \"" + product_name + "\",\n" +
                        "  \"product_price\": " + product_price + ",\n" +
                        "  \"product_stockamnt\": \"" + product_stockamnt + "\"\n" +
                        "}";
        return result;
    }

}