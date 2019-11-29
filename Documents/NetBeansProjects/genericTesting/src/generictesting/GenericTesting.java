/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generictesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
//import java.util.List;
/**
 *
 * @author A555L-HENG
 */
public class GenericTesting {
 List<Data> hello=new MyArrayList<>();
Data d;


public GenericTesting()
{
    readFile();
   // initializeList();
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GenericTesting gt=new GenericTesting();
        // TODO code application logic here       
//       for(Data s:hello)
//       {
//           System.out.println(s);
//       }
    }
    private void initializeList()
    {
      d=new Data("facebook","facebookPage","https://www.facebook.com/");
       // System.out.println(d);
       System.out.println("The length is "+hello.length());
       hello.add(d);
       hello.add(d);
       d=new Data("youtube","youtubePage","https://www.youtube.com/");
       hello.add(d);
       hello.add(d);
       hello.add(d);
         hello.add(d);
       
       System.out.println(hello);
       System.out.println("The length is "+hello.length());
       writeFile(hello);
    }
    private static void writeFile(List<Data> hello )
    {
        try {
            // ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("runners.dat"));
            ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("WebStore.dat"));
            ooStream.writeObject(hello);
            //ooStream.close();

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }
    private  void readFile()
    {
        
         try {
      ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("WebStore.dat"));
      hello = (MyArrayList) (oiStream.readObject());

      oiStream.close();
    } catch (FileNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
    } catch (IOException ex) {
      JOptionPane.showMessageDialog(null, "Cannot read from file", "ERROR", JOptionPane.ERROR_MESSAGE);
    } catch (ClassNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
          System.out.println(hello);
    }
   
}
