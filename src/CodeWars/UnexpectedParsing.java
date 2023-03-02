package CodeWars;

import java.util.HashMap;

public class UnexpectedParsing {

    public static void main(String[] args) {
        System.out.println(getStatus(true).get("status"));
        System.out.println(getStatus(false).get("status"));
    }


    public static HashMap<String, String> getStatus(boolean isBusy) {
        HashMap<String, String> status = new HashMap<>();

        if (isBusy) {
            status.put("status", "busy");
        } else {
            status.put("status", "available");
        }

        return status;
    }
}
