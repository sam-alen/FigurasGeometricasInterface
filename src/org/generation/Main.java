package org.generation;

public class Main {

	public static void main(String[] args) {
		Triangulo bermudas = new Triangulo("Triangulo", 20, 10, 15);
		Cuadrado cuadrado = new Cuadrado("Cuadrado", 10);
		Rectangulo rectangulo = new Rectangulo("Rectángulo", 15, 10);
        Rombo rombo = new Rombo("Rombo", 14, 10, 8);
        Romboide romboide = new Romboide("Romboide", 15, 10, 8);
        Trapecio trapecio = new Trapecio("Trapecio", 20, 10, 8, 7, 6);
        
        // Cálculos e impresión
        imprimirCalculo(bermudas);
        imprimirCalculo(cuadrado);
        imprimirCalculo(rectangulo);
        imprimirCalculo(rombo);
        imprimirCalculo(romboide);
        imprimirCalculo(trapecio);
	}//Main
	
	public static void imprimirCalculo(FiguraGeometrica f) {
		System.out.println(f.toString());
		System.out.println("+=====================================+");
		System.out.println(" El area de [" + f.getNombre()
				+ "] es :" + f.calcularArea());
		System.out.println(" El perimetro de ["+ f.getNombre()
				+ "] es :" + f.calcularPerimetro());
		System.out.println("+=====================================+");
	}//Imprimir calculo
}//Class Main
