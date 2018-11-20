#pragma once 

struct Stack {
    int* data;
    int  size;
    int  maxSize;
};

struct Stack createStack(int size);

void stackPush(struct Stack* stack, int data);
void stackPop(struct Stack* stack);
int stackPeek(struct Stack* stack);

int stackIsEmpty(struct Stack* stack);
int stackIsFull(struct Stack* stack);
int stackDestroy(struct Stack* stack);

