/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delivery;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author zahra
 */
public class Delivery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
       
        
        BufferedReader br = null;
        String currentLine;
        br = new BufferedReader(new FileReader("busy_day.in"));
        int R,C,D,T, maxLoad, W;
        currentLine = br.readLine();
        String Fline[] = new String[5];
        Fline = currentLine.split(" ");
        R= Integer.parseInt(Fline[0]);
        C= Integer.parseInt(Fline[1]);
        D= Integer.parseInt(Fline[2]);
        T= Integer.parseInt(Fline[3]);
        maxLoad= Integer.parseInt(Fline[4]);
        
        int Nproducts;
        int weights[];
        currentLine = br.readLine();
        Nproducts = Integer.parseInt(currentLine);
        weights = new int [Nproducts];
        String Sweights[] = new String[Nproducts];
        currentLine = br.readLine();
        Sweights= currentLine.split(" ");
        
        for(int i =0 ; i<Nproducts; i++)
        {
            weights[i]= Integer.parseInt(Sweights[i]);
        }
        
        currentLine = br.readLine();
        currentLine = br.readLine();
        String[] warehouseLocation= currentLine.split(" "); 
        int W1Location = Integer.parseInt(warehouseLocation[0]);
        currentLine = br.readLine();
        String PinW[] = new String[Nproducts];
        int[][] warehouse = null;
        String[] pinw2= currentLine.split(" ");       
        W = Integer.parseInt(pinw2[0]);
        
        for (int i = 0; i<Nproducts; i++)
                {
                    for (int j=0; j<W; j++)
                    {
                        warehouse[i][j]= Integer.parseInt(PinW[i]);
                    }
           
        }
        
        System.out.print("done");
    
    }
    
}
