/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.tuantu.mathutil.core;


import org.junit.Assert;
import org.junit.Test;


public class MathUtilTest {
    
     //ham getF() dc thiet ke de tra ve con long neu n dua vao 0..20
          //ham getF() dc thiet ke NEM RA EXCEPTION NEU TA DUA VAO N < 0 || N > 20
          //tuc la neu goi getF(-5) thi CHO GOI SE NHAN VE EXCEPTION TEN LA
          //illegalArgumentException
          //dua ca chon, nhan ngoai le
          //bat xem ham minh co dung nem ngoai le hay ko neu data ca chon
          //THAY NGOAI LE MUNG ROI NC MAT
    @Test(expected = Exception.class)
    //vietsub: khi chay ham na, ktr gium xem co 1
    //ngoai le thuoc nhom/class IllegalArgumentException xh hay ko
    //no xh = cach no dc new IllegalArgumentException o dau do
    //neu co xh, mung qua, dung nhu thiet ke, mau XANH
    //KI VONG MAY XH, DU M LA EXCEPTION, VA MAY XH THAT, MAU XANH
    public void testFactorialGivenWrongArgumentThrowsException(){
        MathUtil.getFactorial(-5);
    }
    
    @Test //ten ham test bao ham luon y nghia test cai gi
          //quy uoc dan kiem thu
          //ham nay tui muon test ham giai thua khi dua tham so dung
          //may phai tra ve dung
          //viet code phai theo quy tac - CODING CONVENTION
    public void testFactorialGivenRightArgumentReturnsWell(){
        //Test case #1: Kiem thu tinh huong 1 coi co dung ko?
        //n = 0, hy vong ham oi ve expected = 1; actual thuc te
        //ham chay tra ra may, doan xem???
        long expected = 1;
        long actual = MathUtil.getFactorial(0); //goi ham de kiem tra actual la may
        //so sanh 2 gia tri coi tuong dong hem? co dung, ko BUG
        //so sanh = sout() va dung mat de luan ket qua, XUA ROI 
        //choi mau moi ngau
        Assert.assertEquals(expected, actual);
        
        //Test case #2: Kiem thu tinh huong 1! coi co dung ko?
        //n = 1, hy vong ham oi ve expected = 1; actual thuc te
        //ham chay tra ra may, doan xem???
        expected = 1;
        actual = MathUtil.getFactorial(1);
        Assert.assertEquals(expected, actual);
        
        //Test case #3: n =2, 2! expected =2?
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        
        
    }
    @Test
    public void tryJUnitFirst(){
        Assert.assertEquals(69, 69);
    }
    
    @Test
    public void testFactorialGivenRightArgumentReturnsWell2(){
        
        //Test case #4: n =3, 3! expected =6?
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        
        //Test case #5: n =4, 4! expected =24?
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        
        //Test case #6: n =5, 5! expected =120?
        Assert.assertEquals(120, MathUtil.getFactorial(5));
        
        //Test case #7: n =6, 6! expected =720?
        Assert.assertEquals(720, MathUtil.getFactorial(6));
        
        
        
        
        
    }
    
}


//CLASS NAY TA SE VIET CAC DOAN CODE NHU BINH THUONG
//NHUNG CODE NAY DUNG DE TEST CODE CHINH BEN MATHUTIL
//VIET CODE DE TEST CODE CHINH, THI CAC DOAN CODE TEST DC GOI
//TEN LA TEST SCRIPT
//TEST SCRIPT LA NHUNG DOAN CODE DC VIET DE TEST CODE KHAC, CODE CHINH 
//Nhung doan code nay se goi ham ben code chinh, so sanh gia tri
//tra ve cua ham chinh can test voi gis tri ki vong
//Nhung doan code nay/test script nay se PHAI BAO GOM CAC TEST CASE
//BEN TRONG
//TEST SCRIPT CHUA CAC TEST CASE
//trang test script/Class nay se co test 5! 6! 7! -> test case

//@TEST  @ dc goi ANNOTATION, ki hieu, flag de danh dau doan code
//mang 1 y nghia nao do. Va khi bien dich/compile code thi
//thu vien di kem no se tu dong generate them code cho minh tuy theo\
//@
//vi du @Test thi thu vien  JUnit nay import  no se ngam ngam tu generate
//ham nay thanh public static void main() va gui main() nay cho JVM
//Ki thuat  dung thu vien, bi ep phai theo cu phap cua no qua nhung
//@, thu vien nay goi la FRAMEWORK
//FW: la thu vien, nhung file .jar .dll chua dong class ben trong 
// ep ta phai xai theo cach cua no, theo dan khung code ma no quy uoc
//dan khung, template ta dien not code vao cho trong

//Thu vien - library, nhung file .jar .dll chua 1 dong code ben trong
//ta thoai mai dung ham cua no theo cach cua ta

//Quy tac chhoi xanh do
//XANH: KHI TAT CA CAC TEST CASE DAU XANH, TUC LA TAT CA
//              EXPECTED PHAI == ACTUAL
//DO: CHI CAN 1 TEST CASE MAU DO, XEM NHU HAM TOANG/TACH
//          CHI CAN CO 1 EXPECTED != ACTUAL, XEM NHU BO DI HET CAC TEST CASE
//1 THG GAY SAI CHO TAT CA
//LY DO: ham da dung thi phai dung het cho cac case da dc neu ra
//      chi can 1 su ko == nhau cua actual voi expected, ham ko
//      on dinh ve ket qua tra ve -> SAI

//KO THE TEST HET CASE (NL2) NHUNG DA TEST CASE NAO THI PHAI NGON
//XANH CASE DO

//NOI THEM VE MAU DO:
//O XAY RA KHI: CO 1 SU KO BANG NHAU CUA EXPECTED VA ACTUAL
//LY DO GI EXPECTED != ACTUAL
//CO 2 LY DO
//LD1: EXPECTED DUNG, MINH TINH BEN NGOAI, = TAY KHI CHUA CO HAM
//     ACTUAL  SAI, TINH HUONG NAY HAM CUI BAP, BUG BUG

//LD2: EXPECTED SAI, VUT LUON TEST CASE NAY DI, ANH CHANG QC/DEV BI NGAO
//KI VONG MA SAI, HI VONG GI O ACTUAL

//DDT -Data Driven  Testing
//Tach toan bo data kiem thu ra 1 cho
//Lat hoi nhoi.nap,fill data nay nay tuan tu vao cho kiem thu
//VI du tach data da kiem thu o tren thanh
//1       0      
//1       1
//2       2
//6       3
//24      4
//120     5
//720     6



//thay vi lenh so sanh cho tung case, t bien lenh nay thanh tong quat, ko lay data cu the ma tu dau do

// Assert.assertEquals(???, MathUtil.getFactorial(???));

//??? nay se lay tu tap data o tren
//code gon hon, de bao tri, kiem soat dc du thieu case
//ki thuat tach code ra khoi data, lat hoi fill dc goi la KI THUAT VIET TEST CASE THEO KIEU THAM SO HOA
                                                                                       //PARAMETERIZED
//HOAC CON GOI LA                DDT - DATA DRIVEN TESTING
//VIET KIEM THU HUONG VE TACH DATA RIENG RA!!

//LIBRARY: ĐƯỢC XÀI CLASS TỰ DO, CHỦ ĐỘNG ĐIỀU KHIỂN CODE != FRAMEWORK: BỊ ÉP DÙNG DÀN KHUNG CỦA NÓ