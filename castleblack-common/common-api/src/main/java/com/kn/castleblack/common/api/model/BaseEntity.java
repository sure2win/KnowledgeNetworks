package com.kn.castleblack.common.api.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by kirshnachaitanya.gumma on 28/04/16.
 */

@Data
@MappedSuperclass
public class BaseEntity implements Serializable {

    /**
     * Unique identifier UUID
     */
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    protected String    id;

    /**
     * Status of the domain object
     */
    protected int       status;

    /**
     * Assumption is never will there be deletion of data
     * Only an object will be marked as delete
     */
    protected boolean   deleted = false;

    /**
     * Date and time of creation of the object
     */
    protected Date createdOn;

    /**
     * Date and time of last update on the object
     */
    protected Date      lastUpdatedOn;

    /**
     * ID of the user that created this object
     */
    protected String    createdBy;

    /**
     * ID of the user that last updated this object
     */
    protected String    lastUpdateBy;
}
