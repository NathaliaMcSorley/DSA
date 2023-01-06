array = [9, 1, 8, 2, 7, 3, 6, 4, 5]

print(f"Array to be sorted: {array}\n")

def bubbleSort(array):
    for i in range(len(array)-1):
        for j in range (len(array)-i-1):
            if array[j] > array[j+1]:
                temp = array[j]
                array[j] = array[j+1]
                array[j+1] = temp 
        j+=1
    i+=1

bubbleSort(array)
print(f"Sorted array: {array}\n")
