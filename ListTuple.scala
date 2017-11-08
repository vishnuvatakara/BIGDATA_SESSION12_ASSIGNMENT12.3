//object
object obj1 extends App {
//initializing list and variables
val m = Map(1 -> "alpha", 2 -> "beta", 3 -> "gamma", 4 -> "zeta", 5 ->  "omega")
var count = 0
var sum = 0
for ( i <- m.keys)//mapping key values
{
  if (m(i).length==4) //checking length
	{
        println("number matching length 4 = " + i)
	}
  
  if ( (m(i).contains("m"))  || (m(i).contains("z") == true ))
	{
 		count +=1 //counting number of numbers
    sum +=i  //summing their key values
	}

}

println("average of all numbers, where the corresponding string contains alphabet ‘m’ or alphabet ‘z’ is " + (sum/count) )
}