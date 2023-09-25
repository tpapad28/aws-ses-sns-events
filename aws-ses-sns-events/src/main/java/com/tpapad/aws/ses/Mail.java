package com.tpapad.aws.ses;

import java.util.List;
import lombok.Data;

/**
 *
 * @author tpapad
 */
@Data
public class Mail {

    String timestamp;

    String messageId;

    String source;

    String sourceArn;

    String sourceIp;

    String sendingAccountId;

    String callerIdentity;

    List<String> destination;

    boolean headersTruncated;

    Object headers;

    Object commonHeaders;
}
