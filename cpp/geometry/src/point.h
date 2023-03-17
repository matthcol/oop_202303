#pragma once

#include "form.h"

class Point: public Form {
private:
    double m_x;
    double m_y;

public:
    Point(std::string name, double x, double y);
    virtual ~Point();

    virtual void translate(double x, double y) override;     
};