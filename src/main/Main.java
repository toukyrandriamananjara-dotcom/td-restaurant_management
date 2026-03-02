package main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        DataRetriever dataRetriever = new DataRetriever();

        List<Ingredient> ingredients = new ArrayList<>();

        Ingredient ingredient = new Ingredient("Saucisson", 10, CategoryEnum.ANIMAL);
        ingredients.add(ingredient);
        dataRetriever.createIngredients(ingredients);
    }
}
