
package group2_package;

/**
 *S1: Hoang Gia Quach
 * id#991609272
 * S2:Gursimran Kang
 * id#991529610
 * Date: Feb 10th,2021
 */

/*
    Set name and age for a dog
*/
public class Dog extends Mammal implements Comparable,INameable {
    //declare instance
    private String breed,name;
    
    public Dog(int age)//constructor
    {super(age);}//super}
    
    //set Dog's name
    @Override
    public void setName(String name)//super class
    {this.name=name;}
    
    //get Dog's name
    @Override
    public String getName()//super class
    {return this.name;}
    
    //get Dog's age
    @Override
    public int getAge()
    {return super.getAge();}
    
    //check whether it is a dog or not
    @Override
    public boolean equals(Object obj)
    {
        boolean check=false;
        if(obj instanceof Dog)
        {
            check=true;
        }
        return check;
    }
    
    //compare age between two dogs
    @Override
    public String ageCheck(int age)
    {
        String ans="Age is not the same.";
        if(this.age==age)
        {ans="They are the same age.";}
        return ans;
    }
}

//Interface
interface Comparable{
    @Override
    public boolean equals(Object obj);
    public String ageCheck(int age);
}

