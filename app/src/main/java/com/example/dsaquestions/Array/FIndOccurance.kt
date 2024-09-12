package com.example.dsaquestions.Array

fun main() {
    val array = intArrayOf(1,2,3,4,2,3,4,3,4,4)

    println("${checkOccurance(array)}")

}

fun checkOccurance(arr:IntArray): HashMap<Int, Int> {
    val hashmap = HashMap<Int, Int>()

    for(i in arr.indices)
    {
        if(hashmap.containsKey(arr[i]))
        {
            hashmap[arr[i]] = hashmap[arr[i]]!!+1
        }
        else
        {
            hashmap[arr[i]] =1

        }
    }

    return hashmap
}