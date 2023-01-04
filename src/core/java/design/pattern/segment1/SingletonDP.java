package core.java.design.pattern.segment1;



public class SingletonDP {
    public static void main(String[] args) {
       SingletonNew obj1 = SingletonNew.getInstance();
        SingletonNew obj2 = SingletonNew.getInstance();
        System.out.println("object of singleton class"+ obj1);
        System.out.println("object of singleton class"+ obj2);
    }
    public static class SingletonNew {
        static SingletonNew singletonNew = new SingletonNew();
        private SingletonNew(){

        }
        public static SingletonNew getInstance(){
            return singletonNew;
        }
    }
}
