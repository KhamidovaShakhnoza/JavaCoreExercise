package BookOOP.Ch10.Ex2;

public class BMI {
    private String name;
    private int age;
    private double weight;
    private double feet;
    private double inches;

    public BMI(String name, int age, double weight, double feet, double inches) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.feet = feet;
        this.inches = inches;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getFeet() {
        return feet;
    }

    public double getInches() {
        return inches;
    }

    @Override
    public String toString() {
        return "BMI{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", feet=" + feet +
                ", inches=" + inches +
                '}';
    }
}
