
package group2_package;

/**
 *S1: Hoang Gia Quach
 * id#991609272
 * S2:Gursimran Kang
 * id#991529610
 * Date: Feb 10th,2021
 */
public class Dog extends Mammal implements Group2_Comparable,INameable {
    private String breed,name;
    
    public Dog(int age)
    {super(age);}
    
    @Override
    public void SetName(String name)
    {this.name=name;}
    @Override
    public String GetName()
    {return this.name;}
    @Override
    public int getAge()
    {return super.getAge();}
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
    @Override
    public String ageCheck(int age)
    {
        String ans="Age is not the same.";
        if(this.age==age)
        {ans="They are the same age.";}
        return ans;
    }
}
interface Group2_Comparable{
    @Override
    public boolean equals(Object obj);
    public String ageCheck(int age);
}
