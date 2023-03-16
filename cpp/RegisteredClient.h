#pragma once

#include "client.h"

class RegisteredClient: public Client {
private:
    int m_satisfactionLevel;

public:
    RegisteredClient(int id, const std::string& firstname, 
            const std::string& lastname, int satisfactionLevel);

    int getSatisfactionLevel() const;
    void setSatisfactionLevel(int satisfactionLevel);

};