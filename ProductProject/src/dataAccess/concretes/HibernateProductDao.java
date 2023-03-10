package dataAccess.concretes;

import dataAccess.abstracts.ProductDao;
import entities.concretes.Product;

import java.util.List;

public class HibernateProductDao implements ProductDao {

    @Override
    public void add(Product product) {
        System.out.println("Added with Hibernate! " + product.getName());
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Product product) {

        System.out.println("\nDeleted " + product.getName() + " with Hibernate!");
    }

    @Override
    public Product get(int id) {
        return null;
    }


    @Override
    public List<Product> getAll() {
        return null;
    }
}
