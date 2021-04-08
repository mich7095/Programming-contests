def matrixElementsSum(matrix):
    price = 0
    banned = []
    for row in range(len(matrix)):
        for room in range(len(matrix[row])):
            if matrix[row][room] == 0:
                banned.append(room)
            elif room not in banned:
                price += matrix[row][room]
    
    return price