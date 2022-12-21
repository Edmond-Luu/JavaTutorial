public class Triangle {

    // Static class methods do NOT need an instance in order to be used; we just use
    // the class name.
    static int numOfSides = 3;

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

    // Notice that the word "static" is NOT used because this is NOT a static
    // function because it relies on instances of the class.
    public double findArea() {
        return (this.base * this.height) / 2;
    }
}
