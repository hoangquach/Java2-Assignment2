
package group2_package;
/**
 * S1: Hoang Gia Quach
 * id#991609272
 * S2:Gursimran Kang
 * id#991529610
 * Date: Feb 10th,2021
 */

/*
    set Lizard's name and clone function
*/
 public class Lizard implements Cloneable,INameable{
     //declare instance
     private String name;  
     
     //set name
    @Override
     public void setName(String name)//super class
    {this.name=name;}
     
     //get name
     @Override
    public String getName()//super class
    {return this.name;}
    
    //clone function
     @Override
    public Object clone() throws CloneNotSupportedException {
       return super.clone();
     }
   
    //Interface
    interface Cloneable
    {
        public Object clone()throws CloneNotSupportedException;
    }
}

    