import pytest
from sum_positive import sum_positive_numbers

def test_sum_normal_list():
    assert sum_positive_numbers([1, 2, 3]) == 6

def test_sum_empty_list():
    assert sum_positive_numbers([]) == 0

def test_sum_single_element():
    assert sum_positive_numbers([5]) == 5

def test_raises_exception_on_negative():
    with pytest.raises(ValueError) as excinfo:
        sum_positive_numbers([1, -1, 5])
    
    assert "negative" in str(excinfo.value)