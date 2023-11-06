package practice.sentences;
public class Sentence {

    //We count words in our sentence
    public int countWords(String str) {
        String[] words = str.split(" ");//разделяем предложение на слова
        int n = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("–") || words[i].equals("-") || words[i].equals(",") || words[i].equals(".")) {
                n++;
            }
        }
        //System.out.println(words.length);
        //System.out.println(n);
        return words.length - n;
    }

    //We count symbols in our sentence
    public int countSymbols(String str) {

        String[] symbols = str.split("");
        return symbols.length;
    }
    //TODO : исключить пробелы из результата
    public int countSybmolsWithoutSpaces (String str) {
        str = str.replace(" ", "");
        return str.length();
    }
    //
}
