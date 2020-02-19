package com.goodline;

import com.goodline.Pair;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        if(args.length == 0){
            Scanner in = new Scanner(System.in);
            args = in.nextLine().split(" "); //считываем строку и разделяем на слова
        }

        List<Pair>result = frequencySort(args);

        for (Pair p: result) {
            System.out.println(p.getWord()+": "+p.getCounter());
        }
    }

    public static List<Pair> frequencySort(String[] message) {


        List<Pair> result = new ArrayList<>();

        for (String word:message) {
            boolean nothingFound = true;
            for (Pair p: result) {
                if(p.getWord().equals(word)){    //если такое слово уже есть увеличиваем счетчик на 1 и прекращаем поиск
                    p.inc();
                    nothingFound = false;
                    break;
                }
            }
            if(nothingFound) result.add(new Pair(word, 1)); //если не  нашли, добавляем слово в список
        }

        Collections.sort(result);
        return result;
    }
}
