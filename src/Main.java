public class Main {
    public static void main(String[] args) {
        String[][] booksAndAuthors = new String[4][2];
        booksAndAuthors[0][0] = "Война и мир";
        booksAndAuthors[0][1] = "Лев Николаевич Толстой";
        booksAndAuthors[1][0] = "Капитанская дочка";
        booksAndAuthors[1][1] = "Александр Сергеевич Пушкин";
        booksAndAuthors[2][0] = "Мёртвые души";
        booksAndAuthors[2][1] = "Николай Васильевич Гоголь";
        booksAndAuthors[3][0] = "Горе от ума";
        booksAndAuthors[3][1] = "Александр Сергеевич Грибоедов";

        for (int i = 0; i < booksAndAuthors.length; i++) {
            for (int j = 0; j < booksAndAuthors[i].length; j++) {
                if (j == 0) {
                    System.out.print("«" + booksAndAuthors[i][j] + "»" + " ");
                }else{
                    System.out.println(booksAndAuthors[i][j]);
                }
            }
        }
    }
}
