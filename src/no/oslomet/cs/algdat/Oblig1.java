package no.oslomet.cs.algdat;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Created by lenovo on 9/8/2018.
 */
public class Oblig1 {

    // to swap the integer values location inside the array
    private static void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    // to swap the char values location inside the array
    private static void swap(char[] a, int i, int j)
    {
        char temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    // to get the max value in the array in the last
    public static int maks(int a[])
    {
        if (a.length<1) throw new NoSuchElementException("the table is empty");
        for (int i=1; i<a.length; i++)
            if (a[i - 1] > a[i])
            {
                swap(a, i - 1, i);
            }

        return a[a.length - 1];
    }

    // to get the number of swapping inside the array to get the max value in the last.
    public static int ombyttinger(int[] a)
    {

        int coount = 0;
        if (a.length<1) throw new NoSuchElementException("the table is empty");
        for (int i=1; i<a.length; i++)
            if (a[i - 1] > a[i])
            {
                swap(a, i - 1, i);
                coount++;
            }
        System.out.println("The number of swapping inside the array to get the max value in the last is " + coount);

        return coount;
    }
    //
    public static int antallUlikeSortert(int[] a) throws IllegalAccessException {
        int count = 1;

        if (a.length < 2) count = a.length;
        {
            for (int i = 1; i < a.length; i++) {
                if (a[i - 1] > a[i]) {
                    throw new IllegalAccessException("The Array is not arranged ");
                }
                else if (a[i - 1] > a[i]) count++;
            }
        }
        return count;
    }

    public static int antallUlikeUsortert(int[] a){
        int count = 1 ;
        if (a.length<2) count=a.length;
        for (int i=1; i<a.length; i++)
        {
            int k=0;
            for(; k< i; k++)
            {
                if (a[k]==a[i]) break;

            }

            if (k==i) count++;
        }
        return count;
    }

    public static void delsortering(int[] a){
        int v = 0, h = a.length - 1;

        while (v < a.length && (a[v] & 1) != 0) v++;
        while (h >= 0 && (a[h] & 1) == 0) h--;

        while (true)
        {
            if (v < h) swap(a,v++,h--); else break;
            while ((a[v] & 1) != 0) v++;
            while ((a[h] & 1) == 0) h--;
        }

        Arrays.sort(a, 0, v);
        Arrays.sort(a, v, a.length);


    }





    public static void rotasjon(char[] a) {


        if (a.length > 1) {
            char temp = a[a.length - 1];
            for (int i = a.length - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }
            a[0] = temp;
        }
    }

    public static void rotasjon(char[] a, int k){}
    public static String flett(String s, String t){ return flett("","");}
    public static String flett(String... s){return flett("","");}
    public static int[] indekssortering(int[] a){ return a;}
    public static int[] tredjeMin(int[] a){return a;}
    boolean inneholdt(String a, String b){return false;}
}
