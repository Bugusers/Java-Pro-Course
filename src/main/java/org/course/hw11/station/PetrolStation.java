package org.course.hw11.station;

import java.util.Random;
import java.util.concurrent.Semaphore;


public class PetrolStation {
    private double amount;
    private Semaphore semaphore;

    /**
     * Constructs a new PetrolStation with the specified initial amount of fuel.
     *
     * @param initialAmount The initial amount of fuel in the petrol station.
     */
    public PetrolStation(int initialAmount) {
        this.amount = initialAmount;
        this.semaphore = new Semaphore(3);// Allow up to 3 vehicles to refuel concurrently
    }

    /**
     * Performs the refueling operation, allowing a vehicle to fill up a specified amount of fuel.
     * Waits for a permit from the semaphore before starting the refueling process.
     *
     * @param amountRefuel The amount of fuel to be refueled by the vehicle.
     * @throws RuntimeException If the thread is interrupted during the refueling process.
     */
    public void doRefuel(double amountRefuel) {
        try {
            semaphore.acquire();

            System.out.println("Starting refuel... ");

            int sleepDuration = new Random().nextInt(8) + 3;
            Thread.sleep(sleepDuration);

            amount -= amountRefuel;
            System.out.println("Finished refuel. " + amountRefuel + " liters were filled");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }
}
