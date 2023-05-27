package Prototype;

public class DarkTheme extends ChessTheme {
    private String themeColor;
    public DarkTheme(int piece, String gameName) {
        super(piece, gameName);
        themeColor = "Dark";
    }

    private DarkTheme(DarkTheme dt) {
        super(dt);
        this.themeColor = dt.themeColor;
    }
    @Override
    public String getThemeColor(){
        return themeColor;
    }
    @Override
    public int getPiece(){
        return piece;
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public DarkTheme clone() {
        return new DarkTheme(this);
    }
}
