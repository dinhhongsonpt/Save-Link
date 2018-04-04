/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import com.sun.org.apache.bcel.internal.generic.D2F;
import java.io.File;
import savelink.MyProcessFile;

/**
 *
 * @author dinh son
 */
public class MainPassword {

    public static void main(String[] args) {
        File file = new File("Admin.dat");
        if (!file.isFile()) {
            MyProcessFile.saveData(new PassWord("Cutreson", "muonnam"), "Admin.dat");
        }
        new PassWordFrame().setVisible(true);

    }
}
