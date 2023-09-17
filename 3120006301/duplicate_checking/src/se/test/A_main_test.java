package se.test;

import org.testng.annotations.Test;
import se.main.Hamming;
import se.main.SimHash;
import se.main.TXT_IO;

public class A_main_test
{
//    @Test
//    public void origAndAllTest(){
//        String[] str = new String[6];
//        str[0] = TXT_IO.readTxt("txt/orig.txt");
//        str[1] = TXT_IO.readTxt("txt/orig_0.8_add.txt");
//        str[2] = TXT_IO.readTxt("txt/orig_0.8_del.txt");
//        str[3] = TXT_IO.readTxt("txt/orig_0.8_dis_1.txt");
//        str[4] = TXT_IO.readTxt("txt/orig_0.8_dis_10.txt");
//        str[5] = TXT_IO.readTxt("txt/orig_0.8_dis_15.txt");
//        String ansFileName = "txt/ansAll.txt";
//        for(int i = 0; i <= 5; i++){
//            double ans = Hamming.getSimilarity(SimHash.getSimHash(str[0]), SimHash.getSimHash(str[i]));
//            System.out.println("查重率："+ans*100+"%");
//            TXT_IO.writeTxt(ans, ansFileName);
//        }
//    }

    @Test
    public void origAndOrigTest(){
        String str0 = TXT_IO.readTxt("txt/orig.txt");
        String str1 = TXT_IO.readTxt("txt/orig.txt");
        String ansFileName = "txt/ansAndOrigTest.txt";
        double ans = Hamming.getSimilarity(SimHash.getSimHash(str0), SimHash.getSimHash(str1));
        System.out.println("查重率："+ans*100+"%");
        TXT_IO.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndAddTest(){
        String str0 = TXT_IO.readTxt("txt/orig.txt");
        String str1 = TXT_IO.readTxt("txt/orig_0.8_add.txt");
        String ansFileName = "txt/ansAndAddTest.txt";
        double ans =Hamming.getSimilarity(SimHash.getSimHash(str0), SimHash.getSimHash(str1));
        System.out.println("查重率："+ans*100+"%");
        TXT_IO.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDelTest(){
        String str0 = TXT_IO.readTxt("txt/orig.txt");
        String str1 = TXT_IO.readTxt("txt/orig_0.8_del.txt");
        String ansFileName = "txt/ansAndDelTest.txt";
        double ans = Hamming.getSimilarity(SimHash.getSimHash(str0), SimHash.getSimHash(str1));
        System.out.println("查重率："+ans*100+"%");
        TXT_IO.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDis1Test(){
        String str0 = TXT_IO.readTxt("txt/orig.txt");
        String str1 = TXT_IO.readTxt("txt/orig_0.8_dis_1.txt");
        String ansFileName = "txt/ansAndDis1Test.txt";
        double ans = Hamming.getSimilarity(SimHash.getSimHash(str0), SimHash.getSimHash(str1));
        System.out.println("查重率："+ans*100+"%");
        TXT_IO.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDis10Test(){
        String str0 = TXT_IO.readTxt("txt/orig.txt");
        String str1 = TXT_IO.readTxt("txt/orig_0.8_dis_10.txt");
        String ansFileName = "txt/ansAndDis10Test.txt";
        double ans = Hamming.getSimilarity(SimHash.getSimHash(str0), SimHash.getSimHash(str1));
        System.out.println("查重率："+ans*100+"%");
        TXT_IO.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDis15Test(){
        String str0 = TXT_IO.readTxt("txt/orig.txt");
        String str1 = TXT_IO.readTxt("txt/orig_0.8_dis_15.txt");
        String ansFileName = "txt/ansAndDis15Test.txt";
        double ans = Hamming.getSimilarity(SimHash.getSimHash(str0), SimHash.getSimHash(str1));
        System.out.println("查重率："+ans*100+"%");
        TXT_IO.writeTxt(ans,ansFileName);
    }

}

