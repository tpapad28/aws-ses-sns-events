package com.tpapad.aws.ses;

import java.util.List;
import lombok.Data;

/**
 *
 * @author tpapad
 */
@Data
public class Bounce {

    String bounceType;

    String bounceSubType;

    List<BouncedRecipient> bouncedRecipients;

    String timestamp;

    String feedbackId;

    String remoteMtaIp;

    String reportingMTA;
}
