import java.awt.CardLayout
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Calendar
import java.util.Locale

fun main() {
    var year: Int = Calendar.getInstance().get(Calendar.YEAR)
    val formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")
    var today = LocalDate.now()
    var formattedToday = today.format(formatter)

    //input for most recent full moon
    println("Enter the last month there was a full moon: ")
    var moonMonth = readln()!!.toInt()
    println("Enter the last day there was a full moon: ")
    var moonDay = readln()!!.toInt()

    //most recent full moon
    var recentFullMoon: LocalDate = LocalDate.of(year, moonMonth, moonDay)
    println("The most recent full moon was on ${recentFullMoon.format(formatter)}")

    var nextFullMoon = recentFullMoon
    if(recentFullMoon.isBefore(today)){
        nextFullMoon = recentFullMoon.plusDays(29)
        println("The next full moon is $nextFullMoon")
    }
    else{
        println("That full moon has yet to happen")
    }

}