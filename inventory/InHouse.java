package com.rs.inventory;

public class InHouse extends Part{
    private int machineId;
    public InHouse(int id, String name, double price, int stock, int min, int max, int machineID) {
        super(id, name, price, stock, min, max);
    }
    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }
    public int getMachineId() {
        return this.machineId;
    }
}
