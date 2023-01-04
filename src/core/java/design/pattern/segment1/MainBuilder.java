package core.java.design.pattern.segment1;

public class MainBuilder {
    public static void main(String[] args) {
        UserDetail userDetail = new UserDetail.Builder("Mohita","Sachdeva","25874134").emailID("sachdevasns").acc();
        System.out.println(userDetail.toString());
    }
}
