public class CifradoCesar {
    private String textoDescodificado;
    private String textoCodificado;
    private String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";


    public String encriptar(String texto){
        textoCodificado = "";

        texto = texto.toUpperCase();


        char caracter;

        for(int i=0; i<texto.length(); i++){
            caracter = texto.charAt(i);

            int pos = letras.indexOf(caracter);
        
            if(pos == -1){
                textoCodificado += caracter;
            }else{
                textoCodificado += letras.charAt((pos + 3) % letras.length());
            }

        }

        return textoCodificado;
    }

    public String desencriptar(String texto){
        textoDescodificado = "";

        texto = texto.toUpperCase();


        char caracter;

        for(int i=0; i<texto.length(); i++){
            caracter = texto.charAt(i);

            int pos = letras.indexOf(caracter);
        
            if(pos == -1){
                textoDescodificado += caracter;
            }else{
                if(pos-3 < 0){
                    textoDescodificado += letras.charAt(letras.length() + (pos - 3) );
                }else{

                    textoDescodificado += letras.charAt((pos - 3) % letras.length());
                }
            }

        }

        return textoDescodificado;
    }


}
