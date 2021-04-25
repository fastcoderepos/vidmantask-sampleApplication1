package com.fastcode.timesheet.domain.extended.usertask;

import com.fastcode.timesheet.domain.core.usertask.IUsertaskRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.stereotype.Repository;

@JaversSpringDataAuditable
@Repository("usertaskRepositoryExtended")
public interface IUsertaskRepositoryExtended extends IUsertaskRepository {
    //Add your custom code here
}
