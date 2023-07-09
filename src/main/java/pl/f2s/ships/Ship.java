package pl.f2s.ships;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ship {
    @Id
    private int shipId;
    private String name;
    private String shape;
    private int size;

    public Ship(int shipId, String name, String shape, int size) {
        this.shipId = shipId;
        this.name = name;
        this.shape = shape;
        this.size = size;
    }

    public Ship() {

    }

    public int getShipId() {
        return shipId;
    }

    public void setShipId(int shipId) {
        this.shipId = shipId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "shipId=" + shipId +
                ", name='" + name + '\'' +
                ", shape='" + shape + '\'' +
                ", size=" + size +
                '}';
    }
}
