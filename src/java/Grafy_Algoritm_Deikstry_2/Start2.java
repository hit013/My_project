package Grafy_Algoritm_Deikstry_2;

import static Grafy_Algoritm_Deikstry_2.Graf2.*;
import static Grafy_Algoritm_Deikstry_2.Graf2.finish;
import static Grafy_Algoritm_Deikstry_2.Methods2.find_low_path;
import static Grafy_Algoritm_Deikstry_2.Methods2.find_lowest_cost_node;

public class Start2 {
    public static void main(String[] args) {
        graf.put("start",start);
        graf.put("a",a);
        graf.put("b",b);
        graf.put("finish",finish);


        //find_lowest_cost_node(costs);
        find_low_path(graf);

        //System.out.println(graf.get("b").values());
    }
}
