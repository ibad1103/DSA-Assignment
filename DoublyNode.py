class DoublyNode:
    def _init_(self, data):
        self.data = data
        self.prev = None
        self.next = None

class DoublyLinkedList:
    def _init_(self):
        self.head = None

    def append(self, data):
        new_node = DoublyNode(data)
        if not self.head:
            self.head = new_node
        else:
            temp = self.head
            while temp.next:
                temp = temp.next
            temp.next = new_node
            new_node.prev = temp

    def remove_node(self, node):
        if not node:
            return
        if node.prev:
            node.prev.next = node.next
        if node.next:
            node.next.prev = node.prev
        if node == self.head:  # Update head if necessary
            self.head = node.next

    def print_list(self):
        temp = self.head
        while temp:
            print(temp.data, end=" ⇔ ")
            temp = temp.next
        print("Null")


# Test Cases
dll = DoublyLinkedList()
dll.append(1)
dll.append(2)
dll.append(3)
dll.append(4)
dll.append(5)

print("Original List:")
dll.print_list()

# Remove the node with value 3
node_to_remove = dll.head.next.next  # Node with value 3
dll.remove_node(node_to_remove)

print("After Removal:")
dll.print_list()
