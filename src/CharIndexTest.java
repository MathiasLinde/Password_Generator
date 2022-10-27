import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharIndexTest {
    @Test
    void charindex() {
    }
    char [] index;
    @Test
    void getCharacter() {
        Symbollib symbol = new Symbollib();

        index = new char[70];
        index[0]= new Char(A);
        index[1]= new Char(a);
        index[2]= new Char(B);
        index[3]= new Char();
        char B = index[2];
        System.out.println(B);

    }


}