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
        int count=6;
        int[] a = {-20, 11, -4,13,-5,-2};
        int sum,max;
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
        assertEquals(20,max);
    }
    @Test
    public void main2() {
        int count=6;
        int[] a = {-20, 11, -4,13,-5,-2};
        int sum,max;
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
        assertEquals(20,max);
    }
    @Test
    public void main4() {
        int count=6;
        int[] a = {-20, 11, -4,13,-5,-2};
        int sum,max;
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
        assertEquals(20,max);
    }
}