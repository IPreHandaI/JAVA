import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int forma, formula;
        float largura, altura, profundidade, raio;
        float areaBase, areaLateral;

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

                        System.out.println("Qual é o profundidade?");
                        profundidade = ler.nextFloat();

                        System.out.println("O volume do cubo é: " + largura * altura * profundidade);
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

                        System.out.println("Qual é o profundidade?");
                        profundidade = ler.nextFloat();

                        System.out.println("O volume do paralelepípedo é: " + (altura * largura * profundidade));
                        break;
                }
                break;

                case 3:
                    // PRISMA
                    System.out.println("O que você quer calcular?\n1 - Área da base\n2 - Área Lateral\n3 - Volume");
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
                            //VOLUME
                            System.out.println("Qual é a altura?");
                            altura = ler.nextFloat();
                            
                            System.out.println("Qual é a largura?");
                            largura = ler.nextFloat();
                            
                            System.out.println("Qual é a profunidade?");
                            profundidade = ler.nextFloat();

                            System.out.println("O volume do prisma é: " + (altura * largura * profundidade));

                            break;
                }                
                break;

            case 4:
                // PIRÂMIDE
                System.out.println("O que você quer calcular?\n1 - Área da Base\n2 - Área Lateral\n3 - Área Total\n4 - Volume");
                formula = ler.nextInt();

                switch(formula){
                    case 1:
                    //AREA DA BASE
                        System.out.println("Qual é a altura?");
                        altura = ler.nextFloat();
                        
                        System.out.println("Qual é a largura?");
                        largura = ler.nextFloat();

                        areaBase = altura * largura;
                        
                        System.out.println("A área da base é: " + areaBase);
                        
                        break;
                    
                    case 2:
                    //AREA LATERAL
                        System.out.println("Qual é a altura?");
                        altura = ler.nextFloat();
                        
                        System.out.println("Qual é a largura?");
                        largura = ler.nextFloat();

                        areaLateral = (altura * largura)/2;

                        System.out.println("A área lateral é: " + areaLateral);

                        break;
                    
                    case 3:
                    //AREA TOTAL

                        System.out.println("Qual é a altura?");
                        altura = ler.nextFloat();
                        
                        System.out.println("Qual é a largura?");
                        largura = ler.nextFloat();

                        areaBase = altura * largura;
                        
                        System.out.println("A área da base é: " + areaBase);

                        System.out.println("Qual é a altura?");
                        altura = ler.nextFloat();
                        
                        System.out.println("Qual é a largura?");
                        largura = ler.nextFloat();

                        areaLateral = (altura * largura)/2;

                        System.out.println("A área total é: " + (areaLateral + areaBase));
                        break;
                    
                    case 4:
                    //VOLUME
                        System.out.println("Qual é a altura?");
                        altura = ler.nextFloat();
                        
                        System.out.println("Qual é a largura?");
                        largura = ler.nextFloat();

                        areaBase = altura * largura;
                        
                        System.out.println("O volume é: " + (areaBase * altura)/2);

                        break;
                }

                break;

            case 5:
            // CILINDRO
                System.out.println("O que você quer calcular?\n1 - Área Latera\n2 - Área Total\n3 - Volume");
                formula = ler.nextInt();

                switch(formula){
                    case 1:
                    //AREA LATERAL
                        System.out.println("Qual é a altura?");
                        altura = ler.nextFloat();
                        
                        System.out.println("Qual é o raio?");
                        raio = ler.nextFloat();

                        System.out.println("A área lateral é: " + (raio * altura)/2);

                        break;
                    
                    case 2:
                    //AREA TOTAL
                        System.out.println("Qual é altura?");
                        altura = ler.nextFloat();
                    
                        System.out.println("Qual é o raio?");
                        raio = ler.nextFloat();

                        System.out.println("A área total é: " + ((raio*raio)* 2 + (raio * altura)* 2));

                        break;
                    
                    case 3:
                    //VOLUME
                        System.out.println("Qual é o raio?");
                        raio = ler.nextFloat();

                        System.out.println("Qual é a altura?");
                        altura = ler.nextFloat();

                        System.out.println("O volume é:" + (raio * raio) * altura);

                        break;
                }

                break;

            case 6:
                // ESFERA
                System.out.print("O que você quer calcular?\n1 - Área da Superfície\n2 - Volume");
                formula = ler.nextInt();

                switch(formula){
                    case 1:
                        System.out.println("Qual é o raio?");
                        raio = ler.nextFloat();
        
                        System.out.println("A área da superfície é: " + (raio * raio) * 4);
                        break;

                    case 2:
                        System.out.println("Qual é o raio?");
                        raio = ler.nextFloat();

                        System.out.println("O volume é: " + ((raio * raio * raio) * 4)/3);

                        break;
                }

                break;
        }
    }
}
