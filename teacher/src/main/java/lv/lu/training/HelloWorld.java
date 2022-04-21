package lv.lu.training;

public class HelloWorld {

    public static void main(String[] args) {
        Theatre latvijasUniversitatesTeatris = new Theatre(); //CTRL + Labais peles klikšķis
        System.out.println(latvijasUniversitatesTeatris.getCity()); // String
        System.out.println(latvijasUniversitatesTeatris.getEmployees()); // int
        System.out.println(latvijasUniversitatesTeatris.getSinceYear()); // int
        System.out.println(latvijasUniversitatesTeatris.getType()); // String
        System.out.println(latvijasUniversitatesTeatris.getName()); // String
    }
}
