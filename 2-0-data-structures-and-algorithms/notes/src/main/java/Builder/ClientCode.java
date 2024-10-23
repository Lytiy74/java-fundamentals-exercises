package Builder;

public class ClientCode {
    UsualNutritionFacts cocaCola =
            new UsualNutritionFacts(240, 8, 100, 0, 35, 27);

    NutritionFacts fanta = new NutritionFacts.Builder(240, 8)
            .calories(100)
            .sodium(35)
            .carbohydrate(27)
            .build();
}
