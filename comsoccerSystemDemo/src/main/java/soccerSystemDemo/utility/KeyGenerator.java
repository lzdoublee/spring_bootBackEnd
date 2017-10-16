package soccerSystemDemo.utility;

import java.util.UUID;

/**
 * Created by joindomain on 8/17/2017.
 */
public class KeyGenerator {
    public static String getEntityId() {

        return UUID.randomUUID().toString();
    }
}
