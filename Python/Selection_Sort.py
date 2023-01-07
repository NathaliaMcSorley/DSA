array = [8, 7, 9, 2, 3, 1, 5, 4, 6]

print(f"Array to be sorted: {array}\n")

def selectionSort(array):
    for i in range(len(array)):
        min = i
        for j in range(i+1, len(array)):
            if array[min] > array[j]:
                min = j 
        temp = array[i]
        array[i] = array[min]
        array[min] = temp 
        j+=1
        print(array)

    i+=1

selectionSort(array)
print(f"Sorted array: {array}\n")