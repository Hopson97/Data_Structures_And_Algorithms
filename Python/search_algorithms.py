def linear_search(data, value):
    for i in range(len(data)):
        if value == data[i]:
            return i
    return -1

def binary_search(data, value):
    left = 0
    right = len(data) - 1

    while True:
        if left > right: #Unsuccessful
            return -1
        
        middle = (left + right) // 2
        if (data[middle] < value):
            left = middle + 1
        elif (data[middle] > value):
            right = middle - 1
        else:
            return middle
    