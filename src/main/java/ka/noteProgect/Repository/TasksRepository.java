package ka.noteProgect.Repository;

import ka.noteProgect.Entities.Tasks;
import org.springframework.data.repository.CrudRepository;

public interface TasksRepository extends CrudRepository<Tasks, Long> {


}