public class Main {
    public static void main(String[] args) {

        var a = 640;  //общее время сотрудников
        var b = 8; //время одного сотрудника
        var employees = a / b; //количество сотрудников


        System.out.println("Всего работников в компании" + " " + "–" + " " + employees + " " + "человек.");

        employees = employees +94;
        var hours = a / employees;
        System.out.println("Если в компании работает"+" " + employees  + " " +  "человека, то всего" + " " + hours + " " + "часа работы может быть поделено между сотрудниками."
        );
    }
}