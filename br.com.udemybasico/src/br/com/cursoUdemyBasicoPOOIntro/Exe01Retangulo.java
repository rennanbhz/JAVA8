package br.com.cursoUdemyBasicoPOOIntro;

public class Exe01Retangulo
{
        double altura;
        double largura;
        
        public double area() {
            return altura * largura;
        }
        public double perimeter() {
            return 2 * (altura + largura);
        }
        public double diagonal() {
            return Math.sqrt(altura * largura + altura * largura);
                    
        }
}
