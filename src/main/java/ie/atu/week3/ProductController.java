package ie.atu.week3;

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
    public Product addProduct(@RequestBody Product myProduct) {

        myList.add(myProduct);
        return myProduct;
    }
    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> myProducts) {
        myList.addAll(myProducts);
        return myProducts;
    }

}

