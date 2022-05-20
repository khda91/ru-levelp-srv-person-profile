package ru.levelp.srv.person.profile.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import ru.levelp.srv.person.profile.api.data.CreatePersonData;
import ru.levelp.srv.person.profile.api.data.PersonData;
import ru.levelp.srv.person.profile.api.data.PersonListResponse;
import ru.levelp.srv.person.profile.model.Person;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonMapper extends UuidToStringMappingStrategy {

    Person toPerson(CreatePersonData createPersonData);

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "email", target = "email"),
            @Mapping(source = "role", target = "role"),
            @Mapping(source = "placeOfWork", target = "placeOfWork"),
            @Mapping(source = "firstName", target = "identity.firstName"),
            @Mapping(source = "lastName", target = "identity.lastName"),
            @Mapping(source = "middleName", target = "identity.middleName"),
            @Mapping(source = "gender", target = "identity.gender"),
            @Mapping(source = "dateOfBirth", target = "identity.dateOfBirth"),
            @Mapping(source = "placeOfBirth", target = "identity.placeOfBirth"),
            @Mapping(source = "passportSeries", target = "identity.passport.series"),
            @Mapping(source = "passportNumber", target = "identity.passport.number"),
            @Mapping(source = "placeOfIssue", target = "identity.passport.placeOfIssue"),
            @Mapping(source = "dateOfIssue", target = "identity.passport.dateOfIssue"),
            @Mapping(source = "departmentCode", target = "identity.passport.departmentCode"),
            @Mapping(source = "street", target = "address.street"),
            @Mapping(source = "houseNumber", target = "address.houseNumber"),
            @Mapping(source = "houseBuilding", target = "address.houseBuilding"),
            @Mapping(source = "houseLetter", target = "address.houseLetter"),
            @Mapping(source = "flat", target = "address.flat"),
            @Mapping(source = "city", target = "address.city"),
            @Mapping(source = "postalCode", target = "address.postalCode")
    })
    PersonData toPersonData(Person person);

    @Mappings({
            @Mapping(source = "people", target = "data"),
            @Mapping(source = "limit", target = "meta.pagination.limit"),
            @Mapping(source = "offset", target = "meta.pagination.offset"),
            @Mapping(source = "totalCount", target = "meta.pagination.totalCount")
    })
    PersonListResponse toPersonListResponse(Integer limit, Integer offset, Integer totalCount, List<PersonData> people);
}
