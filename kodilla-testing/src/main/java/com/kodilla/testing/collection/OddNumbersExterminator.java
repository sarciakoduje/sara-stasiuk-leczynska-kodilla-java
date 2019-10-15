package com.kodilla.testing.collection;
import java.util.*;
import java.lang.*;
import java.io.*;
public class OddNumbersExterminator {
  public ArrayList<Integer> exterminate (ArrayList<Integer>numbers){
      ArrayList<Integer>numb = new ArrayList<Integer>();
      for(Integer liczba:numbers){
          if(liczba % 2==0){
              numb.add(liczba);
          }

      }
    return numb;
  }
}
