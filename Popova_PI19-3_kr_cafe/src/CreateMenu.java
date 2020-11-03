import java.util.ArrayList;

public abstract class CreateMenu implements StopList{

    static ArrayList<Tovar> stops = new ArrayList<>();

    public abstract void add(Tovar tovar);

    @Override
    public abstract void stop(Tovar tovar);
}
