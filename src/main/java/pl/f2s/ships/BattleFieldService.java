package pl.f2s.ships;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class BattleFieldService {
    private final BattleFieldRepository battleFieldRepository;

    public BattleFieldService(BattleFieldRepository battleFieldRepository) {
        this.battleFieldRepository = battleFieldRepository;
    }

    @Transactional
    public void save(BattleField battleField) {
       battleFieldRepository.save(battleField);
    }
}
