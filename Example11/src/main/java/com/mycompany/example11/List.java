/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.example11;

/**
 *
 * @author Erishkegal
 * @param <T>
 */
public class List<T> {
   public int getSize() {
        int n=0;
        for(Node<T>i = head; i!=null ;  i=i.next )n++;
        return n;
    }
   class Node<T>{
        private T info;
        private Node<T> next;

        public Node(T info, Node<T> next) {
            this.info = info;
            this.next = next;
        }

        public Node() {
        }

        public Node(T info) {
            this.info = info;
        }

        public void setInfo(T info) {
            this.info = info;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        } 
    }
    Node<T> head;
    Node<T> tail;
    
}
