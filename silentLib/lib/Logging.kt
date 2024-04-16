package silentSky.me.lib

import kotlin.random.Random
import kotlin.random.nextInt
import kotlin.system.exitProcess

@SilentLib
@SinceSilentLib("1.0")
class Logging{
    companion object{
        /**
         * Logs stuff
         * */
        fun logg(text: String){
            return println(text)
        }
        /**
         * Excludes stuff
         * */

        fun exclude(){
            return //TODO implement exclude
        }
        /**
         * This is a death wish function. IT WILL CRASH ANY PROGRAM THAT EXECUTES IT.
         * */

        fun excision(){
            val youFuckedAre = arrayOf("All hail the mighty death", "Excision has started, seek immediate shelter", "Nothing ever after", "I've become death, the destroyer of worlds", "Oh, hell naw", "Logged Logged Fucked", "PG-You're not old enough", "Welcome to hell, darling")
            logg(Colors.styledText(youFuckedAre[Random.nextInt(0..7)], Colors.red+Colors.bold))
            exitProcess(-0)
        }
    }
}

fun main() {
    Logging.excision()
}