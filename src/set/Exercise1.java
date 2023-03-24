package set;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		File file = new File("C:\\Temp\\log.txt");

		System.out.println("Create log archive (y/n)? ");
		String response = sc.next();

		switch (response) {

		case "y":

			try {
				if (file.createNewFile()) {
					System.out.println("File created: " + file.getName());
				} else {
					System.out.println("File already exists.");
				}

			} catch (IOException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();

			}
			System.out.println(" How many users?");
			int usersNumber = sc.nextInt();
			for (int i = 0; i < usersNumber; i++) {
				System.out.println("Enter a name:");
				String name = sc.next();
				User user = new User(name, LocalDateTime.now());
				 
				try {
			        // Cria um FileWriter que não apaga o conteúdo anterior do arquivo
			        FileWriter fw = new FileWriter("C:\\Temp\\log.txt", true);
			        
			        // Cria um BufferedWriter para escrever no arquivo de forma eficiente
			        BufferedWriter bw = new BufferedWriter(fw);
			        
			        // Escreve a mensagem no arquivo, seguida de uma quebra de linha
			        bw.write(user.getName()+": "+user.getFormatedDate());
			        bw.newLine();
			        
			        // Fecha o BufferedWriter e o FileWriter
			        bw.close();
			        fw.close();
			    } catch (IOException e) {
			        // Se ocorrer um erro de I/O, imprime a mensagem de erro
			        System.err.println("Erro ao escrever no arquivo de log: " + e.getMessage());
			    }
				
			}

			break;

		case "n":

			System.out.println("ended");
			break;

		}
		
		try (BufferedReader bfr = new BufferedReader(new FileReader(file))){
			
			java.util.Set<User> set = new HashSet<>();
			
			
			String line = bfr.readLine();
			
			while(line != null) {
				String[] fields = line.split(" ");
				String username = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
				
				set.add(new User(username,moment));
				line = bfr.readLine();
		
			}
		 
			System.out.println("Total diferent users: " + set.size());
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	

		sc.close();

	}

}
