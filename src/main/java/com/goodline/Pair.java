package com.goodline;

public class Pair implements Comparable<Pair>{

    String word;
    int counter;

    Pair(String word, int counter){
        this.word = word;
        this.counter = counter;
    }

    public String getWord(){
        return word;
    }
    public void inc(){
        counter++;
    }

    public int getCounter(){
        return counter;
    }


    public int compareTo(Pair p) {
        int compare = p.counter - this.counter;
        //return compare==0 ? this.word.compareTo(p.word) : compare;
        if(compare==0)
            return this.word.compareTo(p.word); //если количество повторений одинаково, сортируем по алфавиту
        else
            return compare;
    }
}
