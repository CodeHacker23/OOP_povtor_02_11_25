package org.example;

/**
 * ============================================
 * КЛАСС DOG - ДРУГОЙ ПРИМЕР НАСЛЕДОВАНИЯ
 * ============================================
 * 
 * Dog тоже наследуется от Animal, но реализует методы ПО-ДРУГОМУ.
 * Это и есть полиморфизм - одно и то же (makeSound), разное поведение!
 * 
 * Cat: "Мяу!"
 * Dog: "Гав-гав!"
 * Bird: "Чирик!"
 * 
 * Все животные, но звуки разные!
 */
public class Dog extends Animal {
    
    // Уникальное поле собаки
    private int loyaltyLevel = 10; // собаки очень преданные

    public Dog() {
        super(8); // собаки всегда готовы к еде
    }

    public Dog(int initialHunger) {
        super(initialHunger);
    }

    @Override
    public void makeSound() {
        System.out.println("Гав-гав! (собака радуется)");
    }

    @Override
    public void play() {
        System.out.println("Собака бегает за мячом (охрененно веселится!)");
        loyaltyLevel++; // игра увеличивает преданность!
    }

    // Уникальный метод собаки
    public void fetchBall() {
        System.out.println("Собака принесла мяч обратно!");
        loyaltyLevel += 2;
    }

    public int getLoyaltyLevel() {
        return loyaltyLevel;
    }
}
