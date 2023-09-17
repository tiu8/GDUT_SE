package se.test;

import org.junit.Test;
import se.main.SimHash;
import se.main.TXT_IO;

public class SimHash_test {


    @Test
    public void getHashTest(){
        String[] strings = {"我", "在", "GDUT", "2021级计算机科学与技术", "学习", "软件工程"};
        for (String string : strings) {
            String stringHash = SimHash.getHash(string);
            System.out.println(stringHash.length());
            System.out.println(stringHash);
        }
    }

    @Test
    public void getSimHashTest(){
        String str0 = TXT_IO.readTxt("txt/orig.txt");
        String str1 = TXT_IO.readTxt("txt/orig_0.8_add.txt");
        System.out.println(SimHash.getSimHash(str0));
        System.out.println(SimHash.getSimHash(str1));
    }

}
