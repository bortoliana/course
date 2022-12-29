package com.bortoli.course.resources.exceptions;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
public class StandardError implements Serializable {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'" , timezone = "GMT")
    private Instant timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;

    public StandardError(){
    }

    public StandardError(Instant timetamp, Integer status, String error, String message, String path) {
        this.timestamp = timetamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }
}
