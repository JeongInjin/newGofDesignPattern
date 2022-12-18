package com.example.new_gof_design_pattern._04_factory.hfd.pizza_simple;

public class ClamPizza extends Pizza {

    public ClamPizza() {
        name = "Clam Pizza";
        dough = "Thin crust";
        sauce = "White garlic sauce";
        toppings.add("Clams");
        toppings.add("Grated parmesan cheese");
    }
}
