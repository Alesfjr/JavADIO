package POO2;

import java.util.Scanner;
import POO2.Escola;
import POO2.Person;

public class Main {
    public static void main(String[] args) {
        var male = new Person();
        male.setAge(12);
        male.setName("Gabriel");
        var female = new Person();
        female.setAge(13);
        female.setName("Larissa");
        var studants = new Escola();
        studants.setScholl("CodePlus");
        studants.setAddress("Street 3");
        studants.setState("Nevada");


        System.out.println("Male name : "+male.getName() +"; age  : "+male.getAge());
        System.out.println("Female name : "+female.getName() +"; age  : "+female.getAge());
        System.out.println("The two students study in:"+studants.getScholl()+";"+studants.getAddress()+";"+studants.getState());



    }
}
