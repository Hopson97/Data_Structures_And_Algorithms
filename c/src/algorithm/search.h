#pragma once

typedef int (*SearchFunction)(int*, int, int);

//Returns index of value
int linearSearch(int* data, int n, int searhFor);

//Returns 1 if can find value, otherwise 0
int binarySearchItr(int* data, int n, int searhFor);