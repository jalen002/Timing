

import java.util.*;


public class Timing{

   public LinkedList myList = new LinkedList();
   public ArrayList aList = new ArrayList();
   
   public void fillLinkedList(){
      for(int i = 0;i<80000;i++){
         myList.addFirst(8);
      }
   }
   
   public void fillArrayList(){
      for(int i=0;i<80000;i++){
         aList.add(8);
      }
   }
   
      
/******************ARRAY: Get__FIRST TO LAST****************************/
   public void getElementsBeginToEnd(){
      long first = System.nanoTime();
      for(int i = 0;i<aList.size();i++){
         aList.get(i);
      }     
      long last = System.nanoTime();
      long ans = (last-first);
      System.out.println("First to last: "+ans+" nano-seconds ---> " + (ans/1000000000.0) + " seconds");
   }

/*****************ARRAY: Get__LAST TO FIRST*****************************/
   public void getElementsEndToBegin(){
      long first = System.nanoTime();
      for(int i=aList.size() - 1;i>0;i--){
         aList.get(i);
      }
      long last = System.nanoTime();
      long ans = (last-first);
      System.out.println("Last to first: "+ans+" nano-seconds ---> " + (ans/1000000000.0) + " seconds\n");
   }
/*****************ARRAY: Remove__FIRST TO LAST*************************/
   public void removeElementsFirstToLast(){
      long first = System.nanoTime();
      for(int i=0;i<aList.size();i++){
         aList.remove(i);
      }
      long last = System.nanoTime();
      long ans = (last-first);
      System.out.println("First to last: "+ ans+" nano-seconds ---> " + (ans/1000000000.0) + " seconds");
   }
   
/*****************ARRAY: Remove__LAST TO FIRST*************************/
   public void removeElementsLastToFirst(){
      long first = System.nanoTime();
      for(int i=aList.size()-1;i>0;i--){
         aList.remove(i);
      }
      long last = System.nanoTime();
      long ans = (last-first);
      System.out.println("Last to first: "+ ans+" nano-seconds ---> " + (ans/1000000000.0) + " seconds");
   }
/***********LINKED LIST: GET__GET method******************************/
   public void getElementsUsingGet(){
      long first = System.nanoTime();
      for(int i=0;i<myList.size();i++){
         myList.get(i);
      }
      long last = System.nanoTime();
      long ans = (last-first);
      System.out.println("Using Get() Method: "+ans+" nano-seconds ---> " + (ans/1000000000.0) + " seconds");
   }
/**********LINKED LIST: GET__LIST ITERATOR***************************/
   public void getUsingListIterator(){
      int value;
      long first = System.nanoTime();
      for(Iterator i = myList.listIterator(0);i.hasNext();){
         value = (int)i.next();
      }
      long last = System.nanoTime();
      long ans = (last-first);
      System.out.println("Using list iterator: " +ans+" nano-seconds ---> " + (ans/1000000000.0) + " seconds");
   }
/*****************MAIN METHOD******************************************/   
   public static void main(String[] args){
      Timing t = new Timing(); 
      t.fillLinkedList();
      t.fillArrayList();   
      System.out.println("           ArrayList: GET            ");
      System.out.println("-------------------------------------"); 
      t.getElementsBeginToEnd();
      t.getElementsEndToBegin();
      System.out.println("\n          ArrayList: REMOVE          ");
      System.out.println("-------------------------------------");
      t.removeElementsFirstToLast();
      t.fillArrayList();
      t.removeElementsLastToFirst();
      System.out.println("\n\n          LinkedList          ");
      System.out.println("------------------------------");
      t.getElementsUsingGet();
      t.getUsingListIterator();
      
   }
      
      

   

}//end TIMING class