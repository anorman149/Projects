package store.application;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Adam on 12/20/2016.
 */
@Entity

public class Application {

    @Id
    private String applicationId;
    private String applicationName;

    public Application(){

    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
}
