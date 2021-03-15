package lessons.lesson10;


import java.util.Collection;

public class DataGeneric <T extends Collection, K extends Number>{
    public  T value;
    public String name;
    public int size;
    public K code;
}
