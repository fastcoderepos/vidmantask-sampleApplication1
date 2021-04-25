package com.fastcode.timesheet.domain.extended.customer;

import com.fastcode.timesheet.domain.core.customer.ICustomerRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.stereotype.Repository;

@JaversSpringDataAuditable
@Repository("customerRepositoryExtended")
public interface ICustomerRepositoryExtended extends ICustomerRepository {
    //Add your custom code here
}
