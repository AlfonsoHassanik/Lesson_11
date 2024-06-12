public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        Bowl bowl = new Bowl(15);

        Cat[] cats = {cat1, cat2};

        for (Cat cat : cats) {
            cat.eat(bowl.getFood());
            System.out.println("Кот сыт: " + cat.isFull());
        }

        bowl.addFood(10);
    }
}