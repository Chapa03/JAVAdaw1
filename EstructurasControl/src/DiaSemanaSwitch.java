import java.util.Scanner;

public class DiaSemanaSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int diaSemana = 0;
		
		System.out.print("Introduce un numero (1-7) para saber el dia de la semana: ");
		diaSemana = sc.nextInt();
		
		switch (diaSemana) {
		case 1:
			System.out.println("El dia " + diaSemana + " es Lunes");
			break;
		case 2:
			System.out.println("El dia " + diaSemana + " es Martes");
			break;
		case 3:
			System.out.println("El dia " + diaSemana + " es Miercoles");
			break;
		case 4:
			System.out.println("El dia " + diaSemana + " es Jueves");
			break;
		case 5:
			System.out.println("El dia " + diaSemana + " es Viernes");
			break;
		case 6:
			System.out.println("El dia " + diaSemana + " es Sabado");
			break;
		case 7:
			System.out.println("El dia " + diaSemana + " es Domingo");
			break;
		default:
			System.out.println("El numero " + diaSemana + " no se corresponde con un dia de la semana");
			
		}
		
		//escribir mes y que nos diga cuantos dias tiene
		String mes = "";
		System.out.print("Escribe un mes para saber cuantos dias tiene: ");
		mes = sc.next();
		
		switch (mes.toLowerCase()) {
		case "enero":
		case "marzo":
		case "mayo":
		case "julio":
		case "agosto":
		case "octubre":
		case "diciembre":
			System.out.println(mes + " tiene 31 dias");
			break;
		case "febrero":
			System.out.println(mes + " tiene 28 dias");
			break;
		case "abril":
		case "junio":
		case "septiembre":
		case "noviembre":
			System.out.println(mes + " tiene 30 dias");
		default:
			System.out.println(mes + " no se corresponde con un mes valido");
			
		}
		
		sc.close();
	}

}
