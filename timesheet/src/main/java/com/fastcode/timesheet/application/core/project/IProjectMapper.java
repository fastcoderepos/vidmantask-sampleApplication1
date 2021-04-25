package com.fastcode.timesheet.application.core.project;

import com.fastcode.timesheet.application.core.project.dto.*;
import com.fastcode.timesheet.domain.core.customer.CustomerEntity;
import com.fastcode.timesheet.domain.core.project.ProjectEntity;
import java.time.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface IProjectMapper {
    ProjectEntity createProjectInputToProjectEntity(CreateProjectInput projectDto);

    @Mappings(
        {
            @Mapping(source = "entity.customer.customerid", target = "customerid"),
            @Mapping(source = "entity.customer.customerid", target = "customerDescriptiveField"),
        }
    )
    CreateProjectOutput projectEntityToCreateProjectOutput(ProjectEntity entity);

    ProjectEntity updateProjectInputToProjectEntity(UpdateProjectInput projectDto);

    @Mappings(
        {
            @Mapping(source = "entity.customer.customerid", target = "customerid"),
            @Mapping(source = "entity.customer.customerid", target = "customerDescriptiveField"),
        }
    )
    UpdateProjectOutput projectEntityToUpdateProjectOutput(ProjectEntity entity);

    @Mappings(
        {
            @Mapping(source = "entity.customer.customerid", target = "customerid"),
            @Mapping(source = "entity.customer.customerid", target = "customerDescriptiveField"),
        }
    )
    FindProjectByIdOutput projectEntityToFindProjectByIdOutput(ProjectEntity entity);

    @Mappings(
        {
            @Mapping(source = "customer.description", target = "description"),
            @Mapping(source = "customer.name", target = "name"),
            @Mapping(source = "foundProject.id", target = "projectId"),
        }
    )
    GetCustomerOutput customerEntityToGetCustomerOutput(CustomerEntity customer, ProjectEntity foundProject);
}
