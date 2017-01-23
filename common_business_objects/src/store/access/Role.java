package store.access;

import store.application.Application;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Adam on 12/20/2016.
 */
@Entity
@Table(name = "SYSTEMROLE")
public class Role {

    @Id
    @Column(name = "ROLEID")
    private String id;
    @Column(name = "ROLENAME")
    private String name;
    private String description;
    private String createdBy;
    private String updatedBy;

    @OneToMany
    @JoinTable(
            name="SYSTEMROLE_APPLICATION",
            joinColumns = @JoinColumn( name="APPLICATIONID"),
            inverseJoinColumns = @JoinColumn( name="ROLEID")
    )
    private Set<Application> applications;

    @OneToMany
    @JoinTable(
            name="SYSTEMROLE_SYSTEMPERMISSION",
            joinColumns = @JoinColumn( name="PERMISSIONID"),
            inverseJoinColumns = @JoinColumn( name="ROLEID")
    )
    private Set<Permission> permissions;

    public Role() {
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

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Set<Application> getApplications() {
        return applications;
    }

    public void setApplications(Set<Application> applications) {
        this.applications = applications;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }
}
