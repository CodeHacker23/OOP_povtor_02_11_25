package org.example;

/**
 * ============================================
 * ГЛАВНЫЙ КЛАСС - ДЕМОНСТРАЦИЯ ВСЕХ ПРИНЦИПОВ ООП
 * ============================================
 * 
 * Здесь мы увидим все 4 принципа ООП в действии:
 * 1. Инкапсуляция - данные скрыты, доступ через методы
 * 2. Наследование - Cat, Dog, Bird наследуются от Animal
 * 3. Полиморфизм - один метод, разное поведение
 * 4. Абстракция - Animal - абстрактный класс
 */
public class App {

    public static void main(String[] args) {
        System.out.println("============================================");
        System.out.println("УРОК ООП: ДЕМОНСТРАЦИЯ ПРИНЦИПОВ");
        System.out.println("============================================\n");

        // ============================================
        // ДЕМОНСТРАЦИЯ НАСЛЕДОВАНИЯ И ПОЛИМОРФИЗМА
        // ============================================
        
        // Создаем массив Animal, но заполняем разными типами!
        // Это возможно благодаря наследованию: Cat IS-A Animal
        
        Animal[] zoo = {
            new Cat(5),      // кот с голодом 5
            new Dog(3),      // собака с голодом 3
            new Bird(7)      // птица с голодом 7
        };

        System.out.println("=== ПОЛИМОРФИЗМ В ДЕЙСТВИИ ===");
        System.out.println("Один цикл обрабатывает ВСЕХ животных:\n");
        
        // Полиморфизм: вызываем makeSound() для всех животных
        // Каждое животное издаст СВОЙ звук!
        for (Animal animal : zoo) {
            System.out.print("Звук: ");
            animal.makeSound(); // ПОЛИМОРФИЗМ! Один метод, разные реализации
            
            System.out.print("До еды голод: " + animal.getHungerLevel() + " -> ");
            animal.eat(); // все животные умеют есть (наследование)
            
            System.out.print("После сна голод: ");
            animal.sleep(); // все животные умеют спать (наследование)
            System.out.println();
        }

        System.out.println("\n=== ИНКАПСУЛЯЦИЯ В ДЕЙСТВИИ ===");
        // Попробуем напрямую изменить hungerLevel? НЕТ, он private!
        // animal.hungerLevel = 999; // ОШИБКА КОМПИЛЯЦИИ!
        // Мы используем getter и setter - это инкапсуляция!
        
        Cat cat = new Cat();
        System.out.println("Голод кота через getter: " + cat.getHungerLevel());
        cat.setHungerLevel(9); // безопасное изменение через setter
        System.out.println("Новый голод: " + cat.getHungerLevel());

        System.out.println("\n=== АБСТРАКЦИЯ ===");
        // Animal animal = new Animal(); // ОШИБКА! Animal - абстрактный!
        // Мы не можем создать абстрактный класс напрямую.
        // Это как попытаться создать "транспорт" - абсурд!
        System.out.println("Animal - абстрактный класс, нельзя создать напрямую!");
        System.out.println("Но можно создать Cat, Dog, Bird - конкретные реализации!\n");

        System.out.println("=== УНИКАЛЬНЫЕ МЕТОДЫ ===");
        // Чтобы вызвать уникальный метод, нужно знать конкретный тип
        Cat myCat = new Cat();
        myCat.knockThingsOffTable(); // метод есть только у кота
        
        Dog myDog = new Dog();
        myDog.fetchBall(); // метод есть только у собаки
        
        Bird myBird = new Bird();
        myBird.fly(); // метод есть только у птицы

        System.out.println("\n=== ПРИВЕДЕНИЕ ТИПОВ (CASTING) ===");
        Animal mysteryAnimal = new Cat(); // переменная типа Animal
        // mysteryAnimal.knockThingsOffTable(); // ОШИБКА! Animal не знает об этом методе
        
        // Но мы можем проверить тип и привести:
        if (mysteryAnimal instanceof Cat) {
            Cat realCat = (Cat) mysteryAnimal; // приведение типа
            realCat.knockThingsOffTable(); // теперь можем вызвать!
        }
    }
}
