package main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        DataRetriever dataRetriever = new DataRetriever();

        List<Ingredient> existingDish = dataRetriever.findIngredients(1, 5);
        System.out.println(existingDish);
    }
}
