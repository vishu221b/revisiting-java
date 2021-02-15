package com.java.revision.DataStructures;

public class CustomStackImplementation {

    private Object[] stackArray;

    private static final Integer DEFAULT_STACK_SIZE = 5;

    private int userSpecifiedSize;

    CustomStackImplementation(int size){
        if (size == 0) size = CustomStackImplementation.DEFAULT_STACK_SIZE;
        userSpecifiedSize = size;
        stackArray = new Object[size];
    }

    public void push(Object object) throws Exception{
        if (null != stackArray[this.userSpecifiedSize - 1]){
            throw new Exception("Stack Overflow.");
        }
        for (int i=0; i<stackArray.length; i++){
            if (stackArray[i] == null){
                stackArray[i] = object;
                break;
            }
        }
    }

    public void printAllElements(){
        System.out.println("============Stack Elements===========");
        for (Object o : stackArray) {
            System.out.println(o);
        }
        System.out.println("=====================================");
    }

    public void pop(int position) throws Exception {
        if (position <= stackArray.length && position >= 1){
            Object elementToBePopped = stackArray[position - 1];
            for (int i = position - 1; i < this.userSpecifiedSize - 1; i++){
                if(stackArray[i+1] == null){
                    stackArray[i] = null;
                    break;
                }
                stackArray[i] = stackArray[i+1];
            }
            if(stackArray[userSpecifiedSize - 1] != null){
                stackArray[userSpecifiedSize - 1] = null;
            }
            System.out.println("Popped element from postion " + position + ": " + elementToBePopped);
        }else throw new Exception("Stack underflow. ");
    }

    public void top() throws Exception{
        Object topMostElement = null;
        for(int i = this.userSpecifiedSize-1; i>=0; i--){
            if(stackArray[i] != null){
                topMostElement = stackArray[i];
                break;
            }
        }
        if (null == topMostElement) throw new Exception("Cannot find top element as the stack is Empty.");
        System.out.println("Top most element is: " + topMostElement);
    }
}
