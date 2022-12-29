package business.concretes;

import business.abstracts.ProductService;
import core.LoggerService;
import dataAccess.abstracts.ProductDao;
import entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {

    private ProductDao productDao;
    private LoggerService loggerService;

    public ProductManager(ProductDao productDao, LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService = loggerService;
    }

    @Override
    public void add(Product product) {

        this.productDao.add(product);
        //this.loggerService.logToSystem("Success");
    }

    @Override
    public void update(Product product) {
        System.out.println("\nThe Data of " + product.getName() + " changed!");

        product.setId(0);
        product.setName("elbaT");
        product.setCategoryId(0);
        product.setUnitPrice(2000);
        product.setUnitInStock(0);
        System.out.println(product.getId() +
                            " " + product.getName() +
                            " " + product.getCategoryId() +
                            " " + product.getUnitPrice() +
                            " " + product.getUnitInStock());

        this.loggerService.logToSystem("Success");
    }


    @Override
    public List<Product> getAll() {
        return null;
    }
}
