package Polymorphism;

public class healthyBurger extends hamburger{
    private String healthyExtraName;
    private boolean healthyExtraPrice;

    private String healthyExtra1Name;
    private boolean healthyExtra1Price;

    public healthyBurger(String name, String meat, double price, String breadRollType) {
        super("Healthy", meat, price, "Brown rye");
    }
}
