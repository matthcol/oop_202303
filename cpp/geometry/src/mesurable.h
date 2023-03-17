#pragma once

class Mesurable2D {
public:
    virtual ~Mesurable2D(){};
    
    virtual double area() =0;
    virtual double perimeter() =0;
};