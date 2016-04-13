/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Outils;

import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import persons.IPerson;

/**
 *
 * @author Thibaud
 */
public class OutilsPerson {
    
    public static int searchOldest(List<IPerson> lp, GregorianCalendar date) {
        int max=0;
        Iterator<IPerson> listIter = lp.iterator();
		while (listIter.hasNext()) {
			IPerson pers=listIter.next();
                        try {
                        max=Math.max(max, pers.getAge(date));
                        }
                        catch (Exception e ) {
                            
                        }
		}
        return max;
    }
}
