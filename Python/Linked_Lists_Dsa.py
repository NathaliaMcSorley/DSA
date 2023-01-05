#Python does not have a linked list library built in 
#Buit it can be implemented using deque() package , llist package

# importing module
import collections

# initialising a deque() of arbitrary length
linked_lst = collections.deque()

# filling deque() with elements
linked_lst.append('first')
linked_lst.append('second')
linked_lst.append('third')

print("elements in the linked_list:")
print(linked_lst)

# adding element at an arbitrary position
linked_lst.insert(1, 'fourth')

print("elements in the linked_list:")
print(linked_lst)

# deleting the last element
linked_lst.pop()

print("elements in the linked_list:")
print(linked_lst)

# removing a specific element
linked_lst.remove('fourth')

print("elements in the linked_list:")
print(linked_lst)

print(f"\n")

#Implementing from scratch
class Node:
    def __init__(self, data = None): #Constructor
        self.data = data
        self.nextdata = None
    
class LinkedList:
    def __init__(self): #Constructor
        self.head = None

    def listprint(self): #singly linked lists can be traversed in only forward direction starting from the first data element
        printval = self.head
        while printval is not None:
            print(printval.data)
            printval = printval.nextdata
    
    def insertStart(self, newData):
        newNode = Node(newData)
        newNode.nextdata = self.head
        self.head = newNode

    def insertEnd(self, newData):
        newNode = Node(newData)
        if self.head is None:
            self.head = newNode
            return
        last = self.head
        while(last.nextdata):
            last = last.nextdata
        last.nextdata = newNode
    
    def insertInBetween(self, middle_node, newData):
        if middle_node is None:
            print("The mentioned node is absent")
            return
        newNode = Node(newData)
        newNode.nextdata = middle_node.nextdata
        middle_node.nextdata = newNode
    
    def removeNode(self, key):
        headValue = self.head
        if (headValue is not None):
            if(headValue.data == key):
                self.head = headValue.nextdata
                headValue = None
                return
        while(headValue is not None):
            if headValue.data == key:
                break
            prev = headValue
            headValue = headValue.nextdata
        if(headValue == None):
            return
        prev.next = headValue.nextdata
        headValue = None


list = LinkedList() #start linked list
list.head = Node("Monday") #Add Head for linked list

n2 = Node("Tuesday") #Add second node
list.head.nextdata = n2 #Link first node to second node

n3 = Node("Wednesday") #Add third node 
n2.nextdata = n3 #Link second node to third node

list.insertStart("Sunday")
list.insertEnd("Friday")
list.insertInBetween(list.head.nextdata.nextdata.nextdata, "Thursday")
list.removeNode("Sunday")
list.listprint()
