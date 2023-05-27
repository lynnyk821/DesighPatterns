package lab4_var_3_1;

public class Main {
    public static void main(String[] args) {
        ChessTheme darkTheme = new DarkTheme(5, "Game1");
        System.out.println(darkTheme.getThemeColor());

        ChessTheme copyDarkTheme = darkTheme.clone();
        System.out.println(copyDarkTheme.getThemeColor());

        System.out.println();

        ChessTheme whiteTheme = new WhiteTheme(5, "Game2");
        System.out.println(whiteTheme.getThemeColor());

        ChessTheme copyWhiteTheme = whiteTheme.clone();
        System.out.println(copyWhiteTheme.getThemeColor());
    }
}
