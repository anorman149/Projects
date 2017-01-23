package store.application;

import store.access.Permission;
import store.access.Role;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Adam on 12/20/2016.
 */
@Entity
@Table(name = "SYSTEMUSER")
public class User{

    @Id
    private String userId;
    private String firstName;
    private String lastName;
    private String userName;
    private String userPassword;

//    @OneToMany
//    private List<Role> roles;
//
//    @OneToMany
//    private List<Permission> permissions;

    public User() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String id) {
        this.userId = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

//    public List<Role> getRoles() {
//        return roles;
//    }
//
//    public void setRoles(List<Role> roles) {
//        this.roles = roles;
//    }
//
//    public List<Permission> getPermissions() {
//        return permissions;
//    }
//
//    public void setPermissions(List<Permission> permissions) {
//        this.permissions = permissions;
//    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
