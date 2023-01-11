array1 = [6, 3, 5, 28, 32, 2, 1, 49] #8 elements
array2 = [6, 3, 5, 28, 32, 2, 1, 49] 
array3 = [6, 3, 5, 28, 32, 2, 1, 49] 

print(f"Array to be sorted: {array1}\n")

#######################################################################################################################
# BUBBLE SORT O(n^2) : Compares adjacent elements to see if they are in order. If not, they are swapped.
# Not suitable for large data sets
# It is an in-place algorithm, it doesn't use any major data structure

def bubble_sort(array):
    for i in range(len(array) - 1): #for loop from index 0 to 7 to traverse the input array
        swap = False #optimization
        print(f"Iteration: {i}")
        for j in range(len(array) - i - 1): #j is the pointer for the element that will be compared during the iteration
            print(f"Compare {array[j]} > {array[j+1]}:  {array}")
            if array[j] > array [j+1]: #compare the adjacent elements 
                temp = array[j] 
                array[j] = array[j+1]
                array[j+1] = temp 
                swap = True #optimization
        if(swap == False): #optimization
            break #optimization

bubble_sort(array1)
print(f"Bubble Sort: {array1}\n")

#######################################################################################################################
# SELECTION SORT O(n^2) : Search through an array and keep track of the minimum value during each iteration. At the end of each iteration, we swap values. 
# 2 subarrays: already sorted, remaining unsorted. The min of each iteration is moved to the sorted array.
# It is an in place algorithm, it does not require extra space 
def selection_sort(array):
    for i in range(len(array)): #traverse through all elements 
        min = i 
        print(f"Iteration: {i}")
        for j in range(i+1, len(array)): #fint the minimum element in remaining unsorted array
            print(f"Compare {array[min]} > {array[j]}:  {array}")
            if array[min] > array[j]:
                min = j
        temp = array[i] #store array[i] in temp 
        array[i] = array[min] #swap the found minimum element with the first element 
        array[min] = temp

selection_sort(array2)
print(f"Selection Sort: {array2}\n")

#######################################################################################################################
# INSERTION SORT O(n^2) : Start at index 1 and compare elements to the left, shift elements to the right to make room to insert a value.
# Efficient only for small dat vlues or data sets which are already partially sorted. 
# Traverse the array, compare the current element to its predecessor and swap if the current is < predecessor, compare it to the elements before. 
# Move the greater elements one position up to make space for the swapped element
# It is a stable and in-place algorithm
def insertion_sort(array):
    for i in range (len(array)): #traverse the array 
        key = array[i] #put the element in temp
        j = i-1 #move elements that are greater than the key to one position ahead of their current position
        print(f"Iteration {i} and key {key}")
        while j >= 0 and key < array[j]: #while there are still elements to the left of the current element and current < array[j] then make the swap
            print(f"Compare {key} < {array[j]}: {array}")
            array[j+1] = array[j]
            j-=1 #decrease j to compare to all the elements to the left 
        array[j+1] = key

insertion_sort(array3)
print(f"Insertion Sort: {array3}\n")