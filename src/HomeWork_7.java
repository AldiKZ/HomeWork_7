import java.util.Scanner;

public class HomeWork_7 {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat(5, "Barsik"),
                new Cat(4, "Markiz"),
                new Cat(7, "Murka"),
        };
        Plate plate = new Plate(15);

        printInfo(cats, plate);
        haveLunch(cats, plate);

        printInfo(cats, plate);

        addFood(plate);

    }

    private static void addFood(Plate plate) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new food count: ");
        int foodCount = sc.nextInt();
        plate.addFood(foodCount);
    }

    private static void haveLunch(Cat[] cats, Plate plate) {
        for (Cat cat : cats){
            boolean result = cat.eat(plate);
            System.out.printf("Did Cat '%s' eat? Answer: %s%m", cat.getName(), result);
        }
        System.out.println();
    }

    private static void printInfo(Cat[] cats, Plate plate){
        System.out.println("--- info ---");
        plate.info();
        printInfo(cats);
        System.out.println("----");
        System.out.println();
    }

    private static void printInfo(Cat... cats) {
        for (Cat cat : cats) {
            System.out.printf("Is cat '%s(appetite: %d)' hungry? Answer: %s%n",
                    cat.getName(),
                    cat.getAppetite(),
                    !cat.isSatiety());
        }
    }
}
