import java.util.imputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner opc = new Scanner(System.in);
        boolean salir = false; // aqui es para salir de las opciones
        int opc; // aqui es para guardar la opcion que se selecciono

        while (!salir) {

            System.out.println("1.- Primera clase");
            System.out.println("2.- Segunda clase");
            System.out.println("3.- Tercera clase");
            System.out.println("4.- Cuarta clase");
            System.out.println("5.- Quinta clase");
            System.out.println("6.- EXIT");

            try {

                System.out.println("ingrese la opcion que desee:");
                opc= opc.nextInt();

                switch (opc) {
                    case 1:
                        System.out.println("Clase 1");

                        Automovil Auto1=new Automovil();

                        System.out.println(\nEscribe nombre del automovil: ");
                        Scanner inNombre = new Scanner(System.in);
                        Auto1.setNombre(inNombre.next());

                        System.out.println(\nEscribe la potencia que posee el automovil: ");
                        Scanner inPotencia = new Scanner(System.in);
                        Auto1.setPotencia(inPotencia.next());

                        System.out.println(\nEscribe la aceleracion que tiene (0-100km) el automovil: ");
                        Scanner inAceleracion = new Scanner(System.in);
                        Auto1.setAceleracion(inAceleracion.next());

                        System.out.println(\nEscribe velocidad max del automovil: ");
                        Scanner inVel = new Scanner(System.in);
                        Auto1.setVel(inVel.next());

                        System.out.println(\nEscribe el combustible que utiliza el automovil: ");
                        Scanner inCombustible = new Scanner(System.in);
                        Auto1.setCombustible(inCombustible.next());

                        System.out.println("Los valores de este objeto estan asignados por parametro: ");
                        System.out.println(Auto1.getNombre() + ", " + Auto1.getPotencia() + ", " + Auto1.getAceleracion() + ", " + Auto1.getVel() + ", " + Auto1.getCombustible());
                        inNombre.close();
                        inPotencia.close();
                        inAceleracion.close();
                        inVel.close();
                        inCombustible.close();
                        break;

                    case 2:
                        System.out.println("Clase 2");

                        Television Tele2=new Television();

                        System.out.println(\nEscribe marca de la television: ");
                        Scanner inMarca = new Scanner(System.in);
                        Tele2.setMarca(inMarca.next());

                        System.out.println(\nEscribe la resolucion que posee la television: ");
                        Scanner inResolucion = new Scanner(System.in);
                        Tele2.setResolucion(inResolucion.next());

                        System.out.println(\nEscribe la frecuencia que tiene la television: ");
                        Scanner inFrecuencia = new Scanner(System.in);
                        Tele2.setFrecuencia(inFrecuencia.next());

                        System.out.println(\nEscribe el año de la television: ");
                        Scanner inAño = new Scanner(System.in);
                        Tele2.setAño(inAño.next());

                        System.out.println(\nEscribe el numero de pulgadas que que tiene el televisor: ");
                        Scanner inPulga = new Scanner(System.in);
                        Tele2.setPulga(inPulga.next());

                        System.out.println("Los valores de este objeto estan asignados por parametro: ");
                        System.out.println(Tele2.getMarca() + ", " + Tele2.getResolucion() + ", " + Tele2.getFrecuencia() + ", " + Tele2.getAño() + ", " + Tele2.getPulga());
                        inMarca.close();
                        inResolucion.close();
                        inFrecuencia.close();
                        inAño.close();
                        inPulga.close();
                        break;

                    case 3:
                        System.out.println("Clase 3");

                        Avion Avion3=new Avion();

                        System.out.println(\nEscribe nombre del avion: ");
                        Scanner inNombre1 = new Scanner(System.in);
                        Avion3.setNombre1(inNombre1.next());

                        System.out.println(\nEscribe la capacidad de pasajeros que posee el avion: ");
                        Scanner inPasa = new Scanner(System.in);
                        Avion1.setPasa(inPasa.next());

                        System.out.println(\nEscribe la aerolinea que represente al avion: ");
                        Scanner inAero = new Scanner(System.in);
                        Avion1.setAero(inAero.next());

                        System.out.println(\nEscribe la altura maxima que puede alcanzar el avion: ");
                        Scanner inAlt = new Scanner(System.in);
                        Avion1.setAlt(inAlt.next());

                        System.out.println(\nEscribe el nombre del motor del avion: ");
                        Scanner inMotor = new Scanner(System.in);
                        Avion1.setMotor(inMotor.next());

                        System.out.println("Los valores de este objeto estan asignados por parametro: ");
                        System.out.println(Avion1.getNombre1() + ", " + Avion1.getPasa() + ", " + Avion1.getAero() + ", " + Avion1.getAlt() + ", " + Avion1.getMotor());
                        inNombre1.close();
                        inPasa.close();
                        inAero.close();
                        inAlt.close();
                        inMotor.close();
                        break;

                    case 4:
                        System.out.println("Clase 4");

                        Celular Cel1=new Celular();

                        System.out.println(\nEscriba marca del celular: ");
                        Scanner inMarca1 = new Scanner(System.in);
                        Cel1.setMarca1(inMarca1.next());

                        System.out.println(\nEscribe el año del celular: ");
                        Scanner inAño1 = new Scanner(System.in);
                        Cel1.setAño1(inAño1.next());

                        System.out.println(\nEscribe el numero de modelo del celular: ");
                        Scanner inModelo = new Scanner(System.in);
                        Cel1.setModelo(inModelo.next());

                        System.out.println(\nEscribe la capacidad maxima del celular: ");
                        Scanner inCap = new Scanner(System.in);
                        Cel1.setCap(inCap.next());

                        System.out.println(\nEscribe la version del software: ");
                        Scanner inSoft = new Scanner(System.in);
                        Cel1.setSoft(inSoft.next());

                        System.out.println("Los valores de este objeto estan asignados por parametro: ");
                        System.out.println(Cel1.getMarca1() + ", " + Cel1.getAño1() + ", " + Cel1.getModelo() + ", " + Cel1.getCap() + ", " + Cel1.getSoft());
                        inMarca1.close();
                        inAño1.close();
                        inModelo.close();
                        inCap.close();
                        inSoft.close();
                        break;

                    case 5:
                        System.out.println("Clase 5");

                        Consola Con1=new Consola();

                        System.out.println(\nEscriba nombre de la consola: ");
                        Scanner inNombre2 = new Scanner(System.in);
                        Con1.setNombre2(inNombre2.next());

                        System.out.println(\nEscribe el procesador de la consola: ");
                        Scanner inProc = new Scanner(System.in);
                        Con1.setProc(inProc.next());

                        System.out.println(\nEscribe el año de la consola: ");
                        Scanner inAño2 = new Scanner(System.in);
                        Con1.setAño2(inAño2.next());

                        System.out.println(\nEscribe la capacidad maxima de la consola: ");
                        Scanner inCap1 = new Scanner(System.in);
                        Con1.setCap1(inCap1.next());

                        System.out.println(\nEscribe la memoria RAM de la consola: ");
                        Scanner inRAM = new Scanner(System.in);
                        Con1.setRAM(inRAM.next());

                        System.out.println("Los valores de este objeto estan asignados por parametro: ");
                        System.out.println(Con1.getNombre2() + ", " + Con1.getProc() + ", " + Con1.getAño2() + ", " + Con1.getCap1() + ", " + Con1.getRAM());
                        inNombre2.close();
                        inProc.close();
                        inAño2.close();
                        inCap1.close();
                        inRAM.close();
                        break;

                        } catch (InputMismatchException e){
                                        return;




                                    }
                                }

                            }
                        }



