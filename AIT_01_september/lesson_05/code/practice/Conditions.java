package practice;

//proverka polojitelnoe ili otricatelnoe
//proverka 4etnoe ili ne4etnoe
//proverka vozrasta
//

public class Conditions {
    public static void main(String[] args) {

        int x = 0;

        if (x > 0) {
            System.out.println("x - polojitelnoe");
        } else if (x == 0) {
            System.out.println("x=0");
        } else {
            System.out.println("x - otriycatelnoe");
        }

        //
        int y = 16;
        if (y % 2 == 0) {
            System.out.println("4islo: " + y + " - 4etnoe");
        } else {
            System.out.println("4islo: " + y + " - ne 4etnoe");
        }
        int age = 18;
        if (age >= 18 ){
            System.out.println("razreweno deistvovat' samostoyatelno");
        }else {
            System.out.println("nado priyti s opekunom");
        }

    }
}

