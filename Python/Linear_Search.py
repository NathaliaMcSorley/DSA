array = [9, 1, 8, 2, 7, 3, 6, 4, 5]

def linearSearch(array, value):
    for i in range(len(array)):
        if array[i] == value:
            return i
    return -1

index = linearSearch(array, 5)

if index!=-1:
    print(f"Element found at index: {index}")
else:
    print("Element not found")