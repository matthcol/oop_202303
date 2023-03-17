#include "form.h"

#include <iostream>

Form::Form(std::string name): m_name(name)
{
}

Form::~Form()
{
    std::clog << "Destroy as a form" << std::endl;
}

const std::string &Form::getName() const
{
    return m_name;
}

void Form::setName(const std::string &name)
{
    m_name = name;
}
