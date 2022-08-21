package Code;

public class Main {
    public static void main(String[] args){
        recursive(1);
    }
    static void recursive(int  a){
        System.out.println("Вверх " + a);
        if (a<5) recursive(a + 1);
        System.out.println("Вниз " + a);
    }
}
/*
Вверх 1
Вверх 2
Вверх 3
Вверх 4
Вверх 5
Вниз 5
Вниз 4
Вниз 3
Вниз 2
Вниз 1

Принцип Метод выполняется в методе,
каждый из которых ожидает завершения следующего метода
 */
