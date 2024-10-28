public class Bicycle extends Vehicle
{
    @Override
    public void start()
    {
        System.out.println("starts pedaling");
    }

    @Override
    public void stop()
    {
        System.out.println("stops pedaling");
    }

    @Override
    public void accelerate()
    {
        System.out.println("pedaling faster");
    }
}
