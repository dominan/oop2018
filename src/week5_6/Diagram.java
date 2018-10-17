/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;

import java.util.ArrayList;

/**
 *
 * @author Minh Anh
 */
public class Diagram {	
    public ArrayList<Layer> layer = new ArrayList<Layer>();
    /**
     * @return result 
     */
    public int deleteCricle() {
	int result = 0;
	for(int i=0;i<layer.size();i++) {
            result=result+layer.get(i).deteleteCircle();
	}
	return result;
    }  
}
