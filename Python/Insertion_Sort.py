array = [8, 7, 9, 2, 3, 1, 5, 4, 6]

print(f"Array to be sorted: {array}\n")

def insertionSort(array):
    for i in range(1, len(array)):
        temp = array[i]
        j = i-1

        while j>=0 and array[j]>temp:
            array[j+1] = array[j]
            j-=1
        array[j+1] = temp 
        print(array)


insertionSort(array)
print(f"Sorted array: {array}\n")