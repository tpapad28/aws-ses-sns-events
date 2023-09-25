package com.tpapad.aws.ses;

import java.util.List;
import lombok.Data;

/**
 *
 * @author tpapad
 */
@Data
public class Complaint {

    List<ComplainedRecipient> complainedRecipients;

    String timestamp;

    String feedbackId;

    String complaintSubType;

    String userAgent;

    String complaintFeedbackType;

    String arrivalDate;
}
