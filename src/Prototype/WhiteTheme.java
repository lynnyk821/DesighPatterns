package Prototype;

public class WhiteTheme extends ChessTheme {
    private String colorPiece;
    public WhiteTheme(int piece, String gameName, String colorPiece) {
        super(piece, gameName);
        this.colorPiece = colorPiece;
    }
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
        System.out.println("N piece: " + piece + " name of game: " + name + " color of piece: " + colorPiece);
    }
    @Override
    public DarkTheme clone() {
        return new DarkTheme(this.piece, this.name, this.colorPiece);
    }
}
