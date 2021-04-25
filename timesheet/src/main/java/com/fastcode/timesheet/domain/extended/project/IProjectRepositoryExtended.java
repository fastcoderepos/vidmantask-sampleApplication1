package com.fastcode.timesheet.domain.extended.project;

import com.fastcode.timesheet.domain.core.project.IProjectRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.stereotype.Repository;

@JaversSpringDataAuditable
@Repository("projectRepositoryExtended")
public interface IProjectRepositoryExtended extends IProjectRepository {
    //Add your custom code here
}
