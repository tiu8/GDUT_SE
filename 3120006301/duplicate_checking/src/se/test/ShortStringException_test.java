package se.test;

import org.junit.Test;
import se.main.SimHash;


public class ShortStringException_test {

    @Test
    public void shortStringExceptionTest(){
        //测试str.length()<200的情况
        System.out.println(SimHash.getSimHash("孤独之旅"));
    }

}
