package Lessons.Lesson6;

public class ObjectsCount {
    public static int count = 0;
    public static int countFun = 0;
    public static int countTotal = 0;
    public ObjectsCount () {
        count++;
        countTotal++;
    }
    public ObjectsCount (String name) {
        this (); // вызов основного конструктора внутри этого, чтоб не писать снова каунт++
    }
    public ObjectsCount (int x) {
        countFun++;
        countTotal++;
    }
}
