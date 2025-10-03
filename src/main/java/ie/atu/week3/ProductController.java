package ie.atu.week3;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    List<Product> myList = new ArrayList<>();

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
    @GetMapping("/getProducts")
    public List<Product> getProducts() {
        return myList;
    }
    @PostMapping("/addProduct")
    public Product addProduct(@Valid @RequestBody Product myProduct) {

        myList.add(myProduct);
        return myProduct;
    }
    @PostMapping("/addProducts")
    public List<Product> addProducts(@Valid @RequestBody List<Product> myProducts) {
        myList.addAll(myProducts);
        return myProducts;
    }

    // Homework assignment
    @GetMapping("/productCount")
    public int getProductCount() {
        return myList.size();
    }

}

