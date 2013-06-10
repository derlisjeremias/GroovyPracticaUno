/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tutoria.groovy

def unMap =["Pedro":"no terminó","Juan":99,"Zim":"no terminó"]
println "Pedro ${unMap["Pedro"]}"
println "Pedro ${unMap.Pedro}"

unMap["Luis"]="Otro Valor"

unMap.each({println "Posicion $it"})

def unMapVacio = []
println "Tamaño map vacio "+unMapVacio.size()