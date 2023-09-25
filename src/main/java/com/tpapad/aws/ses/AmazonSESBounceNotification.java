package com.tpapad.aws.ses;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author tpapad
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AmazonSESBounceNotification extends AmazonSESNotification {

    Bounce bounce;
}
