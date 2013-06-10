/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tutoria.groovy

def nombres=["Zim","Dib","Gaz","Tak"]
println "\nFor (i=0; i< long; i++)"
for (i=0; i < nombres.size(); i++){
    println "Nombre ${nombres[i]}"
}
println "\nFor (i in 0..3)"
for (i in 0..3){
    println "Nombre ${nombres[i]}"
}
println "\nFor (i in lista)"
for (i in nombres){
    println "Nombre $i"
}
println "\n4.times{}"
4.times{println "Nombre ${nombres[it]}"}
println "\nlista.size().times{}"
nombres.size().times{println "Nombre ${nombres[it]}"}