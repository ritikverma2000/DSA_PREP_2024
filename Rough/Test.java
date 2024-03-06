//package Rough;
//
//import netscape.javascript.JSObject;
//import org.json.JSONException;
//import org.json.JSONObject;
//import org.json.JSONArray;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Objects;
//
//public class Test {
//
//    public static void main(String[] args) throws JSONException {
//
//        Map<Integer,String> rows = new HashMap<>();
//
//        rows.put(0,"[{\n" +
//                "    \"common\": {\n" +
//                "        \"correlationId\": \"9th-Feb-2024\",\n" +
//                "        \"clientId\": \"2220\",\n" +
//                "        \"accountId\": \"00000034060\",\n" +
//                "        \"eventId\": \"T1000\",\n" +
//                "        \"eventType\": \"TRANSACTION\",\n" +
//                "        \"eventSource\": \"ID:414d5\",\n" +
//                "        \"transaction\": {\n" +
//                "            \"debitCreditIndicator\": \"C\",\n" +
//                "            \"applicationSuffix\": \"00\",\n" +
//                "            \"timepost\": \"2006585\",\n" +
//                "            \"classCode\": \"PY\",\n" +
//                "            \"ctimeAuthorization\": \"0000000\",\n" +
//                "            \"statementDate\": \"2020-02-10\",\n" +
//                "            \"amtTransaction\": \"0000000000947\",\n" +
//                "            \"accountIdentifier\": \"00000034060\",\n" +
//                "            \"transactionCode\": \"1234\",\n" +
//                "            \"dateTransaction\": \"2020-03-05\",\n" +
//                "            \"accountId\": \"00000034060\",\n" +
//                "            \"merchantFlags\": \"{\\\"merchantZip\\\":\\\"\\\",\\\"merchantDbaName\\\":\\\"ANUALIDAD\\\",\\\"merchantDbaState\\\":\\\"\\\",\\\"merchantNum\\\":\\\"\\\",\\\"merchantDbaCountry\\\":\\\"USA\\\",\\\"merchantDbaCity\\\":\\\"\\\"}\",\n" +
//                "            \"datePost\": \"2020-03-05\",\n" +
//                "            \"merchantCategoryCode\": \"3112\",\n" +
//                "            \"transactionFlags\": \"{\\\"mailPhoneCode\\\":\\\"BLANK\\\",\\\"terminalEntry\\\":\\\"\\\"}\",\n" +
//                "            \"clientNum\": \"2220\",\n" +
//                "            \"cardNumber\": \"c7GjC9bu3lxKfkOtBF0RKBcX2G4Avw9MTbp4V2A8vWk=\",\n" +
//                "            \"recurrPayInd\": \"S\"\n" +
//                "        }\n" +
//                "    }\n" +
//                "}]");
//
//        JSONArray jsonArr = new JSONArray(rows.get(0));
//        for (int i = 0; i < rows.size(); i++) {
//
//            JSONObject jsonObj = jsonArr.getJSONObject(i);
//            System.out.println(jsonObj.getJSONObject("common").getString("correlationId"));
//
//
//
//
//        }
//
//    }
//}
