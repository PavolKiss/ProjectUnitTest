package sk.akademiasovy.projectUnixTest;

public class MyClass {
    public int max(int a, int b, int c){
        if (a > b && a > c)
            return a;
        else if (b > a && b > c)
            return b;
        else if (c > a && c > b)
            return c;
        return a;
    } //prijme najvacsie z 3 cisel

    public String reverse(String test){
        char[] try1 = test.toCharArray(); //deklaracia pola
        for (int i = try1.length()-1; i >=0; i--) //vypise od zadu
            System.out.println(try1[i]); //vypis pola po znakoch
        return test;
    } //prijme a zo zadu napise slova

    public boolean isPrimNumber(int num){

    } //ci je ci nieje prvocislo
}
