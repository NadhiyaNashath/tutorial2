object profit{


    def attendees(ticketPrice: Int) : Int = 120 + (15 - ticketPrice) / 5 * 20

    def revenue(ticketPrice:Int) : Int = attendees(ticketPrice) * ticketPrice

    def cost(ticketPrice: Int) : Int = 500 + attendees(ticketPrice) * 3

    def profit(ticketPrice:Int) : Int = revenue(ticketPrice) - cost(ticketPrice)

    def main(args: Array[String]): Unit = {
        var price1 = 10
        var price2 = 20
        var price3 = 30
        println(s"Profit at price Rs. $price1: Rs. ${profit(price1)}")
        println(s"Profit at price Rs. $price2: Rs. ${profit(price2)}")
        println(s"Profit at price Rs. $price3: Rs. ${profit(price3)}")
    }

}