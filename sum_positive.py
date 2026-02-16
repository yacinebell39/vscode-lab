def sum_positive_numbers(numbers):
    """
    Sums only positive numbers in a list.
    Raises ValueError if a negative number is found.
    """
    if not numbers:
        return 0
    
    total = 0
    for num in numbers:
        if num < 0:
            raise ValueError(f"Found a negative number: {num}")
        total += num
        
    return total

if __name__ == "__main__":
    try:
        test_list = [10, 5, 20]
        print(f"Sum of {test_list} is: {sum_positive_numbers(test_list)}")
    except ValueError as e:
        print(e)