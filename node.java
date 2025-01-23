class Node:
    def _init_(self, data):
        self.data = data
        self.next = None

class SinglyLinkedList:
    def _init_(self):
        self.head = None

    def append(self, data):
        new_node = Node(data)
        if not self.head:
            self.head = new_node
        else:
            temp = self.head
            while temp.next:
                temp = temp.next
            temp.next = new_node

    def reverse(self):
        reversed_list = SinglyLinkedList()
        temp = self.head
        stack = []  # Use a stack to reverse
        while temp:
            stack.append(temp.data)
            temp = temp.next
        while stack:
            reversed_list.append(stack.pop())
        return reversed_list

    def print_list(self):
        temp = self.head
        while temp:
            print(temp.data, end=" → ")
            temp = temp.next
        print("Null")


# Test Cases
original = SinglyLinkedList()
original.append(10)
original.append(20)
original.append(30)

print("Original List:")
original.print_list()

reversed_list = original.reverse()
print("Reversed List:")
reversed_list.print_list()
