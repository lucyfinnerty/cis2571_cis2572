// Name: Lucy Finnerty
// Date: 9/16/24
// Purpose: Program that prints the characters in the ASCII table from '!' to '~'
public class ASCIICharacterTable {
    public static void main(String[] args) {
        // variable to keep track of amount of characters printed
        int count = 0;
        // loop through ASCII value '!'(33) to '~'(126)
        for(int i = 33; i <= 126; i++) {
            // print character that corresponds to number
            System.out.print((char) i + " ");
            // increment count
            count++;
            // check if 10 characters have been printed
            if(count % 10 == 0) {
                System.out.println();
            }
        }
    }
}