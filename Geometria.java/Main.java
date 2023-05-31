import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int forma, formula;
        float largura, altura, comprimento, raio, ab, al;

        System.out.println("Qual forma você deseja usar? \n1 - Cubo\n2 - Paralelepípedo\n3 - Prisma\n4 - Pirâmide\n5 - Cilindro\n6 - Esfera");
        forma = ler.nextInt();

        switch (forma) {
            case 1:
                System.out.println("O que você quer calcular?\n1 - Área da base\n2 - Volume");
                formula = ler.nextInt();

                switch (formula) {
                    case 1:
                        // ÁREA DA BASE
                        System.out.println("Qual é a largura?");
                        largura = ler.nextFloat();

                        System.out.println("A área da base é: " + largura * largura);
                        break;

                    case 2:
                        // VOLUME
                        System.out.println("Qual é a largura?");
                        largura = ler.nextFloat();

                        System.out.println("Qual é a altura?");
                        altura = ler.nextFloat();

                        System.out.println("Qual é o comprimento?");
                        comprimento = ler.nextFloat();

                        System.out.println("O volume do cubo é: " + largura * altura * comprimento);
                        break;
                }
                break;

            case 2:
                // PARALELEPÍPEDO
                System.out.println("O que você quer calcular?\n1 - Área da base\n2 - Volume");
                formula = ler.nextInt();

                switch (formula) {
                    case 1:
                        // ÁREA DA BASE
                        System.out.println("Qual é a largura?");
                        largura = ler.nextFloat();

                        System.out.println("Qual é a altura?");
                        altura = ler.nextFloat();

                        System.out.println("A área da base é: " + largura * altura);
                        break;

                    case 2:
                        // VOLUME
                        System.out.println("Qual é a altura?");
                        altura = ler.nextFloat();

                        System.out.println("Qual é a largura?");
                        largura = ler.nextFloat();

                        System.out.println("Qual é o comprimento?");
                        comprimento = ler.nextFloat();

                        System.out.println("O volume do paralelepípedo é: " + (altura * largura * comprimento));
                        break;
                }
                break;

            case 3:
                // PRISMA
                System.out.println("O que você quer calcular?\n1 - Área da base\n2 - Área Lateral\n3 - Área da Base\n4 - Volume");
                formula = ler.nextInt();
                switch(formula){
                    case 1:
                        // AREA DA BASE
                        System.out.println("Qual é a altura?");
                        altura = ler.nextFloat();
                        
                        System.out.println("Qual é a largura?");
                        largura = ler.nextFloat();
                        
                        System.out.println("A área da base é: " + altura * largura);
                        
                        break;
                        
                    case 2:
                        //AREA LATERAL
                        System.out.println("Qual é a altura da face lateral?");
                        altura = ler.nextFloat();
                        
                        System.out.println("Qual é a largura da face lateral?");
                        largura = ler.nextFloat();
                        
                        System.out.println("Quantos lados tem?");
                        int lados = ler.nextInt();
                        
                        System.out.println("A área lateral é: " + (lados *(altura * largura)));
                        
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                }                
                break;

            case 4:
                // PIRÂMIDE
                break;

            case 5:
                // CILINDRO
                break;

            case 6:
                // ESFERA
                break;
        }
    }
}
