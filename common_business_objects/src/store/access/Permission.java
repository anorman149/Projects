package store.access;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Adam on 12/20/2016.
 */
@Entity
@Table(name = "SYSTEMPERMISSION")
public class Permission {

    @Id
    @Column(name = "PERMISSIONID")
    private String id;
    @Column(name = "PERMISSIONNAME")
    private String name;
    private String action;
    private String entity;

    public Permission(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
