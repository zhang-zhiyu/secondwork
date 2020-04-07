package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count,max;
        Scanner sc = new Scanner(System.in);
        count=sc.nextInt();
        int[] a = new int[count];
        Scanner shuzu = new Scanner(System.in);
        String[] temp = shuzu.nextLine().split(" ");
        for(int i = 0; i < count; i++) {
            a[i] = Integer.parseInt(temp[i]);
        }
        int sum;
        sum=a[0];
        max=sum;
        for(int j=1;j<count;j++){
            if(sum>0){
                sum=sum+a[j];
            }else{
                sum=a[j];
            }
            if(sum>max)
                max=sum;
        }
        System.out.println(max);
    }
}
