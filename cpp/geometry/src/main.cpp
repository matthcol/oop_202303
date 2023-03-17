#include "form.h"
#include "point.h"
#include <iostream>

void scenario1() {
    std::clog << "Scenario 1" << std::endl; 

    // Form f;  // forbidden

    Point p("A", 1.0, 2.0);

    // LSP ok with reference or pointer
    Form *ptr_f = &p; 
    ptr_f->translate(1,-1);

    Form &f = p;
    f.translate(1, -1);
}  // for object p: call destructor of class Point, then Form 

void scenario2() {
    std::clog << "Scenario 2" << std::endl; 
    const Form &f = Point("A", 1.0, 2.0);
}

void scenario3() {
    std::clog << "Scenario 3" << std::endl; 
    Form *f = new Point("A", 1.0, 2.0);
    // TODO: use f
    delete f;
}

int main() {
    scenario1(); 
    scenario2(); 
    scenario3();
    return 0;
}  