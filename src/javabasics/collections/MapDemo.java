package javabasics.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        // 1. Create a Map using the HashMap implementation
        Map<String, String> countryCodes = new HashMap<>();

        // 2. Add elements (key-value pairs) using the put() method
        countryCodes.put("USA", "United States");
        countryCodes.put("IND", "India");
        countryCodes.put("GBR", "United Kingdom");
        countryCodes.put("JPN", "Japan");
        System.out.println("Original Map: " + countryCodes);

        // 3. Access a value using the get() method
        String countryName = countryCodes.get("IND");
        System.out.println("Value for key 'IND': " + countryName);

        // 4. Check if a key exists using containsKey()
        boolean hasUSA = countryCodes.containsKey("USA");
        System.out.println("Does the map contain key 'USA'? " + hasUSA);

        // 5. Remove an entry using the remove() method
        String removedValue = countryCodes.remove("GBR");
        System.out.println("Removed value for key 'GBR': " + removedValue);
        System.out.println("Map after removal: " + countryCodes);

        // 6. Iterate through the Map using a for-each loop over entrySet()
        System.out.println("\\nIterating through the map:");
        for (Map.Entry<String, String> entry : countryCodes.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}