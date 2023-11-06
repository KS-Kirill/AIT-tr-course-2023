package practice.string_builder;

public class StringBuilderAppl {
    public static void main(String[] args) {
        //StringBuilder  - это класс, котором есть полезные методы для работы со строками

        String str = "Java";
        str = str.concat("_");
        str = str.concat("" + 11);
        System.out.println(str);

        //StringBuilder - он мутабельный!
        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb);
        sb.append("_").append(11);     //append - добавить, сцепить
        System.out.println(sb); // объект "sb"  мутирует, т.е. изменяется
        sb.reverse();
        System.out.println(sb);
         str = sb.toString();
        System.out.println(str);

    }
}
