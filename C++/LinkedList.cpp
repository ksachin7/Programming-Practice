#include <iostream>

// Define a structure for a node in the linked list
struct Node
{
    int data;
    Node *next;
};

int main()
{
    // Create an empty linked list
    Node *head = nullptr;

    // Add elements to the linked list
    for (int i = 1; i <= 5; i++)
    {
        Node *newNode = new Node; // Create a new node
        newNode->data = i;
        newNode->next = head; // Point the new node to the current head
        head = newNode;       // Update the head to the new node
    }

    // Traverse and print the linked list
    Node *current = head;
    while (current != nullptr)
    {
        std::cout << current->data << " -> ";
        current = current->next;
    }
    std::cout << "nullptr" << std::endl;

    // Clean up: Free the allocated memory
    current = head;
    while (current != nullptr)
    {
        Node *temp = current;
        current = current->next;
        delete temp; // Deallocate memory for each node
    }

    return 0;
}
