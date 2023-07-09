package pl.f2s.ships;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ShipsApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ShipsApplication.class, args);
        BattleField battleField = new BattleField();
        BattleFieldRepository contextBattleField = context.getBean(BattleFieldRepository.class);
        for (int i = 0; i < BattleFieldSize.rows.size(); i++) {
            for (int j = 0; j < BattleFieldSize.cols.size(); j++) {
                contextBattleField.save(new BattleField(0, BattleFieldSize.rows.get(i) + BattleFieldSize.cols.get(j), false, false));
            }
        }
        Ship ship1 = new Ship(1, "Potiomkin", "L", 5);
        ShipRepository shipRepository = context.getBean(ShipRepository.class);
        shipRepository.save(ship1);
    }

}
