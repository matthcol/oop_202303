#pragma once

#include "form.h"
#include "mesurable.h"
#include "point.h"

class Circle : public Form, public Mesurable2D {
private:
    double m_radius;
    Point *m_center;
public:
    Circle(std::string name, double radius, Point* center);
    virtual ~Circle();

    virtual void translate(double x, double y) override;
    virtual double area() override;
    virtual double perimeter() override;
};