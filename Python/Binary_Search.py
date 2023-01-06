array = []
i = 0

while (i<101):
    array.append(i)
    i+=1

def binarySearch(array, target):
    low = 0
    high = len(array) - 1

    while low <= high: #loop through all elements
        middle = int(low +(high - low)/2)
        value = array[middle]

        print(f"Middle: {middle}" )

        if value == target:
            return middle
        elif value < target:
            low = middle + 1
        elif value > target:
            high = middle -1
    return -1

index = binarySearch(array, 54)

if index == -1:
    print("Traget not found")
else:
    print(f"Element found at: {index}")