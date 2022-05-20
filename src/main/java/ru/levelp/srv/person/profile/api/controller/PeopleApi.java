/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.0.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package ru.levelp.srv.person.profile.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.levelp.srv.person.profile.api.data.CreatePersonData;
import ru.levelp.srv.person.profile.api.data.CreatePersonMessengerData;
import ru.levelp.srv.person.profile.api.data.CreatePersonSocialNetworkData;
import ru.levelp.srv.person.profile.api.data.PersonListResponse;
import ru.levelp.srv.person.profile.api.data.PersonMessengerListResponse;
import ru.levelp.srv.person.profile.api.data.PersonResponse;
import ru.levelp.srv.person.profile.api.data.PersonRole;
import ru.levelp.srv.person.profile.api.data.PersonSocialNetworkListResponse;
import ru.levelp.srv.person.profile.api.data.ProblemResponse;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-20T20:35:45.386531+03:00[Europe/Moscow]")
@Validated
@Api(value = "people", description = "the people API")
public interface PeopleApi {

    /**
     * POST /people/{personId}/messengers
     * Add a new messenger to a person.
     *
     * @param personId                  Universally unique identifier of the person. (required)
     * @param createPersonMessengerData (optional)
     * @return Request has been successfully processed. (status code 201)
     * or A malformed request was sent. (status code 400)
     * or Authentication is required to access the resource. (status code 401)
     * or There are no permissions to access the resource. (status code 403)
     * or A server side error occurred while processing the request. (status code 500)
     */
    @ApiOperation(value = "", nickname = "addMessengerToPerson", notes = "Add a new messenger to a person.", tags = {"people",})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Request has been successfully processed."),
            @ApiResponse(code = 400, message = "A malformed request was sent.", response = ProblemResponse.class),
            @ApiResponse(code = 401, message = "Authentication is required to access the resource.", response = ProblemResponse.class),
            @ApiResponse(code = 403, message = "There are no permissions to access the resource.", response = ProblemResponse.class),
            @ApiResponse(code = 500, message = "A server side error occurred while processing the request.", response = ProblemResponse.class)})
    @PostMapping(
            value = "/people/{personId}/messengers",
            produces = {"application/problem+json"},
            consumes = {"application/json"}
    )
    ResponseEntity<Void> addMessengerToPerson(@Pattern(regexp = "^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$") @ApiParam(value = "Universally unique identifier of the person.", required = true) @PathVariable("personId") String personId, @ApiParam(value = "") @Valid @RequestBody(required = false) CreatePersonMessengerData createPersonMessengerData);


    /**
     * POST /people/{personId}/social-network
     * Add a new social network to a person.
     *
     * @param personId                      Universally unique identifier of the person. (required)
     * @param createPersonSocialNetworkData (optional)
     * @return Request has been successfully processed. (status code 201)
     * or A malformed request was sent. (status code 400)
     * or Authentication is required to access the resource. (status code 401)
     * or There are no permissions to access the resource. (status code 403)
     * or A server side error occurred while processing the request. (status code 500)
     */
    @ApiOperation(value = "", nickname = "addSocialNetworkToPerson", notes = "Add a new social network to a person.", tags = {"people",})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Request has been successfully processed."),
            @ApiResponse(code = 400, message = "A malformed request was sent.", response = ProblemResponse.class),
            @ApiResponse(code = 401, message = "Authentication is required to access the resource.", response = ProblemResponse.class),
            @ApiResponse(code = 403, message = "There are no permissions to access the resource.", response = ProblemResponse.class),
            @ApiResponse(code = 500, message = "A server side error occurred while processing the request.", response = ProblemResponse.class)})
    @PostMapping(
            value = "/people/{personId}/social-network",
            produces = {"application/problem+json"},
            consumes = {"application/json"}
    )
    ResponseEntity<Void> addSocialNetworkToPerson(@Pattern(regexp = "^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$") @ApiParam(value = "Universally unique identifier of the person.", required = true) @PathVariable("personId") String personId, @ApiParam(value = "") @Valid @RequestBody(required = false) CreatePersonSocialNetworkData createPersonSocialNetworkData);


    /**
     * POST /people
     * Creates a new person record.
     *
     * @param createPersonData (optional)
     * @return The request has been successfully processed. The body contains the results. (status code 201)
     * or A malformed request was sent. (status code 400)
     * or Authentication is required to access the resource. (status code 401)
     * or There are no permissions to access the resource. (status code 403)
     * or A server side error occurred while processing the request. (status code 500)
     */
    @ApiOperation(value = "", nickname = "createPerson", notes = "Creates a new person record.", response = PersonResponse.class, tags = {"people",})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "The request has been successfully processed. The body contains the results.", response = PersonResponse.class),
            @ApiResponse(code = 400, message = "A malformed request was sent.", response = ProblemResponse.class),
            @ApiResponse(code = 401, message = "Authentication is required to access the resource.", response = ProblemResponse.class),
            @ApiResponse(code = 403, message = "There are no permissions to access the resource.", response = ProblemResponse.class),
            @ApiResponse(code = 500, message = "A server side error occurred while processing the request.", response = ProblemResponse.class)})
    @PostMapping(
            value = "/people",
            produces = {"application/json", "application/problem+json"},
            consumes = {"application/json"}
    )
    ResponseEntity<PersonResponse> createPerson(@ApiParam(value = "") @Valid @RequestBody(required = false) CreatePersonData createPersonData);


    /**
     * GET /people
     * Returns all people found according to the search criteria.
     *
     * @param limit  Standard pagination parameter. Defines the maximum number of entries returned in the response. (optional, default to 10)
     * @param offset Standard pagination parameter. Defines the number of entries to skip before beginning to return the search results. (optional, default to 0)
     * @param email  Person&#39;s email (optional)
     * @param role   The comma-separated list of people roles to filter the search results. Only people with the given roles are provided.  (optional, default to new ArrayList&lt;&gt;())
     * @return The request has been successfully processed. The body contains the result. (status code 200)
     * or A malformed request was sent. (status code 400)
     * or Authentication is required to access the resource. (status code 401)
     * or There are no permissions to access the resource. (status code 403)
     * or A server side error occurred while processing the request. (status code 500)
     */
    @ApiOperation(value = "", nickname = "getPeople", notes = "Returns all people found according to the search criteria.", response = PersonListResponse.class, tags = {"people",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "The request has been successfully processed. The body contains the result.", response = PersonListResponse.class),
            @ApiResponse(code = 400, message = "A malformed request was sent.", response = ProblemResponse.class),
            @ApiResponse(code = 401, message = "Authentication is required to access the resource.", response = ProblemResponse.class),
            @ApiResponse(code = 403, message = "There are no permissions to access the resource.", response = ProblemResponse.class),
            @ApiResponse(code = 500, message = "A server side error occurred while processing the request.", response = ProblemResponse.class)})
    @GetMapping(
            value = "/people",
            produces = {"application/json", "application/problem+json"}
    )
    ResponseEntity<PersonListResponse> getPeople(@Min(1) @Max(1000) @ApiParam(value = "Standard pagination parameter. Defines the maximum number of entries returned in the response.", defaultValue = "10") @Valid @RequestParam(value = "limit", required = false, defaultValue = "10") Integer limit, @Min(0) @ApiParam(value = "Standard pagination parameter. Defines the number of entries to skip before beginning to return the search results.", defaultValue = "0") @Valid @RequestParam(value = "offset", required = false, defaultValue = "0") Integer offset, @Size(max = 255) @ApiParam(value = "Person's email") @Valid @RequestParam(value = "email", required = false) String email, @ApiParam(value = "The comma-separated list of people roles to filter the search results. Only people with the given roles are provided. ") @Valid @RequestParam(value = "role", required = false) List<PersonRole> role);


    /**
     * GET /people/{personId}
     * Returns profile data of the given person.
     *
     * @param personId Universally unique identifier of the person. (required)
     * @return The person profile has been successfully found. The body contains the result. (status code 200)
     * or A malformed request was sent. (status code 400)
     * or Authentication is required to access the resource. (status code 401)
     * or There are no permissions to access the resource. (status code 403)
     * or A server side error occurred while processing the request. (status code 500)
     */
    @ApiOperation(value = "", nickname = "getPerson", notes = "Returns profile data of the given person.", response = PersonResponse.class, tags = {"people",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "The person profile has been successfully found. The body contains the result.", response = PersonResponse.class),
            @ApiResponse(code = 400, message = "A malformed request was sent.", response = ProblemResponse.class),
            @ApiResponse(code = 401, message = "Authentication is required to access the resource.", response = ProblemResponse.class),
            @ApiResponse(code = 403, message = "There are no permissions to access the resource.", response = ProblemResponse.class),
            @ApiResponse(code = 500, message = "A server side error occurred while processing the request.", response = ProblemResponse.class)})
    @GetMapping(
            value = "/people/{personId}",
            produces = {"application/json", "application/problem+json"}
    )
    ResponseEntity<PersonResponse> getPerson(@Pattern(regexp = "^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$") @ApiParam(value = "Universally unique identifier of the person.", required = true) @PathVariable("personId") String personId);


    /**
     * GET /people/{personId}/messengers
     * Returns all person messenger accounts according to search criteria.
     *
     * @param personId  Universally unique identifier of the person. (required)
     * @param limit     Standard pagination parameter. Defines the maximum number of entries returned in the response. (optional, default to 10)
     * @param offset    Standard pagination parameter. Defines the number of entries to skip before beginning to return the search results. (optional, default to 0)
     * @param messenger The comma-separated list of the messenger identifiers to filter the search results. Only items with the given messengers are provided.  (optional, default to new ArrayList&lt;&gt;())
     * @return The request has been successfully processed. The body contains the result. (status code 200)
     * or A malformed request was sent. (status code 400)
     * or Authentication is required to access the resource. (status code 401)
     * or There are no permissions to access the resource. (status code 403)
     * or A server side error occurred while processing the request. (status code 500)
     */
    @ApiOperation(value = "", nickname = "getPersonMessengers", notes = "Returns all person messenger accounts according to search criteria.", response = PersonMessengerListResponse.class, tags = {"people",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "The request has been successfully processed. The body contains the result.", response = PersonMessengerListResponse.class),
            @ApiResponse(code = 400, message = "A malformed request was sent.", response = ProblemResponse.class),
            @ApiResponse(code = 401, message = "Authentication is required to access the resource.", response = ProblemResponse.class),
            @ApiResponse(code = 403, message = "There are no permissions to access the resource.", response = ProblemResponse.class),
            @ApiResponse(code = 500, message = "A server side error occurred while processing the request.", response = ProblemResponse.class)})
    @GetMapping(
            value = "/people/{personId}/messengers",
            produces = {"application/json", "application/problem+json"}
    )
    ResponseEntity<PersonMessengerListResponse> getPersonMessengers(@Pattern(regexp = "^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$") @ApiParam(value = "Universally unique identifier of the person.", required = true) @PathVariable("personId") String personId, @Min(1) @Max(1000) @ApiParam(value = "Standard pagination parameter. Defines the maximum number of entries returned in the response.", defaultValue = "10") @Valid @RequestParam(value = "limit", required = false, defaultValue = "10") Integer limit, @Min(0) @ApiParam(value = "Standard pagination parameter. Defines the number of entries to skip before beginning to return the search results.", defaultValue = "0") @Valid @RequestParam(value = "offset", required = false, defaultValue = "0") Integer offset, @ApiParam(value = "The comma-separated list of the messenger identifiers to filter the search results. Only items with the given messengers are provided. ") @Valid @RequestParam(value = "messenger", required = false) List<String> messenger);


    /**
     * GET /people/{personId}/social-network
     * Returns all person social network accounts according to search criteria.
     *
     * @param personId      Universally unique identifier of the person. (required)
     * @param limit         Standard pagination parameter. Defines the maximum number of entries returned in the response. (optional, default to 10)
     * @param offset        Standard pagination parameter. Defines the number of entries to skip before beginning to return the search results. (optional, default to 0)
     * @param socialNetwork The comma-separated list of the social network identifiers to filter the search results. Only items with the given social network are provided.  (optional, default to new ArrayList&lt;&gt;())
     * @return The request has been successfully processed. The body contains the result. (status code 200)
     * or A malformed request was sent. (status code 400)
     * or Authentication is required to access the resource. (status code 401)
     * or There are no permissions to access the resource. (status code 403)
     * or A server side error occurred while processing the request. (status code 500)
     */
    @ApiOperation(value = "", nickname = "getPersonSocialNetworks", notes = "Returns all person social network accounts according to search criteria.", response = PersonSocialNetworkListResponse.class, tags = {"people",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "The request has been successfully processed. The body contains the result.", response = PersonSocialNetworkListResponse.class),
            @ApiResponse(code = 400, message = "A malformed request was sent.", response = ProblemResponse.class),
            @ApiResponse(code = 401, message = "Authentication is required to access the resource.", response = ProblemResponse.class),
            @ApiResponse(code = 403, message = "There are no permissions to access the resource.", response = ProblemResponse.class),
            @ApiResponse(code = 500, message = "A server side error occurred while processing the request.", response = ProblemResponse.class)})
    @GetMapping(
            value = "/people/{personId}/social-network",
            produces = {"application/json", "application/problem+json"}
    )
    ResponseEntity<PersonSocialNetworkListResponse> getPersonSocialNetworks(@Pattern(regexp = "^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$") @ApiParam(value = "Universally unique identifier of the person.", required = true) @PathVariable("personId") String personId, @Min(1) @Max(1000) @ApiParam(value = "Standard pagination parameter. Defines the maximum number of entries returned in the response.", defaultValue = "10") @Valid @RequestParam(value = "limit", required = false, defaultValue = "10") Integer limit, @Min(0) @ApiParam(value = "Standard pagination parameter. Defines the number of entries to skip before beginning to return the search results.", defaultValue = "0") @Valid @RequestParam(value = "offset", required = false, defaultValue = "0") Integer offset, @ApiParam(value = "The comma-separated list of the social network identifiers to filter the search results. Only items with the given social network are provided. ") @Valid @RequestParam(value = "socialNetwork", required = false) List<String> socialNetwork);


    /**
     * DELETE /people/{personId}/messengers/{messengerId}
     * Removes the messenger from a person.
     *
     * @param personId    Universally unique identifier of the person. (required)
     * @param messengerId Universally unique identifier of the person messenger. (required)
     * @return Request has been successfully processed. (status code 204)
     * or A malformed request was sent. (status code 400)
     * or Authentication is required to access the resource. (status code 401)
     * or There are no permissions to access the resource. (status code 403)
     * or The requested resource could not be found. (status code 404)
     * or A server side error occurred while processing the request. (status code 500)
     */
    @ApiOperation(value = "", nickname = "removeMessengerFromPerson", notes = "Removes the messenger from a person.", tags = {"people",})
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "Request has been successfully processed."),
            @ApiResponse(code = 400, message = "A malformed request was sent.", response = ProblemResponse.class),
            @ApiResponse(code = 401, message = "Authentication is required to access the resource.", response = ProblemResponse.class),
            @ApiResponse(code = 403, message = "There are no permissions to access the resource.", response = ProblemResponse.class),
            @ApiResponse(code = 404, message = "The requested resource could not be found.", response = ProblemResponse.class),
            @ApiResponse(code = 500, message = "A server side error occurred while processing the request.", response = ProblemResponse.class)})
    @DeleteMapping(
            value = "/people/{personId}/messengers/{messengerId}",
            produces = {"application/problem+json"}
    )
    ResponseEntity<Void> removeMessengerFromPerson(@Pattern(regexp = "^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$") @ApiParam(value = "Universally unique identifier of the person.", required = true) @PathVariable("personId") String personId, @Size(max = 255) @ApiParam(value = "Universally unique identifier of the person messenger.", required = true) @PathVariable("messengerId") String messengerId);


    /**
     * DELETE /people/{personId}/social-network/{socialNetworkId}
     * Removes the social network from a person.
     *
     * @param personId        Universally unique identifier of the person. (required)
     * @param socialNetworkId Universally unique identifier of the person social network. (required)
     * @return Request has been successfully processed. (status code 204)
     * or A malformed request was sent. (status code 400)
     * or Authentication is required to access the resource. (status code 401)
     * or There are no permissions to access the resource. (status code 403)
     * or The requested resource could not be found. (status code 404)
     * or A server side error occurred while processing the request. (status code 500)
     */
    @ApiOperation(value = "", nickname = "removeSocialNetworkFromPerson", notes = "Removes the social network from a person.", tags = {"people",})
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "Request has been successfully processed."),
            @ApiResponse(code = 400, message = "A malformed request was sent.", response = ProblemResponse.class),
            @ApiResponse(code = 401, message = "Authentication is required to access the resource.", response = ProblemResponse.class),
            @ApiResponse(code = 403, message = "There are no permissions to access the resource.", response = ProblemResponse.class),
            @ApiResponse(code = 404, message = "The requested resource could not be found.", response = ProblemResponse.class),
            @ApiResponse(code = 500, message = "A server side error occurred while processing the request.", response = ProblemResponse.class)})
    @DeleteMapping(
            value = "/people/{personId}/social-network/{socialNetworkId}",
            produces = {"application/problem+json"}
    )
    ResponseEntity<Void> removeSocialNetworkFromPerson(@Pattern(regexp = "^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$") @ApiParam(value = "Universally unique identifier of the person.", required = true) @PathVariable("personId") String personId, @Size(max = 255) @ApiParam(value = "Universally unique identifier of the person social network.", required = true) @PathVariable("socialNetworkId") String socialNetworkId);
}
