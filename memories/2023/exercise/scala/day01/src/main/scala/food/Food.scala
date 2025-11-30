package food

import java.time.LocalDate
import java.util.UUID
import java.util.function.Supplier


final class Food(var expirationDate: LocalDate, var approvedForConsumption: Boolean, var inspectorId: UUID) {

  def isEdible(now: Supplier[LocalDate]): Boolean =
    if (this.expirationDate.isAfter(now.get) && this.approvedForConsumption && this.inspectorId != null) true
    else false
}