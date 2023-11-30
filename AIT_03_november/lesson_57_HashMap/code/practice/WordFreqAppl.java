package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordFreqAppl {
    public static void main(String[] args) {
        //создаём массив и счиатем количество вхождений каждого слова
        String[] words = {"abc", "ab", "limit", "abc", "a", "ab", "limit"};
        //напишем метод
        printWordFreq(words);

    }

    private static void printWordFreq(String[] words) {
        //создаём мапу
        Map<String, Integer> resMap = new HashMap<>();
        //проходим по массиву
        for (String word : words) {
            //если слово есть в мапе, то увеличиваем счётчик
//            int count = res.get(word);
//            if (res.containsKey(word)) {
//               res.put(word, count + 1);
//            } else {
//                //если слова нет в мапе, то добавляем его и счётчик = 1
//                res.put(word, 1);
//            }
//        }
//        //выводим мапу
//        System.out.println(res);
            //второй вариант
            if (!resMap.containsKey(word)) {//если слова нет в мапе, то добавляем его и счётчик = 1
                resMap.put(word, 1);//если слова нет в мапе, то добавляем его и счётчик = 1
            } else {
                resMap.put(word, resMap.get(word) + 1);//если слово есть в мапе, то увеличиваем счётчик
            }
        }
        Set<Map.Entry<String, Integer>> entries = resMap.entrySet();
        System.out.println("========Unsorted========");
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
