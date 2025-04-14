package POO3;

import POO3.Salesman;

import java.util.Scanner;

public class principal {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {


        printEmployee(new Manager());
        printEmployee(new Salesman());


    }

    public static void printEmployee(Employee employee) {

        System.out.printf("=======%s=======\n", employee.getClass().getCanonicalName());

        switch (employee){
            case Manager manager->{
                manager.setCode("14700");
                manager.setSalary(2900.00);
                manager.setComission(20);
                manager.setName("Bruna");
                manager.setLogin("bruna01");
                manager.setPassaword("4788856");


                System.out.println("ID:"+manager.getCode());
                System.out.println("Name:"+manager.getName());
                System.out.println("Salary:"+manager.getSalary());
                System.out.println("Comission:"+manager.getComission()+"%");
                System.out.println("Login:"+manager.getLogin());
                System.out.println("Passaword:"+manager.getPassaword());


            }
            case Salesman salesman->{
                salesman.setCode("19874");
                salesman.setSalary(1300.00);
                salesman.setName("Ricardo");
                salesman.setPercentPorSold(10);

                System.out.println("ID:"+salesman.getCode());
                System.out.println("Name:"+salesman.getName());
                System.out.println("Salary:"+salesman.getSalary());
                System.out.println("ComissionPerSold:"+salesman.getPercentPorSold());


            }
        }
        System.out.println("================");
    }


}
