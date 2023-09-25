package com.tpapad.aws.ses;

import lombok.Data;

/**
 *
 * @author tpapad
 */
@Data
public class BouncedRecipient {

    String emailAddress;

    String action;

    String status;

    String diagnosticCode;

}
