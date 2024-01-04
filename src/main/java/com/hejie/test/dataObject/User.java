package com.hejie.test.dataObject;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private Integer id;
    private String name;
    private String password;

    User(){
    }
    User(Integer id,String name,String password){
        this.id = id;
        this.name = name;
        this.password = password;
    }
}
