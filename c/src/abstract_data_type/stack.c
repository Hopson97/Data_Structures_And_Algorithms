#include "stack.h"

struct Stack createStack(int size)
{
    struct Stack stack;
    stack.data = malloc(sizeof(int) * size);
    stack.size = 0;
    stack.maxSize = size; 
}


void stackPush(struct Stack* stack, int data)
{
    stack->data[stack->size++] = data;
}

void stackPop(struct Stack* stack)
{
    stack->size--;
}

int stackPeek(struct Stack* stack)
{
    return stack->data[stack->size - 1];
}


int stackIsEmpty(struct Stack* stack)
{
    return stack->size == 0;
}

int stackIsFull(struct Stack* stack)
{
    return stack->size == stack->maxSize - 1;
}

int stackDestroy(struct Stack* stack)
{
    return free(stack->data);
}
