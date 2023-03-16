package data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FormTest2 {

    Point ptA;
    Point ptB;
    Point ptC;
    Circle circleC;
    Polygon polyABC;

    List<Form> forms;

    @BeforeEach
    void initData() {
        ptA = new Point("A", 3.0, 4.5);
        ptB = new Point("B", 3.0, 7.5);
        ptC = new Point("C", 8.0, 7.5);
        circleC = new Circle("C", 5.25, ptA);
        polyABC = new Polygon("P", ptA, ptB, ptC);

        // TODO: reunite all forms in list forms
    }

    @Test
    void displayForms(){

    }

    @Test
    void translateForms(){

    }

    @Test
    void downcasting(){

    }


}
