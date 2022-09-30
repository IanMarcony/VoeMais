package com.uea.voemais;
import com.uea.voemais.admin.view.InitialMenuAdminFrame;

import java.util.ArrayList;
import com.uea.voemais.shared.model.Flight;


public class ProjectVoeMais {

    //Aida teremos um lugar para esse array
    ArrayList<Flight> voos = new ArrayList<>(); 
    
    
    public static void main(String[] args) {
        InitialMenuAdminFrame menu = new InitialMenuAdminFrame();
        
        menu.pack();
        menu.show();
        
        
        
    }
}
