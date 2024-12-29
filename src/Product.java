class Product{
    private double price;
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class ProductDriver {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setPrice(2500);
        System.out.println(p1.getPrice());
    }
}
