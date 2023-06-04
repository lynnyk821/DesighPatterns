package Prototype;
public abstract class ChessTheme {
    protected int piece;
    protected String name;
    protected ChessTheme(int piece, String name) {
        this.piece = piece;
        this.name = name;
    }
    public abstract void setPiece(int piece);
    public abstract void setName(String name);
    public abstract void information();
    public abstract ChessTheme clone();
}
