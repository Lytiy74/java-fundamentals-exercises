package Builder;

public class UsualNutritionFacts {
    private final int servingSize; // (mL) required
    private final int servings; // (per container) required
    private final int calories; // (per serving) optional
    private final int fat; // (g/serving) optional
    private final int sodium; // (mg/serving) optional
    private final int carbohydrate; // (g/serving) optional

    // Telescoping constructor pattern - does not scale well!
    public UsualNutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

    public UsualNutritionFacts(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    public UsualNutritionFacts(int servingSize, int servings, int calories) {
        this(servingSize, servings, calories, 0);
    }

    public UsualNutritionFacts(int servingSize, int servings, int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    public UsualNutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }

    //--------------BAD CONSTRUCTOR-------------
//    public BadConstructorNutritionFacts(int servingSize, int servings) {
//        this.servingSize = servingSize;
//        this.servings = servings;
//        this.calories = 0;
//        this.fat = 0;
//        this.sodium = 0;
//        this.carbohydrate = 0;
//    }
//
//    public BadConstructorNutritionFacts(int servingSize, int servings, int calories) {
//        this.servingSize = servingSize;
//        this.servings = servings;
//        this.calories = calories;
//        this.fat = 0;
//        this.sodium = 0;
//        this.carbohydrate = 0;
//    }
//
//    public BadConstructorNutritionFacts(int servingSize, int servings, int calories, int fat) {
//        this.servingSize = servingSize;
//        this.servings = servings;
//        this.calories = calories;
//        this.fat = fat;
//        this.sodium = 0;
//        this.carbohydrate = 0;
//    }
//
//    public BadConstructorNutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
//        this.servingSize = servingSize;
//        this.servings = servings;
//        this.calories = calories;
//        this.fat = fat;
//        this.sodium = sodium;
//        this.carbohydrate = 0;
//    }


}

