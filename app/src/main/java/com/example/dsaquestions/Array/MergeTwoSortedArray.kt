package com.example.dsaquestions.Array

fun main()
{
    val intArray = arrayOf(1,2,3,4,5)
    val intArray2 = arrayOf(6,7,8,9,10)
    var intArray3 = arrayOfNulls<Int>(intArray.size+intArray2.size)

    for (i in 0..intArray.size-1)
    {

        intArray3[i]=intArray[i]
    }
    for (j in 0.. intArray2.size-1)
    {

        intArray3[intArray.size+j]=intArray2[j]

    }
    for (k in intArray3 ){

        print(" $k")

    }
}