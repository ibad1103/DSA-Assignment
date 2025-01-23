def find_intersection(list1, list2):
    dummy = Node(0)  # Dummy node for the result list
    tail = dummy
    temp1, temp2 = list1.head, list2.head

    while temp1 and temp2:
        if temp1.data == temp2.data:
            tail.next = Node(temp1.data)  # Add common element
            tail = tail.next
            temp1 = temp1.next
            temp2 = temp2.next
        elif temp1.data < temp2.data:
            temp1 = temp1.next
        else:
            temp2 = temp2.next

    result = SinglyLinkedList()
    result.head = dummy.next
    return result


# Test Cases
list1 = SinglyLinkedList()
list1.append(10)
list1.append(20)
list1.append(30)

list2 = SinglyLinkedList()
list2.append(15)
list2.append(20)
list2.append(30)

print("List 1:")
list1.print_list()

print("List 2:")
list2.print_list()

intersection = find_intersection(list1, list2)
print("Intersection List:")
intersection.print_list()
