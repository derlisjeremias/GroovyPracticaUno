/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tutoria.groovy

def cuadrado = {it * it}

println "Cuadrado de nueve ${cuadrado(9)}"

def lista = [1, 2, 3, 4]
def cuadrados = lista.collect(cuadrado)

for (i in 0..3){
    println "El cuadrado de ${lista[i]} es ${cuadrados[i]}"
}

imprimirMap ={clave, valor -> println "$clave es $valor"}
[ "Zim" : "invasor", "Dib" : "humano", "Gaz" : "humana" ].each(imprimirMap)
