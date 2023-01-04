package core.java.design.pattern.segment1;

public class Demo1 {

        public static void main(String[] args) {
            Collections cmpnyRepository = new Collections();

            for(Iterator iter = cmpnyRepository.getIterator(); iter.hasNext();){
                String name = (String)iter.next();
                System.out.println("Name : " + name);
            }
        }
    }

