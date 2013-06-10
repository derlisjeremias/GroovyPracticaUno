/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios
import ejercicios.EjercicioCuatro

class Currency{
    def type
    def amount
    def exchangeServer
    
    Currency(){
        this.initializeExchangeServer()
    }
    
    void initializeExchangeServer(){
        this.exchangeServer = new Exchange()
        this.exchangeServer.setURL("http://openexchangerates.org/api/latest.json?app_id=4272aa1329564d879f5fc1e54d666f1c")
        this.exchangeServer.loadValidAcronyms()
    }
    
    Currency plus(Currency c){
        def valueA = this.exchangeServer.actualCurrency(this.type)
        def valueB = this.exchangeServer.actualCurrency(c.type)
        valueA = valueA * this.amount
        valueB = valueB * c.amount
        def answer = new Currency(amount:valueA + valueB, type:"USD")
        answer
    }
    
    Currency minus(Currency c){
        def valueA = this.exchangeServer.actualCurrency(this.type)
        def valueB = this.exchangeServer.actualCurrency(c.type)
        def values = [valueA * this.amount,valueB * c.amount]
        def min = values.min()
        def max = values.max()
        def answer = new Currency(amount:max - min, type:"USD")
        answer
    }
    
    Currency multiply(Currency c){
        def valueA = this.exchangeServer.actualCurrency(this.type)
        def valueB = this.exchangeServer.actualCurrency(c.type)
        valueA = valueA * this.amount
        valueB = valueB * c.amount
        def answer = new Currency(amount:valueA * valueB, type:"USD")
        answer
    }
    
    String toString(){
        "cantidad ${this.amount} de tipo ${this.type}"
    }
}

def ars = new Currency(type:"ARS", amount:1000)

def aed = new Currency(type:"AED", amount:1000)

def usd = ars + aed

println """
Sumar ${ars} con ${aed} da
de resultado ${usd}
"""

usd = ars - aed

println """
Restar ${ars} con ${aed} da
de resultado ${usd}
"""

usd = ars * aed

println """
Multiplicar ${ars} con ${aed} da
de resultado ${usd}
"""
