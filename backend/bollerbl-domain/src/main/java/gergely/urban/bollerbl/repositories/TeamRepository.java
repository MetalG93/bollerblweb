package gergely.urban.bollerbl.repositories;

import gergely.urban.bollerbl.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, String> {
}
