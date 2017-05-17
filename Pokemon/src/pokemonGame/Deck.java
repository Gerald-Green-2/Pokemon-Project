package pokemonGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;

public class Deck {
	
static LinkedList<String> card_list;

	public void Read_in_File(String [] args) throws IOException{
		String filePath = "C:/Users/Joe_Robertson/Desktop/Pokemon/" + "pokemon_names.txt";
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		
		String line = br.readLine();
		LinkedList <String> card_list = new LinkedList<String>();

		while (line != null) {
			System.out.println(line);
			line = br.readLine();
			card_list.add(line);
		}

		//close the reader
		br.close();	
	}
	
	//possibly another way to read in the file
//		Scanner s = new Scanner(new File("C:/Users/Joe_Robertson/Desktop/Pokemon/pokemon_names.txt"));
//		LinkedList<String> card_list = new LinkedList<String>();
//		while (s.hasNextLine()){
//		    card_list.add(s.nextLine());
//		}
//		s.close();
	
		
	
	public static void shuffle() {
		Collections.shuffle(card_list);
	}
		

	public static void draw(){
		/*Same as a queue*/
		while (!card_list.isEmpty())
			System.out.println(card_list.removeFirst());
		System.out.println();
		}	
	}
