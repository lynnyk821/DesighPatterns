package Prototype;

public class DarkTheme extends ChessTheme {
    private String colorPiece;
    public DarkTheme(int piece, String gameName, String colorPiece) {
        super(piece, gameName);
        this.colorPiece = colorPiece;
    }
    @Override
    public void setName(String name){
        this.name = name;
    }
    @Override
    public void setPiece(int piece){
        this.piece = piece;
    }
    public void setColorPiece(String colorPiece){
        this.colorPiece = colorPiece;
    }
    @Override
    public void information() {
        System.out.println("\nPrint information about:");
        System.out.println("N piece: " + piece + " name of game: " + name + " color of piece: " + colorPiece +"\n");
    }
    @Override
    public DarkTheme clone() {
        return new DarkTheme(this.piece, this.name, this.colorPiece);
    }
}
