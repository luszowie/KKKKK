import com.sun.org.apache.xml.internal.res.XMLErrorResources_ko;

import java.awt.*;

public class Test {
    static synchronized protected final void specialMethod() {};
    public static final int A = 5;

    public static void main(String[] args) {

        /*WashingMachine washingMachine = new WashingMachine();
        washingMachine.modeForSensitiveClothes();
        */



       /* A a = new A();
        a.setCounter(124);
        a.print();*/
        //a.counter = 34; tego się nie da bo jest private




        /*Integer i = 1;
        System.out.println(i.toString());
        System.out.println(i);

        Point point = new Point(2, 5);
        System.out.println(point.toString());
        System.out.println(point);

        Employee[] employees = new Employee[4];
        employees[0] = new Employee("Tomek", 28,1000);
        employees[1] = new Employee("Zofia", 55, 2000);
        employees[2] = new Employee("Wojciech", 22, 3000);
        employees[3] = new Employee("Karol", 17, 1500);

        for (Employee employee : employees) {
            System.out.println(employee);

        }

        Product product = new Product(100,"Mleko");
        System.out.println(product);
*/
    }
}

class A {
    protected int counter;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void print (){
        System.out.println("jsetem obiektem klasy A " + "licznik" + getCounter());

    }
}

class B {
    A a = new A();
    void test() {
        int i = a.counter;
    }
}

