package repository;

import model.Vehicle;

public class VehicleRepository implements IRepository {
    private Vehicle[] vehicles;
    private int size;
    private final int capacity;

    public VehicleRepository(int capacity) {
        this.capacity = capacity;
        this.vehicles = new Vehicle[capacity];
        this.size = 0;
    }

    @Override
    public void add(Vehicle v) throws Exception {
        if (size >= capacity) {
            throw new Exception("Repository is full!");
        }
        vehicles[size++] = v;
    }

    @Override
    public void remove(String name) throws Exception {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (vehicles[i].getName().equalsIgnoreCase(name)) {
                index = i;
                break;
            }
        }
        if (index == -1) throw new Exception("Vehicle not found!");

        for (int i = index; i < size - 1; i++) {
            vehicles[i] = vehicles[i + 1];
        }
        size--;
    }

    @Override
    public Vehicle[] getAll() {
        Vehicle[] copy = new Vehicle[size];
        System.arraycopy(vehicles, 0, copy, 0, size);
        return copy;
    }
}
