package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("üçgenin kenar uzunluklarını giriniz:");
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b= input.nextInt();
    int c= input.nextInt();
    int cevre= (a+b+c)/2;
    int alan = (cevre*(cevre-a)*(cevre-b)*(cevre-c))^1/2;

    System.out.println("üçgenin alanı :"+alan);

    boolean kosul1= a>b;
    boolean kontrol1 =(kosul1==true);



    int max= kosul1? a:b;
    int min= kosul1? b:a;

    boolean kosul2= max>c;

    int newMax= kosul2? max:c;
    int newMin = kosul2? c:min;
    System.out.println(newMax);
    System.out.println(newMin);

    int hipotenus=newMax^2;
    hipotenus= max*max+newMin*newMin;
    System.out.println("hipotenüsün değeri:"+hipotenus);






    }
}
