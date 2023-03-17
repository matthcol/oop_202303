#include "point.h"

#include <iostream>

Point::Point(std::string name, double x, double y):
        Form(name), m_x(x), m_y(y)
{
}

Point::~Point()
{
    std::clog << "Destroy as a Point" << std::endl;
}

void Point::translate(double x, double y)
{
    m_x += x;
    m_y += y;
}