#include "circle.h"

Circle::Circle(std::string name, double radius, Point *center):
    Form(name), m_radius(radius), m_center(center)
{
}

Circle::~Circle()
{
}

void Circle::translate(double x, double y)
{
}

double Circle::area()
{
    return 0.0;
}

double Circle::perimeter()
{
    return 0.0;
}
