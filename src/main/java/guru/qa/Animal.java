package guru.qa;

public class Animal {
    int age;
    int choice;
    String name;
    String say;

    public Animal(int age, String name, String say) {
        this.age = age;
        this.name = name;
        this.say = say;
    }

    public Animal() {
    }

    void say() {
        System.out.println("Meow");
    }

    void goToVet() {

        if (choice == 1) {
            System.out.println("Нет, ему еще рано!");
        } else if (choice == 2) {
            System.out.println("Правильно! Котик доволен!");
        }
        else{
            System.out.println("Котик злится! Команда неправильная!");
        }
    }
}