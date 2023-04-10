/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mooretext;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TURAN
 */
public class MooreText {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String al="aaababbaabb";
        String out="";
        List<State> states = new ArrayList<>();
        char[] gercek = al.toCharArray();
                 for(int i = 0; i<gercek.length;i++){
             System.out.println(gercek[i]);
         }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"))) {

			String line = null;

			String specialCharacter = " ";

		

			while ((line = bufferedReader.readLine()) != null) {

				System.out.println(line);

				String[] values = line.split(specialCharacter);

				State state = new State();

				state.setIsim(values[0]);
                                state.setAfterA(values[1]);
                                state.setAfterB(values[2]);
                                state.setOut(values[3]);
				states.add(state);

                               
                                
			}
                       
                       
		}
                                 out+="0";
                                State gercekSiradaki = states.get(0);
                                for(int i = 0; i<gercek.length;i++){
                                 if(gercek[i]=='a'){
                    
                                    String siradaki = gercekSiradaki.afterA;
                                     System.out.println("sıradaki : " + siradaki);
                                     for (State state1 : states) {

                                         if(state1.getIsim().equals(siradaki)){
                                             gercekSiradaki=state1;
                                         }
                                     }
                                    out+= gercekSiradaki.getOut();
                                    }
                                    else{

                                    String siradaki = gercekSiradaki.afterB;
                                    System.out.println("sıradaki : " + siradaki);
                                     for (State state1 : states) {
                                         if(state1.getIsim().equals(siradaki)){
                                             gercekSiradaki=state1;
                                         }
                                     }
                                    out+= gercekSiradaki.getOut();
                        
                              }  
                           }
                                System.out.println("OUT:  "+out);
                            

        
       
	}
    

}
        

