# practical-4
object input
{
	def main(args: Array[String])
	{
		var input: String=" "

		print("Enter your Name: ")

		input=scala.io.StdIn.readLine()

		println("Your name is: "+input)
	}
}
#Add two numbers
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
#Acess modiefier
class Parent
{
	private var pvtVariable: Int=12
	println("initial private variable: "+pvtVariable)

	protected var prtVariable: Int=99
	println("initial protected variable: "+prtVariable)

	var pbcVariable: Int=56
	println("initial public variable: "+pbcVariable)

	def show()
	{
		pvtVariable=45  // changing or accessing private type
		println("after accessing (parent class & its member method) private variable: "+pvtVariable)

		prtVariable=420
		println("after accessing (parent class & its member method) protected variable: "+prtVariable)
		
		pbcVariable=69
		println("after accessing (parent class & its member method) public variable: "+pbcVariable)
	}
}

class Child extends Parent
{
	def showAgain()
	{
		prtVariable=786
		println("after accessing (child class & its member method) protected variable: "+prtVariable)

		pbcVariable=85
		println("after accessing (child class & its member method) public variable: "+pbcVariable)
	}
}
object check
{
	def main(args: Array[String])
	{
		var parentObject=new Parent()
		parentObject.show()

		var childObject=new Child()
		childObject.showAgain()
	}
}
