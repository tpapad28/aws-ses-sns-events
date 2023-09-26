package com.tpapad.aws.ses;

import java.time.ZonedDateTime;
import java.util.List;
import lombok.Data;
import lombok.ToString;

/**
 *
 * @author tpapad
 */
@Data
public class Mail {

    private ZonedDateTime timestamp;

    private String messageId;

    private String source;

    private String sourceArn;

    private String sourceIp;

    private String sendingAccountId;

    private String callerIdentity;

    private List<String> destination;

    private boolean headersTruncated;

    private List<Header> headers;

    private CommonHeaders commonHeaders;

    @Data
    static class Header {

        private String name;
        private String value;

    }

    @Data
    @ToString
    static class CommonHeaders {

        private List<String> from;
        private String date;
        private List<String> to;
        private String messageId;
        private String subject;

    }
}
