package Grafy_Algoritm_Deikstry_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static Grafy_Algoritm_Deikstry_2.Graf2.*;
import static Grafy_Algoritm_Deikstry_2.Graf2.graf;

public class Methods2 {

    public static String find_lowest_cost_node(HashMap<String ,Integer> map){

    Integer low_cost = Integer.MAX_VALUE;
    String low_cost_node = null;

    for(String node : map.keySet()){ //find min value rebra y nods // vyvodit key y costs
        Integer cost = map.get(node); // vyvodit vse value po key

        if(!backList.contains(node) && cost < low_cost){ // proverka na backList and min cost

            low_cost = cost;
            low_cost_node = node;

        }
    }
    return low_cost_node;
}



    public static void find_low_path(HashMap<String, HashMap<String,Integer>> graf){

        HashMap<String, Integer> low_path = new HashMap<>();

        String node = find_lowest_cost_node(costs); // b uzel

        //System.out.println(backList.size()+" back");

         while(backList.size() != costs.size()) {

             Integer cost = costs.get(node); // cost b..a..f = 2 //min cost node
             HashMap<String, Integer> neighbors = graf.get(node);

             for (String s : neighbors.keySet()) { // key nods {b} ...min cost node
                 Integer new_cost = cost + neighbors.get(s); // cost b + cost a/finish to est + cost sosedei

                 if (new_cost < costs.get(s)) {
                     costs.put(s, new_cost); // obnovlyem cost v node s
                     parents.put(s, node); // obnovlyem parents v node parents
                 }
             }
             backList.add(node);
             node = find_lowest_cost_node(costs);

         }
         for(var pair: costs.entrySet())
             System.out.println(pair.getKey() + " " + pair.getValue());

        System.out.println();


             for(var pair2: parents.entrySet())
                 System.out.println(pair2.getKey() + " " + pair2.getValue());


    }
}
