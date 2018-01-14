/**
 * Created by Reptilko on 1/14/2018.
 */

class Person(Name: String, Surname: String, DayBirth: Int, MonthBirth: Int, YearBirth: Int, ID: Int, Nationality: String, Status:Boolean, EthAddress:String){
    var Name:String?=null
    var Surname:String?=null
    var DayBirth:Int?=null
    var MonthBirth:Int?=null
    var YearBirth:Int?=null
    var ID:Int?=null
    var Nationality:String?=null
    var Status:Boolean?=null
    var EthAddress:String?=null
    init{
/*
        println("Name: $Name")
        println("Surname: $Surname")
        println("DayBirth: $DayBirth")
        println("MonthBirth: $MonthBirth")
        println("YearBirth: $YearBirth")
        println("ID: $ID")
        println("Nationality: $Nationality")
             */
        this.Name=Name
        this.Surname=Surname
        this.DayBirth=DayBirth
        this.MonthBirth=MonthBirth
        this.YearBirth=YearBirth
        this.ID=ID
        this.Nationality=Nationality
        this.Status=Status
        this.EthAddress=EthAddress
    }

    fun GetName():String{
        return this.Name!!
    }
    fun GetSurname():String{
        return this.Surname!!
    }
    fun GetDayBirt():Int{
        return this.DayBirth!!
    }
    fun GetMonthBirth():Int{
        return this.MonthBirth!!
    }
    fun GetYearBirth():Int{
        return this.YearBirth!!
    }
    fun GetID():Int{
        return this.ID!!
    }
    fun GetNationality():String{
        return this.Nationality!!
    }
    fun GetStatus():Boolean{
        return this.Status!!
    }
    fun GetEthAddress():String{
        return this.EthAddress!!
    }
}

//balance transfer function

fun main(args: Array<String>) {
    var zeroHero = Person("Zero", "Hero", 29, 8, 1937, 1010101010, "NoCoiner", true, "0x774802cC0b0eeEB0cE4DEf9638AB04C35AAB7F24")
    print(zeroHero.GetName() + zeroHero.GetSurname() + zeroHero.GetDayBirt() + zeroHero.GetMonthBirth() +
            zeroHero.GetYearBirth() + zeroHero.GetYearBirth() + zeroHero.GetID()+ zeroHero.GetNationality() +
                zeroHero.GetStatus() + zeroHero.GetEthAddress())
    if(zeroHero.GetStatus()!=true){
            println(zeroHero.GetEthAddress()) //transfer funds (not done)
    }
//also possible to print i *init*; added
    //how to declare someone dead=?



}