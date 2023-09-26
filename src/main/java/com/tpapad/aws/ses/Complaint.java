package com.tpapad.aws.ses;

import java.time.ZonedDateTime;
import java.util.List;
import lombok.Data;

/**
 *
 * @author tpapad
 */
@Data
public class Complaint {

    private List<ComplainedRecipient> complainedRecipients;

    private ZonedDateTime timestamp;

    private String feedbackId;

    private String complaintSubType;

    private String userAgent;

    private String complaintFeedbackType;

    private String arrivalDate;
}
