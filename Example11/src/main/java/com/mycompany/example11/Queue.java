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
public class Queue<T> extends List<T>{

    public Queue() {
        super();
    }
    @Override
    public void push(T info){
        super.addToEnd(info);
    }
}
