import java.lang.*;

public class Start {
    public static void main(String[] args) {
        Food food1 = new Food() {
            
            public void showDetails() {
                System.out.println("Food 1 Details:");
                System.out.println("Name: " + getName());
                System.out.println("Ingredients: " + String.join(", ", getIngredients()));
                System.out.println("Price: $" + getPrice());
                System.out.println("Calories: " + getCalories());
            }
        };
        Food food2 = new Food("Pizza", new String[]{"Dough", "Tomato Sauce", "Cheese"}, 10.99, 1200.0f) {
            
            public void showDetails() {
                System.out.println("Food 2 Details:");
                System.out.println("Name: " + getName());
                System.out.println("Ingredients: " + String.join(", ", getIngredients()));
                System.out.println("Price: $" + getPrice());
                System.out.println("Calories: " + getCalories());
            }
        };

        food1.setName("Burger");
        food1.setIngredients(new String[]{"Bun", "Beef Patty", "Lettuce", "Tomato", "Cheese"});
        food1.setPrice(5.99);
        food1.setCalories(700.0f);

        food2.addIngredient("Olives");
        food1.removeIngredient("Tomato");

        food1.showDetails();
        food2.showDetails();
    }
}