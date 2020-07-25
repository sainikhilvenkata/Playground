#include <stdlib.h>
#include <iostream>
using namespace std;
struct Node {
  int item;
  struct Node* next;
};
void printList(struct Node* node) {
  while (node != NULL) {
    cout << node->item << " ";
    node = node->next;
  }
}
void insertAtBeginning(struct Node** ref, int data) {

  // Allocate memory to a node
  struct Node* new_node = (struct Node*)malloc(sizeof(struct Node));

  // insert the item
  new_node->item = data;
  new_node->next = (*ref);

  // Move head to new node
  (*ref) = new_node;
}

int main() {
  struct Node* head = NULL;
  int a;
  cin>>a;
  while(a>0)
  {   insertAtBeginning(&head, a);
    cin>>a;
  }
    printList(head);
}