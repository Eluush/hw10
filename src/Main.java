public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        String fullName = "Фамилия Имя Отчество";
        fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);

        System.out.println("Задание 2");
        String fullname1 = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета —" + fullname1);

        System.out.println("Задание 3");
        String fullname2 = "Иван Семёнов Семёнович";
        fullname2=fullname2.replace("ё" , "е");
        System.out.println("Данные Ф. И. О. сотрудника —" + fullname2);




    }
}