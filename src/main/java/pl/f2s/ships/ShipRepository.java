package pl.f2s.ships;

import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ShipRepository {
    private final EntityManager entityManager;

    public ShipRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public void save(Ship ship) {
        entityManager.persist(ship);
    }
}
