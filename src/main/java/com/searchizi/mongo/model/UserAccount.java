package com.searchizi.mongo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by larrymitchell on 2014-11-28.
 */
@Data
public class UserAccount implements Serializable {

    private static final long serialVersionUID = -448775676329967450L;

    @Id
    private String userName;

    private String password;

    private String firstName;

    private String lastName;

    private List<String> roleList = new ArrayList<>();

    private List<String> messageListIds = new ArrayList<>();


    public UserAccount(String firstName, String lastName, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
    }

    public void addRole(String role) {
        roleList.add(role);
    }


}
