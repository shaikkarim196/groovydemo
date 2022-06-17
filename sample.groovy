#!/usr/bin/env groovy

def call(int a =10, int b =3) {
a = a
b = b

println "a =  ${a}"
println "b = ${b}"
println "a + b = ${a + b}"
println "a - b = ${a - b}"
println "a * b = ${a * b}"
println "a / b = ${a / b}"
println "a % b = ${a % b}"
println "a ** b = ${a ** b}"
}