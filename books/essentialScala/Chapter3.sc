
//Person example

case class Person(firstName: String, lastName: String) {
  def name = firstName + " " + lastName
}

object Person {
  def apply(name: String): Person = {
    val parts = name.split(" ")
    apply(parts(0), parts(1))
  }
}

object StormSTroope

val dave = new Person("Dave", "Gurnell")

Person("Otro", "Va")
Person("vamos todos")

//Cat example

case class Cat (name:String, colour: String, food: String)

object ChipShop {
  def willServer (cat: Cat):Boolean = cat match{
    case Cat(_, _, "ChipShop") => true
    case _ => false
  }
}

val grey = Cat("Grey", "grey", "ChipShop")
val blackTree = Cat("Black", "black", "Fish")

ChipShop.willServer(grey)
ChipShop.willServer(blackTree)


// Director and film examples

case class Director (name: String, surname: String, yearBirth : Int)

object Director{
  def older (directorOne: Director, directorTwo: Director) : Director =
    if (directorOne.yearBirth > directorOne.yearBirth) directorOne else directorTwo
}

case class Film (name: String, yearOfRelease: Int, director: Director, imdbRating: Double)

object Film{
  def highestRating (filmOne: Film, filmTwo: Film) : Double = if (filmOne.imdbRating > filmTwo.imdbRating) filmOne.imdbRating else filmTwo.imdbRating
  def oldestDirectorAtTheTime (filmOne: Film, filmTwo: Film) : Director = if (filmOne.director.yearBirth > filmTwo.director.yearBirth) filmOne.director else filmTwo.director

}

object Dad {
  def rate (film: Film) = film match {
    case Film(_, _, Director("Clint", "Eastwood", _), _) => 10.0
    case Film(_, _, Director("John", "McTiernan", _), _) => 7.0
    case _ => 3.0
  }
}

val one = Film("Ello", 1888, Director("Clint", "Eastwood", 1968), 12)
val two = Film("Ella", 1898, Director("John", "McTiernan", 1968), 12)
val three = Film("El", 1877, Director("Pepito", "Eastwood", 1968), 12)
Dad.rate(one)
Dad.rate(two)
Dad.rate(three)


// Counter examples

case class Counter(count: Int = 0){
  def dec : Counter = copy(count = count -1)
  def inc : Counter = copy(count = count +1)
}

Counter(0)

Counter().inc







