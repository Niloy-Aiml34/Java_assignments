class bank{
    double getRoi(){
        return 0;
    }
}
class SBI extends bank{
    double getRoi(){
        return 8.0;
    }
}
class ICICI extends bank{
    double getRoi(){
        return 7.0;
    }
}
class AXIS extends bank{
    double getRoi(){
        return 9.0;
    }
}
public class bankroi {
    public static void main(String[] args) {
        bank axis = new AXIS();
        bank icici = new ICICI();
        bank sbi = new SBI();
        System.out.println("Roi :"+axis.getRoi());
        System.out.println("Roi :"+icici.getRoi());
        System.out.println("Roi :"+sbi.getRoi());
    }
}
