package com.test.tarea1


//Guillermo Carsolio Gonzalez A01700041


//P17 divide una lista en 2
/*
split(int x, List lis)
    lis2 = lis.sublist(0,x)
    lis3 = lis.sublist(x,lis.size())

lis = [a, b, c, d ,e ,f, g]

split(3, lis)

OUTPUT [a, b, c] [d, e, f, g]
*/
//Se que esta medio sencillo pero como conocía la existencia de la funcion por eso mi algoritmo está asi



fun split(digits: Int,list1: List<Char>){
    print(list1.subList(0,digits))

    print(list1.subList(digits,list1.size))
    print("\n")
}

val lis = "abcdefghi".toList()

//TEST CASES


print("Case 1: [a, b, c, d ,e ,f, g, h, i] split to [a, b, c][d, e, f, g, h, i]\nresult: \n")
split(3,lis)
print("\nCase 2: [a, b, c, d ,e ,f, g, h, i] split to [a, b, c, d, e][f, g, h, i]\nresult: \n")
split(5,lis)
print("\nCase 3: [a, b, c, d ,e ,f, g, h, i] split to [a][b, c, d, e, f, g, h, i]\nresult: \n")
split(1,lis)

// P33 check if two integers are COPRIME
/*

 coprime(int a, int b)
    if gcd(a,b) == 1
        true
    else
        flase

 */

//Esta funcion es del Greatest Common Divisor que es necesaria para encontrar el coprime
fun gcd (x: Int, y: Int): Int {
    if (y == 0)
        return x
    else
        return gcd(y, x.rem(y))
}
fun coprime(a: Int, b: Int):Boolean{
    if (gcd(a,b)==1)
        return true
    return false
}



//Test Cases
print("\nTest 1: ")
if(coprime(35,64))
    print("Passed")
else
    print("Failed")
print("\nTest 2: ")
if(coprime(23,63))
    print("Passed")
else
    print("Failed")
print("\nTest 3: ")
if(coprime(32,33))
    print("Passed")
else
    print("Failed")