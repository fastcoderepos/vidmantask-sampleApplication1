package com.fastcode.timesheet.application.core.authorization.users;

import com.fastcode.timesheet.application.core.authorization.users.dto.*;
import com.fastcode.timesheet.commons.search.SearchCriteria;
import com.fastcode.timesheet.domain.core.authorization.users.UsersEntity;
import com.fastcode.timesheet.domain.core.authorization.userspreference.UserspreferenceEntity;
import java.util.*;
import org.springframework.data.domain.Pageable;

public interface IUsersAppService {
    //CRUD Operations

    CreateUsersOutput create(CreateUsersInput users);

    void delete(Long id);

    UpdateUsersOutput update(Long id, UpdateUsersInput input);

    FindUsersByIdOutput findById(Long id);

    List<FindUsersByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;

    UserspreferenceEntity createDefaultUsersPreference(UsersEntity users);

    void updateTheme(UsersEntity users, String theme);

    void updateLanguage(UsersEntity users, String language);

    void updateUsersData(FindUsersWithAllFieldsByIdOutput users);

    UsersProfile updateUsersProfile(FindUsersWithAllFieldsByIdOutput users, UsersProfile usersProfile);

    FindUsersWithAllFieldsByIdOutput findWithAllFieldsById(Long usersId);

    UsersProfile getProfile(FindUsersByIdOutput user);

    UsersEntity getUsers();

    FindUsersByUsernameOutput findByUsername(String username);

    FindUsersByUsernameOutput findByEmailaddress(String emailAddress);

    //Join Column Parsers

    Map<String, String> parseDashboardsJoinColumn(String keysString);

    Map<String, String> parseDashboardversionsJoinColumn(String keysString);

    Map<String, String> parseReportsJoinColumn(String keysString);

    Map<String, String> parseReportversionsJoinColumn(String keysString);

    Map<String, String> parseTimesheetsJoinColumn(String keysString);

    Map<String, String> parseUserspermissionsJoinColumn(String keysString);

    Map<String, String> parseUsersrolesJoinColumn(String keysString);

    Map<String, String> parseUsertasksJoinColumn(String keysString);
}
