package com.fastcode.timesheet.domain.extended.authorization.usersrole;

import com.fastcode.timesheet.domain.core.authorization.usersrole.IUsersroleRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.stereotype.Repository;

@JaversSpringDataAuditable
@Repository("usersroleRepositoryExtended")
public interface IUsersroleRepositoryExtended extends IUsersroleRepository {
    //Add your custom code here
}
