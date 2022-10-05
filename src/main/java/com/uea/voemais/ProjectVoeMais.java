package com.uea.voemais;
import com.uea.voemais.client.view.InitialMenuClientFrame;

import java.util.ArrayList;
import com.uea.voemais.shared.model.Flight;


public class ProjectVoeMais {

    //Aida teremos um lugar para esse array
    ArrayList<Flight> voos = new ArrayList<>(); 
    
    
    public static void main(String[] args) {
        InitialMenuClientFrame menu = new InitialMenuClientFrame();
        
        menu.pack();
        menu.show();
        
        
        
    }
}
