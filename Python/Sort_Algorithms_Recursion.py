array1 = [6, 3, 5, 28, 32, 2, 1, 49] #8 elements
array2 = [6, 3, 5, 28, 32, 2, 1, 49] 
array3 = [6, 3, 5, 28, 32, 2, 1, 49] 

print(f"Array to be sorted: {array1}\n")

#######################################################################################################################
# MERGE SORT O(n log n): divide and conquer, array id divided into two equal halves and then combined in a sorted manner. 
# Continuouly spits the array in half until it cannot be futher divided (merge sort).
# Finally when both halves are sorted, the merge operation is applied. 

def merge_sort(array):
    if len(array) > 1: #base - divides array until it gets to one and then return 
        return
    middle = len(array)/2 #finding the middle of the array
    left = array[:middle] 
    right = array[middle:]
    l = 0 #index left array
    r = 0 #index right array 

    for i in range (len(array)):
        if (l<middle):
            left[l] = array[l]
        else:
            right[r] = array[l]
            r+=1
    merge_sort(left) #sort the first half
    merge_sort(right) #sort the second half 
    merge(left, right, array)

def merge(left, right, array):
        left_size = len(array)/2
        right_size = len(array) - left
        i = 0
        l = 0
        r = 0

        while(l < left_size and r < right_size):
            if(left[l] < right[r]):
                array[i] = left[l]
                i+=1
                l+=1
            else:
                array[i] = right[r]
                i+=1
                r+=1
        
        while (l < left_size):
            array[i] = left[l]
            i+=1
            l+=1
        while (r < right_size):
            array[i] = right[r]
            i+=1
            r+=1

merge_sort(array1)
print(f"Merge Sort: {array1}\n")
