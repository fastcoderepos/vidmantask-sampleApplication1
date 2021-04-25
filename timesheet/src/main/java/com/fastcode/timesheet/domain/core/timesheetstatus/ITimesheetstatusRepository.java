package com.fastcode.timesheet.domain.core.timesheetstatus;

import java.time.*;
import java.util.*;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@JaversSpringDataAuditable
@Repository("timesheetstatusRepository")
public interface ITimesheetstatusRepository
    extends JpaRepository<TimesheetstatusEntity, Long>, QuerydslPredicateExecutor<TimesheetstatusEntity> {}
