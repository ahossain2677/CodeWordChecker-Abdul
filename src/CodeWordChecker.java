public class CodeWordChecker implements StringChecker

{
    private int min;
    private int max;
    private char symbol;

public StringChecker (int min , int max , char symbol){
    
    this.min = min ;
    this.max = max ;
    this.symbol = symbol;
}
}
