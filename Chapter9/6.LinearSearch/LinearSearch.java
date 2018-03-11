/**
Linear Search
Problem: Given an array arr[] of n elements, write a function to search a given element x in arr[].

Solution:
A simple approach is to do linear search, i.e

Start from the leftmost element of arr[] and one by one compare x with each element of arr[]
If x matches with an element, return the index.
If x doesn’t match with any of elements, return -1.

*/

class LinearSearch
{
    // This function returns index of element x in arr[]
    public int search(int arr[], int x)
    {
        for (int i = 0; i < arr.length; i++)
        {
            // Return the index of the element if the element
            // is found
            if (arr[i] == x) {
                return i;
            }
        }

        // return -1 if the element is not found
        return -1;
    }
}
