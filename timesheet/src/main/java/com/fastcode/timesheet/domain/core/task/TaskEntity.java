package com.fastcode.timesheet.domain.core.task;

import com.fastcode.timesheet.domain.core.abstractentity.AbstractEntity;
import com.fastcode.timesheet.domain.core.project.ProjectEntity;
import com.fastcode.timesheet.domain.core.timesheetdetails.TimesheetdetailsEntity;
import com.fastcode.timesheet.domain.core.usertask.UsertaskEntity;
import java.time.*;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.javers.core.metamodel.annotation.ShallowReference;

@Entity
@Table(name = "task")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class TaskEntity extends AbstractEntity {

    @Basic
    @Column(name = "description", nullable = true, length = 255)
    private String description;

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Basic
    @Column(name = "isactive", nullable = false)
    private Boolean isactive;

    @Basic
    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "projectid")
    private ProjectEntity project;

    @ShallowReference
    @OneToMany(mappedBy = "task", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<TimesheetdetailsEntity> timesheetdetailsSet = new HashSet<TimesheetdetailsEntity>();

    public void addTimesheetdetails(TimesheetdetailsEntity timesheetdetails) {
        timesheetdetailsSet.add(timesheetdetails);
        timesheetdetails.setTask(this);
    }

    public void removeTimesheetdetails(TimesheetdetailsEntity timesheetdetails) {
        timesheetdetailsSet.remove(timesheetdetails);
        timesheetdetails.setTask(null);
    }

    @ShallowReference
    @OneToMany(mappedBy = "task", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<UsertaskEntity> usertasksSet = new HashSet<UsertaskEntity>();

    public void addUsertasks(UsertaskEntity usertasks) {
        usertasksSet.add(usertasks);
        usertasks.setTask(this);
    }

    public void removeUsertasks(UsertaskEntity usertasks) {
        usertasksSet.remove(usertasks);
        usertasks.setTask(null);
    }
}
