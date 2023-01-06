package core.java.design.pattern.segment1.strategy;

public class Add implements Strategy{
        @Override
        public int doOperation(int num1, int num2) {
            return num1 + num2;
        }
    }

