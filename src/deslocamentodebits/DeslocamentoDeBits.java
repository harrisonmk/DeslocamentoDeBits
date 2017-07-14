package deslocamentodebits;

/**
 *
 * @author Harrison
 */
public class DeslocamentoDeBits {

    public static void main(String[] args) {

        int a = 1234567890; // 01001001100101100000001011010010 em binário
        int b = 987654321;  // 00111010110111100110100010110001 em binário
        int k = 10;

        int and = a & b; // 00001000100101100000000010010000
        int or = a | b; // 01111011110111100110101011110011
        int xor = a ^ b; // 01110011010010000110101001100011
        int not = ~a;    // 10110110011010011111110100101101

        System.out.print("a -> ");
        System.out.println(Integer.toBinaryString(a)); // imprime a representação binária do número
        System.out.print("b -> ");
        System.out.println(Integer.toBinaryString(b));

        System.out.println();
        System.out.print("a & b -> ");
        System.out.println(Integer.toBinaryString(and)); //operação and
        System.out.print("a | b -> ");
        System.out.println(Integer.toBinaryString(or)); //operação or
        System.out.print("a ^ b -> ");
        System.out.println(Integer.toBinaryString(xor)); //operação xor
        System.out.print("~a -> ");
        System.out.println(Integer.toBinaryString(not)); //operação not

        //Descolamento de bits
        System.out.println();
        int h = 1431655765;  // 01010101010101010101010101010101
        int m = -1431655766; // 10101010101010101010101010101010

        System.out.print("h -> ");
        System.out.println(Integer.toBinaryString(h)); // imprime a representação binária do número
        System.out.print("m -> ");
        System.out.println(Integer.toBinaryString(m));

        System.out.println();
        System.out.print("h << 3 -> ");
        System.out.println(Integer.toBinaryString(h << 3));
        System.out.print("m << 3 -> ");
        System.out.println(Integer.toBinaryString(m << 3));

        System.out.println();
        System.out.print("h >>> 3 -> ");
        System.out.println(Integer.toBinaryString(h >>> 3));
        System.out.print("m >>> 3 -> ");
        System.out.println(Integer.toBinaryString(m >>> 3));

        System.out.println();
        System.out.print("h >> 3 -> ");
        System.out.println(Integer.toBinaryString(h >> 3));
        System.out.print("m >> 3 -> ");
        System.out.println(Integer.toBinaryString(m >> 3) + "\n");

    }
}


