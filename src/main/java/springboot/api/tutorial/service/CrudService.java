package springboot.api.tutorial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.api.tutorial.model.Product;
import springboot.api.tutorial.repository.ProductRepository;

@Service
public class CrudService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProductList() {
        return productRepository.findAll();
    }

    public Product getProductById(Integer id) {
        return productRepository.findById(id).get();
    }

    public void saveOrUpdateProduct(Product product) {
        productRepository.save(product);
    }
    
    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }

}