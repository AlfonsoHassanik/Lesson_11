public class Cat extends Animal {
    private static int count = 0;
    private int runLimit = 200;
    private boolean isFull = false;

    public Cat() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println("Кот пробежал " + distance + " м.");
        } else {
            System.out.println("Кот не может пробежать такое расстояние");
        }
    }

    public void eat(int amount) {
        if (amount > 0) {
            isFull = true;
            System.out.println("Кот покушал");
        } else {
            System.out.println("В миске недостаточно еды");
        }
    }

    public boolean isFull() {
        return isFull;
    }
}