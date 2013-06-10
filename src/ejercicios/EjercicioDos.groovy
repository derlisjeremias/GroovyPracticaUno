package ejercicios

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


class createMapFromPage {
    def url = null
    
    void setUrl(url){
        this.url = new URL(url).getText();
    }
    
    Map readLine(){
        if (url != null){
            def map = [:]
            def i = 0
            def c = {map[++i] = it.length()}
            this.url.eachLine(1,c)
            return map
        }
        null
    }	
}

def a = new createMapFromPage()
a.setUrl("http://info.cern.ch/hypertext/WWW/TheProject.html")
def map = a.readLine()
map.each{posicion,letras  ->println "La linea ${posicion} tiene ${letras} letras de largo"}