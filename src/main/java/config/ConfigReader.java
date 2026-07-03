package config;
import java.io.*;import java.util.*;
public class ConfigReader{
Properties p=new Properties();
public ConfigReader(){
try{
FileInputStream f=new FileInputStream("src/main/resources/config.properties");
p.load(f);
}catch(Exception e){e.printStackTrace();}
}
public String get(String k){return p.getProperty(k);}
}