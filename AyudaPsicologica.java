import java.util.Scanner; 



public class AyudaPsicologica {

	public static void main(String[] args) { 

		// Dar la bienvenida al usuario 

		System.out.println("Bienvenido al programa de ayuda psicológica.");

		System.out.println("¿En qué puedo ayudarte hoy?"); 

		// Crear un objeto Scanner para leer la entrada del usuario 

		Scanner scanner = new Scanner(System.in); 

		// Bucle principal del programa 

		while (true) { 

			// Leer la entrada del usuario 

			String entradaUsuario = scanner.nextLine(); 

			// Procesar la entrada del usuario y dar una respuesta 

			String respuesta = procesarEntrada(entradaUsuario); 

			// Mostrar la respuesta al usuario 

			System.out.println(respuesta); 

		} 

	} // Generar una respuesta 

	

	public static String procesarEntrada(String entrada) { 

		// Aquí van las respuestas predeterminadas 

		String[] respuestas = { "Entiendo cómo te sientes.",

				"¿Puedes contarme más sobre eso?", 

				"A veces puede ser difícil", 

				"pero estoy aquí para ayudarte.", 

				"¿Has considerado hablar con alguien de confianza sobre esto?", 

				"¿Tienes alguna preocupación que te gustaría mencionar?", 

				"Recuerda que no estás solo en esto." }; 

		// Que seleccione una respuesta al azar 

		int indiceRespuesta = (int) (Math.random() * respuestas.length); 

		return respuestas[indiceRespuesta]; 

	} 

}