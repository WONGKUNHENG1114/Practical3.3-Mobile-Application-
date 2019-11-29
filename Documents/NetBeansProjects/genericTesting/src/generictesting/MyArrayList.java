/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generictesting;
import java.io.Serializable;
/**
 *
 * @author A555L-HENG
 */
public class MyArrayList<T> implements List<T>, Serializable{

 
private T[] genericStore;
private Data d;
private int size=-1;
private int dataAmount;

public MyArrayList()
{
     genericStore =(T[]) new Object[5];
}
    @Override
    public void add(T t) {
      
//       d=new Data[5];
        try
        {
       if(IsFull())
       {
          ExpandArray();
           genericStore[++size] = t;
           d = (Data) t;
           dataAmount++;
       }
       else
       {
            genericStore[++size]=t;
            d=(Data) t; 
            dataAmount++;
       }
        }catch(NullPointerException ex)
        {
           System.out.println("The T is null"); 
        }
        
    }

    @Override
    public Boolean IsFull() {
       if(size+1==genericStore.length)
       {
           return true;
       }
       else
           return false;
    }
    

    @Override
    public void ExpandArray() {
        
      T[] temp=(T[])new Object[genericStore.length*2];
      for(int i=0;i<dataAmount;i++)
      {
          temp[i]=genericStore[i];
      }
      genericStore =temp;
      temp=null;
      
    }
    

  
    public String toString()
    {
        String str="";
        
         for (int i = 0; i <= size; i++) {
            str+=(i+1)+"."+((Data) genericStore[i])+ "\n";
        }
         
        return str;
     
    }
@Override
    public boolean isEmpty()
    {
        return size==-1;
    }
    
@Override
    public int length()
    {
        return genericStore.length;
    }

    
}
