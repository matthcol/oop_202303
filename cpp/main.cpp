#include <iostream>
#include <vector>

#include "client.h"
#include "RegisteredClient.h"

void scenario1(const Client& client) {
    std::cout << "sccenario #1" << client  
        << " a comme nom " << client.getLastname() << std::endl; 
}

void scenario2(const Client& client) {
    Client copyClient(client);  // Client copyClient = client;
    std::cout << "sccenario #2" << copyClient << std::endl;
}
 
int main(){
    std::cout << "I like OOP" << std::endl;

    Client  client1;  // in the stack
    Client *ptr_client2 = new Client(); // in the heap

    Client client3(2, "James", "Doe");
    Client *ptr_client4 = new Client(4, "Jenifer", "Doe");

    RegisteredClient client5(5, "Toto", "Titi", 10);   

    std::vector<Client*> clients {&client1, ptr_client2, &client3, ptr_client4, &client5};

    std::cout << std::endl << "Liste des clients:" << std::endl;
    for (auto ptr_client: clients) {
        std::cout << *ptr_client << std::endl;
        // un client est il un register client
        RegisteredClient *ptr_registredClient = dynamic_cast<RegisteredClient*>(ptr_client);
        if (ptr_registredClient != nullptr) {
            std::cout << "\t- satisfaction:" << ptr_registredClient->getSatisfactionLevel()
                    << std::endl;
        }
    }
    std::cout << std::endl;

    std::cout << client5 << std::endl << std::endl;

    std::cout << client5.toString() << std::endl << std::endl;

    scenario1(client3);
    scenario1(client5);

    scenario2(client5);

    delete ptr_client2;
    delete ptr_client4;

    return 0;
}