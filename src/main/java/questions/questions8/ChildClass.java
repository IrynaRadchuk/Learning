package questions.questions8;

public class ChildClass extends SuperClass{
private final String userName;

    public ChildClass(String userName) {
       this.userName = userName;
    }
    public void show(){
        external.hello(userName);
    }
}
