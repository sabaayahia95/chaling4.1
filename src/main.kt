fun main(){
    var flist = listOf("one","tow", "three","four","fife") ;
    var farray = arrayOf("sabaa", "lool", "samar","wafa","somaiah");
    var MutableList = mutableListOf("sanaa", "taiz", "adan","haja","ibb");
    println("            ")
    for (item in flist.iterator()){
        println(" the num of item is :"+"$item");
    }
    for ((index,value) in farray.withIndex())
    {
        println("in the index:" + "$index" + "the name is:" + "$value");
    }
    for (element in MutableList.indices){
        println(MutableList[element]) ;
    }

}