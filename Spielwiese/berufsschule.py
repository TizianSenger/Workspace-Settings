def bubble_sort(arr):
    for i in range(len(arr)):
        for j in range(0, len(arr)-1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]

# Beispielaufruf des Bubble Sort
arr = [64, 34, 25, 12, 22, 11, 90]
bubble_sort(arr)
print("Sortiertes Array:", arr)