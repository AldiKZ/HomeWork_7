public class Cat {
    private final int appetite;
    private final String name;
    private boolean satiety;

    public Cat(int appetite, String name) {
        this.appetite = appetite;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAppetite(){
        return appetite;
    }

    public boolean eat(Plate plate){
        String validateMessage = checkEat(plate);
        if (validateMessage != null){
            System.out.println(validateMessage);
            return false;
        }

        doEat(plate);
        satiety = true;
        return true;
    }
    private String checkEat(Plate plate){
        if (!plate.isFoodEnough(appetite)){
            return "Food isn't enough in the plate";
        }
        if (satiety){
            return "Cat is already satiety"
        }
        return null;
    }

    private void doEat(Plate plate){
        plate.deacreseFood(appetite);
    }

    public boolean isSatiety(){
        return satiety;
    }
}
