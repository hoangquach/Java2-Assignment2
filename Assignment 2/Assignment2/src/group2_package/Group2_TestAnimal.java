/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group2_package;

/**
 *
 * @author Ryan-PC
 */
public class Group2_TestAnimal {
    public static void main(String[] args) throws CloneNotSupportedException {
        Lizard lizard1=new Lizard();
        lizard1.SetName("Lizard");
        Lizard lizard2=lizard1.clone();
        Dog dog1=new Dog(10);//10 years old dog
        dog1.SetName("Tommy");
        Dog dog2=new Dog(12);
        dog2.SetName("Jimmy");
        System.out.println("Dog1's name: "+dog1.GetName()+ "\nDog2's name: "+dog2.GetName());
        System.out.println("Lizard1's name: "+lizard1.GetName()+"\n(cloned)Lizard2's name: "+lizard2.GetName());
       
        System.out.println("Compare dog1 and dog2.\nAre they dog? "+dog1.equals(dog2));
        System.out.println(dog1.ageCheck(dog2.getAge()));
    }
}
