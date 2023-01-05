#Queue using list
queue = ["Karen", "Chad", "Steve"]
queue.append("Harold")
print(f"\nQueue using list")
print(f"Initial queue: {queue}")
print(f"First item removed: {queue.pop(0)}")

#Queue using deque
from collections import deque
queue = deque(["Karen", "Chad", "Steve"])
queue.append("Harold")
print(f"\nQueue using deque")
print(f"Initial queue: {queue}")
print(f"First item removed: {queue.popleft()}")

#Queue using queue
print(f"\nQueue using queue")
import queue
queue = queue.Queue()
for i in range(5):
    queue.put(i)
while not queue.empty():
    print(queue.get())