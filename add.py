def add_one(arr):
    carry = 1  # Initialize carry as 1 (for +1 operation)
    result = []

    for digit in reversed(arr):
        summation = digit + carry
        result.append(summation % 10)  # Append last digit
        carry = summation // 10  # Update carry

    if carry:
        result.append(carry)

    return result[::-1]  # Reverse the result to correct order


# Test Cases
print(add_one([1, 2, 3]))  # [1, 2, 4]
print(add_one([9, 9]))     # [1, 0, 0]
print(add_one([0]))        # [1]
print(add_one([1, 0, 0, 0]))  # [1, 0, 0, 1]
