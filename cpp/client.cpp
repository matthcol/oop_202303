#include "client.h"

#include <sstream>

Client::Client():
        m_id(-1), m_firstname(""), m_lastname("")  // or keep default values (random, "", "")
{
}

Client::Client(int id, const std::string &firstname, const std::string &lastname):
        m_id(id),m_firstname(firstname), m_lastname(lastname)
{
}

int Client::getId() const
{
    return this->m_id;
}

void Client::setId(int id)
{
    this->m_id = id;
}

const std::string &Client::getFirstname() const
{
    return this->m_firstname;
}

void Client::setFirstname(const std::string &firstname)
{
    this->m_firstname = firstname;
}

const std::string &Client::getLastname() const
{
    return this->m_lastname;
}

void Client::setLastname(const std::string &lastname)
{
    this->m_lastname = lastname;
}

std::string Client::toString() const
{
    std::stringstream buffer;
    buffer << "Client#" << this->m_id
        << "[" << this->m_firstname
        << " " << this->m_lastname
        << "]"; 
    return buffer.str();
}

std::ostream &operator<<(std::ostream &out, const Client &client)
{
    return out << client.toString();
}
