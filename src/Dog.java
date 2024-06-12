public class Dog extends Animal {
    private static int count = 0;
    private int runLimit = 500;
    private int swimLimit = 10;

    public Dog() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println("Собака пробежала " + distance + " м.");
        } else {
            System.out.println("Собака не может пробежать такое расстояние");
        }
    }

    public void swim(int distance) {
        if (distance <= swimLimit) {
            System.out.println("Собака проплыла " + distance + " м.");
        } else {
            System.out.println("Собака не может проплыть такое расстояние");
        }
    }
}
