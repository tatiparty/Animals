import animals.*;
import animals.options.Options;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<Animal>();

        Scanner sc = new Scanner(System.in);

        boolean isExit = true;
        while(isExit){
            System.out.println("Введите, какую команду из меню выполнить: add/list/exit");
            String choice = sc.next().toUpperCase().trim();

            String option1 = Options.ADD.getOpt();
            String option2 = Options.LIST.getOpt();
            String option3 = Options.EXIT.getOpt();

            switch (choice){
                case "ADD":
                    if (choice.matches(option1)) {
                        System.out.println("Введите, какое животное добавить: кот/кошка/пёс/собака/утка");
                        String animalType = sc.next();
                        if (animalType.matches("кот") || animalType.matches("кошка")) {
                            Animal cat = new Cat();
                            CreateAnimal(cat, sc);
                            animals.add(cat);
                            cat.say();
                        } else if (animalType.matches("собака") || animalType.matches("пес") || animalType.matches("пёс")) {
                            Animal dog = new Dog();
                            CreateAnimal(dog, sc);
                            animals.add(dog);
                            dog.say();
                        } else if (animalType.matches("утка")) {
                            Animal duck = new Duck();
                            CreateAnimal(duck, sc);
                            animals.add(duck);
                            duck.say();
                            Flying f = new Duck();
                            f.Fly();
                        } else {
                            System.out.println("Некорректный ввод");
                            break;
                        }
                    }
                case "LIST":
                    if(choice.matches(option1) || choice.matches(option2)) {
                        if (animals.size() == 0) {
                            System.out.println("В список пока не было добавлено ни одного животного");
                        } else {
                            System.out.println("\n" + "Добавленные животные:");
                            for (Animal animal : animals) {
                                System.out.println(animal);
                            }
                        }
                        break;
                    }
                case "EXIT":
                    if(choice.matches(option3)) {
                        System.out.println("Выход");
                        isExit = false;
                        break;
                    }
                default:
                    System.out.println("Некорректный ввод");
            }

        }
    }
    public static void CreateAnimal(Animal animal, Scanner scanner){
        try {
            System.out.println("Введите имя животного");
            animal.setName(scanner.next());
            System.out.println("Введите возраст животного (только цифры)");
            animal.setAge(scanner.nextInt());
            System.out.println("Введите вес животного (только цифры)");
            animal.setWeight(scanner.nextInt());
            System.out.println("Введите цвет животного");
            animal.setColor(scanner.next());
        }
        catch (Exception e){
            System.out.println("Вероятно вы ввели неверный формат данных");
            System. exit(0);
        }
    }
}
