package data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

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

    @Test
    void designPatternIteratorImplicit() {
        // Rappel: forms = List.of(ptA, ptB, ptC, circleC, polyABC);

        // What is the real class of list forms
        System.out.println(forms.getClass());
        // class java.util.ImmutableCollections$ListN

        System.out.println("Instance of List<E> ? " + (forms instanceof List));

        // iterator implicite avec for "foreach" en Java 5
        for (Form f : forms) {
            System.out.println("\t * " + f);
        }
        for (var f : forms) {
            System.out.println("\t - " + f);
        }
        forms.forEach((Form f) -> System.out.println("\t ° " + f));
        forms.forEach((var f) -> System.out.println("\t * " + f));
        forms.forEach(f -> System.out.println("\t - " + f));

    }

    @Test
    void  designPatternIteratorPolygon() {
        // for (var e: ptA) {}  // Point is not iterable

        // Polygon has been made Iterable<Point>
        System.out.println("Summits of polygon: " + polyABC);
        for (var summit: polyABC) {
            System.out.println("\t- summit: " + summit);
        }
    }

    @Test
    void designPatternIteratorExplicit() {
//        var it1 = forms.iterator();
//        System.out.println(it1.getClass());
        // class java.util.ImmutableCollections$ListItr

        List<Form> formsAL = new ArrayList<>(forms);
        List<Form> formsLL = new LinkedList<>(forms);
        Set<Form>  formSet = new HashSet<>(forms);
        NavigableSet<Form> formOrderedSet = new TreeSet<>(
                Comparator.comparing(Form::getName)
                        .thenComparing(f->f.getClass().getSimpleName())
        );
        formOrderedSet.addAll(formSet);

        for (var formCollection: List.of(
                forms,
                formsAL,
                formsLL,
                formSet,
                formOrderedSet)
        ){
            System.out.println(formCollection.getClass().getName()
                    + ": " + formCollection);
            Iterator<Form> it = formCollection.iterator();
            System.out.println("Iterator: " + it.getClass().getName());
            while (it.hasNext()) {
                var f = it.next();
                System.out.println("\t - item: " + f);
            }
            System.out.println();
        }

    }

}
