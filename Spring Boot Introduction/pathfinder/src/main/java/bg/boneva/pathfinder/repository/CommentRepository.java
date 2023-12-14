package bg.boneva.pathfinder.repository;

import bg.boneva.pathfinder.model.CommentsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<CommentsEntity, Long> {
}
