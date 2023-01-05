from queue import PriorityQueue

priority_queue = PriorityQueue()

priority_queue.put((10,'Red balls'))
priority_queue.put((8,'Pink balls'))
priority_queue.put((5,'White balls'))
priority_queue.put((4,'Green balls'))

print(priority_queue.empty())
print(priority_queue.full())
while not priority_queue.empty():
    item = priority_queue.get()
    print(item)