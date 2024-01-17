package org.example;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        int[] dizi = {5,3,9,1,8,2,7,4,6};
        System.out.println("Sıralanmamış Dizi: "+ Arrays.toString(dizi));
        quickSort(dizi,0,dizi.length-1);
        System.out.println("Sıralanmış Dizi: "+Arrays.toString(dizi));
    }

    public static void quickSort(int[] dizi, int baslangic, int bitis){
        if(baslangic<bitis){
            int pivotIndex = partition(dizi,baslangic,bitis);
            quickSort(dizi,baslangic,pivotIndex-1);
            quickSort(dizi, pivotIndex+1,bitis);
        }
    }


    public static int partition(int[] dizi, int baslangic, int bitis){
        int pivot = dizi[bitis];
        int i = (baslangic-1);
        for(int j = baslangic;j<bitis;j++){
            if(dizi[j]<pivot){
                i++;
                int gecici = dizi[i];
                dizi[i] = dizi[j];
                dizi[j] = gecici;
            }
        }
        int gecici = dizi[i+1];
        dizi[i+1] = dizi[bitis];
        dizi[bitis] = gecici;
        return i+1;
    }
}
