package silentSky.me.lib
@SilentColors
@SinceSilentLib("1.0")
@SinceSilentColors("1.2")
class Colors {
    @SilentColors
    companion object {
        const val black = "\u001b[30m"
        const val red = "\u001b[31m"
        const val green = "\u001b[32m"
        const val yellow = "\u001b[33m"
        const val blue = "\u001b[34m"
        const val purple = "\u001B[35m"
        const val cyan = "\u001b[36m"
        const val gray = "\u001B[37m"

        const val darkGray = "\u001b[30;1m"
        const val lightRed = "\u001b[31;1m"
        const val boldGreen = "\u001b[32;1m"
        const val boldYellow = "\u001b[33;1m"
        const val lightBlue = "\u001b[34;1m"
        const val boldPurple = "\u001b[35;1m"
        const val boldCyan = "\u001b[36;1m"
        const val lightGray = "\u001b[37;1m"

        const val backgroundBlack = "\u001b[40m"
        const val backgroundRed = "\u001b[41m"
        const val backgroundGreen = "\u001b[42m"
        const val backgroundYellow = "\u001b[43m"
        const val backgroundBlue = "\u001b[44m"
        const val backgroundPurple = "\u001b[45m"
        const val backgroundCyan = "\u001b[46m"
        const val backgroundGray = "\u001b[47m"

        const val backgroundDarkGray = "\u001b[40;1m"
        const val backgroundLightRed = "\u001b[41;1m"
        const val backgroundLime = "\u001b[42;1m"
        const val backgroundLightBlue = "\u001b[44;1m"
        const val backgroundLightGray = "\u001b[47;1m"

        const val bold = "\u001b[1m"
        const val italic = "\u001b[3m"
        const val underline = "\u001B[4m"
        const val crossedOver = "\u001B[9m"
        const val boldUnderline = "\u001B[21m"
        const val reversed = "\u001b[7m"


        const val resetColor = "\u001b[0m"

        /**
         * @sample sampleStyledText
         */

        @SinceSilentColors("1.2")
        @SinceSilentLib("1.0")
        @SilentColors
        @SilentLib.inlineOnly
        public inline fun styledText(text: String, color: String?){
            return println(color+text+Colors.resetColor)
        }
        @SilentLib.inlineOnly
        public inline fun styledText(text: String, color: String?, end:String?){
            return print(color+text+Colors.resetColor)
        }
    }

    fun sampleStyledText(): String{
        return styledText("hello", Colors.blue)
    }


}
