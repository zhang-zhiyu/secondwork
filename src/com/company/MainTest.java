package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class MainTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void main1() {
        int count=4;
        int flge=0;
        int[] a = {-10, -20, 1,2};
        int sum,max;
        sum=a[0];
        max=sum;
        for(int j=1;j<count;j++){
            if(a[j]>0)
                flge=1;
            if(sum>0){
                sum=sum+a[j];
            }else{
                sum=a[j];
            }
            if(sum>max)
                max=sum;
        }
        if(flge==0)
            max=0;
        assertEquals(3,max);
    }
    @Test
    public void main2() {
        int count=4;
        int flge=0;
        int[] a = {1, 5, 8,9};
        int sum,max;
        sum=a[0];
        max=sum;
        for(int j=1;j<count;j++){
            if(a[j]>0)
                flge=1;
            if(sum>0){
                sum=sum+a[j];
            }else{
                sum=a[j];
            }
            if(sum>max)
                max=sum;
        }
        if(flge==0)
            max=0;
        assertEquals(23,max);
    }
    @Test
    public void main3() {
        int count=4;
        int flge=0;
        int[] a = {-1, -9, -8,-7};
        int sum,max;
        sum=a[0];
        max=sum;
        for(int j=1;j<count;j++){
            if(a[j]>0)
                flge=1;
            if(sum>0){
                sum=sum+a[j];
            }else{
                sum=a[j];
            }
            if(sum>max)
                max=sum;
        }
        if(flge==0)
            max=0;
        assertEquals(0,max);
    }
}