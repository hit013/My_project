package Grafy_Algoritm_Deikstry_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graf2 {

    static Integer infinity = Integer.MAX_VALUE;
    public static HashMap<String, HashMap<String,Integer>> graf = new HashMap<>(); // Graf start

    static HashMap<String, Integer> start = new HashMap<>() {{ put("a",6) ; put("b",2); }};
    static HashMap<String, Integer> a = new HashMap<>() {{ put("finish",1); }};

    static HashMap<String, Integer> b = new HashMap<>() {{ put("a",3); put("finish",5); }};

    static HashMap<String, Integer> finish = new HashMap<>();

    static HashMap<String, Integer> costs = new HashMap<>() {{ put("a",6); put("b",2); put("finish", infinity); }};

    static HashMap<String, String> parents = new HashMap<>() {{ put("a","start"); put("b","start"); put("finish","-"); }};


    static List<String> backList = new ArrayList<>();

        //System.out.println(graf.values());
        //System.out.println(start.keySet());
}
