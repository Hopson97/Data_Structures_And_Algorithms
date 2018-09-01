#include "ArrayList.h"
#include <stdlib.h>
#include <stdio.h>

static int grow(struct ArrayList* ls) {
    ls->capacity *= 2;
    printf("New capacity: %d\n", ls->capacity);
    int* newBlock = realloc(ls->data, ls->capacity * sizeof(int));
    if (newBlock) {
        ls->data = newBlock;
        return 1;
    }
    else {
        return 0;
    }
}

struct ArrayList arrayListCreate(int capacity)
{
    struct ArrayList list;
    list.capacity = capacity;
    list.size = 0;
    list.data = malloc(sizeof(int) * capacity);

    return list;
}

int arrayListPush(struct ArrayList* ls, int value)
{
    ls->size++;
    if (ls->size > ls->capacity) {
        printf("Growing array list\n");
        if (!(grow(ls))) {
            return 0;
        }
    }
    ls->data[ls->size - 1] = value;  
}

int arrayListGet(struct ArrayList* ls, int index)
{
    return ls->data[index];
}

void destroyList(struct ArrayList* ls)
{
    free(ls->data);
}