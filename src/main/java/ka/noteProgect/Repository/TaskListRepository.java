package ka.noteProgect.Repository;

import ka.noteProgect.Entities.TaskList;
import org.springframework.data.repository.CrudRepository;

public interface TaskListRepository extends CrudRepository<TaskList, Long> {


}