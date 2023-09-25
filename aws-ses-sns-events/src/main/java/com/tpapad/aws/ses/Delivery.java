package com.tpapad.aws.ses;

import java.util.List;
import lombok.Data;

/**
 *
 * @author tpapad
 */
@Data
public class Delivery {

    String timestamp;

    long processingTimeMillis;

    List<String> recipients;

    String smtpResponse;

    String reportingMTA;

    String remoteMtaIp;

}
