package com.fastcode.timesheet.domain.extended.timesheetdetails;

import com.fastcode.timesheet.domain.core.timesheetdetails.ITimesheetdetailsRepository;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.stereotype.Repository;

@JaversSpringDataAuditable
@Repository("timesheetdetailsRepositoryExtended")
public interface ITimesheetdetailsRepositoryExtended extends ITimesheetdetailsRepository {
    //Add your custom code here
}
