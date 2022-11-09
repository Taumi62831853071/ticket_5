import java.util.Scanner;

    public class Main{
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            input.nextLine();

            Book[] books = new Book[num];
            String title;
            String author;
            for (int i = 0; i < num; i++) {
                title = input.nextLine();
                author = input.nextLine();
                books[i] = new Book(title,author);
            }
            for (int i = 0; i < num; i++) {
                books[i].show();
            }
        }
    }
