package Assignment8;


import java.util.ArrayList;

public interface DAOCreate<E> {
    ArrayList<E> list();

    Boolean create(E e);

    Boolean update(E e);

    Boolean delete(E e);
}
