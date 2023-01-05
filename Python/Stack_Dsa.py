#stack implementation using list
#push() = append()
#issue: it can run into speed issues as it grows
stack = []

stack.append("Java")
stack.append("Python")
stack.append("C#")
stack.append("SQL")
stack.append("HTML")

print(f"\nStack using list")
print(f"Initial Stack: {stack}")

stack.pop()
print(f"Stack after pop: {stack}")

stack.sort()
print(f"Stack sorted: {stack}")

stack.reverse()
print(f"Stack reversed: {stack}")

stack.insert(2, "CSS")
print(f"Stack: {stack}")

print(f"Stak length: {stack.__len__()}")


#stack implementation using collections.deque
#It is preferred over the list in the cases where we need quicker append and pop operations from both ends of the container
from collections import deque

stack = deque()

stack.append('a')
stack.append('b')
stack.append('c')

print(f"\nStack using deque")
print(f"Initial Stack: {stack}")

stack.pop()
print(f"Stack after pop: {stack}")

stack.appendleft('z')
print(f"Append left Stack: {stack}")

stack.remove('a')
print(f"Remove 'a' Stack: {stack}")


#stack implementation using queue.LifoQueue
#It is basically a stack. 
#push() = put()
#pop() = get()
from queue import LifoQueue

# Initializing a stack
stack = LifoQueue(maxsize=3)
print(f"\nStack using Queue")

print("Empty: ", stack.empty())
print(f"Number of elements in the stack: {stack.qsize()}")
stack.put('a')
stack.put('b')
stack.put('c')
print("Empty: ", stack.empty())
print(f"Number of elements in the stack: {stack.qsize()}")
print("Full: ", stack.full())
print('Elements popped from the stack: ')
print(stack.get())
print(stack.get())
print(stack.get())
print("Empty: ", stack.empty())
