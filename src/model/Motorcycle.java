package model;

public class Motorcycle implements Vehicle {
    private String name;
    private double repairCost;

    public Motorcycle(String name, double repairCost) {
        this.name = name;
        this.repairCost = repairCost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getRepairCost() {
        return repairCost;
    }

    @Override
    public String toString() {
        return "Motorcycle{" + "name='" + name + '\'' + ", repairCost=" + repairCost + '}';
    }
}
