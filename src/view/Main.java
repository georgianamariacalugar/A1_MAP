package view;

import controller.VehicleController;
import model.*;
import repository.VehicleRepository;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            VehicleRepository repo = new VehicleRepository(10);
            VehicleController controller = new VehicleController(repo);


            controller.addVehicle(new Car("Dacia", 850));
            controller.addVehicle(new Truck("Volvo", 2500));
            controller.addVehicle(new Motorcycle("Audi", 1200));
            controller.addVehicle(new Car("BMW", 3000));
            controller.addVehicle(new Motorcycle("Honda", 700));

            System.out.println("All vehicles:");
            for (Vehicle v : controller.getAllVehicles()) {
                System.out.println(v);
            }


            Vehicle newVehicle = new Car("Mercedes", 1800);
            controller.addVehicle(newVehicle);

            System.out.println("Vehicle added");
            System.out.println("\nAll vehicles after adding:");
            for (Vehicle v : controller.getAllVehicles()) {
                System.out.println(v);
            }


            controller.removeVehicle("Audi");

            System.out.println("\nAll vehicles after removal:");
            for (Vehicle v : controller.getAllVehicles()) {
                System.out.println(v);
            }


            System.out.println("\nVehicles with repair cost > 1000:");
            List<Vehicle> expensive = controller.getVehiclesWithRepairCostAbove(1000);
            for (Vehicle v : expensive) {
                System.out.println(v);
            }

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
