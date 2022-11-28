import java.util.HashMap;

public class w7_exercise1 {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<String, String>();
        //name=key, nickname=value
        hm.put("matti", "mage");
        hm.put("mikael", "mixu");
        hm.put("arto", "arppa");

        System.out.println("mikael's nickname: "+hm.get("mikael"));
    }
}
