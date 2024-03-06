//package Strings;
//
//import java.util.HashMap;
//import java.util.Stack;
//import java.util.logging.Logger;
//import java.util.StringUtils;
//
//public class DecodeString {
//    private static final Logger logger = LoggerFactory.getLogger(WebhookUtil.class);
//    private static final String ALT1 = "_ALT1";
//    private static final String ALT2 = "_ALT2"; private final String ALT = "_ALT";
//    public static void main(String[] args) {
//
//        getSupportedConfigSubType("WEBHOOK");
//    }
//
//    public static String getSupportedConfigSubType(String notificationType) {
//        logger.info("NotificationType: ", notificationType);
//        notificationType = (notificationType.contains(ALT1)) ? StringUtils.removeEnd(notificationType, ALT1)
//                : StringUtils.removeEnd(notificationType, ALT2);
//        logger.info("Updated NotificationType from Webhook ALT1 and ALT2 to : {}", notificationType);
//        return notificationType;
//
//    }
//    }
//
//
