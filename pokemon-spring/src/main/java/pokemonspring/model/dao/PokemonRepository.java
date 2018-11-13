package pokemonspring.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pokemonspring.model.dto.Pokemon;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
    /*
      No code is needed in here because it is extending JpaRepository.
      With this here we can Save(), findOne(), findAll(), count(), delete() etc.
      These methods are already implemented by Spring Data JPA's SimpleJpaRepository.
      This is ran automatically by Spring.

      only add to this if there are other types of queries that is needed
     */
}
