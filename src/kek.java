import java.util.Scanner;

public class kek {

    public static void main(String[] args) {

        Scanner in = new Scanner ( System.in );
        String str = in.nextLine ();
        //one( str );
        two( str );
        //three ( str );
    }

    public static void one(String str) {
        char[] b = {
                'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я'
        };
        String[] words = str.split ( " " );
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (words[i].charAt ( 0 ) == b[j]) {
                    counter++;
                }
            }
        }
        System.out.println ( counter );
    }

    public static void two(String str) {
        String[] words = str.split ( " " );
        for (int i = 0; i < words.length; i++) {
            if (words[i].length () == 3) {
                System.out.print ( i + 1 + " " );
            }
        }
    }

    public static void three(String str) {
        String[] words = str.split ( " " );
        int max = 0;
        int in = 0;
        for (int i = 0; i < words.length; i++) {
            if (max <= words[i].length()) {
                max = words[i].length();
                in = i + 1;
            }
        }
        System.out.println ( in );
    }
}

