package task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var cats = Cat.makeCats(10);
        Printer.print(cats);

        System.out.println("      Сортировка по породе");
        List<Cat> catsBreed = Cat.copy(cats);
        catsBreed.sort(Comparator.comparing(Cat::getBreed));
        Printer.print(catsBreed);

        System.out.println("      Сортировка по имени и возрасту");
        List<Cat> catsNameAge = Cat.copy(cats);
        catsNameAge.sort(Comparator.comparing(Cat:: getName).thenComparing(Cat::getAge));
        Printer.print(catsNameAge);

        System.out.println("      Удаление котов определенной породы");
        List<Cat> catsRemoveBreed = Cat.copy(cats);
        catsRemoveBreed.removeIf(cat -> cat.getColor().equals(Cat.Color.GINGER));
        Printer.print(catsRemoveBreed);

        System.out.println("      Удаление котов с длинным именем");
        List<Cat> catsRemoveLongName = Cat.copy(cats);
        catsRemoveLongName.removeIf(cat -> cat.getName().length() == 5);
        Printer.print(catsRemoveLongName);
    }
}
