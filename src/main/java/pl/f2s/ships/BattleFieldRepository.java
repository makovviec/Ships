package pl.f2s.ships;

import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class BattleFieldRepository {
    private final EntityManager entityManager;

    public BattleFieldRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public void save(BattleField battleField) {
        entityManager.persist(battleField);
    }
}
