package controller;

import model.Vehicle;
import repository.IRepository;

import java.util.ArrayList;
import java.util.List;

public class VehicleController {
    private IRepository repo;

    public VehicleController(IRepository repo) {
        this.repo = repo;
    }

    public void addVehicle(Vehicle v) throws Exception {
        repo.add(v);
    }

    public void removeVehicle(String name) throws Exception {
        repo.remove(name);
    }

    public List<Vehicle> getVehiclesWithRepairCostAbove(double threshold) {
        Vehicle[] all = repo.getAll();
        List<Vehicle> result = new ArrayList<>();
        for (Vehicle v : all) {
            if (v.getRepairCost() > threshold) {
                result.add(v);
            }
        }
        return result;
    }

    public Vehicle[] getAllVehicles() {
        return repo.getAll();
    }
}
