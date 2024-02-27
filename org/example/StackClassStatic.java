package org.example;

import java.util.*;

class StackClassStatic {
    static class Stack {
        static int size = 10;
        int top;
        int a[] = new int[size];

        boolean isEmpty() {
            return (top < 0);
        }

        Stack() {
            top = -1;
        }

        Stack(int size) {
            this.size = size;
        }

        boolean push(int x) {
            if (top > (size - 1)) {
                System.out.println("overflow");
                return false;
            } else {
                a[++top] = x;
                return true;
            }
        }

        int pop() {
            if (top <= 0) {
                System.out.println("underflow");
                return -1;
            } else {
                int x = a[top--];
                return x;
            }
        }

        int peek() {
            if (top <= 0) {
                System.out.println("underflow");
                return -1;
            } else {
                int x = a[top];
                return x;
            }
        }

        void print() {
            for (int i = top; i > -1; i--) {
                if (a[i] != 0) {
                    System.out.print(a[i] + " ");
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        Stack s1 = new Stack(size);

    }
}