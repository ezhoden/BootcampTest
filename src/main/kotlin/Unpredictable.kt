class Unpredictable(id: Int) : Trader(id) {

    override fun makeDecision(): Boolean = makeWrongDecision(java.util.Random().nextBoolean())

}