public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food){
        this.food = food;
    }

    public void deacreseFood(int appetite){
        this.food -= appetite;
    }

    public void addFood(int foodCount){
        this.food += foodCount;
    }

    public boolean isFoodEnough(int foodCount){
        return  getFood() >= foodCount;
    }
    public void info(){
        System.out.println("Plate: " + food);
    }
}
