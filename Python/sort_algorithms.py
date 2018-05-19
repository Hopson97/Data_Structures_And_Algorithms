
def bubble_sort(data):
    for i in range(len(data) - 1):
        for j in range(len(data) - i - 1):
            if (data[j] > data[j + 1]):
                tempValue = data[j]
                data[j] = data[j + 1]
                data[j + 1] = tempValue