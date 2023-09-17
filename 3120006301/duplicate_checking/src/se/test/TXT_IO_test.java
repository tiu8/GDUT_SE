package se.test;

import org.junit.Test;
import se.main.TXT_IO;

import static se.main.TXT_IO.*;

public class TXT_IO_test {
    @Test
    public void readTxtTest() {
        // 路径存在，正常读取
        String str = readTxt("txt/orig.txt");
        String[] strings = str.split(" ");
        for (String string : strings) {
            System.out.println(string);
        }
    }

    @Test
    public void writeTxtTest() {
        // 路径存在，正常写入
        double[] elem = {0.1, 0.2, 0.3, 0.4, 0.5};
        for (int i = 0; i < elem.length; i++) {
            writeTxt(elem[i], "txt/ans.txt");
        }
    }

    @Test
    public void readTxtFailTest() {
        // 路径不存在，读取失败
        String str = readTxt("txt/none.txt");
    }

    @Test
    public void writeTxtFailTest() {
        // 路径错误，写入失败
        double[] elem = {0.1, 0.2, 0.3, 0.4, 0.5};
        for (int i = 0; i < elem.length; i++) {
            writeTxt(elem[i], "User:/test/ans.txt");
        }
    }

}