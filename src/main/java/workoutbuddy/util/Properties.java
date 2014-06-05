package workoutbuddy.util;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * Created by jonathan on 6/3/14.
 */
public class Properties {
    private static Map<String, String> properties;

    public static String getProperty(String key) {
        if (properties == null) {
            initProperties();
        }
        return properties.get(key);
    }

    private static void initProperties() {
        properties = new HashMap<>();
        ResourceBundle rb = ResourceBundle.getBundle("workoutbuddy");
        Enumeration<String> keys = rb.getKeys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            properties.put(key, rb.getString(key));
        }
    }
}
