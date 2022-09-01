package Polimorfismo;

import java.util.Set;

public class ProductFactory {
    static Product create(String name, Set<String> details){
        return new Product(name, details);
    }
}
