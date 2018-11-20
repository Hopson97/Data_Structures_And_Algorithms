#pragma once

struct ArrayList 
{
    int capacity;
    int size;

    int* data;
};

struct ArrayList arrayListCreate(int capacity);

int arrayListPush(struct ArrayList* ls, int value);
int arrayListPop(struct ArrayList* ls);
int arrayListGet(struct ArrayList* ls, int index);

void destroyList(struct ArrayList* ls);