package Kodlamaio.Product;

public class ProductManager  {
    public void add(Product product1, Product product2, Product product3) {
        Product[] products = {product1,product2, product3};
        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>" + "Ürün Eklendi : " + product.getName() + "</li>");
        }
        System.out.println("</ul>");
    }
}
