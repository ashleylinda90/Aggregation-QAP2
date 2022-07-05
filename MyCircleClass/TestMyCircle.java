package MyCircleClass;

public class TestMyCircle {

        public static void main(String[] args) {

                // Create new MyPoints p1 and p2 with x and y values
                MyPoint p1 = new MyPoint(10, 10);
                MyPoint p2 = new MyPoint(5, 5);

                // Create new MyCircles c1 with p1 center and radius 5, and c2 with p2 center
                // and radius 6
                MyCircle c1 = new MyCircle(p1, 5);
                MyCircle c2 = new MyCircle(p2, 6);

                // Print statements
                System.out.println("\n");

                // Print p1 and p2 coordinates
                System.out.println("Point 1: " + p1);
                System.out.println("Point 2: " + p2);
                System.out.println("\n");

                // Print c1 and c2 coordinates/radius
                System.out.println("First Circle: " + c1.getCenter() + " Radius: " + c1.getRadius());
                System.out.println("Second Circle: " + c2.getCenter() + " Radius: " + c2.getRadius());
                System.out.println("\n");

                // Print c1 and c2 areas
                System.out.println("Area of First Circle = " + (Math.round(c1.getArea())));
                System.out.println("Area of Second Circle = " + (Math.round(c2.getArea())));
                System.out.println("\n");

                // Print distance between c1 and c2
                System.out.println("The distance between two circles is "
                                + (Math.round(c1.getCenter().distance(c2.getCenter()))));
                System.out.println("\n");

                System.out.println("Set Circle 1 Center to p2");

                // Set p2 as c1 center
                c1.setCenter(p2);

                // Print c1 and c2 coordinates/radius
                System.out.println("First Circle: " + c1.getCenter() + " Radius: " + c1.getRadius());
                System.out.println("Second Circle: " + c2.getCenter() + " Radius: " + c2.getRadius());

                // Print new distance between c1 and c2
                System.out.println("New distance between two circles is "
                                + (Math.round(c1.getCenter().distance(c2.getCenter()))));
                System.out.println("\n");

                System.out.println("Set Circle 1 Center to (5,10) and Circle 2 to (25,10)");

                // Set new x,y values to p1
                p1.setXY(5, 10);

                // Print c1 coordinates/radius
                System.out.println("First Circle: " + c1.getCenter() + " Radius: " + c1.getRadius());

                // Set new x,y values to p2
                p2.setXY(25, 10);

                // Print c2 coordinates/radius
                System.out.println("Second Circle: " + c2.getCenter() + " Radius: " + c2.getRadius());

                // Print distance between p1 and p2
                System.out.println("Final distance between two circles is "
                                + (Math.round(p1.distance(p2))));

                System.out.println("\n");

        }

}
