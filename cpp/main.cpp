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
    Client *ptr_client4 = new Client(3, "Jenifer", "Doe");

    RegisteredClient client5(4, "Toto", "Titi", 4);   

    std::vector<Client*> clients {&client1, ptr_client2, &client3, ptr_client4, &client5};

    for (auto ptr_client: clients) {
        std::cout << *ptr_client << std::endl;
    }

    scenario1(client3);
    scenario1(client5);

    scenario2(client5);

    delete ptr_client2;
    delete ptr_client4;

    return 0;
}