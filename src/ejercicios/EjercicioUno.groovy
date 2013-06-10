/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
def lista = ["primero", "altar", "patogeno","directiva","partido","concurrencia","dislocado","genetica","diagnostico","pala"]


lista.sort({primera, segunda -> segunda.length().compareTo(primera.length()) })

println "Lista ordenada por longitud, descendente\n ${lista}"

for (i=1; i < lista.size(); i++){
     if (lista[i].length() == lista[i-1].length()){
            lista[i] = lista[i].toList().sort().join()
            lista[i-1] = lista[i-1].toList().sort().join()
     }
}
println "Para igual longitud, palabras en orden alfabético\n ${lista}"

