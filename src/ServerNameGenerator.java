import java.lang.reflect.Array;
import java.util.Arrays;

public class ServerNameGenerator {
   private static final String[] adjective = {"dedicated", "loyal", "brave", "true","scattered",
            "fluffy", "tender", "tasteless", "nebulous", "sneaky", "craven"};
   private static final String[] noun = {"computer", "economics", "error", "salad", "bath",
            "classroom", "newspaper", "diamond", "gate", "piano", "basket"};

   public static String randomString(String[] nounAdj) {
       double randomNum = Math.floor(Math.random() * nounAdj.length);
        return nounAdj[(int) randomNum];

   }

    public static void main(String[] args) {

//        System.out.printf("Your random server name is:\n%s-%s", randomString(adjective), randomString(noun));


    }


}
