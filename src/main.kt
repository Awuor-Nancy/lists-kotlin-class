fun main() {
    //Immutable List ou cannot change its size once created
    var classes = listOf("AnitaB","LoveLace","LisaLab")
    println(classes)
    //mutable list
    var colors = mutableListOf("red","blue","green")
    colors.add("yellow")
    colors.remove("blue")
    println(colors)

    //specify list type of any
    var x= mutableListOf<String>()

    getSquare()

    var toyota=Car("Toyota","Corolla")
    var ford=Car("Ford","Fiesta")
    var audi=Car("Audi","V8")

    var myCars= listOf(toyota,ford,audi)
    println(toyota.model)
    println(ford.model)
    println(audi.model)

    //Sorting List
    myCars.forEach(){ c->
        println(c.model)
        var sortedCar=myCars.sortedBy {car ->car.model}  //Sorting Lists
        println(sortedCar)

        var sortedcar=myCars.sortedByDescending {car ->car.model}
        println(sortedCar)
    }
    //create a function that takes in a list of cars and returns
    //a list of the models
    println(getVowelModels(myCars))

    var fruits= mutableListOf<String>()
    fruits.add("banana")
    fruits.add("apple")
    fruits.add("mango")
    fruits.add("avocado")
    fruits.add("orange")
    println(fruits)
    fruits.remove("apple",)
    println(fruits)
    //add  element to the list
    fruits.add(0,"guava")
    fruits.removeAt(3) //remove element
    fruits[1] ="pear"  //add element
    println(fruits)
    //remain with fruits longer that 5 characters
    var longNames=fruits.filter { fruit-> fruit.length>5 }
    println(longNames)

    var b =Person("Edrian",10)
    var a= Person("Meshack",20)
    var c=Person("Damian",30)
    var t=Person("Lencier",15)

    var people= listOf( b,a,c,t )
    var adults=people.filter {person->person.age>=18}
    println(adults)

}
fun doSth(names:List<String>){
    var nums= listOf<Int>(19,20,21,22,23,34,22,43,20)
    println(nums.count()) //
    println(nums.size) //know the size of the list
    println(nums.sum()) //get sim of all the elements
    println(nums.minOrNull()) //get the smallest elements
    println(nums.maxOrNull()) //biggest number in a list

    var nums2= emptyList<Int>()
    println(nums2.maxOrNull())
    println(nums.average())    //gets average of the nums
    println(nums.indexOf(3)) //get position of an element in a list
    println(nums.first())   //get the first element
    println(nums[9])  //get the 9th elements
    println(nums.get(4))   //works the same way as index
    println(nums.lastIndex)
    nums.forEach{ x->
        var numSorted=nums.sortedDescending()
        println(nums)
    }
    println(nums.lastIndexOf(21))
    var numbers= listOf<Int>(19,20,21,22,23,34,22,43,20)

    nums.forEach{ n ->
        println(n)
    }
    //write a function that prints out the squares
    //of the elements at odd indices given a list of integers(use forEachIndexed)
}
fun getSquare() {
    var total= listOf<Int> (3,5,9,6,9,2)
    total.forEach{ c->
        println(c*c)
        for (c in total){   //using for loop function
            println(c)
            var index=0
            for (c in total){
                println()
            }
        }
    }
}
//}
fun cars() {
}
data class  Car(var make:String,var model:String){
}
fun getVowelModels(car: List<Car>):List<String> {
    var model= mutableListOf<String>()
    var vowels= listOf('a','e','i','o','u')
    car.forEach{car->
        if (vowels.contains(car.model.lowercase().first()))
            model.add(car.model)
    }
    return model
}
data class Person(var name:String , var age:Int)




