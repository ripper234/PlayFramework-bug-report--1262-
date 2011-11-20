package models;

import org.apache.commons.lang.builder.ToStringBuilder;
import play.db.jpa.Model;

public abstract class PortalModel extends Model {
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
