package pokemonspring.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pokemonspring.model.dto.Type;

@Repository
public interface TypeRepository extends JpaRepository<Type, Long> {
    /*
      All that is needed.
      only add to this if there are other types of queries that is needed
     */

}
