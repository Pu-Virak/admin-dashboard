package com.kshrd.school.utilities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Accessors(chain = true) // prefix , fluent , chain
public class Response<T> {

    public enum Status {
        OK,
        BAD_REQUEST,
        UNAUTHORIZED,
        EXCEPTION,
        VALIDATION_EXCEPTION,
        WRONG_CREDENTIAL,
        ACCESS_DENIED,
        NOT_FOUND,
        DUPLICATE_ENTRY,
        SUCCESS_DELETE,
        CREATE_SUCCESS,
        UPDATE_SUCCESS
    }

    private T payload;
    private String message;
    private boolean success = false;
    private Object metadata;
    private Status status;
    private int code;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd@HH:mm:ss", timezone = "Asia/Phnom_Penh")
    private LocalDateTime requestedTime;

    // for bad request
    public static <T> Response<T> badRequest() {
        Response<T> response = new Response<>();
        response.setStatus(Status.BAD_REQUEST);
        return response;
    }

    public static <T> Response<T> accessDenied() {
        Response<T> response = new Response<>();
        response.setStatus(Status.ACCESS_DENIED);
        return response;
    }

    public static <T> Response<T> ok() {
        Response<T> response = new Response<>();
        response.setStatus(Status.OK);
        response.setSuccess(true);
        return response;
    }

    public static <T> Response<T> successDelete() {
        Response<T> response = new Response<>();
        response.setStatus(Status.SUCCESS_DELETE);
        response.setSuccess(true);
        return response;
    }
    // SUCCESS

    public static <T> Response<T> successCreate() {
        Response<T> response = new Response<>();
        response.setStatus(Status.CREATE_SUCCESS);
        response.setSuccess(true);
        return response;
    }

    //DuplicateEntry
    public static <T> Response<T> duplicateEntry() {
        Response<T> response = new Response<>();
        response.setStatus(Status.DUPLICATE_ENTRY);
        return response;
    }

    //notFound
    public static <T> Response<T> notFound() {
        Response<T> response = new Response<>();
        response.setStatus(Status.NOT_FOUND);
        return response;
    }

    //Exception Error
    public static <T> Response<T> exception() {
        Response<T> response = new Response<>();
        response.setStatus(Status.EXCEPTION);
        return response;
    }

    public static <T> Response<T> successUpdate() {
        Response<T> response = new Response<>();
        response.setStatus(Status.UPDATE_SUCCESS);
        response.setSuccess(true);
        return response;
    }

    // we need this class for the pagination purpose

    @Getter
    @Setter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)

    protected static final class PagesMetaData {
        private final int size;
        private final long totalElement;
        private final int totalPages;
        private final int number;

        public PagesMetaData(int size, long totalElement, int totalPages, int number) {

            this.size = size;
            this.totalElement = totalElement;
            this.totalPages = totalPages;
            this.number = number;
        }

    }

}
