package core.java.design.pattern.segment1.reflection;

import java.lang.reflect.Method;

public class Reflection {

        public void get() {
            System.out.println("hello world");
        }
        public void display() {
            System.out.println("i am learnning core java");
        }
    }

    class ReflectionUSe {
        public static void main(String[] args) {
            Reflection reflection = new Reflection();
            Class aclass = reflection.getClass();
            String c = aclass.getName();
            System.out.println("name of the class" + c);
            Method c1[] = aclass.getDeclaredMethods();
            for (Method m : c1
            ) {
                System.out.println("name of the methods that declare in class" + m.getName());
            }

        }
    }

