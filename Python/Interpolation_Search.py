array = [1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024]

def interpolationSearch(array, target):
    low = 0
    high = len(array) - 1

    while low <= high and target >= array[low] and target <= array[high]: 
        probe = int(low + (high - low) * (target - array[low])/(array[high] - array[low]))

        print(f"Probe: {probe}" )

        if array[probe] == target:
            return probe
        elif array[probe] < target:
            low = probe + 1
        elif probe > target:
            high = probe -1
    return -1

index = interpolationSearch(array, 256)

if index == -1:
    print("Traget not found")
else:
    print(f"Element found at: {index}")