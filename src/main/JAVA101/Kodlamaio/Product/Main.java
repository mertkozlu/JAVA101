package Kodlamaio.Product;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setName("X Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitInStock(3);
        product1.setImageUrl("image1.jpg");

        Product product2 = new Product();
        product2.setName("Y Makinesi");
        product2.setDiscount(6);
        product2.setUnitPrice(6500);
        product2.setUnitInStock(2);
        product2.setImageUrl("image2.jpg");

        Product product3 = new Product();
        product3.setName("Z Makinesi");
        product3.setDiscount(9);
        product3.setUnitPrice(5000);
        product3.setUnitInStock(6);
        product3.setImageUrl("image3.jpg");

        Product[] products = {product1, product2,product3};

        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");

    }
}
