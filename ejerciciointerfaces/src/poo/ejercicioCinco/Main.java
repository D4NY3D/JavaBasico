package poo.ejercicioCinco;

public class Main {
    public static void main(String[] args) {
        CocheCRUD cocheCrud = new CocheCRUDImpl();

        cocheCrud.save();
        cocheCrud.findAll();
        cocheCrud.delete();

        System.out.println(cocheCrud);


    }
}



