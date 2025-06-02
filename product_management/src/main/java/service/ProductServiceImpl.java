package service;

import model.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    private List<Product> products;
    private static int currentId = 0;

    public ProductServiceImpl() {
        products = new ArrayList<>();
        products.add(new Product(++currentId, "Laptop", 999.99, "High-performance laptop", "Dell"));
        products.add(new Product(++currentId, "Smartphone", 599.99, "Latest model smartphone", "Samsung"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products);
    }

    @Override
    public void save(Product product) {
        product.setId(++currentId);
        products.add(product);
    }

    @Override
    public Product findById(int id) {
        return products.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void update(int id, Product product) {
        Product existing = findById(id);
        if (existing != null) {
            existing.setName(product.getName());
            existing.setPrice(product.getPrice());
            existing.setDescription(product.getDescription());
            existing.setManufacturer(product.getManufacturer());
        }
    }

    @Override
    public void delete(int id) {
        products.removeIf(p -> p.getId() == id);
    }

    @Override
    public List<Product> searchByName(String name) {
        String lowerName = name.toLowerCase();
        return products.stream()
                .filter(p -> p.getName().toLowerCase().contains(lowerName))
                .toList();
    }
}