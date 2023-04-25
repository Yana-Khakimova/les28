package task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var cats = new ArrayList<ActiveCat>();
        cats.add(new ActiveCat(() ->ActiveCat.eat()));
        cats.add(new ActiveCat(() ->ActiveCat.jump()));
        cats.add(new ActiveCat(() ->ActiveCat.sleep()));
        cats.add(new ActiveCat(() ->ActiveCat.purr()));
        cats.add(new ActiveCat(() ->ActiveCat.play()));
        cats.add(new ActiveCat(() ->ActiveCat.play()));

        cats.forEach(ActiveCat::doAction);
    }

}
