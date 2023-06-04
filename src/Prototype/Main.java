package Prototype;

public class Main {
    public static void main(String[] args) {
        // 1 example
        System.out.println("Create first chess game with dark theme:");
        ChessTheme chessTheme1 = new DarkTheme(5, "Game1", "Red");
        chessTheme1.information();

        System.out.println("Clone dark theme game:");
        ChessTheme cloneDarkThemeGame1 = chessTheme1.clone();
        cloneDarkThemeGame1.information();

        System.out.println("Set piece in clone dark theme game:");
        cloneDarkThemeGame1.setPiece(25);
        cloneDarkThemeGame1.information();

        System.out.println("Second clone dark theme with new information about piece:");
        ChessTheme cloneDarkThemeGameSecond1 = cloneDarkThemeGame1.clone();
        cloneDarkThemeGameSecond1.information();

        // 2 example
        System.out.println("Create second chess game with white theme:");
        ChessTheme chessTheme2 = new WhiteTheme(5, "Game1", "Red");
        chessTheme2.information();

        System.out.println("Clone white theme game:");
        ChessTheme cloneWhiteThemeGame2 = chessTheme2.clone();
        cloneWhiteThemeGame2.information();

        System.out.println("Set piece in clone white theme game:");
        cloneWhiteThemeGame2.setPiece(50);
        cloneWhiteThemeGame2.information();

        System.out.println("Second clone white theme with new information about piece:");
        ChessTheme cloneDarkThemeGameSecond2 = cloneWhiteThemeGame2.clone();
        cloneDarkThemeGameSecond2.information();
    }
}
