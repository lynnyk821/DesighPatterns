package lab4_var_3_1;

public class WhiteTheme extends ChessTheme {
    private String themeColor;
    public WhiteTheme(int piece, String gameName) {
        super(piece, gameName);
        themeColor = "White";
    }

    private WhiteTheme(WhiteTheme wt) {
        super(wt);
        this.themeColor = wt.themeColor;
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
    public String getThemeColor(){
        return themeColor;
    }
    @Override
    public WhiteTheme clone() {
        return new WhiteTheme(this);
    }
}
