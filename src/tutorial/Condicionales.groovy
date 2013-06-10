/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tutoria.groovy

def amPM = Calendar.getInstance().getAt(Calendar.AM_PM)
if (amPM == Calendar.AM){
    println "Bune día"
}else{
    println "Buenas tardes"
}