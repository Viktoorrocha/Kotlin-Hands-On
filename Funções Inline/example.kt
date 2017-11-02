inline fun List<Int>.filtrar(filtro: (Int)-> (Boolean)): List<Int> {
    val newlist = arrayListOf<Int>()
    for (item in this){
    if (filtro(item)){
        newlist.add(item)
    }
}
return newlist
}