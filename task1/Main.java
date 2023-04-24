package task1;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        var cats = Cat.makeCats(10);
        Printer.print(cats);

        System.out.println("Сортировка по породе");
        cats.sort(Comparator.comparing(Cat::getBreed));
        Printer.print(cats);

        System.out.println("Сортировка по имени и возрасту");
        cats.sort(Comparator.comparing(Cat:: getName).thenComparing(Cat::getAge));
        Printer.print(cats);

      // cats.removeIf(Cat:: byName);

        // А сюда добавьте код, который будет сортировать коллекцию котов
        // используйте лямбда-выражения и ссылки на методы
        // cats.sort(?);
        // Printer.print(cats);
    }
}
