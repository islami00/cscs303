package learn;

public class LearnString {
    public static void main(String[] args) {
//        Format
        /*
        String name = "Farham Hasin Chowdhury"; // %s
        String country = "NG";
        int age = 26; // %d
        String company = "freeCodeCamp";
        double gpa = 3.8; // %f
        char percentSign = '%'; // %c
        boolean isTruth = false; // %b

        String formatted = String.format("My name is %s. I am from %s. I am %d years old. I work for %s. My GPA is %f. I have attended 100%c of my university classes. these are all %b claims.", name, country, age, company, gpa, percentSign, isTruth);
        System.out.println(formatted);

         */
//         length, isEmpty
/*
        String name = "My Name Islam";
        System.out.println(name.length());
        System.out.println(name.isEmpty());

 */

//        Uppercase, lowercase
//        String name = "Islam";
//        System.out.println(name.toLowerCase());
//        System.out.println(name.toLowerCase());

//        equals
//        String string1 = new String("ABC");
//        String string2 = new String("abc");
//
//        System.out.println(string1.equalsIgnoreCase(string2));

//        Characters are taken as ints
//        char char1 = 'n';
//        char char2 = 'y';
//        Fails
//        char char3 =  char1 + char2;
//        System.out.println(char1 - char2);

//        Contains

        String string1 = "abc213123";
        String string2 = "abc";

        System.out.println(string1.contains(string2));

    }
}
