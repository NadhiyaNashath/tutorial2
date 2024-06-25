object salary{
  
  val normalHour = 250
  val otHour = 85
  val taxRate = 0.12

  def calculateGrossSalary(normalHours: Int, otHours: Int): Double = {
    (normalHours * normalHour) + (otHours * otHour)
  }

  def calculateTax(grossSalary: Double): Double = {
    grossSalary * taxRate
  }

  def calculateTakeHomeSalary(normalHours: Int, otHours: Int): Double = {
    val grossSalary = calculateGrossSalary(normalHours, otHours)
    grossSalary - calculateTax(grossSalary)
  }

  def main(args: Array[String]): Unit = {
    val normalHours = 40
    val otHours = 30
    val takeHomeSalary = calculateTakeHomeSalary(normalHours, otHours)
    println(s"Take-home salary : $takeHomeSalary")
  }
}
