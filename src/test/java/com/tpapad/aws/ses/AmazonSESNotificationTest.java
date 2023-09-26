package com.tpapad.aws.ses;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.IOException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author tpapad
 */
public class AmazonSESNotificationTest {

    public AmazonSESNotificationTest() {
    }

    @Test
    public void testDeserialization() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        JavaTimeModule module = new JavaTimeModule();
        objectMapper.registerModules(module);
        // https://docs.aws.amazon.com/ses/latest/dg/notification-examples.html
        // Sample 1: Bounce notification with a DSN
        AmazonSESNotification value1 = objectMapper.readValue(this.getClass().getResourceAsStream("sample1.json"), AmazonSESNotification.class);
        Assertions.assertEquals("Bounce", value1.getNotificationType());
        AmazonSESBounceNotification bounce1 = (AmazonSESBounceNotification) value1;
        Assertions.assertEquals("jane@example.com", bounce1.getBounce().getBouncedRecipients().get(0).getEmailAddress());
        System.out.println(bounce1.getMail().getTimestamp());
        System.out.println(bounce1.getMail().getCommonHeaders());
        bounce1.getMail().getHeaders().forEach(h -> {
            System.out.println(h.getName() + "\t" + h.getValue());
        });
        // Sample 2: Bounce notification without a DSN
        AmazonSESNotification value2 = objectMapper.readValue(this.getClass().getResourceAsStream("sample2.json"), AmazonSESNotification.class);
        // Sample 3: Complaint notification with a feedback report
        AmazonSESNotification value3 = objectMapper.readValue(this.getClass().getResourceAsStream("sample3.json"), AmazonSESNotification.class);
        // Sample 4: Complaint notification without a feedback report
        AmazonSESNotification value4 = objectMapper.readValue(this.getClass().getResourceAsStream("sample4.json"), AmazonSESNotification.class);
        // Sample 5: Amazon SNS delivery notification example
        AmazonSESNotification value5 = objectMapper.readValue(this.getClass().getResourceAsStream("sample5.json"), AmazonSESNotification.class);
    }

}
