#include "RegisteredClient.h"

RegisteredClient::RegisteredClient(
    int id, const std::string &firstname, const std::string &lastname, 
    int satisfactionLevel
): Client(id, firstname, lastname), m_satisfactionLevel(satisfactionLevel)
{
}

int RegisteredClient::getSatisfactionLevel() const
{
    return this->m_satisfactionLevel;
}

void RegisteredClient::setSatisfactionLevel(int satisfactionLevel)
{
    this->m_satisfactionLevel = satisfactionLevel;
}
