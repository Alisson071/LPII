package Polimorfismo;

import java.util.HashSet;

public class Principal {
    public static void main(String[] args) {
        final var product = ProductFactory.create("Pepsi", new HashSet<>(){{add("Bebida"); add("Refrigerante");}});
        
        System.out.println(product.details());
    }
    }

