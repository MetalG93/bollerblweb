package hu.gergelyurban.bollerbweb.repository;

import hu.gergelyurban.bollerbweb.entity.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TeamRepository extends JpaRepository<TeamEntity, Integer> {
    
    Optional<TeamEntity> findByName(String name);
    
    void deleteByName(String name);
    
}