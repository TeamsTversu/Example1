/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.example11;
import com.mycompany.example11.List;
import com.mycompany.example11.Stack;
import com.mycompany.example11.Queue;
/**
 *
 * @author Erishkegal
 */
public class Main {
     public static void main(String []args)
    {
        List<String> list = new List<>();
           list.addToBegin("one");
           list.addToBegin("two");
           list.addToEnd("-one");
           list.addToEnd("-two");
           System.out.println(list);
    }
}
