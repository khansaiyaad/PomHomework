package org.example;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProp {
    static FileInputStream input=null;
    static Properties prop=null;

    public String getProperty(String key){
        prop=new Properties();
        try{
            input=new FileInputStream("src/test/java/Resources/testDataConfig.properties");
            prop.load(input);
            input.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
//just to check working or not
//    @Test
//    public void testing(){
//        System.out.println(getProperty("url"));
//    }
}
