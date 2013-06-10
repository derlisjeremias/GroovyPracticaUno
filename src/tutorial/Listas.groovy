/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tutoria.groovy

def unaLista = [1776, -1, 33, 99, 0, 928734928763]

unaLista.each({println "Posicion $it"})
println "Posicion cero ${unaLista[0]}"
println "Tamaño de la lista ${unaLista.size()}"

def unaListaVacia = []
println "Tamaño de lista vacia ${unaListaVacia.size()}"