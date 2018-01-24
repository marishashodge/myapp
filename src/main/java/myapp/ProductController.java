package myapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    private Logger logger = LoggerFactory.getLogger((getClass()));

    @Autowired
    protected ProductRepository productRepository;

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public Iterable<Product> getAllProducts() {

        logger.info("Retrieving all products.");

        Iterable<Product> productList = productRepository.findAll();

        return productList;
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public ProductDTO createProduct(@RequestBody ProductDTO productDTO) throws Exception {

        logger.info("Creating a product.");

        Product product = new Product();
        product.setProductName(productDTO.getProductName());
        product.setImageUris(productDTO.getImageUris());
        product.setInformationDetails(productDTO.getInformationDetails());
        product.setPricePerUnit(productDTO.getPricePerUnit());
        product.setBrandName(productDTO.getBrandName());
        product.setProductCategory(productDTO.getProductCategory());
        product.setSizes(productDTO.getSizes());
        product.setColors(productDTO.getColors());
        product.setFlavors(productDTO.getFlavors());

        try {
            product = productRepository.save(product);
        } catch (Exception ex) {
            logger.error("Error saving to the database");
            throw new Exception(ex.getMessage());
        }

        productDTO.setId(product.getId());

        return productDTO;
    }
}




