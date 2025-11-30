<?php

declare(strict_types = 1);

use Carbon\Carbon;
use Food\Food;
use PHPUnit\Framework\TestCase;
use Ramsey\Uuid\Uuid;

class EdibleTest extends TestCase
{
	private static $expirationDate;

	private static $inspector;

	private static $notFreshDate;

	private static $freshDate;

	public static function setUpBeforeClass(): void
	{
		self::$expirationDate = Carbon::createFromDate(2023, 12, 1);
		self::$inspector = Uuid::uuid4();
		self::$notFreshDate = self::$expirationDate->copy()->addDays(7);
		self::$freshDate = self::$expirationDate->copy()->subDays(7);
	}

	public static function not_edible_food_data_provider(): array
	{
		return [
			[true, self::$inspector, self::$notFreshDate],
			[false, self::$inspector, self::$freshDate],
			[true, null, self::$freshDate],
			[false, null, self::$notFreshDate],
			[false, null, self::$freshDate],
		];
	}

	/**
	 * @dataProvider not_edible_food_data_provider
	 */
	public function test_not_edible_if_not_fresh(bool $approvedForConsumption, $inspectorId, $now): void
	{
		$food = new Food(
			expirationDate: self::$expirationDate,
			approvedForConsumption: $approvedForConsumption,
			inspectorId: $inspectorId,
		);

		$this->assertFalse($food->isEdible($now));
	}

	public function test_edible_food(): void
	{
		$food = new Food(
			approvedForConsumption: true,
			inspectorId: self::$inspector,
			expirationDate: self::$expirationDate
		);

		$this->assertTrue($food->isEdible(self::$freshDate));
	}
}
