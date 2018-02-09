/*
 * Kotlin version of the Addition Table I created on Java
 * See here: https://github.com/iasjem/addition-table-java
 * This is my first Kotlin program and I am loving it! :)
 */

fun main(args: Array<String>) {
	var z:Int 
	for (y in 0..10){
		for (x in 0..10){
			z = x+y
			print("$z \t")
		}
		print("\n")
	}
}

// omg... less to worry about syntax... My first nested for loop
// Kotlin all the way!!! :D