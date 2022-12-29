import business.abstracts.ProductService;
import business.concretes.ProductManager;
import core.JLoggerManagerAdapter;
import dataAccess.abstracts.ProductDao;
import dataAccess.concretes.HibernateProductDao;
import entities.concretes.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductManager(new HibernateProductDao(), new JLoggerManagerAdapter());
        ProductDao productDao = new HibernateProductDao();


        //Products
        Product product1 = new Product(1, 2, "Table", 450, 5);
        Product product2 = new Product(2, 2, "Chair", 225, 10);
        Product product3 = new Product(3, 3, "Sofa", 600, 2);

        productService.add(product1);
        productService.add(product2);
        productService.add(product3);

        productDao.delete(product2);
        productDao.delete(product3);

        productService.update(product1);


    }
}