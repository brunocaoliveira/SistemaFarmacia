package projeto.farmacia.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto.farmacia.Entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
