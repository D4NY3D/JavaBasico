package poo.ejercicioCinco;

public class CocheCRUDImpl implements CocheCRUD {

    @Override
    public void save() {
    }
    @Override
    public void findAll() {
    }
    @Override
    public void delete() {
    }

    String save = "Guardar";
    String findAll = "Buscar todo";
    String delete = "Borrando";

    @Override
    public String toString() {
        return "CocheCRUDImpl{" +
                "save='" + save + '\'' +
                ", findAll='" + findAll + '\'' +
                ", delete='" + delete + '\'' +
                '}';
    }
}
