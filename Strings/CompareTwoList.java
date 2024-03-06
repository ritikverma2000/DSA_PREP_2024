package Strings;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CompareTwoList {

    public static void main(String[] args) {
        List<String> accountStatus = new ArrayList<>();
        List<String> userAccountStatusList = new ArrayList<>();

        accountStatus.add("TW:35, BK:07, BK:09, BK:11, BK:12, BK:13, BK:99, CC:Y, CO:AT, CO:BD, CO:CD, CO:DC, CO:EC, CO:FR, CO:HD, CO:IC, CO:IO, CO:JR, CO:LG, CO:M1, CO:M2, CO:M3, CO:M4, CO:M5, CO:M6, CO:M7, CO:M8, CO:M9, CO:M0, CO:OT, CO:P1, CO:P2, CO:P3, CO:P7, CO:P9, CO:RT, CO:SK, CO:ST, CO:UE, CO:XM, CO:07, CO:09, CO:11, CO:12, CO:13, CO:14, CO:15, CO:16, CO:17, CO:18, CO:19, CO:99, CR:DC, FO:CS, FO:DE, FO:PS, FR:Y, SF:AT, SF:BE, SF:BT, SF:B1, SF:B2, SF:B3, SF:CA, SF:CC, SF:CD, SF:CK, SF:DK, SF:FA, SF:FL, SF:FN, SF:FP, SF:IA, SF:IF, SF:LS, SF:MD, SF:MP, SF:NA, SF:NN, SF:NR, SF:NS, SF:NT, SF:OK, SF:OT, SF:ST, SF:3D, SF:4A, SF:4B, SF:4C, SF:4D, SF:4E, SF:4F, SF:4G, SF:4P, SF:4U, XF:OT, XF:PU, XF:T0, XF:T1, XF:T2, XF:T3, XF:T4, XF:T5, XF:T6, XF:T7, XF:T8, XF:T9, XF:00, XF:01, XF:02, XF:03, XF:04, XF:05, XF:06, XF:07, XF:08, XF:10, XF:17, XF:24, XF:24, XF:51");
          userAccountStatusList.add("RE:13, PD:1C, BK:00, CO:AT, CR:BD, FU:PU, DC:AN, PP:Y, OA:Y, RD:Y, CV:N, YT:Y");

          if(accountStatus.contains(userAccountStatusList)){
              System.out.println("TRUE");
          }else{
              System.out.println("FALSE");

              System.out.println(LocalDate.parse("2023-02-23"));
              System.out.println((java.time.temporal.ChronoUnit.DAYS.between(java.time.LocalDate.parse("2024-01-22"),
                      java.time.LocalDate.parse("2023-02-23"))));
          }

          int [] arr = {1,2,2,4,5,5,6,7,8,22,10};
        Set<Integer> s1 = new HashSet<>();
        for (int i = 0; i <arr.length ; i++) {
            if(s1.contains(arr[i])){
                s1.remove(arr[i]);
            }
            else{
                s1.add(arr[i]);
            }

        }
        System.out.println(s1);



    }
}
