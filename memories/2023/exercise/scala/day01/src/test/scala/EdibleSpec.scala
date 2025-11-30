import food.Food
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.prop.TableDrivenPropertyChecks

import java.time.LocalDate
import java.util.UUID

class EdibleSpec extends AnyFlatSpec with Matchers with TableDrivenPropertyChecks {

  private val expirationDate: LocalDate = LocalDate.of(2023, 12, 1)
  private val inspector: UUID = UUID.randomUUID()
  private val notFreshDate: LocalDate = expirationDate.plusDays(7)
  private val freshDate: LocalDate = expirationDate.minusDays(7)

  private val notEdibleFoodData = Table(
    ("approvedForConsumption", "inspectorId", "now"),
    (true, inspector, notFreshDate),
    (false, inspector, freshDate),
    (true, null, freshDate),
    (false, null, notFreshDate),
    (false, null, freshDate)
  )

  "A food" should "not be edible if not fresh" in {
    forAll(notEdibleFoodData) { (approvedForConsumption, inspectorId, now) =>
      val food = new Food(expirationDate, approvedForConsumption, inspectorId)
      food.isEdible(() => now) shouldBe false
    }
  }

  it should "be edible" in {
    val food = new Food(expirationDate, true, inspector)
    food.isEdible(() => freshDate) shouldBe true
  }
}
