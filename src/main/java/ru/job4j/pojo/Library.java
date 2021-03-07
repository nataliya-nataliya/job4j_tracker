package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {

        Book theBrothersKaramazov = new Book("The Brothers Karamazov", 800);
        Book cleanCode = new Book("Clean code", 0);
        Book martinEden = new Book("Martin Eden", 500);
        Book oliverTwist = new Book("Oliver Twist", 400);
        Book theStranger = new Book("The stranger", 700);
        Book[] books = new Book[5];
        books[0] = theBrothersKaramazov;
        books[1] = cleanCode;
        books[2] = martinEden;
        books[3] = oliverTwist;
        books[4] = theStranger;
        for (int i = 0; i < books.length; i++) {
            Book a = books[i];
            System.out.println(a.getName() + " - " + a.getPages() + " p.");
        }
        System.out.println("Replace \"The Brothers Karamazov\" and \"Oliver Twist\" ");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            Book a = books[i];
            System.out.println(a.getName() + " - " + a.getPages() + " p.");
        }
        System.out.println( "The name of books: Clean code");
        for (int i = 0; i < books.length; i++) {
            Book a = books[i];
           if (a.getName().equals("Clean code")) {
               System.out.println(a.getName() + " - " + a.getPages() + " p.");
           }
        }

    }
}

