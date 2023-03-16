package data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormTest {

    @Test
    void test_asbtract_class_cannot_be_instiated() {
        // OK to declare a Form variable
        Form form;
//        form = new Form();  // abstract class can't be instantiated
    }


    @Test
    void test_point_as_a_form(){
        Form form = new Point("A", 3.0, 4.5);
        System.out.println(form);
    }

    @Test
    void test_circle_as_a_form(){
        Point ptA = new Point("A", 3.0, 4.5);
        Form form = new Circle("C", 5.25, ptA);
        System.out.println(form);
    }

    @Test
    void test_polygon_as_a_form(){
        Point ptA = new Point("A", 3.0, 4.5);
        Point ptB = new Point("B", 3.0, 7.5);
        Point ptC = new Point("C", 8.0, 7.5);
        Form form = new Polygon("P", ptA, ptB, ptC);
        System.out.println(form);
    }
}