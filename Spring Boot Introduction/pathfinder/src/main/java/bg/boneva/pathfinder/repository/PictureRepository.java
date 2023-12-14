package bg.boneva.pathfinder.repository;

import bg.boneva.pathfinder.model.PicturesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PictureRepository extends JpaRepository<PicturesEntity, Long> {
}
