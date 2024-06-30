#include<stdio.h>
#include<stdlib.h>
struct stack{
    int size;
    int top;
    int *arr;
};
int isEmpty(struct stack* ptr){
    if(ptr->top==-1){
        return 1;
    }else{
        return 0;
    }
}
int isFull(struct stack* ptr){
    if(ptr->top==ptr->size-1){
        return 1;
    }else{
        return 0;
    }
}
void push(struct stack *ptr,int val){
	if(isFull(ptr)){
		printf("stack is overflow");
	}else{
		ptr->top++;
		ptr->arr[ptr->top]=val;
	}
}
int pop(struct stack *ptr){
	if(isEmpty(ptr)){
		printf("stack is underflow");
		return -1;
	}else{
		int val = ptr->arr[ptr->top];
		ptr->top--;
		return val;
	}
}
int peek(struct stack * sp,int i){
	if(sp->top-i+1 < 0){
		printf("not a valid position");
	}else{
		return sp->arr[sp->top-i+1];
	}
}
int main(){
    struct stack * sp = (struct stack *)malloc( sizeof(struct stack));
    sp->size=10;
    sp->top=-1;
    sp->arr=(int *)malloc(sp->size * sizeof(int));
    printf("the stack has been created succesfully\n");
    printf("before inserting %d\n",isEmpty(sp));
    printf("before inserting %d\n",isFull(sp));
    push(sp,1);
    push(sp,2);
    push(sp,3);
    push(sp,4);
    push(sp,5);
    push(sp,6);
    push(sp,7);
    push(sp,8);
    push(sp,9);
    push(sp,10);
    printf("after inserting %d\n",isEmpty(sp));
    printf("after inserting %d\n",isFull(sp));
    printf("the popped vallue is %d\n",pop(sp));
    printf("the popped vallue is %d\n",pop(sp));
    int j=0;
    for(j=0;j<sp->top+1;j++){
    	printf("the value at index %d is %d\n ",j,peek(sp,j));
	}
    return 0;
}
