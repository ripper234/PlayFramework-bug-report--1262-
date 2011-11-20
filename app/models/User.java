package models;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.joda.time.DateTime;
import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User extends PortalModel {
    public String email;
    public String hash;

//    @GeneratedValue
    public DateTime createdDate;

    public String googleAnalyticsID;
}

