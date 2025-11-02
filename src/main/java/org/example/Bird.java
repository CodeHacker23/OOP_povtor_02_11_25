package org.example;

/**
 * ============================================
 * КЛАСС BIRD - ТРЕТИЙ ПРИМЕР НАСЛЕДОВАНИЯ
 * ============================================
 * 
 * Еще один наследник Animal, с совершенно другим поведением.
 * Обрати внимание: все три класса (Cat, Dog, Bird) реализуют
 * одни и те же методы, но ПО-РАЗНОМУ!
 * 
 * Это полиморфизм в чистом виде!
 */
public class Bird extends Animal {
    
    private boolean canFly = true; // большинство птиц умеют летать

    public Bird() {
        super(6); // птички умеренно голодные
    }

    public Bird(int initialHunger) {
        super(initialHunger);
    }

    @Override
    public void makeSound() {
        System.out.println("Чирик-чирик! (птичка поет)");
    }

    @Override
    public void play() {
        System.out.println("Птица летает по клетке (но лучше бы на свободе...)");
    }

    // Уникальный метод птицы
    public void fly() {
        if (canFly) {
            System.out.println("Птица летит! Свобода!");
        } else {
            System.out.println("Эта птица не умеет летать (пингвин? страус?)");
        }
    }

    public boolean canFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
