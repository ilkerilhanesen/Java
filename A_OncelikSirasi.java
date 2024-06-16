package Samples.A_Operators;

public class A_OncelikSirasi {
    public static void main(String[] args) {
        /*
        Parantezler           ()                                                   : En yüksek önceliğe sahiptir ve içerisindeki işlemler öncelikle yapılır.
        Artırma/azaltma       (++/--)                                              : İkinci en yüksek önceliğe sahiptir.
        Pozitif/negatif       (+/-)                                                : Tekli bir operandı pozitif veya negatif yapmak için kullanılır.
        Çarpma/bölme/modül    (* / / / %)                                          : Çarpma, bölme ve modül işlemleri, üçüncü önceliğe sahiptir.
        Toplama/çıkarma       (+/-)                                                : Dördüncü önceliğe sahiptir.
        İlişkisel operatörler (==, !=, <, >, <=, >=)                               : Beşinci önceliğe sahiptir.
        Mantıksal AND         (&&)                                                 : Altıncı önceliğe sahiptir.
        Mantıksal OR          (||)                                                 : Yedinci önceliğe sahiptir.
        Koşullu operatör      (?:)                                                 : Sekizinci önceliğe sahiptir.
        Atama operatörleri    (=, +=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=, >>>=)  : En düşük önceliğe sahiptir.
        */

        System.out.println("1 + 2 = " + 1 + 2);	    // Sonuç -->    1 + 2 = 12
        System.out.println("1 + 2 = " + (1 + 2));   // Sonuç -->    1 + 2 = 3

        System.out.println(1 + 2 + "abc");	        // Sonuç -->    3abc
        System.out.println("abc" + 1 + 2);	        // Sonuç -->    abc12

        boolean a = false;
        boolean b = false;
        boolean c = true;
        System.out.println(a == b == c);	        // Sonuç -->    true

        int x = 5;
        int y = 10;
        int z = ++x * y--;                          // x'i +1 arttır ve y ile çarp, sonra y'yi +1 arttır.
        System.out.println(z);	                    // Sonuç -->    60

        int x1 = 10;
        int y1 = x1+++x1;                           // (10) + (++10) = 10 + 11 = 21
        System.out.println(y1);	                    // Sonuç -->    21
    }
}
