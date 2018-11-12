package pokemonspring.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pokemonspring.model.dto.Attack;

@Repository
public interface AttackRepository extends JpaRepository<Attack, Long> {
    /*
      All that is needed.
      only add to this if there are other types of queries that is needed
     */
}
