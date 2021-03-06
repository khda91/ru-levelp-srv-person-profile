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
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.levelp.srv.person.profile.api.data.MessengerListResponse;
import ru.levelp.srv.person.profile.api.data.ProblemResponse;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-20T20:35:45.386531+03:00[Europe/Moscow]")
@Validated
@Api(value = "messengers", description = "the messengers API")
public interface MessengersApi {

    /**
     * PUT /messengers/{messengerId}
     * Create a new messenger record.
     *
     * @param messengerId Universally unique identifier of the messenger. (required)
     * @return The request has been successfully processed. A new tag is created. (status code 204)
     * or A malformed request was sent. (status code 400)
     * or Authentication is required to access the resource. (status code 401)
     * or There are no permissions to access the resource. (status code 403)
     * or A server side error occurred while processing the request. (status code 500)
     */
    @ApiOperation(value = "", nickname = "createMessenger", notes = "Create a new messenger record.", tags = {"messengers",})
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "The request has been successfully processed. A new tag is created."),
            @ApiResponse(code = 400, message = "A malformed request was sent.", response = ProblemResponse.class),
            @ApiResponse(code = 401, message = "Authentication is required to access the resource.", response = ProblemResponse.class),
            @ApiResponse(code = 403, message = "There are no permissions to access the resource.", response = ProblemResponse.class),
            @ApiResponse(code = 500, message = "A server side error occurred while processing the request.", response = ProblemResponse.class)})
    @PutMapping(
            value = "/messengers/{messengerId}",
            produces = {"application/problem+json"}
    )
    ResponseEntity<Void> createMessenger(@Pattern(regexp = "([A-Z0-9_]*)") @Size(min = 2, max = 255) @ApiParam(value = "Universally unique identifier of the messenger.", required = true) @PathVariable("messengerId") String messengerId);


    /**
     * DELETE /messengers/{messengerId}
     * Deletes an existing messenger record.
     *
     * @param messengerId Universally unique identifier of the messenger. (required)
     * @return The request has been successfully processed. (status code 204)
     * or A malformed request was sent. (status code 400)
     * or Authentication is required to access the resource. (status code 401)
     * or There are no permissions to access the resource. (status code 403)
     * or The requested resource could not be found. (status code 404)
     * or A server side error occurred while processing the request. (status code 500)
     */
    @ApiOperation(value = "", nickname = "deleteMessenger", notes = "Deletes an existing messenger record.", tags = {"messengers",})
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "The request has been successfully processed."),
            @ApiResponse(code = 400, message = "A malformed request was sent.", response = ProblemResponse.class),
            @ApiResponse(code = 401, message = "Authentication is required to access the resource.", response = ProblemResponse.class),
            @ApiResponse(code = 403, message = "There are no permissions to access the resource.", response = ProblemResponse.class),
            @ApiResponse(code = 404, message = "The requested resource could not be found.", response = ProblemResponse.class),
            @ApiResponse(code = 500, message = "A server side error occurred while processing the request.", response = ProblemResponse.class)})
    @DeleteMapping(
            value = "/messengers/{messengerId}",
            produces = {"application/problem+json"}
    )
    ResponseEntity<Void> deleteMessenger(@Size(max = 255) @ApiParam(value = "Universally unique identifier of the messenger.", required = true) @PathVariable("messengerId") String messengerId);


    /**
     * GET /messengers
     * Returns all messengers found according to search criteria.
     *
     * @param limit  Standard pagination parameter. Defines the maximum number of entries returned in the response. (optional, default to 10)
     * @param offset Standard pagination parameter. Defines the number of entries to skip before beginning to return the search results. (optional, default to 0)
     * @return The request has been successfully processed. The body contains the result. (status code 200)
     * or A malformed request was sent. (status code 400)
     * or Authentication is required to access the resource. (status code 401)
     * or There are no permissions to access the resource. (status code 403)
     * or A server side error occurred while processing the request. (status code 500)
     */
    @ApiOperation(value = "", nickname = "getMessengers", notes = "Returns all messengers found according to search criteria.", response = MessengerListResponse.class, tags = {"messengers",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "The request has been successfully processed. The body contains the result.", response = MessengerListResponse.class),
            @ApiResponse(code = 400, message = "A malformed request was sent.", response = ProblemResponse.class),
            @ApiResponse(code = 401, message = "Authentication is required to access the resource.", response = ProblemResponse.class),
            @ApiResponse(code = 403, message = "There are no permissions to access the resource.", response = ProblemResponse.class),
            @ApiResponse(code = 500, message = "A server side error occurred while processing the request.", response = ProblemResponse.class)})
    @GetMapping(
            value = "/messengers",
            produces = {"application/json", "application/problem+json"}
    )
    ResponseEntity<MessengerListResponse> getMessengers(@Min(1) @Max(1000) @ApiParam(value = "Standard pagination parameter. Defines the maximum number of entries returned in the response.", defaultValue = "10") @Valid @RequestParam(value = "limit", required = false, defaultValue = "10") Integer limit, @Min(0) @ApiParam(value = "Standard pagination parameter. Defines the number of entries to skip before beginning to return the search results.", defaultValue = "0") @Valid @RequestParam(value = "offset", required = false, defaultValue = "0") Integer offset);

}
