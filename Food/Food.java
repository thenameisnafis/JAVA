import java.lang.*;

public abstract class Food {
    private String name;
    private String[] ingredients;
    private double price;
    private float calories;

    public Food() {
        this.name = "";
        this.ingredients = new String[0];
        this.price = 0.0;
        this.calories = 0.0f;
    }

    public Food(String name, String[] ingredients, double price, float calories) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
        this.calories = calories;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCalories(float calories) {
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public double getPrice() {
        return price;
    }

    public float getCalories() {
        return calories;
    }

    public void removeIngredient(String ingredient) {
        if (ingredients != null) {
            for (int i = 0; i < ingredients.length; i++) {
                if (ingredients[i].equals(ingredient)) {
                    ingredients[i] = null;
                    break;
                }
            }
        }
    }

    public void addIngredient(String ingredient) {
        if (ingredients != null) {
            String[] newIngredients = new String[ingredients.length + 1];
            for (int i = 0; i < ingredients.length; i++) {
                newIngredients[i] = ingredients[i];
            }
            newIngredients[ingredients.length] = ingredient;
            ingredients = newIngredients;
        }
    }

    public abstract void showDetails();
}