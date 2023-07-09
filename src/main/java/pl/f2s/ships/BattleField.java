package pl.f2s.ships;

import jakarta.persistence.*;

import java.util.Map;

@Entity
public class BattleField {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int shipId;
    private String cell;
    private boolean hit;
    private boolean active;

    public BattleField(int shipId, String cell, boolean hit, boolean active) {
        this.shipId = shipId;
        this.cell = cell;
        this.hit = hit;
        this.active = active;
    }

    public BattleField() {
    }

}
