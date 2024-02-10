package Grafy_poisk_algoritm_1;

import static Grafy_poisk_algoritm_1.Grafy.*;

import java.util.*;

public class Methods {

    public static void search(String name){
        Deque<String> deque = new ArrayDeque<>();

        graph.put("you", you);
        graph.put("bob", bob);
        graph.put("alice", alice);
        graph.put("claire", claire);
        graph.put("anuj", anuj);
        graph.put("peggy", peggy);
        graph.put("thom", thom);
        graph.put("jonny", jonny);
        //graph.put("sam", sam);

        String [] array = graph.get(name);
        //String str = Arrays.toString(array[0].toCharArray());
        ArrayList<String> backList = new ArrayList<>();// лист проверенных друзей

        for (int i = 0; i<= array.length-1; i++) { //добавляем в очередь Строки имена людей из массива в графе
            deque.addLast(array[i]);
        }


        while (!deque.isEmpty()){
          String firstName = deque.pollFirst();// первый человек из списка длфя проверки


            if(!backList.contains(firstName)) {
                if (check(firstName)) {

                    System.out.println("Продавец манго найден : " + firstName);
                    break;
                } else if(graph.containsKey(firstName)) {

                        String [] array2 = graph.get(firstName);
                    for (int i = 0; i<= array2.length-1; i++) {
                        deque.addLast(array2[i]);
                    }
                    backList.add(firstName);
                }
            }
            if(deque.isEmpty())
            System.out.println("Продавец манго не найден в вашем списке друзей!");
        }

    }


    public static boolean check(String str){
        if(str.endsWith("m")){
            return true;
        } else
            return false;
    }
}
