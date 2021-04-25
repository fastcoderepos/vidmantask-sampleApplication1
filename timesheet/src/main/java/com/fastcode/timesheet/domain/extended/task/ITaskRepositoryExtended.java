package com.fastcode.timesheet.domain.extended.task;

import com.fastcode.timesheet.domain.core.task.ITaskRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.stereotype.Repository;

@JaversSpringDataAuditable
@Repository("taskRepositoryExtended")
public interface ITaskRepositoryExtended extends ITaskRepository {
    //Add your custom code here
}
