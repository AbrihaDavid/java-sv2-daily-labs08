package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    @Test
    void createTestByName(){
        Recipe recipe = new Recipe("Steak");
        assertEquals("Steak",recipe.getName());
        assertNull(recipe.getDescription());
        assertEquals(0,recipe.getIngredients().size());
    }

    @Test
    void createTestByNameAndDescription(){
        Recipe recipe = new Recipe("Steak","Delicious");
        assertEquals("Steak",recipe.getName());
        assertEquals("Delicious",recipe.getDescription());
        assertEquals(0,recipe.getIngredients().size());
    }

    @Test
    void addIngredient(){
        Recipe recipe = new Recipe("Steak");
        recipe.addIngredient("beef");
        assertEquals("beef",recipe.getIngredients().get(0));
    }

    @Test
    void addMoreIngredients(){
        Recipe recipe = new Recipe("Steak");
        recipe.addIngredient("beef","potato","onion");
        assertEquals(3,recipe.getIngredients().size());
    }

}