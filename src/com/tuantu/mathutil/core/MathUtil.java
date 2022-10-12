/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuantu.mathutil.core;

/**
 *
 * @author kichi
 */

//Ta se clone bothu vien/cong cu Math util cua JDK
//gia lap cac ham cua class Math cua JDK
//nhung gii ma la cong cu dung cho ham khac, class khac thi thuong se dc 
//thiet ke la STATIC
//STATIC LA CHAM TRUC TIEP QUA TEN CLASS, EO CO NEW
public class MathUtil {
    
    public static final double PI = 3.141592653589793;
    
    //Ham tinh n! = 1.2.3....n
    //Quy uoc:
    //ko co giai thua cho so am
    //0! = 1! = 1
    //21! vuot 18 so 0, vuot kieu long
    //ham cua chung ta design la: chi chap nhan tinh giai thua cua n tu 0....20
    //<0 || >20 CHUI, M DUA N CA CHON!!!
    
    public static long getFactorial(int n){
        if(n<0 || n>20)
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
        if(n==0 || n==1)
            return 1;
        //song sot den day, sure n tu 0..20
        long product = 1; //bien con heo dat, nhan tich luy
                          //acc = accumulation, gop dan
        for (int i = 2; i <= n; i++)
            product *= i;
        return product;
    }

    
}

//KI THUAT LAP TRINH KIEU MOOI (VAN GIU NGUYEN NHUNG KIEN THUC LAP TRINH DA CO)
//1 PLUGIN MOI CHO TRINH DO CUA DEV - VIET CODE CHU Y LUON/CAM KET CO CHAT LUONG
//CHAT LUONG KO NOI = MIENG, CHAT LUONG NOI = CODE
//KI THUAT TDD - TEST DRIVEN DEVELOPMENT
//VIET CODE VA VIET CODE DE TEST CODE SONG SONG VOI NHAU
//MOI HAM DEVELOPER VIET RA PHAI VIET NGAY CAI TEST CASE, PHAI VIET NGAY HANH DONG
//KIEM THU HAM, DE BIET RANG HAM VUA VIET CHAY SAI HAY DUNG