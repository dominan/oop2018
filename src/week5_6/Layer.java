/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;

/**
 *
 * @author Minh Anh
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

class Layer {
    ArrayList<Shape> shape = new ArrayList<Shape>();
    /**
     * ham xoa tat ca hinh tam giac da duoc khai bao
     * @return result 
     */
    public int deteleteTriange() {
	int result =0;	
	for(int i=0;i<this.shape.size();i++) {
            if(shape.get(i) instanceof Triangle) { 
		shape.remove(i);
		result++;
		i--;
            }		
	}
	return result;
    }  
    /**
     * ham xoa tat ca hinh tron duoc khai bao
     * @return result 
     */
    public int deteleteCircle() {
        int result =0;	
	for(int i=0;i<this.shape.size();i++) {
            if(shape.get(i) instanceof Circle) {
		shape.remove(i);
		result++;
		i--;			
            }
	}
	return result;
    }
}
