package repository;

import model.Vehicle;

public interface IRepository {
    void add(Vehicle v) throws Exception;
    void remove(String name) throws Exception;
    Vehicle[] getAll();
}
