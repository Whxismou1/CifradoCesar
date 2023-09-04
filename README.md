# Cifrado César en Java

Este es un proyecto simple que implementa el cifrado César en Java. El cifrado César es una técnica de cifrado de sustitución en la que cada letra en el texto plano se desplaza un número fijo de lugares hacia adelante en el alfabeto. En este caso, el usuario puede especificar el valor de desplazamiento.

## Cómo utilizar

1. Clona este repositorio o descárgalo como archivo ZIP.

2. Abre el proyecto en tu entorno de desarrollo Java favorito.

3. En la clase `CifradoCesar.java`, encontrarás un método llamado `cifrar`. Puedes utilizar este método para cifrar una cadena de texto. 

4. Ajusta el valor de desplazamiento (llamado `desplazamiento`) en la función `cifrar` para especificar cuántos lugares quieres desplazar las letras. Por ejemplo, si deseas un desplazamiento de 3, usa `cifrar("Texto a cifrar", 3)`.

5. Ejecuta la aplicación y verás el texto cifrado en la consola.

## Notas
Este es un proyecto muy básico para demostrar la implementación del cifrado César en Java. Puedes personalizarlo y expandirlo según tus necesidades.

## Contribución
Si deseas contribuir a este proyecto, ¡siéntete libre de hacerlo!

## Ejemplo de uso

```java
public static void main(String[] args) {
    String textoOriginal = "Hola, mundo!";
    int desplazamiento = 3;
    String textoCifrado = cifrar(textoOriginal, desplazamiento);
    
    System.out.println("Texto original: " + textoOriginal);
    System.out.println("Texto cifrado: " + textoCifrado);
}
```


