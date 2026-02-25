package main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        DataRetriever dataRetriever = new DataRetriever();

        List<Ingredient> ingredients = new ArrayList<>();
        Ingredient pommeDeTerre = new Ingredient("Pomme de terre", 2.5, CategoryEnum.VEGETABLE);
        Ingredient saucisse = new Ingredient("Saucisse", 2.5, CategoryEnum.ANIMAL);
        ingredients.add(pommeDeTerre);
        ingredients.add(saucisse);

        List<Ingredient> created = dataRetriever.createIngredients(ingredients);
        System.out.println("Ingrédient créé avec ID : " + created.get(0).getId());
    }
}
