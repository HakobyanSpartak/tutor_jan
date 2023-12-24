// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee("Aram", 20000);

        Manager man = new Manager("Karen", 2000, 500);
        //System.out.println(man.getSalary());

        Uxxankyun u1 = new Uxxankyun(5, 2);
        Uxxankyun u2 = new Uxxankyun(5, 3);
        Uxxankyun u3 = new Uxxankyun(5, 4);

        Qarakusi q1 = new Qarakusi(2);
        Qarakusi q2 = new Qarakusi(99);
        Qarakusi q3 = new Qarakusi(4);


        Circle c1 = new Circle(2);
        Circle c2 = new Circle(3);
        Circle c3 = new Circle(4);

        try {
            int d = getWeekDay("qaq");
            System.out.println(d);
        }   catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(4);
        //System.out.println(maxShapeArea(q1,q2,c1));

    }

    public static int getWeekDay (String weekday) {
        int day;
        switch (weekday) {
            case "erk":
                day = 1;
                break;
            case "ereq":
                day = 2;
                break;
            case "choreq":
                day = 3;
                break;
            case "hing":
                day = 4;
                break;
            case "urb":
                day = 5;
                break;
            case "shab":
                day = 6;
                break;
            case "kiraki":
                day = 7;
                break;
            default:
                throw new RuntimeException("Your inout is wrong");
        }
        return day;
    }

    public static double maxShapeArea (Shape sh1 , Shape sh2, Shape sh3) {
        double max = sh1.calculateArea();;

        if (sh2.calculateArea() > max) {
            max = sh2.calculateArea();
        }
        if (sh3.calculateArea() > max) {
            max = sh3.calculateArea();
        }

        return max;
    }

}