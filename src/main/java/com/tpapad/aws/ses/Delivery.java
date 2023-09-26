package com.tpapad.aws.ses;

import java.time.ZonedDateTime;
import java.util.List;
import lombok.Data;

/**
 *
 * @author tpapad
 */
@Data
public class Delivery {

    private ZonedDateTime timestamp;

    private long processingTimeMillis;

    private List<String> recipients;

    private String smtpResponse;

    private String reportingMTA;

    private String remoteMtaIp;

}
