def counting_sort(arr):
    max_value = max(arr)
    count = [0] * (max_value + 1)

    for num in arr:
        count[num] += 1

    sorted_arr = []
    for i in range(max_value + 1):
        sorted_arr.extend([i] * count[i])

    return sorted_arr

arr = [12, 11, 13, 5, 6]
arr = counting_sort(arr)
print("Array ordenado:")
print(arr)