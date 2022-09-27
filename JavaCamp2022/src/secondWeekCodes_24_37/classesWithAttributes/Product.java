package classesWithAttributes;

public class Product {
    public Product () {

    }

    public Product (int id, String name, String description, double price, int stockAmount, String color) {
        System.out.println("Constructor is invoked");
        _id = id;
        _name = name;
        _description = description;
        _price = price;
        _stockAmount = stockAmount;
        _color = color;
    }

    // attributes or fields
    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;
    private String _color;
    private String _code;

    //Getters - Setters
    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double price) {
        _price = price;
    }

    public int getStockAmount() {
        return _stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        _stockAmount = stockAmount;
    }

    public String getColor() {
        return _color;
    }

    public void setColor(String color) {
        _color = color;
    }

    public String getCode() {
        return _name.substring(0, 1) + _id;
    }
}
