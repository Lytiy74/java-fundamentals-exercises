package example;

import example.clases.Animal;
import example.clases.Dog;

import java.util.ArrayList;
import java.util.List;

//TODO: reade about this  Invariance vs Covariance

/**
 * Invariance (Інваріація) це можливість присваювання списків з однаковими дженеріками.
 * <p>
 * Приклад: {@link CovarianceAndInvariance#invariance()}
 * </p>
 * Covariance (Коваріація) це можливість змінній одного узагальнення(Дженеріка) задати об'єкт іншого узагальнення
 * <p>
 * Приклад: {@link CovarianceAndInvariance#covariance()}
 * </p>
 * Для ковараріції використовуємо конструкцію ? extends Animal
 * Приклад:
 */
public class Notates {
    public static void main(String[] args) {

    }

    public static class CovarianceAndInvariance {


        public static void invariance() {
            List<Animal> animalList = new ArrayList<Animal>(); // інваріація

//        наступне не скопілюється, через те що ми не можемо бути на 100% впевненні
//        що якщо ми будемо витягувати елементи з списку і викликати метод у
//        Dog якого немає в Animal то отримаємо помилку

//        List<Dog> dogs = new ArrayList<>();
//        List<Animal> animals = dogs;
        }

        public static void covariance() {
//        наступне - коваріація але компілятор не дозволить це зробити, по причині що описав я вище
//        List<Animal> animalList = ArrayList<Dog>;

//        тому коваріантність представлена в іншому вигляді
//        ? extends Animal
//        ця конструкція дженеріка означає, що підійде будь-який тип який є нащадком типу Animal (включно з Animal)
            List<Dog> dogs = new ArrayList<>();
            dogs.add(new Dog());
            dogs.add(new Dog());
            animalVoice(dogs);
            List<? extends Animal> animals = dogs;
//        зауваження, що в список з ? extends Animal ми не можемо додати нові дані ніякого типу, ні типу Dog, ні Animal
//        animals.add(new Dog());
//        dogs.add(new Animal());
//        це пов'язано з тим що ми не можемо бути на 100% впевненні,
//        список з об'єктами якого типу буде присвоєний списку з дженеріком <? extends Animal>
        }


        //    output
//    Гав! Гав!
        public static void animalVoice(List<? extends Animal> animals) {
            for (Animal animal : animals) {
                animal.voice();
            }
        }
    }

    //In which situations class should be nested?
    public static class InnerAndNestedClass {
        //обидва ці класи є Nested (вкладеними) але вони ще поділяються на Inner Class та Static nested Classes
        public static class StaticNestedClass{

        }
        //Inner class поділяється на Inner Class, Method-local inner class та на Anonymous inner class
        class InnerClass{

        }
    }
// Varargs and potential problems
//TODO: generics PECS - find (super?????)
}
