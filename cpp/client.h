#ifndef CLIENT_H
#define CLIENT_H

#include <string>
#include <iostream>

class Client {
private:
    int m_id;
    std::string m_firstname;
    std::string m_lastname;
public:
    Client();
    Client(int id, const std::string& firstname, const std::string& lastname);

    int getId() const;
    void setId(int id);

    const std::string& getFirstname() const;
    void setFirstname(const std::string& firstname);

    const std::string& getLastname() const;
    void setLastname(const std::string& lastname);

    std::string toString() const;
};

std::ostream& operator<<(std::ostream& out, const Client& client);

#endif // CLIENT_H