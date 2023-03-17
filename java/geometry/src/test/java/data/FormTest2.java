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
        forms = List.of(ptA, ptB, ptC, circleC, polyABC);
    }

    @Test
    void displayForms(){
        for (Form f: forms) {
            System.out.println("- " + f);
            System.out.println("\t* name: " + f.getName());
        }
    }

    @Test
    void translateForms(){
        System.out.println("Before translation: " + forms);
        for (Form f: forms) {
            f.translate(1, -1);
        }
        System.out.println("After translation: " + forms);
    }

    @Test
    void downcastingFormCircle(){
        // look for circles in a lot of forms
        for (Form f: forms) {
            if (f instanceof  Circle){
                Circle c = (Circle) f;
                System.out.println("I've a circle:" + c
                        + " with a radius " + c.getRadius()
                );
            } else  {
                System.out.println("Skip (not a circle: " + f);
            }
        }
    }

    @Test
    void downcastingFormMesurable2d(){
        // look for mesurable object in a lot of forms
        double totalArea = 0;
        for (Form f: forms) {
            if (f instanceof  Mesurable2D){
                Mesurable2D m = (Mesurable2D) f;
                totalArea += m.area();
            }
        }
        System.out.println("Total area: " + totalArea);
    }

}
