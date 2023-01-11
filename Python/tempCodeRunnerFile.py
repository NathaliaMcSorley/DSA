array1 = [6, 3, 5, 28, 32, 2, 1, 49] #8 elements

print(f"Array to be sorted: {array1}\n")

#Bubble Sort O(n^2) : Compares adjacent elements to see if they are in order. If not, they are swapped.
def bubble_sort(array):
    for i in range(len(array) - 1): #for loop from index 0 to 7
        for j in range(len(array) - i - 1): #j is the pointer for the element that will be compared during the iteration
            if array[j] > array [j+1]: #compare the adjacent elements 
                temp = array[j] 
                array[j] = array[j+1]
                array[j+1] = temp 
                print(f"Compare {array[j]} > {array[j+1]}:  {array}")
        j+=1
    i+=1
bubble_sort(array1)
print(f"Bubble Sort: {array1}\n")