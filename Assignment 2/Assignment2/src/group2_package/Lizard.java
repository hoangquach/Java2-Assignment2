
package group2_package;
/**
 * S1: Hoang Gia Quach
 * id#991609272
 * S2:Gursimran Kang
 * id#991529610
 * Date: Feb 10th,2021
 */
 public class Lizard implements Cloneable,INameable{
     private String name;  
    @Override
     public void SetName(String name)
    {this.name=name;}
     @Override
    public String GetName()
    {return this.name;}
     @Override
    public Lizard clone() throws CloneNotSupportedException {
       return (Lizard) super.clone();
     }
   
    
}

