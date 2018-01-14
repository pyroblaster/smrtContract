/**
 * Created by Reptilko on 1/14/2018.
 */

data class Person(var Name: String, var Surname: String, val DayBirth: Int, val MonthBirth: Int, val YearBirth: Int,
                  var ID: Int, var Nationality: String, var Status:Boolean, var EthAddress:String, var Pulse:Int)

//balance transfer function

fun main(args: Array<String>) {
    var zeroHero = Person("Zero", "Hero", 29, 8, 1937, 1010101010, "NoCoiner", true,
            "0x774802cC0b0eeEB0cE4DEf9638AB04C35AAB7F24", 80)
    print(zeroHero)
    if(zeroHero.Status!=true && zeroHero.Pulse>0){
            println(zeroHero.EthAddress) //transfer funds (not done)
    }
    //how to verify death
}
