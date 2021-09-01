class Test
{
	var sum: Int=0

	def add(arg1:Int, arg2:Int)  // method to add mutables and immutables
	{
		sum=arg1+arg2   
	}

	def showAllResult() // method to print result
	{
		println("Sum is: "+sum)
	}
}
object find
{
	def main(args: Array[String])
	{
		var x: Int=12  // mutables declaration
		var y: Int=20

		val a: Int=23  // immutables declaration
		val b: Int=30

		val obj1,obj2,obj3=new Test() // object creation

		obj1.add(x,y)
		print("Mutables -> ")
		obj1.showAllResult()

		obj2.add(a,b)
		print("Immutables -> ")
		obj2.showAllResult()

		obj3.add(x,a)
		print("Mixed -> ")
		obj3.showAllResult()
	}
}