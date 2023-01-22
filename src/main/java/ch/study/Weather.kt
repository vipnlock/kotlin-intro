package ch.study

class Weather(degrees: Int) {
    private val description: String
    private val color: Color

    init {
        val (description, color) = when {
            degrees < 10 -> "cold" to Color.BLUE
            degrees < 25 -> "mild" to Color.ORANGE
            else -> "hot" to Color.RED
        }
        this.description = description
        this.color = color
    }

    enum class Color {
        BLUE, ORANGE, RED
    }
}