package com.sun.pojo;

import lombok.Data;

import java.sql.Blob;

@Data
public class Test {
    private int id;
    private Blob data;
    private String name;
}
