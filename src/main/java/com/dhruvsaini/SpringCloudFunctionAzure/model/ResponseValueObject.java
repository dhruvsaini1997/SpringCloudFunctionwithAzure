package com.dhruvsaini.SpringCloudFunctionAzure.model;

import lombok.*;


public class ResponseValueObject {
    private String message;
    private boolean status;
    private Object data;
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
