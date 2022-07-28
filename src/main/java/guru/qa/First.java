package guru.qa;

import java.util.Scanner;

public class First {

    public static void main(String[] args) {

        Animal cat = new Animal(5, "Stray", "Meow!");
        Animal stray = new Animal();

        System.out.println("Кота зовут " + cat.name + '.');
        System.out.println("Ему " + cat.age + " лет.");

        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1, чтобы мяукнуть");
        int num = in.nextInt();

        if (num == 1) {
            System.out.println(cat.say);
        }
        else {
            System.out.println("Котик злится! Команда неправильная!");
        }

        System.out.println("В 10 лет ему нужно к ветеринару. Пора его отправлять?");
        System.out.println("Введите 1, если да, введите 2, если нет.");
        stray.choice = in.nextInt();
        stray.goToVet();
    }
}
