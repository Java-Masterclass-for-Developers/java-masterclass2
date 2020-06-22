package pl.pawtel.classes_constructors_inheritance;

public class Main {
    public static void main(String[] args) {
        // test for SimpleCalculator
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.setFirstNumber(5.0);
        simpleCalculator.setSecondNumber(4.0);
        System.out.println("Sum: " + simpleCalculator.getAdditionResult());
        System.out.println("Substract: " + simpleCalculator.getSubstractionResult());
        System.out.println("Multiply: " + simpleCalculator.getMultiplicationResult());
        System.out.println("Divide: " + simpleCalculator.getDivisionResult());

        // test for Person
        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());

        // test for Wall
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

        // test for Point
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());

        //OUTPUT Point
        /*distance(0,0)= 7.810249675906654
        distance(second)= 5.0
        distance(2,2)= 5.0
        distance()= 0.0*/

        // ComplexNumber
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1, 1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());

        // expected OUTPUT

       /* one.real= 2.0
        one.imaginary= 2.0
        one.real= -0.5
        one.imaginary= 3.5
        number.real= 3.0
        number.imaginary= -5.0*/
    }
}
