public class CharIndex {

    char [] index;

    public void charindex(){
        Symbollib symbol = new Symbollib();

        index = new char[70];
        index[0]= new Char(Symbollib.symA());
        index[1]= new Char(symbol);
        index[2]= new Char(B);
        index[3]= new Char();
        char B = index[2];
        System.out.println(B);

    }

    public char getCharacter(int i){
        return index[i].getCharacter();
    }
}

