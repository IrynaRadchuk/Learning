package Questions.questions8;

public class MainExternal {
    public static void main(String[] args) {
        SuperClass sp = new ChildClass("Super User");
        ((ChildClass) sp).show();
    }
}
