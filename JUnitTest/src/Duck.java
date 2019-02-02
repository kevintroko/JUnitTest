public class Duck {

    private String name;
    private boolean hunger = false;

    public Duck(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isHunger() {
        return hunger;
    }

    public int getYearsHumanYears(int age) {
        return age*7;
    }
}
