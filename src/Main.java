public class Main {
    public static void main(String[] args) {
//        1. Уй-булолор квартирада, общежитиеде жана гостиницада жашашат
//        2. Квартирада жашагандар ком услуга толошот
//        3. Общежитие менен гостиницада жашагандар аренда толошот
//        4. Уй-булолор бир канча адамдан турушат
//        5. Кайсы жерде канча адам жашаганын консольго чыгарыныз
//        6. Жашоо демек озунун адресин корсотуу

        Person person=new Person("Nurdin");
        Person person2=new Person("Aruuke");
        Person person3=new Person("Dastan");
        Person person4=new Person("Aizada");
        Person person5=new Person("Jibek");
        Person person6=new Person("Aziza");
        Person person7=new Person("Datka");
        Person person8=new Person("Nurtilek");

        Kvartira kvartira1=new Kvartira("Bishkek");
        Hostel hostel1=new Hostel("Vostok5");
        Hotel hotel1=new Hotel("Mkr7");


        System.out.println("==========KVARTIRA==========\n");
        System.out.println(kvartira1);
        kvartira1.oplata();
        Person[]kvartira={person,person2,person3};
        int count=0;
        for (Person person1 : kvartira) {
            count++;
            System.out.println(person1);
        } System.out.println(count+"\n");


        System.out.println("==========HOTEL==========\n");
        System.out.println(hotel1);
        hotel1.arenda();
        Person[]hotel={person4,person5};
        int count2=0;
        for (Person persons : hotel) {
            count2++;
            System.out.println(persons);
        } System.out.println(count2+"\n");


        System.out.println("==========HOSTEL==========\n");
        System.out.println(hostel1);
        hostel1.arenda();
        Person[]hostel={person6,person7,person8};
        int coun3=0;
        for (Person personi : hostel) {
            coun3++;
            System.out.println(personi);
        }
        System.out.println(coun3+"\n");

    }
}