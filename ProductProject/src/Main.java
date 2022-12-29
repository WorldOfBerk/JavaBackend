import business.abstracts.ProductService;
import business.concretes.ProductManager;
import dataAccess.concretes.HibernateProductDao;
import entities.concretes.Product;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductManager(new HibernateProductDao());

        //Products
        Product product1 = new Product(1, 2, "Table", 450, 5);
        Product product2 = new Product(2, 2, "Chair", 225, 10);
        Product product3 = new Product(3, 3, "Sofa", 600, 2);
    }
}