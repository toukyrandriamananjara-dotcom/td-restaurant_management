ALTER TABLE Dish DROP COLUMN selling_price;
ALTER TABLE Ingredient DROP COLUMN id_dish;
ALTER TABLE Ingredient DROP COLUMN required_quantity;

CREATE TYPE unit_enum AS ENUM ('PCS', 'KG', 'L');

CREATE TABLE DishIngredient(
    id SERIAL PRIMARY KEY,
    id_dish int,
    id_ingredient int,
    quantity_required numeric,
    unit unit_enum,
    FOREIGN KEY (id_dish) REFERENCES Dish(id) ON DELETE SET NULL,
    FOREIGN KEY (id_ingredient) REFERENCES Ingredient(id) ON DELETE SET NULL
)