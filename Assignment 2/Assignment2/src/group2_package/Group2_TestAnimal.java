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
        lizard1.setName("Lizard");//set Lizard's name
        Lizard lizard2=(Lizard) lizard1.clone();
        Dog dog1=new Dog(10);//10 years old dog
        dog1.setName("Tommy");//dog is named Tommy
        Dog dog2=new Dog(12);//12 years old dog
        dog2.setName("Jimmy");//dog is named Jimmy
        System.out.println("Dog1's name: "+dog1.getName()+ "\nDog2's name: "+dog2.getName());
        System.out.println("Lizard1's name: "+lizard1.getName()+"\n(cloned)Lizard2's name: "+lizard2.getName());
        System.out.println("Compare dog1 and dog2.\nAre they dog? "+dog1.equals(dog2));
        System.out.println(dog1.ageCheck(dog2.getAge()));
    }
}
