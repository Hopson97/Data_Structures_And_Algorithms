
def bubble_sort(data):
    for i in range(len(data) - 1):
        for j in range(len(data) - i - 1):
            if (data[j] > data[j + 1]):
                tempValue = data[j]
                data[j] = data[j + 1]
                data[j + 1] = tempValue

def insertion_sort(data):
    for i in range(len(data)):
        key = data[i]
        j   = i - 1

        while j >= 0 and data[j] > key:
            data[j + 1] = data[j]
            j -= 1
        data[j + 1] = key