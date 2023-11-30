package practice.hw_57;
// В 1800-х годах, в те времена, когда не было еще ни железных, ни шоссейных дорог, ни газового, н
// и стеаринового света, ни пружинных низких диванов, ни мебели без лаку, ни разочарованных юношей со стеклышками,
// ни либеральных философов-женщин, ни милых дам-камелий, которых так много развелось в наше время, – в те наивные времена,
// когда из Москвы, выезжая в Петербург в повозке или карете, брали с собой целую кухню домашнего приготовления,
// ехали восемь суток по мягкой, пыльной или грязной дороге и верили в пожарские котлеты,
// в валдайские колокольчики и бублики, – когда в длинные осенние вечера нагорали сальные свечи,
// освещая семейные кружки из двадцати и тридцати человек, на балах в канделябры вставлялись восковые и спермацетовые свечи,
// когда мебель ставили симметрично, когда наши отцы были еще молоды не одним отсутствием морщин и седых волос,
// а стрелялись за женщин и из другого угла комнаты бросались поднимать нечаянно и не нечаянно уроненные платочки,
// наши матери носили коротенькие талии и огромные рукава и решали семейные дела выниманием билетиков,
// когда прелестные дамы-камелии прятались от дневного света, – в наивные времена масонских лож, мартинистов,
// тугендбунда, во времена Милорадовичей, Давыдовых, Пушкиных, – в губернском городе К. был съезд помещиков,
// и кончались дворянские выборы.";

import java.util.HashMap;
import java.util.Map;

//Посчитайте количество повторяющихся слов, букв в предложении выше.
public class TolstoyHashMap {
    public static void main(String[] args) {
        String str = "В 1800-х годах, в те времена, когда не было еще ни железных, ни шоссейных дорог, ни газового, н" +
                "и стеаринового света, ни пружинных низких диванов, ни мебели без лаку, ни разочарованных юношей со стеклышками," +
                "ни либеральных философов-женщин, ни милых дам-камелий, которых так много развелось в наше время, – в те наивные времена," +
                "когда из Москвы, выезжая в Петербург в повозке или карете, брали с собой целую кухню домашнего приготовления," +
                "ехали восемь суток по мягкой, пыльной или грязной дороге и верили в пожарские котлеты," +
                "в валдайские колокольчики и бублики, – когда в длинные осенние вечера нагорали сальные свечи," +
                "освещая семейные кружки из двадцати и тридцати человек, на балах в канделябры вставлялись восковые и спермацетовые свечи," +
                "когда мебель ставили симметрично, когда наши отцы были еще молоды не одним отсутствием морщин и седых волос," +
                "а стрелялись за женщин и из другого угла комнаты бросались поднимать нечаянно и не нечаянно уроненные платочки," +
                "наши матери носили коротенькие талии и огромные рукава и решали семейные дела выниманием билетиков," +
                "когда прелестные дамы-камелии прятались от дневного света, – в наивные времена масонских лож, мартинистов," +
                "тугендбунда, во времена Милорадовичей, Давыдовых, Пушкиных, – в губернском городе К. был съезд помещиков," +
                "и кончались дворянские выборы.";

        String[] words = str.split("[^a-zA-Zа-яА-Я]+");//разбиваем строку на слова
        Map<String, Integer> resMap = new HashMap<>();//создаём мапу
        for (String word : words) {//проходим по массиву
            if (!resMap.containsKey(word)) {//если слова нет в мапе, то добавляем его и счётчик = 1
                resMap.put(word, 1);//если слова нет в мапе, то добавляем его и счётчик = 1
            } else {
                resMap.put(word, resMap.get(word) + 1);//если слово есть в мапе, то увеличиваем счётчик
            }
        }
        System.out.println("========Unsorted========");
        System.out.println(resMap);


        //посчитаем количество букв по алфавиту от А до Я
        System.out.println("========Letters========");
        Map<Character, Integer> resMapLetters = new HashMap<>();
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                char letter = word.charAt(i);
                if (!resMapLetters.containsKey(letter)) {
                    resMapLetters.put(letter, 1);
                } else {
                    resMapLetters.put(letter, resMapLetters.get(letter) + 1);
                }
            }
        }
        System.out.println(resMapLetters);


    }
}