/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios

class Datum{
    Object invokeMethod(String nombre, Object args) { 
        println "No existe el método ${nombre}()" 
    }
}

    def a = new Datum()
    a.unMetodo()
    a.otroMetodoDistinto()
    a.algunMetodoMas()