#pragma once

#include <string>

class Form { // abstract because has at least one abstract method
private:
    std::string m_name;

protected:
    Form(std::string name);

public:
    virtual ~Form();

    const std::string& getName() const;
    void setName(const std::string& name);

    virtual void translate(double x, double y) =0; // abstract method, pure virtual method
};