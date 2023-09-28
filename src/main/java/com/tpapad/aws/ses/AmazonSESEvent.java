package com.tpapad.aws.ses;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

/**
 *
 * @author tpapad
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "eventType", visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = AmazonSESBounceNotification.class, name = "Bounce"),
    @JsonSubTypes.Type(value = AmazonSESComplaintNotification.class, name = "Complaint"),
    @JsonSubTypes.Type(value = AmazonSESDeliveryNotification.class, name = "Delivery")}
)
@Data
public class AmazonSESEvent {

    String eventType;

    Mail mail;
}
