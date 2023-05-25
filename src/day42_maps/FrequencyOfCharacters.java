package day42_maps;

import java.text.CollationElementIterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "bbcccaaaaa";

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String each : str.split("")) {
            int frequency = Collections.frequency( Arrays.asList( str.split(""))  , each );

            map.put(each, frequency); // this one way to do that
        }

        System.out.println(map);

    }
}
