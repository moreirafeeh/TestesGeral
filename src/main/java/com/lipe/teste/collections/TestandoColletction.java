package com.lipe.teste.collections;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;

public class TestandoColletction {

	public static void main(String[] args) throws IOException {
		
		//classes como String vem com alguns metodos implementados como "compareTo" e "toString" que servem pts voce nao rpexisar fazer convesoes
		//mas com listas voce acaba nao obtenfo o resultado que deseja e ai é necessario fazer overide nesses metodos
		
		//-----------------TESTANDO COLLECTIONS COM STRING--------
//		ArrayList<String> array = new ArrayList<String>();
//		
//		array.add("xablau");
//		array.add("batata");
//		array.add("quiabo");
//		array.add("cebola");
//		
//		Collections.sort(array);
//		
//		for(String l : array) {
//			System.out.println(l);
//		}
		//----------------------------------------------
		//----------------TESTANDO COLLECTIONS COM OBJETOS MEUS----
//		Aula a1 = new Aula("Revistando as ArrayLists", 21);
//        Aula a2 = new Aula("Listas de objetos", 20);
//        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
//
//        List<Aula> aulas = new ArrayList<>();
//        aulas.add(a1);
//        aulas.add(a2);
//        aulas.add(a3);
//        
//        aulas.sort((a4, a5) -> a1.getTitulo().compareTo(a2.getTitulo())); //aqui eu usei o compareTo da List(antes tava sendo feito com o compareTo da casse Aula)
//        System.out.println(aulas);
        //-----------------------------------------------
        //--------------usando predicates---------------
//		  Aula a1 = new Aula("Revistando as ArrayLists", 21);
//	      Aula a2 = new Aula("Listas de objetos", 20);
//	      Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
//	
//	      List<Aula> aulas = new ArrayList<>();
//	      aulas.add(a1);
//	      aulas.add(a2);
//	      aulas.add(a3);
//	      
//	      Predicate<Aula> pred = (p1) -> p1.getTempo() > 15; 
//	      
//	      aulas.removeIf(pred);
//        
//	      System.out.println(aulas);
	    //--------------usando predicates COM METODOS---------------
//		  Aula a1 = new Aula("Revistando as ArrayLists", 21);
//	      Aula a2 = new Aula("Listas de objetos", 20);
//	      Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
//	      Aula a4 = new Aula("Relacionamento de listas e objetos", 15);
//	      List<Aula> aulas = new ArrayList<>();
//	      aulas.add(a1);
//	      aulas.add(a1);
//	      aulas.add(a3);
//	      
////	      List<Aula> aulas2 = aulas.stream().filter(Aula::testandopredicate2).collect(Collectors.toList());
//	      //List<Boolean> filter =  aulas.stream().map( p -> p.contains("C")).collect(Collectors.toList());
//	      System.out.println(aulas.contains(a4));
	      
	      //------------transformando imagem em base64-----------
	      
	      byte[] fileContent = FileUtils.readFileToByteArray(new File("D:\\Downloads\\imagemteste.jpg"));
	      String encodedString = Base64.getEncoder().encodeToString(fileContent);
	      
	      File arquivo = new File("D:\\Downloads\\testeBase64.txt"); 
			
		  FileWriter fw = new FileWriter(arquivo, true);
			
		  BufferedWriter bw = new BufferedWriter(fw);
			
		  bw.write(encodedString);
		  bw.newLine();
			
		  bw.close();
		  fw.close();
	      //System.out.println("PASSEI");
	      System.out.println(encodedString);
	      
	      //decode
	      //byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
	      //FileUtils.writeByteArrayToFile(new File(outputFileName), decodedBytes);
	      
	      
	      //-----------------------------------------------------
	}

}
