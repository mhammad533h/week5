import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test  {

    public static void main(String[] args) {

        List<Pc> pcList = new ArrayList<>();

        pcList.add(new Pc(1,"Dell","4gb","520 Gb","Samsung",true));
        pcList.add(new Pc(2,"HP","6gb","720 Gb","HP",true));
        pcList.add(new Pc(3,"Lenovo","4gb","320 Gb","Samsung",true));
        pcList.add(new Pc(4,"Dell","8gb","520 Gb","IBM",true));

        pcList.add(2,new Pc(10,"Lenovo","4 gb","120 Gb","IBM",true));

        List<Pc> pcList1 = new ArrayList<>();

        pcList1.add(new Pc(5,"Dell","4gb","520 Gb","Samsung",true));
        pcList1.add(new Pc(6,"HP","6gb","720 Gb","HP",true));
        pcList1.add(new Pc(7,"Lenovo","4gb","320 Gb","Samsung",true));
        pcList1.add(new Pc(8,"Dell","8gb","520 Gb","IBM",true));
        pcList1.add(new Pc(9,"Lenovo","4gb","320 Gb","Samsung",true));
        pcList1.add(new Pc(10,"Dell","8gb","520 Gb","IBM",true));

        pcList.addAll(pcList1);
        pcList.remove(new Pc(10,"Lenovo","4 gb","120 Gb","IBM",true));

        pcList.set(1,new Pc(10,"Lenovo","4 gb","120 Gb","IBM",true));
        for (Pc temp : pcList){
            temp.setId(temp.getId()+2);
        }


        Collections.sort(pcList);
        Collections.reverse(pcList);
        for(Pc temp : pcList)
        {System.out.println(temp);}
    }
}
