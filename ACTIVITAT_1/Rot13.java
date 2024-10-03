package ACTIVITAT_1;


public class Rot13 {

    public static String xifraRot13(String cadena) {
        String minuscules = "abcdefghijklmnñopqrstuvwxyzàáèéìòóí";
        String majuscules = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        StringBuilder resultat = new StringBuilder();

        // Recorremos cada carácter de la cadena
        for (char c : cadena.toCharArray()) {
            // Si el carácter es una letra minúscula
            if (minuscules.indexOf(c) != -1) {
                int posicio = (minuscules.indexOf(c) + 13) % 26;
                resultat.append(minuscules.charAt(posicio));
            }
            // Si el carácter es una letra mayúscula
            else if (majuscules.indexOf(c) != -1) {
                int posicio = (majuscules.indexOf(c) + 13) % 26;
                resultat.append(majuscules.charAt(posicio));
            }
            // Si no es una letra, lo dejamos igual (espacios, signos, números, etc.)
            else {
                resultat.append(c);
            }
        }
        return resultat.toString();
    }

    // Método para descifrar con ROT13 (el mismo proceso que cifrar)
    public static String desxifraRot13(String cadena) {
        return xifraRot13(cadena);  // ROT13 es simétrico, mismo proceso para cifrar y descifrar
    }

    // Método principal (main) para probar el cifrado y descifrado
    public static void main(String[] args) {
        String textOriginal = "Hola, com estas? Aquest és un exemple de ROT13!";
        
        // Cifrar el texto
        String textXifrat = xifraRot13(textOriginal);
        System.out.println("Text xifrat: " + textXifrat);
        
        // Descifrar el texto
        String textDesxifrat = desxifraRot13(textXifrat);
        System.out.println("Text desxifrat: " + textDesxifrat);
    }
}

