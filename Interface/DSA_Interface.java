// variables are static and final
// methods are abstract
// Interface are used to solve multiple inheritance problem in java

// single class can implements more than one interfaces
// class must override all the methods of interface to which it implementing

 interface Engine 
{
    static final int price=70000;
    void start();
    void stop();
    void acc();
}
interface Break
{
    void Break();
}
interface media
{
    void start();
    void stop();
}


 class CDplayer implements media{
    @Override
    public void start()
    {
        System.out.println("start music");
    }
     @Override
    public void stop()
    {
        System.out.println("stop music");
    }
 }

 class PowerEngine implements Engine
 {
    @Override
    public void start()
    {
        System.out.println("power engine start ");
    }
     @Override
    public void stop()
    {
        System.out.println("power engine stops ");
    }
     @Override
    public void acc()
    {
        System.out.println("power engine accelerate");
    }
 }

class ElectricEngine implements Engine
 {
    @Override
    public void start()
    {
        System.out.println("electric engine start ");
    }
     @Override
    public void stop()
    {
        System.out.println("electric engine stops ");
    }

     @Override
    public void acc()
    {
        System.out.println("electric engine accelerate");
    }
 }



class Nicecar 
{
    private Engine engine;
    private media player=new CDplayer();

    public Nicecar()
    {
        engine = new PowerEngine();
    }
    public Nicecar(Engine engine)
    {
        this.engine=engine;
    }

    public void start()
    {
        engine.start();
    }

    
    public void startmusic()
    {
        player.start();
    }
    public void stopmusic()
    {
        player.stop();
    }

    public void upgrade()
    {
        this.engine= new ElectricEngine();
    }
    
}

    public class DSA_Interface
    {
    public static void main(String[] args)
    {
        car obj=new car();

        // Engine obj = new car();
        // System.out.println(obj.a);

        // we can't access a becoz what will access depends on reference (Engine) but version will call depends on object type(car);

        // obj.start();
        // obj.stop();
        // obj.acc()

        Nicecar car= new Nicecar();
        car.start();
        car.startmusic();
        car.upgrade();  // power to electric engine change
        car.start();
        
    }
    }





// class car implements Engine
// {
//     int a=30;
//     @Override
//     public void start()
//     {
//         System.out.println("start engine like a normal car");
//     }

//      @Override
//     public void stop()
//     {
//         System.out.println("stop engine like a normal car");
//     }
//      @Override
//     public void acc()
//     {
//         System.out.println("accelerate engine like a normal car");
//     }
// }
