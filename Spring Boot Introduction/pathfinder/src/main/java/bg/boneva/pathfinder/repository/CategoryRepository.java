package bg.boneva.pathfinder.repository;

import bg.boneva.pathfinder.model.CategoriesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoriesEntity, Long> {
}
