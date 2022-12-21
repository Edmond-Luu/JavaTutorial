public class ClassesA {

    public class Triangle {
        double base;
        double height;
        double sideLenOne;
        double sideLenTwo;
        double sideLenThree;

        public Triangle(double base, double height, double sideLenOne,
                double sideLenTwo,
                double sideLenThree) {
            this.base = base;
            this.height = height;
            this.sideLenOne = sideLenOne;
            this.sideLenTwo = sideLenTwo;
            this.sideLenThree = sideLenThree;
        }

        public double findArea() {
            return (this.base * this.height) / 2;
        }
    }

    public static void main(String[] args) {
        Triangle triangleA = new Triangle(1, 2, 3, 4, 5);
    }
}