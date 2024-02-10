package Zadacha_4;

import java.util.Scanner;

public class Calculaytor {
    public static void main(String[] args) {
    Calculaytor.nachalo();
//Calculaytor.chooseArithmetic();
    }

    static int num1 ;
    static double result = 0;

    static double resultD ;
    static Scanner sc = new Scanner(System.in);

    static int num2 ;
    static String str ;

    static void nachalo (){


            while (true) {
                System.out.print("\t\t\tВведите любое число : ");
                String sNum = sc.nextLine();

                if (sNum.matches("\\d{1,}")) {
                    num1 = Integer.parseInt(sNum);
                    result = num1;
                    break;
                }
            }


        System.out.print("Выберете арифметическое действие : <+> <-> <*> </> ");


        while (true) {
            chooseArithmetic();
        if(str.equalsIgnoreCase("Exit")){
            break;
        }
            System.out.println();
            System.out.println("Чтобы продолжить вычисления выберете арифметическое действие");
            System.out.println();
            System.out.println("Чтобы начать заново введите \"Go\"");
            System.out.println();
            System.out.println("Чтобы закончить введите \"Exit\"");

        }
    }


    static void chooseArithmetic() {


        try {
            UNNER :
            while (true) {

                str = sc.nextLine();
//                System.out.println("...");
//                System.out.println("Начало работы Чейс блока");
//                System.out.println("eto str : "+str);


                if (str.equals("+")) {
                    INNER:
                    while (true) {
                        System.out.print("\t\t\tВведите любое число : ");
                        String sNum = sc.nextLine();

                        if(sNum.matches("\\d{1,}")){
                            num2 = Integer.parseInt(sNum);
                            addition(num2);
                            break UNNER;
                        }
                    }
                } else if (str.equals("-")) {
                    INNER:
                    while (true) {
                        System.out.print("\t\t\tВведите любое число : ");
                        String sNum = sc.nextLine();

                        if (sNum.matches("[0-9]{1,}")) {
                            num2 = Integer.parseInt(sNum);
                            subtraction(num2);
                            break UNNER;
                        }
                    }

                } else if (str.equals("*")) {
                    while (true) {
                        System.out.print("\t\t\tВведите любое число : ");
                        String sNum = sc.nextLine();

                        if (sNum.matches("[0-9]{1,}")) {
                            num2 = Integer.parseInt(sNum);
                            multiply(num2);
                            break UNNER;
                        }
                    }
                    }
                   else if (str.equals("/")) {
                    while (true) {
                        System.out.print("\t\t\tВведите любое число : ");
                        String sNum = sc.nextLine();

                        if (sNum.matches("[0-9]{1,}")) {
                            num2 = Integer.parseInt(sNum);
                            divide(num2);
                            break UNNER;
                        }
                    }
                    }
                   else if (str.equalsIgnoreCase("go")) {
                        nachalo();
                        break;

                    }
                   else if (str.equalsIgnoreCase("exit")) {
                        break;
                    }

                   else {
                    System.out.println("Введите корректное значение");
                     //chooseArithmetic();
                   // break;
                }

            }
        }

            catch (Exception e){
                System.out.println("\t\tНа ноль нельзя делить!!!\n");
                System.out.println("\t\t\tПопробуйте заново");
                nachalo();
            }

        }




    static void addition(int i){
        System.out.println(result+ "+" + i + "="+(result = result + i));
    }

    static void subtraction(int i){
        System.out.println(result+ "-" + i + "="+(result = result - i));
    }

    static void multiply(int i){
        System.out.println(result+ "*" + i + "="+(result = result * i));
    }

    static void divide(int i){
        resultD = result;
        result = result / i;
            if(result % 1 != 0 && resultD % 1 == 0 ) {

                System.out.println((long)resultD + "/" + i + "=" + result);

            } else if(result % 1 != 0 && resultD % 1 !=0)
        System.out.println(resultD+ "/" + i + "="+result);

            else if(result % 1 == 0 && resultD % 1 == 0)
                System.out.println((long)resultD+ "/" + i + "="+(long)result);

    }
}
