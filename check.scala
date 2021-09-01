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