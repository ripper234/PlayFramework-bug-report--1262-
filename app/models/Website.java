package models;

import org.joda.time.DateTime;
import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Website extends PortalModel {
    @Required
    public String url;

    @Required
    @ManyToOne
    public User owner;

    public DateTime created;
}
