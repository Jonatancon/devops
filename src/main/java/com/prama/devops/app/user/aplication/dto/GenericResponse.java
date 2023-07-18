package com.prama.devops.app.user.aplication.dto;

import java.util.ArrayList;
import java.util.List;

public class GenericResponse<E> {
    private Integer status;
    private String description;

    private List<E> data;

    private GenericResponse() {
        this.data = new ArrayList<>();
    }

    public static <E> GenericResponse<E> success() {
        return new GenericResponse<>();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<E> getData() {
        return data;
    }

    public void setData(List<E> data) {
        this.data = data;
    }
}
