package domain;

public class OrderTransaction {

    private static final int DEFAULT_TTL_MINUTES = 1;
    private String id;

    public String start() {
        return start(DEFAULT_TTL_MINUTES);
    }

    public String start(int ttlMinutes) {
        id = "TX" + Math.random() * 10000;
        System.out.println(String.format("Start OrderTransaction (%d min)", ttlMinutes));
        return id;
    }


    public String getId() {
        return id;
    }
}
