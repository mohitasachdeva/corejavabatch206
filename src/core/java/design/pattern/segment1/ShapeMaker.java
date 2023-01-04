package core.java.design.pattern.segment1;


    public class ShapeMaker {
        private Shapes2 circle;

        private Shapes2 square;

        public ShapeMaker() {
            circle = new Circle1();

            square = new Square();
        }

        public void drawCircle(){
            circle.draw();
        }

        public void drawSquare(){
            square.draw();
        }
    }

