package day41_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();
        map.put("C02", "Josh");
        map.put("B03", "Nora");
        map.put("A02", "Khashavar");
        map.put("D02", "Abidullah");
        map.put("A03", "Tatiana");
        map.put("A04", "Tatiana");
        map.put("A05", "Tatiana");
        map.put("A06", "Tatiana");
        map.put("A07", "Tatiana");

        System.out.println( map.size());
        System.out.println(map);

        System.out.println(map.get("A04"));

        map.put("A04", "Lucy"); // value is changeable in the map
        map.put("A06", "Madivar");

        System.out.println(map);

        System.out.println(map.get("B03"));

        map.replace("C02", "Aseel");
        map.replace("A07", "Marika");

        System.out.println(map);

        map.remove("A05"); // size of the map will reaccessed, one less pair

        System.out.println(map);

        System.out.println(map.containsKey("B03")); // true
        System.out.println(map.containsKey("H98")); // false, we do not have such ID in this map

        System.out.println(map.containsValue("Lucy")); //true
        System.out.println(map.containsValue("Anna")); // false, we do not have this value in the map

        System.out.println(map.isEmpty()); // false, because we do have pairs in this map
        System.out.println(map.equals(map)); // true

        map.clear(); // everything from map will be cleared
        System.out.println(map);

        System.out.println(map.isEmpty()); //true, after clear method




    }
}
/*
pair: id - name
 */