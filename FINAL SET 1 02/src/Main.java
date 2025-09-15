public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0]=new Book("HP", "IDK", 500);
        books[1]=new Book("DELLING", "IDK2", 600);
        books[2]=new Book("STATICS","KAMAL HASAN", 700);
        books[3]=new Book("CHEMISTRY", "HAZARI NAG", 800);
        books[4]=new Book("PHYSICS", "TAPAN HASAN", 400);
        books[1].setPrice(35.0);
        books[3].setPrice(1000.00);
        double maxPrice = 0.0;
        String authorWithMax = "";
        for (Book b : books) {
            System.out.println(b.getBookInfo());
            if (b.getPrice() > maxPrice) {
                maxPrice = b.getPrice();
                authorWithMax = b.getAuthor();
            }
        }
        char lastLetter = authorWithMax.charAt(authorWithMax.length() - 1);
        System.out.println("Last letter of author with highest price: " + lastLetter);
    }
}
