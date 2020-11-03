package gergely.urban.bollerbl.repositories;

import gergely.urban.bollerbl.domain.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, String> {
    Artist findByContactName(String name);
}
