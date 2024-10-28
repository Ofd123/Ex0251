public class Motorcycle extends Vehicle
{

    @Override
    public void start()
    {
        System.out.println("put a helmet on");
    }

    @Override
    public void stop()
    {
        System.out.println("you can take the helmet off");
    }

    @Override
    public void accelerate()
    {
        System.out.println("be careful");
    }
}
