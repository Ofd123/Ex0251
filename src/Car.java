public class Car extends Vehicle
{
    @Override
    public void start()
    {
        System.out.println("press the gas pedal");
    }

    @Override
    public void stop()
    {
        System.out.println("pull the breaks");
    }

    @Override
    public void accelerate()
    {
        System.out.println("press the gas pedal harder");
    }
}
