package store.application;

import store.access.Role;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Adam on 12/20/2016.
 */
@Entity
@Table(name = "STOREAPPLICATION")
public class Store  {

    @Id
    @Column(name = "STOREID")
    private String id;

    @Column(name = "STORENAME")
    private String name;
    private String description;
    private String link;

    @Transient
    private List<Role> roles;

    public Store() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
