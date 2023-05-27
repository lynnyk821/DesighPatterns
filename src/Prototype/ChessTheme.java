package Prototype;

public abstract class ChessTheme {
    protected final int piece;
    protected final String name;
    protected ChessTheme(int piece, String name) {
        this.piece = piece;
        this.name = name;
    }
    protected ChessTheme(ChessTheme ct) {
        this.piece = ct.piece;
        this.name = ct.name;
    }
    public abstract String getThemeColor();
    public abstract int getPiece();
    public abstract String getName();
    public abstract ChessTheme clone();
}
