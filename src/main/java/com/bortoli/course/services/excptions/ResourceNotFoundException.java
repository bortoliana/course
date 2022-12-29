package com.bortoli.course.services.excptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(Object id){
        super("Resourse not found. Id " + id);
    }
}
