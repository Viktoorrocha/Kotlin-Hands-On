fun toList(vararg args: String): List<String>{
    var list = ArrayList<String>()
    for (s in args)
    list.add(s)
    return list
}
fun main (args: Array<String>){
    var list = toList("Viktor","Rocha","Dev")
    println(list)
}

//[Viktor, Rocha, Dev]

