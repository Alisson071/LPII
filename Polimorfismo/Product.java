package Polimorfismo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Product {
    private String name;
    private Set<String> details = new HashSet<>();

    public Product(String name, Set<String> details){
        this.name = name;
        this.details = details;
    }

    public String name(){
        return name;
    }

    public Set<String> details(){
        return Collections.unmodifiableSet(details);
    }
}
