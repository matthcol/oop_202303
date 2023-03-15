#include <iostream>
#include <vector>

#include "client.h"

 
int main(){
    std::cout << "I like OOP" << std::endl;

    Client  client1;  // in the stack
    Client *ptr_client2 = new Client(); // in the heap

    Client client3(2, "James", "Doe");
    Client *ptr_client4 = new Client(3, "Jenifer", "Doe");

    std::vector<Client*> clients {&client1, ptr_client2, &client3, ptr_client4};

    for (auto ptr_client: clients) {
        std::cout << *ptr_client << std::endl;
    }


    delete ptr_client2;
    delete ptr_client4;

    return 0;
}