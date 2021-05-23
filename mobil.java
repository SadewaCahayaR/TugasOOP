package tugasOOP;

public class mobil implements tugasOOP.komponenn {
    public static void main(String[] args){
        mobil data = new mobil();
        data.mesin();
        data.design();
    }

    @Override
    public void mesin() {
        System.out.println("Kecepatan Mobil: "+kecepatan);
    }

    @Override
    public void design() {
        System.out.println("Mempunyai Model: "+model);
    }
}
